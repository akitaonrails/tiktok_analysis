package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228871CLl extends Message<C2228871CLl, C2228881CLm> {
    public static final ProtoAdapter<C2228871CLl> ADAPTER = new ProtoAdapter<C2228871CLl>() { // from class: X.1CLk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228871CLl decode(ProtoReader protoReader) {
            C2228881CLm c2228881CLm = new C2228881CLm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228881CLm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228881CLm.LIZLLL = C2228891CLn.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228881CLm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228871CLl c2228871CLl) {
            C2228871CLl c2228871CLl2 = c2228871CLl;
            return C2228891CLn.ADAPTER.encodedSizeWithTag(1, c2228871CLl2.biz_info) + c2228871CLl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228871CLl redact(C2228871CLl c2228871CLl) {
            C2228881CLm c2228881CLmNewBuilder = c2228871CLl.newBuilder();
            c2228881CLmNewBuilder.LIZLLL = C2228891CLn.ADAPTER.redact(c2228881CLmNewBuilder.LIZLLL);
            c2228881CLmNewBuilder.clearUnknownFields();
            return c2228881CLmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228871CLl c2228871CLl) {
            C2228871CLl c2228871CLl2 = c2228871CLl;
            C2228891CLn.ADAPTER.encodeWithTag(protoWriter, 1, c2228871CLl2.biz_info);
            protoWriter.writeBytes(c2228871CLl2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2228891CLn biz_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.biz_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228881CLm newBuilder() {
        C2228881CLm c2228881CLm = new C2228881CLm();
        c2228881CLm.LIZLLL = this.biz_info;
        c2228881CLm.addUnknownFields(unknownFields());
        return c2228881CLm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", biz_info=");
        sb.append(this.biz_info);
        sb.replace(0, 2, "FuncParamsXc48cb332fac13c75{");
        sb.append('}');
        return sb.toString();
    }

    public C2228871CLl(C2228891CLn c2228891CLn) {
        this(c2228891CLn, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228871CLl)) {
            return false;
        }
        C2228871CLl c2228871CLl = (C2228871CLl) obj;
        if (unknownFields().equals(c2228871CLl.unknownFields()) && this.biz_info.equals(c2228871CLl.biz_info)) {
            return true;
        }
        return false;
    }

    public C2228871CLl(C2228891CLn c2228891CLn, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_info = c2228891CLn;
    }
}
