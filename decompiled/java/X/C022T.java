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

/* JADX INFO: renamed from: X.022T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022T extends Message<C022T, C02I4> {
    public static final ProtoAdapter<C022T> ADAPTER = new ProtoAdapter<C022T>() { // from class: X.021r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022T decode(ProtoReader protoReader) {
            C022T c022t = new C022T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022t.bg_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c022t.bg_corner_radius = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 3:
                            c022t.text_label_alignment = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c022t.text_label_insets.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            c022t.caption_text_size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 7:
                            c022t.caption_text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c022t.caption_text_stroke_width = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022t.caption_text_stroke_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022t.should_show_caption_icon = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022t.should_show_instruction_text = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022t.instruction_text_size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c022t.instruction_text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c022t.instruction_text_stroke_width = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 15:
                            c022t.instruction_text_stroke_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c022t.expansion_direction = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c022t.text_label_inset_info = C589402Ro.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c022t.should_show_control_when_collapsed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c022t.should_show_control_when_expanded = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c022t.should_show_caption_on = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            c022t.should_show_caption_off = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            c022t.tooltip_hide_enabled = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022T c022t) {
            C022T c022t2 = c022t;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c022t2.bg_color);
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c022t2.bg_corner_radius);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c022t2.text_label_alignment) + protoAdapter3.asRepeated().encodedSizeWithTag(4, c022t2.text_label_insets) + protoAdapter3.encodedSizeWithTag(5, c022t2.caption_text_size) + protoAdapter.encodedSizeWithTag(7, c022t2.caption_text_color) + protoAdapter2.encodedSizeWithTag(8, c022t2.caption_text_stroke_width) + protoAdapter.encodedSizeWithTag(9, c022t2.caption_text_stroke_color);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(10, c022t2.should_show_caption_icon) + protoAdapter4.encodedSizeWithTag(11, c022t2.should_show_instruction_text) + protoAdapter3.encodedSizeWithTag(12, c022t2.instruction_text_size) + protoAdapter.encodedSizeWithTag(13, c022t2.instruction_text_color) + protoAdapter2.encodedSizeWithTag(14, c022t2.instruction_text_stroke_width) + protoAdapter.encodedSizeWithTag(15, c022t2.instruction_text_stroke_color) + protoAdapter3.encodedSizeWithTag(16, c022t2.expansion_direction) + C589402Ro.ADAPTER.encodedSizeWithTag(17, c022t2.text_label_inset_info) + protoAdapter4.encodedSizeWithTag(18, c022t2.should_show_control_when_collapsed) + protoAdapter4.encodedSizeWithTag(19, c022t2.should_show_control_when_expanded) + protoAdapter4.encodedSizeWithTag(20, c022t2.should_show_caption_on) + protoAdapter4.encodedSizeWithTag(21, c022t2.should_show_caption_off) + protoAdapter4.encodedSizeWithTag(22, c022t2.tooltip_hide_enabled) + c022t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C022T c022t) {
            C022T c022t2 = c022t;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c022t2.bg_color);
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            protoAdapter2.encodeWithTag(protoWriter, 2, c022t2.bg_corner_radius);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 3, c022t2.text_label_alignment);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 4, c022t2.text_label_insets);
            protoAdapter3.encodeWithTag(protoWriter, 5, c022t2.caption_text_size);
            protoAdapter.encodeWithTag(protoWriter, 7, c022t2.caption_text_color);
            protoAdapter2.encodeWithTag(protoWriter, 8, c022t2.caption_text_stroke_width);
            protoAdapter.encodeWithTag(protoWriter, 9, c022t2.caption_text_stroke_color);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 10, c022t2.should_show_caption_icon);
            protoAdapter4.encodeWithTag(protoWriter, 11, c022t2.should_show_instruction_text);
            protoAdapter3.encodeWithTag(protoWriter, 12, c022t2.instruction_text_size);
            protoAdapter.encodeWithTag(protoWriter, 13, c022t2.instruction_text_color);
            protoAdapter2.encodeWithTag(protoWriter, 14, c022t2.instruction_text_stroke_width);
            protoAdapter.encodeWithTag(protoWriter, 15, c022t2.instruction_text_stroke_color);
            protoAdapter3.encodeWithTag(protoWriter, 16, c022t2.expansion_direction);
            C589402Ro.ADAPTER.encodeWithTag(protoWriter, 17, c022t2.text_label_inset_info);
            protoAdapter4.encodeWithTag(protoWriter, 18, c022t2.should_show_control_when_collapsed);
            protoAdapter4.encodeWithTag(protoWriter, 19, c022t2.should_show_control_when_expanded);
            protoAdapter4.encodeWithTag(protoWriter, 20, c022t2.should_show_caption_on);
            protoAdapter4.encodeWithTag(protoWriter, 21, c022t2.should_show_caption_off);
            protoAdapter4.encodeWithTag(protoWriter, 22, c022t2.tooltip_hide_enabled);
            protoWriter.writeBytes(c022t2.unknownFields());
        }
    };
    public String bg_color;
    public Float bg_corner_radius;
    public String caption_text_color;
    public Integer caption_text_size;
    public String caption_text_stroke_color;
    public Float caption_text_stroke_width;
    public Integer expansion_direction;
    public String instruction_text_color;
    public Integer instruction_text_size;
    public String instruction_text_stroke_color;
    public Float instruction_text_stroke_width;
    public Boolean should_show_caption_icon;
    public Boolean should_show_caption_off;
    public Boolean should_show_caption_on;
    public Boolean should_show_control_when_collapsed;
    public Boolean should_show_control_when_expanded;
    public Boolean should_show_instruction_text;
    public Integer text_label_alignment;
    public C589402Ro text_label_inset_info;
    public List<Integer> text_label_insets;
    public Boolean tooltip_hide_enabled;

    public C022T() {
        super(ADAPTER, ByteString.EMPTY);
        this.text_label_insets = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02I4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
