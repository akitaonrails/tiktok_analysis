package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C34, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C34 extends Message<C1C34, C1C36> {
    public static final ProtoAdapter<C1C34> ADAPTER = new ProtoAdapter<C1C34>() { // from class: X.1C35
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C34 decode(ProtoReader protoReader) {
            C1C36 c1c36 = new C1C36();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c36.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c36.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c36.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C34 c1c34) {
            C1C34 c1c342 = c1c34;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c1c342.ret) + c1c342.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C34 redact(C1C34 c1c34) {
            C1C36 c1c36NewBuilder = c1c34.newBuilder();
            c1c36NewBuilder.clearUnknownFields();
            return c1c36NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C34 c1c34) {
            C1C34 c1c342 = c1c34;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c1c342.ret);
            protoWriter.writeBytes(c1c342.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C36 newBuilder() {
        C1C36 c1c36 = new C1C36();
        c1c36.LIZLLL = C1516540pZE.LIZJ("ret", this.ret);
        c1c36.addUnknownFields(unknownFields());
        return c1c36;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.ret.isEmpty()) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnX011dd45b533eb24e{");
        sb.append('}');
        return sb.toString();
    }

    public C1C34(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C34)) {
            return false;
        }
        C1C34 c1c34 = (C1C34) obj;
        if (unknownFields().equals(c1c34.unknownFields()) && this.ret.equals(c1c34.ret)) {
            return true;
        }
        return false;
    }

    public C1C34(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = C1516540pZE.LJFF("ret", list);
    }
}
