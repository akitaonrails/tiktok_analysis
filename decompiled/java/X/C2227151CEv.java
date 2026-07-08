package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227151CEv extends Message<C2227151CEv, C2227171CEx> {
    public static final ProtoAdapter<C2227151CEv> ADAPTER = new ProtoAdapter<C2227151CEv>() { // from class: X.1CEw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227151CEv decode(ProtoReader protoReader) {
            C2227171CEx c2227171CEx = new C2227171CEx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227171CEx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227171CEx.LIZLLL.add(C2232021CXo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227171CEx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227151CEv c2227151CEv) {
            C2227151CEv c2227151CEv2 = c2227151CEv;
            return C2232021CXo.ADAPTER.asRepeated().encodedSizeWithTag(1, c2227151CEv2.ret) + c2227151CEv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227151CEv redact(C2227151CEv c2227151CEv) {
            C2227171CEx c2227171CExNewBuilder = c2227151CEv.newBuilder();
            C1516540pZE.LJIIIZ(c2227171CExNewBuilder.LIZLLL, C2232021CXo.ADAPTER);
            c2227171CExNewBuilder.clearUnknownFields();
            return c2227171CExNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227151CEv c2227151CEv) {
            C2227151CEv c2227151CEv2 = c2227151CEv;
            C2232021CXo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2227151CEv2.ret);
            protoWriter.writeBytes(c2227151CEv2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2232021CXo> ret;

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
    public C2227171CEx newBuilder() {
        C2227171CEx c2227171CEx = new C2227171CEx();
        c2227171CEx.LIZLLL = C1516540pZE.LIZJ("ret", this.ret);
        c2227171CEx.addUnknownFields(unknownFields());
        return c2227171CEx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.ret.isEmpty()) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnX65cbee6adb0ec7a1{");
        sb.append('}');
        return sb.toString();
    }

    public C2227151CEv(List<C2232021CXo> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227151CEv)) {
            return false;
        }
        C2227151CEv c2227151CEv = (C2227151CEv) obj;
        if (unknownFields().equals(c2227151CEv.unknownFields()) && this.ret.equals(c2227151CEv.ret)) {
            return true;
        }
        return false;
    }

    public C2227151CEv(List<C2232021CXo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = C1516540pZE.LJFF("ret", list);
    }
}
