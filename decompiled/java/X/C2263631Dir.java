package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Dir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263631Dir extends Message<C2263631Dir, C2263651Dit> {
    public static final ProtoAdapter<C2263631Dir> ADAPTER = new ProtoAdapter<C2263631Dir>() { // from class: X.1Dis
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2263631Dir decode(ProtoReader protoReader) {
            C2263651Dit c2263651Dit = new C2263651Dit();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        if (iNextTag != 101) {
                            switch (iNextTag) {
                                case 1:
                                    c2263651Dit.LJ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 2:
                                    c2263651Dit.LJFF = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    c2263651Dit.LJI = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 4:
                                    c2263651Dit.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 5:
                                    c2263651Dit.LJIIIIZZ = C2263571Dil.ADAPTER.decode(protoReader);
                                    break;
                                case 6:
                                    c2263651Dit.LJIIIZ = C029C.ADAPTER.decode(protoReader);
                                    break;
                                case 7:
                                    c2263651Dit.LJIIJ = C1DAP.ADAPTER.decode(protoReader);
                                    break;
                                case 8:
                                    c2263651Dit.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c2263651Dit.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c2263651Dit.LJIILIIL = C1CHB.ADAPTER.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c2263651Dit.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    c2263651Dit.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    c2263651Dit.LJIILL = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 14:
                                    c2263651Dit.LJIILLIIL = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 15:
                                    c2263651Dit.LJIIZILJ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 16:
                                    c2263651Dit.LJIJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    c2263651Dit.LJIJI = C2263701Diy.ADAPTER.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    c2263651Dit.LJIJJ = C2223611C1f.ADAPTER.decode(protoReader);
                                    break;
                                case 19:
                                    c2263651Dit.LJIJJLI = C2263631Dir.ADAPTER.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    c2263651Dit.LJIL = C029C.ADAPTER.decode(protoReader);
                                    break;
                                case 21:
                                    c2263651Dit.LJJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 22:
                                    c2263651Dit.LJJI = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2263651Dit.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c2263651Dit.LJJII.putAll(this.LIZIZ.decode(protoReader));
                        }
                    } else {
                        c2263651Dit.LJJIFFI.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2263651Dit.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2263631Dir c2263631Dir) {
            C2263631Dir c2263631Dir2 = c2263631Dir;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(12, c2263631Dir2.out_desc);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(1, c2263631Dir2.type) + protoAdapter.encodedSizeWithTag(2, c2263631Dir2.text) + protoAdapter.encodedSizeWithTag(3, c2263631Dir2.link) + protoAdapter.encodedSizeWithTag(4, c2263631Dir2.name) + C2263571Dil.ADAPTER.encodedSizeWithTag(5, c2263631Dir2.pop_up);
            ProtoAdapter<C029C> protoAdapter3 = C029C.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c2263631Dir2.icon) + C1DAP.ADAPTER.encodedSizeWithTag(7, c2263631Dir2.bubble) + ProtoAdapter.BOOL.encodedSizeWithTag(8, c2263631Dir2.disable) + protoAdapter2.encodedSizeWithTag(9, c2263631Dir2.action) + C1CHB.ADAPTER.encodedSizeWithTag(10, c2263631Dir2.toast) + protoAdapter.encodedSizeWithTag(11, c2263631Dir2.copy_content) + protoAdapter2.encodedSizeWithTag(13, c2263631Dir2.jump_type) + protoAdapter2.encodedSizeWithTag(14, c2263631Dir2.sheet_type) + protoAdapter2.encodedSizeWithTag(15, c2263631Dir2.exit_page_event) + protoAdapter.encodedSizeWithTag(16, c2263631Dir2.disable_hover) + C2263701Diy.ADAPTER.encodedSizeWithTag(17, c2263631Dir2.tooltip) + C2223611C1f.ADAPTER.encodedSizeWithTag(18, c2263631Dir2.pre_action) + C2263631Dir.ADAPTER.encodedSizeWithTag(19, c2263631Dir2.add_to_cart_button) + protoAdapter3.encodedSizeWithTag(20, c2263631Dir2.suffix_icon) + protoAdapter.encodedSizeWithTag(21, c2263631Dir2.color) + protoAdapter.encodedSizeWithTag(22, c2263631Dir2.dark_color) + this.LIZ.encodedSizeWithTag(100, c2263631Dir2.extra) + this.LIZIZ.encodedSizeWithTag(101, c2263631Dir2.da_info) + c2263631Dir2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2263631Dir c2263631Dir) {
        }
    };
    public Integer action;
    public C2263631Dir add_to_cart_button;
    public C1DAP bubble;
    public String color;
    public String copy_content;
    public Map<String, String> da_info;
    public String dark_color;
    public Boolean disable;
    public String disable_hover;
    public Integer exit_page_event;
    public Map<String, String> extra;
    public C029C icon;
    public Integer jump_type;
    public String link;
    public String name;
    public String out_desc;
    public C2263571Dil pop_up;
    public C2223611C1f pre_action;
    public Integer sheet_type;
    public C029C suffix_icon;
    public String text;
    public C1CHB toast;
    public C2263701Diy tooltip;
    public Integer type;

    public C2263631Dir() {
    }

    @Override // com.squareup.wire.Message
    public C2263651Dit newBuilder() {
        return null;
    }

    public C2263631Dir(String str, Integer num, String str2, String str3, String str4, C2263571Dil c2263571Dil, C029C c029c, C1DAP c1dap, Boolean bool, Integer num2, C1CHB c1chb, String str5, Integer num3, Integer num4, Integer num5, String str6, C2263701Diy c2263701Diy, C2223611C1f c2223611C1f, C2263631Dir c2263631Dir, C029C c029c2, String str7, String str8, Map<String, String> map, Map<String, String> map2) {
        this(str, num, str2, str3, str4, c2263571Dil, c029c, c1dap, bool, num2, c1chb, str5, num3, num4, num5, str6, c2263701Diy, c2223611C1f, c2263631Dir, c029c2, str7, str8, map, map2, ByteString.EMPTY);
    }

    public C2263631Dir(String str, Integer num, String str2, String str3, String str4, C2263571Dil c2263571Dil, C029C c029c, C1DAP c1dap, Boolean bool, Integer num2, C1CHB c1chb, String str5, Integer num3, Integer num4, Integer num5, String str6, C2263701Diy c2263701Diy, C2223611C1f c2223611C1f, C2263631Dir c2263631Dir, C029C c029c2, String str7, String str8, Map<String, String> map, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.out_desc = str;
        this.type = num;
        this.text = str2;
        this.link = str3;
        this.name = str4;
        this.pop_up = c2263571Dil;
        this.icon = c029c;
        this.bubble = c1dap;
        this.disable = bool;
        this.action = num2;
        this.toast = c1chb;
        this.copy_content = str5;
        this.jump_type = num3;
        this.sheet_type = num4;
        this.exit_page_event = num5;
        this.disable_hover = str6;
        this.tooltip = c2263701Diy;
        this.pre_action = c2223611C1f;
        this.add_to_cart_button = c2263631Dir;
        this.suffix_icon = c029c2;
        this.color = str7;
        this.dark_color = str8;
        this.extra = C1516540pZE.LJI("extra", map);
        this.da_info = C1516540pZE.LJI("da_info", map2);
    }
}
