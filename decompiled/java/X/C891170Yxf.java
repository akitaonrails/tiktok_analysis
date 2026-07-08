package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Yxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891170Yxf extends Message<C891170Yxf, C891210Yxj> {
    public static final ProtoAdapter<C891170Yxf> ADAPTER = new ProtoAdapter<C891170Yxf>() { // from class: X.0Yxg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891170Yxf decode(ProtoReader protoReader) {
            C891210Yxj c891210Yxj = new C891210Yxj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c891210Yxj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c891210Yxj.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c891210Yxj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C891170Yxf c891170Yxf) {
            C891170Yxf c891170Yxf2 = c891170Yxf;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c891170Yxf2.voip_notification_value) + c891170Yxf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891170Yxf redact(C891170Yxf c891170Yxf) {
            C891210Yxj c891210YxjNewBuilder = c891170Yxf.newBuilder();
            c891210YxjNewBuilder.clearUnknownFields();
            return c891210YxjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C891170Yxf c891170Yxf) {
            C891170Yxf c891170Yxf2 = c891170Yxf;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c891170Yxf2.voip_notification_value);
            protoWriter.writeBytes(c891170Yxf2.unknownFields());
        }
    };
    public static final Integer DEFAULT_VOIP_NOTIFICATION_VALUE = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer voip_notification_value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.voip_notification_value;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C891210Yxj newBuilder() {
        C891210Yxj c891210Yxj = new C891210Yxj();
        c891210Yxj.LIZLLL = this.voip_notification_value;
        c891210Yxj.addUnknownFields(unknownFields());
        return c891210Yxj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.voip_notification_value != null) {
            sb.append(", voip_notification_value=");
            sb.append(this.voip_notification_value);
        }
        sb.replace(0, 2, "VoipNotificationExt{");
        sb.append('}');
        return sb.toString();
    }

    public C891170Yxf(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C891170Yxf)) {
            return false;
        }
        C891170Yxf c891170Yxf = (C891170Yxf) obj;
        if (unknownFields().equals(c891170Yxf.unknownFields()) && C1516540pZE.LJ(this.voip_notification_value, c891170Yxf.voip_notification_value)) {
            return true;
        }
        return false;
    }

    public C891170Yxf(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.voip_notification_value = num;
    }
}
