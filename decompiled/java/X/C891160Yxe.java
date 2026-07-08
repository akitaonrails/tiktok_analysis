package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Yxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891160Yxe extends Message<C891160Yxe, C891200Yxi> {
    public static final ProtoAdapter<C891160Yxe> ADAPTER = new ProtoAdapter<C891160Yxe>() { // from class: X.0Yxd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891160Yxe decode(ProtoReader protoReader) {
            C891200Yxi c891200Yxi = new C891200Yxi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c891200Yxi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c891200Yxi.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c891200Yxi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C891160Yxe c891160Yxe) {
            C891160Yxe c891160Yxe2 = c891160Yxe;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c891160Yxe2.alert_tone_value) + c891160Yxe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891160Yxe redact(C891160Yxe c891160Yxe) {
            C891200Yxi c891200YxiNewBuilder = c891160Yxe.newBuilder();
            c891200YxiNewBuilder.clearUnknownFields();
            return c891200YxiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C891160Yxe c891160Yxe) {
            C891160Yxe c891160Yxe2 = c891160Yxe;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c891160Yxe2.alert_tone_value);
            protoWriter.writeBytes(c891160Yxe2.unknownFields());
        }
    };
    public static final Integer DEFAULT_ALERT_TONE_VALUE = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer alert_tone_value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.alert_tone_value;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C891200Yxi newBuilder() {
        C891200Yxi c891200Yxi = new C891200Yxi();
        c891200Yxi.LIZLLL = this.alert_tone_value;
        c891200Yxi.addUnknownFields(unknownFields());
        return c891200Yxi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.alert_tone_value != null) {
            sb.append(", alert_tone_value=");
            sb.append(this.alert_tone_value);
        }
        sb.replace(0, 2, "AlertToneExt{");
        sb.append('}');
        return sb.toString();
    }

    public C891160Yxe(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C891160Yxe)) {
            return false;
        }
        C891160Yxe c891160Yxe = (C891160Yxe) obj;
        if (unknownFields().equals(c891160Yxe.unknownFields()) && C1516540pZE.LJ(this.alert_tone_value, c891160Yxe.alert_tone_value)) {
            return true;
        }
        return false;
    }

    public C891160Yxe(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.alert_tone_value = num;
    }
}
