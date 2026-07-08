package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Yxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891130Yxb extends Message<C891130Yxb, C891190Yxh> {
    public static final ProtoAdapter<C891130Yxb> ADAPTER = new ProtoAdapter<C891130Yxb>() { // from class: X.0Yxc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891130Yxb decode(ProtoReader protoReader) {
            C891190Yxh c891190Yxh = new C891190Yxh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c891190Yxh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c891190Yxh.LJ = C891170Yxf.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c891190Yxh.LIZLLL = C891160Yxe.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c891190Yxh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C891130Yxb c891130Yxb) {
            C891130Yxb c891130Yxb2 = c891130Yxb;
            return C891160Yxe.ADAPTER.encodedSizeWithTag(1, c891130Yxb2.alert_tone) + C891170Yxf.ADAPTER.encodedSizeWithTag(2, c891130Yxb2.voip_notification) + c891130Yxb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891130Yxb redact(C891130Yxb c891130Yxb) {
            C891190Yxh c891190YxhNewBuilder = c891130Yxb.newBuilder();
            C891160Yxe c891160Yxe = c891190YxhNewBuilder.LIZLLL;
            if (c891160Yxe != null) {
                c891190YxhNewBuilder.LIZLLL = C891160Yxe.ADAPTER.redact(c891160Yxe);
            }
            C891170Yxf c891170Yxf = c891190YxhNewBuilder.LJ;
            if (c891170Yxf != null) {
                c891190YxhNewBuilder.LJ = C891170Yxf.ADAPTER.redact(c891170Yxf);
            }
            c891190YxhNewBuilder.clearUnknownFields();
            return c891190YxhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C891130Yxb c891130Yxb) {
            C891130Yxb c891130Yxb2 = c891130Yxb;
            C891160Yxe.ADAPTER.encodeWithTag(protoWriter, 1, c891130Yxb2.alert_tone);
            C891170Yxf.ADAPTER.encodeWithTag(protoWriter, 2, c891130Yxb2.voip_notification);
            protoWriter.writeBytes(c891130Yxb2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.AlertToneExt#ADAPTER", tag = 1)
    public final C891160Yxe alert_tone;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.VoipNotificationExt#ADAPTER", tag = 2)
    public final C891170Yxf voip_notification;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C891160Yxe c891160Yxe = this.alert_tone;
        int iHashCode2 = (iHashCode + (c891160Yxe != null ? c891160Yxe.hashCode() : 0)) * 37;
        C891170Yxf c891170Yxf = this.voip_notification;
        int iHashCode3 = iHashCode2 + (c891170Yxf != null ? c891170Yxf.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C891190Yxh newBuilder() {
        C891190Yxh c891190Yxh = new C891190Yxh();
        c891190Yxh.LIZLLL = this.alert_tone;
        c891190Yxh.LJ = this.voip_notification;
        c891190Yxh.addUnknownFields(unknownFields());
        return c891190Yxh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.alert_tone != null) {
            sb.append(", alert_tone=");
            sb.append(this.alert_tone);
        }
        if (this.voip_notification != null) {
            sb.append(", voip_notification=");
            sb.append(this.voip_notification);
        }
        sb.replace(0, 2, "SettingPersistentExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C891130Yxb)) {
            return false;
        }
        C891130Yxb c891130Yxb = (C891130Yxb) obj;
        if (unknownFields().equals(c891130Yxb.unknownFields()) && C1516540pZE.LJ(this.alert_tone, c891130Yxb.alert_tone) && C1516540pZE.LJ(this.voip_notification, c891130Yxb.voip_notification)) {
            return true;
        }
        return false;
    }

    public C891130Yxb(C891160Yxe c891160Yxe, C891170Yxf c891170Yxf) {
        this(c891160Yxe, c891170Yxf, ByteString.EMPTY);
    }

    public C891130Yxb(C891160Yxe c891160Yxe, C891170Yxf c891170Yxf, ByteString byteString) {
        super(ADAPTER, byteString);
        this.alert_tone = c891160Yxe;
        this.voip_notification = c891170Yxf;
    }
}
