package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.028C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C028C extends Message<C028C, C02IM> {
    public static final ProtoAdapter<C028C> ADAPTER = new ProtoAdapter<C028C>() { // from class: X.0233
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C028C decode(ProtoReader protoReader) {
            C028C c028c = new C028C();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c028c.is_converted_text = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c028c.is_text2image = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c028c.text_post_template_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c028c.is_comment2post = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c028c.comment_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c028c.original_item_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c028c.generated_text_post_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c028c.ai_generated_image_style_id = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c028c.is_ai_text_mode = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c028c.generated_text_post_ai_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c028c.comment_summary = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c028c.is_ai_summary = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c028c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C028C c028c) {
            C028C c028c2 = c028c;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c028c2.is_converted_text) + protoAdapter.encodedSizeWithTag(2, c028c2.is_text2image);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c028c2.text_post_template_id) + protoAdapter.encodedSizeWithTag(4, c028c2.is_comment2post) + protoAdapter2.encodedSizeWithTag(5, c028c2.comment_id) + protoAdapter2.encodedSizeWithTag(6, c028c2.original_item_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c028c2.generated_text_post_position) + protoAdapter3.encodedSizeWithTag(8, c028c2.ai_generated_image_style_id) + protoAdapter.encodedSizeWithTag(9, c028c2.is_ai_text_mode) + protoAdapter3.encodedSizeWithTag(10, c028c2.generated_text_post_ai_position) + ProtoAdapter.STRING.encodedSizeWithTag(11, c028c2.comment_summary) + protoAdapter.encodedSizeWithTag(12, c028c2.is_ai_summary) + c028c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C028C c028c) {
            C028C c028c2 = c028c;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c028c2.is_converted_text);
            protoAdapter.encodeWithTag(protoWriter, 2, c028c2.is_text2image);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, c028c2.text_post_template_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c028c2.is_comment2post);
            protoAdapter2.encodeWithTag(protoWriter, 5, c028c2.comment_id);
            protoAdapter2.encodeWithTag(protoWriter, 6, c028c2.original_item_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 7, c028c2.generated_text_post_position);
            protoAdapter3.encodeWithTag(protoWriter, 8, c028c2.ai_generated_image_style_id);
            protoAdapter.encodeWithTag(protoWriter, 9, c028c2.is_ai_text_mode);
            protoAdapter3.encodeWithTag(protoWriter, 10, c028c2.generated_text_post_ai_position);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, c028c2.comment_summary);
            protoAdapter.encodeWithTag(protoWriter, 12, c028c2.is_ai_summary);
            protoWriter.writeBytes(c028c2.unknownFields());
        }
    };
    public Integer ai_generated_image_style_id;
    public Long comment_id;
    public String comment_summary;
    public Integer generated_text_post_ai_position;
    public Integer generated_text_post_position;
    public Boolean is_ai_summary;
    public Boolean is_ai_text_mode;
    public Boolean is_comment2post;
    public Boolean is_converted_text;
    public Boolean is_text2image;
    public Long original_item_id;
    public Long text_post_template_id;

    public C028C() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
