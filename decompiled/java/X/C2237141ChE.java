package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237141ChE extends Message<C2237141ChE, C2237161ChG> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAppInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2237171ChH app_info;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C1CIG biz_provider;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C1CIG event_monitor;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C1CIG http_client;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_anchor;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C1CIG log_handler;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final C1CIG message_center;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLiveRoom#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2236901Cgq room_model;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final C1CIG rtc_provider;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long self_uid;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C1CIG task_dispatcher;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C1CIG timer;
    public static final ProtoAdapter<C2237141ChE> ADAPTER = new ProtoAdapter<C2237141ChE>() { // from class: X.1ChF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237141ChE decode(ProtoReader protoReader) {
            C2237161ChG c2237161ChG = new C2237161ChG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237161ChG.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2237161ChG.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2237161ChG.LJFF = C2236901Cgq.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2237161ChG.LJI = C2237171ChH.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2237161ChG.LJII = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2237161ChG.LJIIIIZZ = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2237161ChG.LJIIIZ = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2237161ChG.LJIIJ = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2237161ChG.LJIIJJI = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2237161ChG.LJIIL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2237161ChG.LJIILIIL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2237161ChG.LJIILJJIL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237161ChG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237161ChG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237141ChE c2237141ChE) {
            C2237141ChE c2237141ChE2 = c2237141ChE;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c2237141ChE2.self_uid) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2237141ChE2.is_anchor) + C2236901Cgq.ADAPTER.encodedSizeWithTag(3, c2237141ChE2.room_model) + C2237171ChH.ADAPTER.encodedSizeWithTag(4, c2237141ChE2.app_info);
            ProtoAdapter<C1CIG> protoAdapter = C1CIG.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, c2237141ChE2.log_handler) + protoAdapter.encodedSizeWithTag(6, c2237141ChE2.timer) + protoAdapter.encodedSizeWithTag(7, c2237141ChE2.http_client) + protoAdapter.encodedSizeWithTag(8, c2237141ChE2.message_center) + protoAdapter.encodedSizeWithTag(9, c2237141ChE2.rtc_provider) + protoAdapter.encodedSizeWithTag(10, c2237141ChE2.biz_provider) + protoAdapter.encodedSizeWithTag(11, c2237141ChE2.event_monitor) + protoAdapter.encodedSizeWithTag(12, c2237141ChE2.task_dispatcher) + c2237141ChE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237141ChE redact(C2237141ChE c2237141ChE) {
            C2237161ChG c2237161ChGNewBuilder = c2237141ChE.newBuilder();
            c2237161ChGNewBuilder.LJFF = C2236901Cgq.ADAPTER.redact(c2237161ChGNewBuilder.LJFF);
            c2237161ChGNewBuilder.LJI = C2237171ChH.ADAPTER.redact(c2237161ChGNewBuilder.LJI);
            ProtoAdapter<C1CIG> protoAdapter = C1CIG.ADAPTER;
            c2237161ChGNewBuilder.LJII = protoAdapter.redact(c2237161ChGNewBuilder.LJII);
            c2237161ChGNewBuilder.LJIIIIZZ = protoAdapter.redact(c2237161ChGNewBuilder.LJIIIIZZ);
            c2237161ChGNewBuilder.LJIIIZ = protoAdapter.redact(c2237161ChGNewBuilder.LJIIIZ);
            c2237161ChGNewBuilder.LJIIJ = protoAdapter.redact(c2237161ChGNewBuilder.LJIIJ);
            c2237161ChGNewBuilder.LJIIJJI = protoAdapter.redact(c2237161ChGNewBuilder.LJIIJJI);
            c2237161ChGNewBuilder.LJIIL = protoAdapter.redact(c2237161ChGNewBuilder.LJIIL);
            C1CIG c1cig = c2237161ChGNewBuilder.LJIILIIL;
            if (c1cig != null) {
                c2237161ChGNewBuilder.LJIILIIL = protoAdapter.redact(c1cig);
            }
            C1CIG c1cig2 = c2237161ChGNewBuilder.LJIILJJIL;
            if (c1cig2 != null) {
                c2237161ChGNewBuilder.LJIILJJIL = protoAdapter.redact(c1cig2);
            }
            c2237161ChGNewBuilder.clearUnknownFields();
            return c2237161ChGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237141ChE c2237141ChE) {
            C2237141ChE c2237141ChE2 = c2237141ChE;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2237141ChE2.self_uid);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2237141ChE2.is_anchor);
            C2236901Cgq.ADAPTER.encodeWithTag(protoWriter, 3, c2237141ChE2.room_model);
            C2237171ChH.ADAPTER.encodeWithTag(protoWriter, 4, c2237141ChE2.app_info);
            ProtoAdapter<C1CIG> protoAdapter = C1CIG.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 5, c2237141ChE2.log_handler);
            protoAdapter.encodeWithTag(protoWriter, 6, c2237141ChE2.timer);
            protoAdapter.encodeWithTag(protoWriter, 7, c2237141ChE2.http_client);
            protoAdapter.encodeWithTag(protoWriter, 8, c2237141ChE2.message_center);
            protoAdapter.encodeWithTag(protoWriter, 9, c2237141ChE2.rtc_provider);
            protoAdapter.encodeWithTag(protoWriter, 10, c2237141ChE2.biz_provider);
            protoAdapter.encodeWithTag(protoWriter, 11, c2237141ChE2.event_monitor);
            protoAdapter.encodeWithTag(protoWriter, 12, c2237141ChE2.task_dispatcher);
            protoWriter.writeBytes(c2237141ChE2.unknownFields());
        }
    };
    public static final Long DEFAULT_SELF_UID = 0L;
    public static final Boolean DEFAULT_IS_ANCHOR = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((unknownFields().hashCode() * 37) + this.self_uid.hashCode()) * 37) + this.is_anchor.hashCode()) * 37) + this.room_model.hashCode()) * 37) + this.app_info.hashCode()) * 37) + this.log_handler.hashCode()) * 37) + this.timer.hashCode()) * 37) + this.http_client.hashCode()) * 37) + this.message_center.hashCode()) * 37) + this.rtc_provider.hashCode()) * 37) + this.biz_provider.hashCode()) * 37;
        C1CIG c1cig = this.event_monitor;
        int iHashCode2 = (iHashCode + (c1cig != null ? c1cig.hashCode() : 0)) * 37;
        C1CIG c1cig2 = this.task_dispatcher;
        int iHashCode3 = iHashCode2 + (c1cig2 != null ? c1cig2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2237161ChG newBuilder() {
        C2237161ChG c2237161ChG = new C2237161ChG();
        c2237161ChG.LIZLLL = this.self_uid;
        c2237161ChG.LJ = this.is_anchor;
        c2237161ChG.LJFF = this.room_model;
        c2237161ChG.LJI = this.app_info;
        c2237161ChG.LJII = this.log_handler;
        c2237161ChG.LJIIIIZZ = this.timer;
        c2237161ChG.LJIIIZ = this.http_client;
        c2237161ChG.LJIIJ = this.message_center;
        c2237161ChG.LJIIJJI = this.rtc_provider;
        c2237161ChG.LJIIL = this.biz_provider;
        c2237161ChG.LJIILIIL = this.event_monitor;
        c2237161ChG.LJIILJJIL = this.task_dispatcher;
        c2237161ChG.addUnknownFields(unknownFields());
        return c2237161ChG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", self_uid=");
        sb.append(this.self_uid);
        sb.append(", is_anchor=");
        sb.append(this.is_anchor);
        sb.append(", room_model=");
        sb.append(this.room_model);
        sb.append(", app_info=");
        sb.append(this.app_info);
        sb.append(", log_handler=");
        sb.append(this.log_handler);
        sb.append(", timer=");
        sb.append(this.timer);
        sb.append(", http_client=");
        sb.append(this.http_client);
        sb.append(", message_center=");
        sb.append(this.message_center);
        sb.append(", rtc_provider=");
        sb.append(this.rtc_provider);
        sb.append(", biz_provider=");
        sb.append(this.biz_provider);
        if (this.event_monitor != null) {
            sb.append(", event_monitor=");
            sb.append(this.event_monitor);
        }
        if (this.task_dispatcher != null) {
            sb.append(", task_dispatcher=");
            sb.append(this.task_dispatcher);
        }
        sb.replace(0, 2, "FuncParamsX9750604dcf45e7ac{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237141ChE)) {
            return false;
        }
        C2237141ChE c2237141ChE = (C2237141ChE) obj;
        if (unknownFields().equals(c2237141ChE.unknownFields()) && this.self_uid.equals(c2237141ChE.self_uid) && this.is_anchor.equals(c2237141ChE.is_anchor) && this.room_model.equals(c2237141ChE.room_model) && this.app_info.equals(c2237141ChE.app_info) && this.log_handler.equals(c2237141ChE.log_handler) && this.timer.equals(c2237141ChE.timer) && this.http_client.equals(c2237141ChE.http_client) && this.message_center.equals(c2237141ChE.message_center) && this.rtc_provider.equals(c2237141ChE.rtc_provider) && this.biz_provider.equals(c2237141ChE.biz_provider) && C1516540pZE.LJ(this.event_monitor, c2237141ChE.event_monitor) && C1516540pZE.LJ(this.task_dispatcher, c2237141ChE.task_dispatcher)) {
            return true;
        }
        return false;
    }

    public C2237141ChE(Long l, Boolean bool, C2236901Cgq c2236901Cgq, C2237171ChH c2237171ChH, C1CIG c1cig, C1CIG c1cig2, C1CIG c1cig3, C1CIG c1cig4, C1CIG c1cig5, C1CIG c1cig6, C1CIG c1cig7, C1CIG c1cig8) {
        this(l, bool, c2236901Cgq, c2237171ChH, c1cig, c1cig2, c1cig3, c1cig4, c1cig5, c1cig6, c1cig7, c1cig8, ByteString.EMPTY);
    }

    public C2237141ChE(Long l, Boolean bool, C2236901Cgq c2236901Cgq, C2237171ChH c2237171ChH, C1CIG c1cig, C1CIG c1cig2, C1CIG c1cig3, C1CIG c1cig4, C1CIG c1cig5, C1CIG c1cig6, C1CIG c1cig7, C1CIG c1cig8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.self_uid = l;
        this.is_anchor = bool;
        this.room_model = c2236901Cgq;
        this.app_info = c2237171ChH;
        this.log_handler = c1cig;
        this.timer = c1cig2;
        this.http_client = c1cig3;
        this.message_center = c1cig4;
        this.rtc_provider = c1cig5;
        this.biz_provider = c1cig6;
        this.event_monitor = c1cig7;
        this.task_dispatcher = c1cig8;
    }
}
