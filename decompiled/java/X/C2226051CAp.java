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

/* JADX INFO: renamed from: X.1CAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226051CAp extends Message<C2226051CAp, C2226061CAq> {
    public static final ProtoAdapter<C2226051CAp> ADAPTER = new ProtoAdapter<C2226051CAp>() { // from class: X.1CAo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226051CAp decode(ProtoReader protoReader) {
            C2226051CAp c2226051CAp = new C2226051CAp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                c2226051CAp.style = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                c2226051CAp.icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c2226051CAp.title = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c2226051CAp.subtitle = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c2226051CAp.buttons.add(C2226111CAv.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                c2226051CAp.display_duration_sec = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 7:
                                c2226051CAp.is_dismissable = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                c2226051CAp.pop_up_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c2226051CAp.extra_info = C2226021CAm.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c2226051CAp.content.add(C2226081CAs.ADAPTER.decode(protoReader));
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c2226051CAp.is_icon_size_dynamic = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c2226051CAp.lynx_info = C1C2B.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c2226051CAp.page_padding = C1CB4.ADAPTER.decode(protoReader);
                                break;
                            case 14:
                                c2226051CAp.is_title_fixed_to_top = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 15:
                                c2226051CAp.popup_config = C1C3J.ADAPTER.decode(protoReader);
                                break;
                            case 16:
                                c2226051CAp.pdp_myna_banner_info = C1C73.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c2226051CAp.background = C2224711C5l.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c2226051CAp.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226051CAp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226051CAp c2226051CAp) {
            C2226051CAp c2226051CAp2 = c2226051CAp;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2226051CAp2.style) + C029C.ADAPTER.encodedSizeWithTag(2, c2226051CAp2.icon);
            ProtoAdapter<C5431029t> protoAdapter2 = C5431029t.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2226051CAp2.title) + protoAdapter2.encodedSizeWithTag(4, c2226051CAp2.subtitle) + C2226111CAv.ADAPTER.asRepeated().encodedSizeWithTag(5, c2226051CAp2.buttons) + protoAdapter.encodedSizeWithTag(6, c2226051CAp2.display_duration_sec);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c2226051CAp2.is_dismissable) + protoAdapter.encodedSizeWithTag(8, c2226051CAp2.pop_up_type) + C2226021CAm.ADAPTER.encodedSizeWithTag(9, c2226051CAp2.extra_info) + C2226081CAs.ADAPTER.asRepeated().encodedSizeWithTag(10, c2226051CAp2.content) + protoAdapter3.encodedSizeWithTag(11, c2226051CAp2.is_icon_size_dynamic) + C1C2B.ADAPTER.encodedSizeWithTag(12, c2226051CAp2.lynx_info) + C1CB4.ADAPTER.encodedSizeWithTag(13, c2226051CAp2.page_padding) + protoAdapter3.encodedSizeWithTag(14, c2226051CAp2.is_title_fixed_to_top) + C1C3J.ADAPTER.encodedSizeWithTag(15, c2226051CAp2.popup_config) + C1C73.ADAPTER.encodedSizeWithTag(16, c2226051CAp2.pdp_myna_banner_info) + C2224711C5l.ADAPTER.encodedSizeWithTag(17, c2226051CAp2.background) + ProtoAdapter.STRING.encodedSizeWithTag(255, c2226051CAp2.da_info) + c2226051CAp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2226051CAp c2226051CAp) {
        }
    };
    public C2224711C5l background;
    public List<C2226111CAv> buttons;
    public List<C2226081CAs> content;
    public String da_info;
    public Integer display_duration_sec;
    public C2226021CAm extra_info;
    public C029C icon;
    public Boolean is_dismissable;
    public Boolean is_icon_size_dynamic;
    public Boolean is_title_fixed_to_top;
    public C1C2B lynx_info;
    public C1CB4 page_padding;
    public C1C73 pdp_myna_banner_info;
    public Integer pop_up_type;
    public C1C3J popup_config;
    public Integer style;
    public C5431029t subtitle;
    public C5431029t title;

    public C2226051CAp() {
        super(ADAPTER, ByteString.EMPTY);
        this.buttons = C1516540pZE.LJIIIIZZ();
        this.content = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2226061CAq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
