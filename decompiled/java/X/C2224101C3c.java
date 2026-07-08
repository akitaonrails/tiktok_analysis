package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224101C3c extends Message<C2224101C3c, C2224121C3e> {
    public static final ProtoAdapter<C2224101C3c> ADAPTER = new ProtoAdapter<C2224101C3c>() { // from class: X.1C3d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224101C3c decode(ProtoReader protoReader) {
            C2224121C3e c2224121C3e = new C2224121C3e();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224121C3e.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224121C3e.LIZLLL.add(C2224331C3z.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224121C3e.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224101C3c c2224101C3c) {
            C2224101C3c c2224101C3c2 = c2224101C3c;
            return C2224331C3z.ADAPTER.asRepeated().encodedSizeWithTag(1, c2224101C3c2.configurations) + c2224101C3c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224101C3c redact(C2224101C3c c2224101C3c) {
            C2224121C3e c2224121C3eNewBuilder = c2224101C3c.newBuilder();
            C1516540pZE.LJIIIZ(c2224121C3eNewBuilder.LIZLLL, C2224331C3z.ADAPTER);
            c2224121C3eNewBuilder.clearUnknownFields();
            return c2224121C3eNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224101C3c c2224101C3c) {
            C2224101C3c c2224101C3c2 = c2224101C3c;
            C2224331C3z.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2224101C3c2.configurations);
            protoWriter.writeBytes(c2224101C3c2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInteractForwardStreamConfiguration#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2224331C3z> configurations;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.configurations.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2224121C3e newBuilder() {
        C2224121C3e c2224121C3e = new C2224121C3e();
        c2224121C3e.LIZLLL = C1516540pZE.LIZJ("configurations", this.configurations);
        c2224121C3e.addUnknownFields(unknownFields());
        return c2224121C3e;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.configurations.isEmpty()) {
            sb.append(", configurations=");
            sb.append(this.configurations);
        }
        sb.replace(0, 2, "FuncParamsXc73d37745f9bde3c{");
        sb.append('}');
        return sb.toString();
    }

    public C2224101C3c(List<C2224331C3z> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2224101C3c)) {
            return false;
        }
        C2224101C3c c2224101C3c = (C2224101C3c) obj;
        if (unknownFields().equals(c2224101C3c.unknownFields()) && this.configurations.equals(c2224101C3c.configurations)) {
            return true;
        }
        return false;
    }

    public C2224101C3c(List<C2224331C3z> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.configurations = C1516540pZE.LJFF("configurations", list);
    }
}
