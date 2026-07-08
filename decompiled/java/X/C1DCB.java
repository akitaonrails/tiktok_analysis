package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DCB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCB extends Message<C1DCB, C1DC9> {
    public static final ProtoAdapter<C1DCB> ADAPTER = new ProtoAdapter<C1DCB>() { // from class: X.1DCA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DCB decode(ProtoReader protoReader) {
            C1DC9 c1dc9 = new C1DC9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dc9.LIZLLL.add(C1DCH.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c1dc9.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1dc9.LJFF.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            c1dc9.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1dc9.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1dc9.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1dc9.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c1dc9.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1dc9.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1dc9.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1dc9.LJIILIIL = C2251481DAk.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1dc9.LJIILJJIL = C2251481DAk.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1dc9.LJIILL.add(C2251371D9z.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            c1dc9.LJIILLIIL = C2251671DBd.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c1dc9.LJIIZILJ = C1517790pbF.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c1dc9.LJIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dc9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dc9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DCB c1dcb) {
            C1DCB c1dcb2 = c1dcb;
            int iEncodedSizeWithTag = C1DCH.ADAPTER.asRepeated().encodedSizeWithTag(1, c1dcb2.consumption_items);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1dcb2.day_view_time);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.asRepeated().encodedSizeWithTag(3, c1dcb2.client_cache);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(4, c1dcb2.last_ad_timestamp) + protoAdapter2.encodedSizeWithTag(5, c1dcb2.last_show_lives) + protoAdapter2.encodedSizeWithTag(6, c1dcb2.last_play_lives) + protoAdapter.encodedSizeWithTag(7, c1dcb2.batch_num) + protoAdapter.encodedSizeWithTag(8, c1dcb2.batch_num_all) + protoAdapter.encodedSizeWithTag(9, c1dcb2.play_num) + protoAdapter.encodedSizeWithTag(10, c1dcb2.play_num_all);
            ProtoAdapter<C2251481DAk> protoAdapter4 = C2251481DAk.ADAPTER;
            return iEncodedSizeWithTag4 + protoAdapter4.encodedSizeWithTag(11, c1dcb2.last_session_unconsumptioned_items) + protoAdapter4.encodedSizeWithTag(12, c1dcb2.un_consumed_list) + C2251371D9z.ADAPTER.asRepeated().encodedSizeWithTag(13, c1dcb2.onboarding_signal_list) + C2251671DBd.ADAPTER.encodedSizeWithTag(14, c1dcb2.poi_num) + C1517790pbF.ADAPTER.encodedSizeWithTag(15, c1dcb2.refresh_trigger_signal) + protoAdapter3.encodedSizeWithTag(16, c1dcb2.general_context_timestamp) + c1dcb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DCB c1dcb) {
            C1DCB c1dcb2 = c1dcb;
            C1DCH.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1dcb2.consumption_items);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c1dcb2.day_view_time);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, c1dcb2.client_cache);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 4, c1dcb2.last_ad_timestamp);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1dcb2.last_show_lives);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1dcb2.last_play_lives);
            protoAdapter.encodeWithTag(protoWriter, 7, c1dcb2.batch_num);
            protoAdapter.encodeWithTag(protoWriter, 8, c1dcb2.batch_num_all);
            protoAdapter.encodeWithTag(protoWriter, 9, c1dcb2.play_num);
            protoAdapter.encodeWithTag(protoWriter, 10, c1dcb2.play_num_all);
            ProtoAdapter<C2251481DAk> protoAdapter4 = C2251481DAk.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 11, c1dcb2.last_session_unconsumptioned_items);
            protoAdapter4.encodeWithTag(protoWriter, 12, c1dcb2.un_consumed_list);
            C2251371D9z.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, c1dcb2.onboarding_signal_list);
            C2251671DBd.ADAPTER.encodeWithTag(protoWriter, 14, c1dcb2.poi_num);
            C1517790pbF.ADAPTER.encodeWithTag(protoWriter, 15, c1dcb2.refresh_trigger_signal);
            protoAdapter3.encodeWithTag(protoWriter, 16, c1dcb2.general_context_timestamp);
            protoWriter.writeBytes(c1dcb2.unknownFields());
        }
    };
    public Integer batch_num;
    public Integer batch_num_all;
    public List<String> client_cache;
    public List<C1DCH> consumption_items;
    public Integer day_view_time;
    public Long general_context_timestamp;
    public Long last_ad_timestamp;
    public String last_play_lives;
    public C2251481DAk last_session_unconsumptioned_items;
    public String last_show_lives;
    public List<C2251371D9z> onboarding_signal_list;
    public Integer play_num;
    public Integer play_num_all;
    public C2251671DBd poi_num;
    public C1517790pbF refresh_trigger_signal;
    public C2251481DAk un_consumed_list;

    @Override // com.squareup.wire.Message
    public C1DC9 newBuilder() {
        return null;
    }

    public C1DCB(List<C1DCH> list, Integer num, List<String> list2, Long l, String str, String str2, Integer num2, Integer num3, Integer num4, Integer num5, C2251481DAk c2251481DAk, C2251481DAk c2251481DAk2, List<C2251371D9z> list3, C2251671DBd c2251671DBd, C1517790pbF c1517790pbF, Long l2) {
        this(list, num, list2, l, str, str2, num2, num3, num4, num5, c2251481DAk, c2251481DAk2, list3, c2251671DBd, c1517790pbF, l2, ByteString.EMPTY);
    }

    public C1DCB(List<C1DCH> list, Integer num, List<String> list2, Long l, String str, String str2, Integer num2, Integer num3, Integer num4, Integer num5, C2251481DAk c2251481DAk, C2251481DAk c2251481DAk2, List<C2251371D9z> list3, C2251671DBd c2251671DBd, C1517790pbF c1517790pbF, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.consumption_items = C1516540pZE.LJFF("consumption_items", list);
        this.day_view_time = num;
        this.client_cache = C1516540pZE.LJFF("client_cache", list2);
        this.last_ad_timestamp = l;
        this.last_show_lives = str;
        this.last_play_lives = str2;
        this.batch_num = num2;
        this.batch_num_all = num3;
        this.play_num = num4;
        this.play_num_all = num5;
        this.last_session_unconsumptioned_items = c2251481DAk;
        this.un_consumed_list = c2251481DAk2;
        this.onboarding_signal_list = C1516540pZE.LJFF("onboarding_signal_list", list3);
        this.poi_num = c2251671DBd;
        this.refresh_trigger_signal = c1517790pbF;
        this.general_context_timestamp = l2;
    }
}
