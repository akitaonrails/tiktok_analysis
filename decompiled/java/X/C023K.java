package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.023K, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C023K extends Message<C023K, C5319025l> {
    public static final ProtoAdapter<C023K> ADAPTER = new ProtoAdapter<C023K>() { // from class: X.023L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C023K decode(ProtoReader protoReader) {
            C5319025l c5319025l = new C5319025l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        if (iNextTag != 101) {
                            switch (iNextTag) {
                                case 1:
                                    c5319025l.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    c5319025l.LJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    c5319025l.LJFF.add(ProtoAdapter.STRING.decode(protoReader));
                                    break;
                                case 4:
                                    c5319025l.LJI = C02U1.ADAPTER.decode(protoReader);
                                    break;
                                case 5:
                                    c5319025l.LJII = C02U1.ADAPTER.decode(protoReader);
                                    break;
                                case 6:
                                    c5319025l.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 7:
                                    c5319025l.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 8:
                                    c5319025l.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c5319025l.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c5319025l.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c5319025l.LJIILIIL = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    c5319025l.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    c5319025l.LJIILL = C02U1.ADAPTER.decode(protoReader);
                                    break;
                                case 14:
                                    c5319025l.LJIILLIIL = C02U1.ADAPTER.decode(protoReader);
                                    break;
                                case 15:
                                    c5319025l.LJIIZILJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 16:
                                    c5319025l.LJIJ = C02U1.ADAPTER.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    c5319025l.LJIJI = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c5319025l.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c5319025l.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c5319025l.LJIJJ.add(C02H9.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5319025l.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C023K c023k) {
            C023K c023k2 = c023k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c023k2.id) + protoAdapter.encodedSizeWithTag(2, c023k2.name) + protoAdapter.asRepeated().encodedSizeWithTag(3, c023k2.subheaders);
            ProtoAdapter<C02U1> protoAdapter2 = C02U1.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c023k2.icon) + protoAdapter2.encodedSizeWithTag(5, c023k2.back_ground);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c023k2.style) + protoAdapter3.encodedSizeWithTag(7, c023k2.type) + protoAdapter.encodedSizeWithTag(8, c023k2.countdown) + protoAdapter.encodedSizeWithTag(9, c023k2.start_time) + protoAdapter.encodedSizeWithTag(10, c023k2.end_time) + protoAdapter3.encodedSizeWithTag(11, c023k2.status) + protoAdapter.encodedSizeWithTag(12, c023k2.price) + protoAdapter2.encodedSizeWithTag(13, c023k2.waist_img) + protoAdapter2.encodedSizeWithTag(14, c023k2.addition_waist_img) + protoAdapter.encodedSizeWithTag(15, c023k2.voucher_id) + protoAdapter2.encodedSizeWithTag(16, c023k2.dark_icon) + protoAdapter.encodedSizeWithTag(17, c023k2.preview_show_text) + C02H9.ADAPTER.asRepeated().encodedSizeWithTag(100, c023k2.extra_property) + protoAdapter.encodedSizeWithTag(101, c023k2.log_extra) + c023k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C023K c023k) {
        }
    };
    public C02U1 addition_waist_img;
    public C02U1 back_ground;
    public String countdown;
    public C02U1 dark_icon;
    public String end_time;
    public List<C02H9> extra_property;
    public C02U1 icon;
    public String id;
    public String log_extra;
    public String name;
    public String preview_show_text;
    public String price;
    public String start_time;
    public Integer status;
    public Integer style;
    public List<String> subheaders;
    public Integer type;
    public String voucher_id;
    public C02U1 waist_img;

    public C023K() {
    }

    @Override // com.squareup.wire.Message
    public C5319025l newBuilder() {
        return null;
    }

    public C023K(String str, String str2, List<String> list, C02U1 c02u1, C02U1 c02u12, Integer num, Integer num2, String str3, String str4, String str5, Integer num3, String str6, C02U1 c02u13, C02U1 c02u14, String str7, C02U1 c02u15, String str8, List<C02H9> list2, String str9) {
        this(str, str2, list, c02u1, c02u12, num, num2, str3, str4, str5, num3, str6, c02u13, c02u14, str7, c02u15, str8, list2, str9, ByteString.EMPTY);
    }

    public C023K(String str, String str2, List<String> list, C02U1 c02u1, C02U1 c02u12, Integer num, Integer num2, String str3, String str4, String str5, Integer num3, String str6, C02U1 c02u13, C02U1 c02u14, String str7, C02U1 c02u15, String str8, List<C02H9> list2, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.subheaders = C1516540pZE.LJFF("subheaders", list);
        this.icon = c02u1;
        this.back_ground = c02u12;
        this.style = num;
        this.type = num2;
        this.countdown = str3;
        this.start_time = str4;
        this.end_time = str5;
        this.status = num3;
        this.price = str6;
        this.waist_img = c02u13;
        this.addition_waist_img = c02u14;
        this.voucher_id = str7;
        this.dark_icon = c02u15;
        this.preview_show_text = str8;
        this.extra_property = C1516540pZE.LJFF("extra_property", list2);
        this.log_extra = str9;
    }
}
