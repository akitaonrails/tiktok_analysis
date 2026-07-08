package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227501CGe extends Message<C2227501CGe, C2227511CGf> {
    public static final ProtoAdapter<C2227501CGe> ADAPTER = new ProtoAdapter<C2227501CGe>() { // from class: X.1CGd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227501CGe decode(ProtoReader protoReader) {
            C2227511CGf c2227511CGf = new C2227511CGf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227511CGf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227511CGf.LJ = C2227471CGb.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227511CGf.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227511CGf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227501CGe c2227501CGe) {
            C2227501CGe c2227501CGe2 = c2227501CGe;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2227501CGe2.invoke_id) + C2227471CGb.ADAPTER.encodedSizeWithTag(2, c2227501CGe2.biz_params) + c2227501CGe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227501CGe redact(C2227501CGe c2227501CGe) {
            C2227511CGf c2227511CGfNewBuilder = c2227501CGe.newBuilder();
            C2227471CGb c2227471CGb = c2227511CGfNewBuilder.LJ;
            if (c2227471CGb != null) {
                c2227511CGfNewBuilder.LJ = C2227471CGb.ADAPTER.redact(c2227471CGb);
            }
            c2227511CGfNewBuilder.clearUnknownFields();
            return c2227511CGfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227501CGe c2227501CGe) {
            C2227501CGe c2227501CGe2 = c2227501CGe;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2227501CGe2.invoke_id);
            C2227471CGb.ADAPTER.encodeWithTag(protoWriter, 2, c2227501CGe2.biz_params);
            protoWriter.writeBytes(c2227501CGe2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizCancelApplyParams#ADAPTER", tag = 2)
    public final C2227471CGb biz_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37;
        C2227471CGb c2227471CGb = this.biz_params;
        int iHashCode2 = iHashCode + (c2227471CGb != null ? c2227471CGb.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2227511CGf newBuilder() {
        C2227511CGf c2227511CGf = new C2227511CGf();
        c2227511CGf.LIZLLL = this.invoke_id;
        c2227511CGf.LJ = this.biz_params;
        c2227511CGf.addUnknownFields(unknownFields());
        return c2227511CGf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        if (this.biz_params != null) {
            sb.append(", biz_params=");
            sb.append(this.biz_params);
        }
        sb.replace(0, 2, "LinkMicCancelApplyParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227501CGe)) {
            return false;
        }
        C2227501CGe c2227501CGe = (C2227501CGe) obj;
        if (unknownFields().equals(c2227501CGe.unknownFields()) && this.invoke_id.equals(c2227501CGe.invoke_id) && C1516540pZE.LJ(this.biz_params, c2227501CGe.biz_params)) {
            return true;
        }
        return false;
    }

    public C2227501CGe(String str, C2227471CGb c2227471CGb) {
        this(str, c2227471CGb, ByteString.EMPTY);
    }

    public C2227501CGe(String str, C2227471CGb c2227471CGb, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.biz_params = c2227471CGb;
    }
}
