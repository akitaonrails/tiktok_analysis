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

/* JADX INFO: renamed from: X.021k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5214021k extends Message<C5214021k, C02KC> {
    public static final ProtoAdapter<C5214021k> ADAPTER = new ProtoAdapter<C5214021k>() { // from class: X.021L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5214021k decode(ProtoReader protoReader) {
            C5214021k c5214021k = new C5214021k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5214021k.zero_icon_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5214021k.zero_input_box_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5214021k.non_zero_input_box_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5214021k.empty_list_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5214021k.emoji_recommend_list.add(C560502Gl.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c5214021k.preload = C622002bi.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5214021k.quick_comment = C616202am.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5214021k.quick_mention = C630602d6.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5214021k.zero_comment_button_config = C02CJ.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5214021k.zero_comment_opt_config = C665402ii.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5214021k.long_press_recommend_list.add(C560502Gl.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5214021k.quick_comment_emoji_recommend_list.add(C560502Gl.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5214021k.comment_panel_show_tab_config = C560302Gj.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c5214021k.surprise_preload_config = C595002Ts.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c5214021k.comment_top_bar_component.add(C5262023g.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            c5214021k.social_quick_comment = C02ZE.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5214021k.has_hot_comment = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5214021k.has_author_comment = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c5214021k.has_visual_comment = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5214021k.poll_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 21:
                            c5214021k.poll_background_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5214021k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5214021k c5214021k) {
            C5214021k c5214021k2 = c5214021k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5214021k2.zero_icon_text) + protoAdapter.encodedSizeWithTag(2, c5214021k2.zero_input_box_text) + protoAdapter.encodedSizeWithTag(3, c5214021k2.non_zero_input_box_text) + protoAdapter.encodedSizeWithTag(4, c5214021k2.empty_list_text);
            ProtoAdapter<C560502Gl> protoAdapter2 = C560502Gl.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(5, c5214021k2.emoji_recommend_list) + C622002bi.ADAPTER.encodedSizeWithTag(6, c5214021k2.preload) + C616202am.ADAPTER.encodedSizeWithTag(7, c5214021k2.quick_comment) + C630602d6.ADAPTER.encodedSizeWithTag(8, c5214021k2.quick_mention) + C02CJ.ADAPTER.encodedSizeWithTag(9, c5214021k2.zero_comment_button_config) + C665402ii.ADAPTER.encodedSizeWithTag(10, c5214021k2.zero_comment_opt_config) + protoAdapter2.asRepeated().encodedSizeWithTag(11, c5214021k2.long_press_recommend_list) + protoAdapter2.asRepeated().encodedSizeWithTag(12, c5214021k2.quick_comment_emoji_recommend_list) + C560302Gj.ADAPTER.encodedSizeWithTag(13, c5214021k2.comment_panel_show_tab_config) + C595002Ts.ADAPTER.encodedSizeWithTag(14, c5214021k2.surprise_preload_config) + C5262023g.ADAPTER.asRepeated().encodedSizeWithTag(15, c5214021k2.comment_top_bar_component) + C02ZE.ADAPTER.encodedSizeWithTag(16, c5214021k2.social_quick_comment);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(17, c5214021k2.has_hot_comment) + protoAdapter3.encodedSizeWithTag(18, c5214021k2.has_author_comment) + protoAdapter3.encodedSizeWithTag(19, c5214021k2.has_visual_comment) + ProtoAdapter.INT64.encodedSizeWithTag(20, c5214021k2.poll_id) + protoAdapter.encodedSizeWithTag(21, c5214021k2.poll_background_url) + c5214021k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5214021k c5214021k) {
            C5214021k c5214021k2 = c5214021k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5214021k2.zero_icon_text);
            protoAdapter.encodeWithTag(protoWriter, 2, c5214021k2.zero_input_box_text);
            protoAdapter.encodeWithTag(protoWriter, 3, c5214021k2.non_zero_input_box_text);
            protoAdapter.encodeWithTag(protoWriter, 4, c5214021k2.empty_list_text);
            ProtoAdapter<C560502Gl> protoAdapter2 = C560502Gl.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, c5214021k2.emoji_recommend_list);
            C622002bi.ADAPTER.encodeWithTag(protoWriter, 6, c5214021k2.preload);
            C616202am.ADAPTER.encodeWithTag(protoWriter, 7, c5214021k2.quick_comment);
            C630602d6.ADAPTER.encodeWithTag(protoWriter, 8, c5214021k2.quick_mention);
            C02CJ.ADAPTER.encodeWithTag(protoWriter, 9, c5214021k2.zero_comment_button_config);
            C665402ii.ADAPTER.encodeWithTag(protoWriter, 10, c5214021k2.zero_comment_opt_config);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 11, c5214021k2.long_press_recommend_list);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 12, c5214021k2.quick_comment_emoji_recommend_list);
            C560302Gj.ADAPTER.encodeWithTag(protoWriter, 13, c5214021k2.comment_panel_show_tab_config);
            C595002Ts.ADAPTER.encodeWithTag(protoWriter, 14, c5214021k2.surprise_preload_config);
            C5262023g.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, c5214021k2.comment_top_bar_component);
            C02ZE.ADAPTER.encodeWithTag(protoWriter, 16, c5214021k2.social_quick_comment);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 17, c5214021k2.has_hot_comment);
            protoAdapter3.encodeWithTag(protoWriter, 18, c5214021k2.has_author_comment);
            protoAdapter3.encodeWithTag(protoWriter, 19, c5214021k2.has_visual_comment);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, c5214021k2.poll_id);
            protoAdapter.encodeWithTag(protoWriter, 21, c5214021k2.poll_background_url);
            protoWriter.writeBytes(c5214021k2.unknownFields());
        }
    };
    public C560302Gj comment_panel_show_tab_config;
    public List<C5262023g> comment_top_bar_component;
    public List<C560502Gl> emoji_recommend_list;
    public String empty_list_text;
    public Boolean has_author_comment;
    public Boolean has_hot_comment;
    public Boolean has_visual_comment;
    public List<C560502Gl> long_press_recommend_list;
    public String non_zero_input_box_text;
    public String poll_background_url;
    public Long poll_id;
    public C622002bi preload;
    public C616202am quick_comment;
    public List<C560502Gl> quick_comment_emoji_recommend_list;
    public C630602d6 quick_mention;
    public C02ZE social_quick_comment;
    public C595002Ts surprise_preload_config;
    public C02CJ zero_comment_button_config;
    public C665402ii zero_comment_opt_config;
    public String zero_icon_text;
    public String zero_input_box_text;

    public C5214021k() {
        super(ADAPTER, ByteString.EMPTY);
        this.emoji_recommend_list = C1516540pZE.LJIIIIZZ();
        this.long_press_recommend_list = C1516540pZE.LJIIIIZZ();
        this.quick_comment_emoji_recommend_list = C1516540pZE.LJIIIIZZ();
        this.comment_top_bar_component = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
