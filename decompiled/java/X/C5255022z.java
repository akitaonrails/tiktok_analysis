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

/* JADX INFO: renamed from: X.022z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5255022z extends Message<C5255022z, C569602Jy> {
    public static final ProtoAdapter<C5255022z> ADAPTER = new ProtoAdapter<C5255022z>() { // from class: X.021s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5255022z decode(ProtoReader protoReader) {
            C5255022z c5255022z = new C5255022z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5255022z.lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5255022z.language_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c5255022z.url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5255022z.expire = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c5255022z.caption_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5255022z.complaint_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c5255022z.is_auto_generated = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c5255022z.sub_id = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5255022z.sub_version = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5255022z.cla_subtitle_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5255022z.translator_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5255022z.language_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5255022z.is_original_caption = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c5255022z.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            c5255022z.caption_length = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c5255022z.variant = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5255022z.subtitle_type = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5255022z.source_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c5255022z.translation_type = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5255022z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5255022z c5255022z) {
            C5255022z c5255022z2 = c5255022z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5255022z2.lang);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5255022z2.language_id) + protoAdapter.encodedSizeWithTag(3, c5255022z2.url) + protoAdapter2.encodedSizeWithTag(4, c5255022z2.expire) + protoAdapter.encodedSizeWithTag(5, c5255022z2.caption_format) + protoAdapter2.encodedSizeWithTag(6, c5255022z2.complaint_id);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c5255022z2.is_auto_generated) + ProtoAdapter.INT32.encodedSizeWithTag(8, c5255022z2.sub_id) + protoAdapter.encodedSizeWithTag(9, c5255022z2.sub_version) + protoAdapter2.encodedSizeWithTag(10, c5255022z2.cla_subtitle_id) + protoAdapter2.encodedSizeWithTag(11, c5255022z2.translator_id) + protoAdapter.encodedSizeWithTag(12, c5255022z2.language_code) + protoAdapter3.encodedSizeWithTag(13, c5255022z2.is_original_caption) + protoAdapter.asRepeated().encodedSizeWithTag(14, c5255022z2.url_list) + protoAdapter2.encodedSizeWithTag(15, c5255022z2.caption_length) + protoAdapter.encodedSizeWithTag(16, c5255022z2.variant) + protoAdapter2.encodedSizeWithTag(17, c5255022z2.subtitle_type) + protoAdapter.encodedSizeWithTag(18, c5255022z2.source_tag) + protoAdapter2.encodedSizeWithTag(19, c5255022z2.translation_type) + c5255022z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5255022z c5255022z) {
            C5255022z c5255022z2 = c5255022z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5255022z2.lang);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c5255022z2.language_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c5255022z2.url);
            protoAdapter2.encodeWithTag(protoWriter, 4, c5255022z2.expire);
            protoAdapter.encodeWithTag(protoWriter, 5, c5255022z2.caption_format);
            protoAdapter2.encodeWithTag(protoWriter, 6, c5255022z2.complaint_id);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 7, c5255022z2.is_auto_generated);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, c5255022z2.sub_id);
            protoAdapter.encodeWithTag(protoWriter, 9, c5255022z2.sub_version);
            protoAdapter2.encodeWithTag(protoWriter, 10, c5255022z2.cla_subtitle_id);
            protoAdapter2.encodeWithTag(protoWriter, 11, c5255022z2.translator_id);
            protoAdapter.encodeWithTag(protoWriter, 12, c5255022z2.language_code);
            protoAdapter3.encodeWithTag(protoWriter, 13, c5255022z2.is_original_caption);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 14, c5255022z2.url_list);
            protoAdapter2.encodeWithTag(protoWriter, 15, c5255022z2.caption_length);
            protoAdapter.encodeWithTag(protoWriter, 16, c5255022z2.variant);
            protoAdapter2.encodeWithTag(protoWriter, 17, c5255022z2.subtitle_type);
            protoAdapter.encodeWithTag(protoWriter, 18, c5255022z2.source_tag);
            protoAdapter2.encodeWithTag(protoWriter, 19, c5255022z2.translation_type);
            protoWriter.writeBytes(c5255022z2.unknownFields());
        }
    };
    public String caption_format;
    public Long caption_length;
    public Long cla_subtitle_id;
    public Long complaint_id;
    public Long expire;
    public Boolean is_auto_generated;
    public Boolean is_original_caption;
    public String lang;
    public String language_code;
    public Long language_id;
    public String source_tag;
    public Integer sub_id;
    public String sub_version;
    public Long subtitle_type;
    public Long translation_type;
    public Long translator_id;
    public String url;
    public List<String> url_list;
    public String variant;

    public C5255022z() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C569602Jy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
