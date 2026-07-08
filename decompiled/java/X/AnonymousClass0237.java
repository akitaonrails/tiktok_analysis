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

/* JADX INFO: renamed from: X.0237, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0237 extends Message<AnonymousClass0237, C02IP> {
    public static final ProtoAdapter<AnonymousClass0237> ADAPTER = new ProtoAdapter<AnonymousClass0237>() { // from class: X.0223
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0237 decode(ProtoReader protoReader) {
            AnonymousClass0237 anonymousClass0237 = new AnonymousClass0237();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0237.has_original_audio = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0237.enable_auto_caption = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0237.original_language_info = C02B5.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0237.caption_infos.add(C5255022z.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            anonymousClass0237.creator_edited_caption_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0237.vertical_positions.add(ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 7:
                            anonymousClass0237.position = C615302ad.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0237.appearance = C022T.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0237.hide_original_caption = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0237.captions_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0237.no_caption_reason = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0237.duplicate_languages.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0237.is_author_dubbing_qualified = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0237.no_caption_reason_v2 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0237;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0237 anonymousClass0237) {
            AnonymousClass0237 anonymousClass02372 = anonymousClass0237;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02372.has_original_audio) + protoAdapter.encodedSizeWithTag(2, anonymousClass02372.enable_auto_caption) + C02B5.ADAPTER.encodedSizeWithTag(3, anonymousClass02372.original_language_info) + C5255022z.ADAPTER.asRepeated().encodedSizeWithTag(4, anonymousClass02372.caption_infos) + ProtoAdapter.INT64.encodedSizeWithTag(5, anonymousClass02372.creator_edited_caption_id) + ProtoAdapter.FLOAT.asRepeated().encodedSizeWithTag(6, anonymousClass02372.vertical_positions) + C615302ad.ADAPTER.encodedSizeWithTag(7, anonymousClass02372.position) + C022T.ADAPTER.encodedSizeWithTag(8, anonymousClass02372.appearance);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(9, anonymousClass02372.hide_original_caption) + protoAdapter.encodedSizeWithTag(10, anonymousClass02372.captions_type) + protoAdapter.encodedSizeWithTag(11, anonymousClass02372.no_caption_reason) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, anonymousClass02372.duplicate_languages) + protoAdapter2.encodedSizeWithTag(13, anonymousClass02372.is_author_dubbing_qualified) + protoAdapter.encodedSizeWithTag(14, anonymousClass02372.no_caption_reason_v2) + anonymousClass02372.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0237 anonymousClass0237) {
            AnonymousClass0237 anonymousClass02372 = anonymousClass0237;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02372.has_original_audio);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02372.enable_auto_caption);
            C02B5.ADAPTER.encodeWithTag(protoWriter, 3, anonymousClass02372.original_language_info);
            C5255022z.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, anonymousClass02372.caption_infos);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, anonymousClass02372.creator_edited_caption_id);
            ProtoAdapter.FLOAT.asRepeated().encodeWithTag(protoWriter, 6, anonymousClass02372.vertical_positions);
            C615302ad.ADAPTER.encodeWithTag(protoWriter, 7, anonymousClass02372.position);
            C022T.ADAPTER.encodeWithTag(protoWriter, 8, anonymousClass02372.appearance);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 9, anonymousClass02372.hide_original_caption);
            protoAdapter.encodeWithTag(protoWriter, 10, anonymousClass02372.captions_type);
            protoAdapter.encodeWithTag(protoWriter, 11, anonymousClass02372.no_caption_reason);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, anonymousClass02372.duplicate_languages);
            protoAdapter2.encodeWithTag(protoWriter, 13, anonymousClass02372.is_author_dubbing_qualified);
            protoAdapter.encodeWithTag(protoWriter, 14, anonymousClass02372.no_caption_reason_v2);
            protoWriter.writeBytes(anonymousClass02372.unknownFields());
        }
    };
    public C022T appearance;
    public List<C5255022z> caption_infos;
    public Integer captions_type;
    public Long creator_edited_caption_id;
    public List<String> duplicate_languages;
    public Integer enable_auto_caption;
    public Integer has_original_audio;
    public Boolean hide_original_caption;
    public Boolean is_author_dubbing_qualified;
    public Integer no_caption_reason;
    public Integer no_caption_reason_v2;
    public C02B5 original_language_info;
    public C615302ad position;
    public List<Float> vertical_positions;

    public AnonymousClass0237() {
        super(ADAPTER, ByteString.EMPTY);
        this.caption_infos = C1516540pZE.LJIIIIZZ();
        this.vertical_positions = C1516540pZE.LJIIIIZZ();
        this.duplicate_languages = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
