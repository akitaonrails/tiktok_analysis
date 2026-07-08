package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233531CbP extends Message<C2233531CbP, C2233561CbS> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233611CbX biz_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long group_channel_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2233581CbU layout;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSpotInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<C2233171Cap> spot_list;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CW4> ui_pos_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long version;
    public static final ProtoAdapter<C2233531CbP> ADAPTER = new ProtoAdapter<C2233531CbP>() { // from class: X.1CbQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233531CbP decode(ProtoReader protoReader) {
            C2233561CbS c2233561CbS = new C2233561CbS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2233561CbS.LIZLLL = C2233611CbX.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2233561CbS.LJ = C2233581CbU.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2233561CbS.LJFF.add(C2233171Cap.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c2233561CbS.LJI.add(C1CW4.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c2233561CbS.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2233561CbS.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233561CbS.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233561CbS.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233531CbP c2233531CbP) {
            C2233531CbP c2233531CbP2 = c2233531CbP;
            int iEncodedSizeWithTag = C2233611CbX.ADAPTER.encodedSizeWithTag(1, c2233531CbP2.biz_source) + C2233581CbU.ADAPTER.encodedSizeWithTag(2, c2233531CbP2.layout) + C2233171Cap.ADAPTER.asRepeated().encodedSizeWithTag(3, c2233531CbP2.spot_list) + C1CW4.ADAPTER.asRepeated().encodedSizeWithTag(4, c2233531CbP2.ui_pos_list);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, c2233531CbP2.version) + protoAdapter.encodedSizeWithTag(6, c2233531CbP2.group_channel_id) + c2233531CbP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233531CbP redact(C2233531CbP c2233531CbP) {
            C2233561CbS c2233561CbSNewBuilder = c2233531CbP.newBuilder();
            c2233561CbSNewBuilder.LIZLLL = C2233611CbX.ADAPTER.redact(c2233561CbSNewBuilder.LIZLLL);
            c2233561CbSNewBuilder.LJ = C2233581CbU.ADAPTER.redact(c2233561CbSNewBuilder.LJ);
            C1516540pZE.LJIIIZ(c2233561CbSNewBuilder.LJFF, C2233171Cap.ADAPTER);
            C1516540pZE.LJIIIZ(c2233561CbSNewBuilder.LJI, C1CW4.ADAPTER);
            c2233561CbSNewBuilder.clearUnknownFields();
            return c2233561CbSNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233531CbP c2233531CbP) {
            C2233531CbP c2233531CbP2 = c2233531CbP;
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 1, c2233531CbP2.biz_source);
            C2233581CbU.ADAPTER.encodeWithTag(protoWriter, 2, c2233531CbP2.layout);
            C2233171Cap.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c2233531CbP2.spot_list);
            C1CW4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c2233531CbP2.ui_pos_list);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 5, c2233531CbP2.version);
            protoAdapter.encodeWithTag(protoWriter, 6, c2233531CbP2.group_channel_id);
            protoWriter.writeBytes(c2233531CbP2.unknownFields());
        }
    };
    public static final Long DEFAULT_VERSION = 0L;
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.biz_source.hashCode()) * 37) + this.layout.hashCode()) * 37) + this.spot_list.hashCode()) * 37) + this.ui_pos_list.hashCode()) * 37) + this.version.hashCode()) * 37) + this.group_channel_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233561CbS newBuilder() {
        C2233561CbS c2233561CbS = new C2233561CbS();
        c2233561CbS.LIZLLL = this.biz_source;
        c2233561CbS.LJ = this.layout;
        c2233561CbS.LJFF = C1516540pZE.LIZJ("spot_list", this.spot_list);
        c2233561CbS.LJI = C1516540pZE.LIZJ("ui_pos_list", this.ui_pos_list);
        c2233561CbS.LJII = this.version;
        c2233561CbS.LJIIIIZZ = this.group_channel_id;
        c2233561CbS.addUnknownFields(unknownFields());
        return c2233561CbS;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", biz_source=");
        sb.append(this.biz_source);
        sb.append(", layout=");
        sb.append(this.layout);
        if (!this.spot_list.isEmpty()) {
            sb.append(", spot_list=");
            sb.append(this.spot_list);
        }
        if (!this.ui_pos_list.isEmpty()) {
            sb.append(", ui_pos_list=");
            sb.append(this.ui_pos_list);
        }
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.replace(0, 2, "LinkMicLayoutData{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233531CbP)) {
            return false;
        }
        C2233531CbP c2233531CbP = (C2233531CbP) obj;
        if (unknownFields().equals(c2233531CbP.unknownFields()) && this.biz_source.equals(c2233531CbP.biz_source) && this.layout.equals(c2233531CbP.layout) && this.spot_list.equals(c2233531CbP.spot_list) && this.ui_pos_list.equals(c2233531CbP.ui_pos_list) && this.version.equals(c2233531CbP.version) && this.group_channel_id.equals(c2233531CbP.group_channel_id)) {
            return true;
        }
        return false;
    }

    public C2233531CbP(C2233611CbX c2233611CbX, C2233581CbU c2233581CbU, List<C2233171Cap> list, List<C1CW4> list2, Long l, Long l2) {
        this(c2233611CbX, c2233581CbU, list, list2, l, l2, ByteString.EMPTY);
    }

    public C2233531CbP(C2233611CbX c2233611CbX, C2233581CbU c2233581CbU, List<C2233171Cap> list, List<C1CW4> list2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_source = c2233611CbX;
        this.layout = c2233581CbU;
        this.spot_list = C1516540pZE.LJFF("spot_list", list);
        this.ui_pos_list = C1516540pZE.LJFF("ui_pos_list", list2);
        this.version = l;
        this.group_channel_id = l2;
    }
}
