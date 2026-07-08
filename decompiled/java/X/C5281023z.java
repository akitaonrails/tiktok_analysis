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

/* JADX INFO: renamed from: X.023z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5281023z extends Message<C5281023z, C02MO> {
    public static final ProtoAdapter<C5281023z> ADAPTER = new ProtoAdapter<C5281023z>() { // from class: X.022Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5281023z decode(ProtoReader protoReader) {
            C5281023z c5281023z = new C5281023z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5281023z.audio_is_listenable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c5281023z.audio_is_podcast = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c5281023z.follow_display = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c5281023z.background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5281023z.audio_is_audible = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c5281023z.is_podcast_preview = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c5281023z.podcast_episode_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c5281023z.podcast_episode_authors.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5281023z.podcast_episode_play_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5281023z.podcast_episode_cover_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5281023z.podcast_episode_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5281023z.podcast_episode_is_branded_content = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5281023z.podcast_episode_duration_milliseconds = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c5281023z.podcast_feed_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5281023z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5281023z c5281023z) {
            C5281023z c5281023z2 = c5281023z;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5281023z2.audio_is_listenable) + protoAdapter.encodedSizeWithTag(2, c5281023z2.audio_is_podcast) + ProtoAdapter.INT32.encodedSizeWithTag(3, c5281023z2.follow_display);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5281023z2.background_color) + protoAdapter.encodedSizeWithTag(5, c5281023z2.audio_is_audible) + protoAdapter.encodedSizeWithTag(6, c5281023z2.is_podcast_preview);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c5281023z2.podcast_episode_id) + protoAdapter2.asRepeated().encodedSizeWithTag(8, c5281023z2.podcast_episode_authors);
            ProtoAdapter<C673002jw> protoAdapter4 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(9, c5281023z2.podcast_episode_play_addr) + protoAdapter4.encodedSizeWithTag(10, c5281023z2.podcast_episode_cover_image) + protoAdapter2.encodedSizeWithTag(11, c5281023z2.podcast_episode_title) + protoAdapter.encodedSizeWithTag(12, c5281023z2.podcast_episode_is_branded_content) + protoAdapter3.encodedSizeWithTag(13, c5281023z2.podcast_episode_duration_milliseconds) + protoAdapter2.encodedSizeWithTag(14, c5281023z2.podcast_feed_title) + c5281023z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5281023z c5281023z) {
            C5281023z c5281023z2 = c5281023z;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c5281023z2.audio_is_listenable);
            protoAdapter.encodeWithTag(protoWriter, 2, c5281023z2.audio_is_podcast);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c5281023z2.follow_display);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c5281023z2.background_color);
            protoAdapter.encodeWithTag(protoWriter, 5, c5281023z2.audio_is_audible);
            protoAdapter.encodeWithTag(protoWriter, 6, c5281023z2.is_podcast_preview);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 7, c5281023z2.podcast_episode_id);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 8, c5281023z2.podcast_episode_authors);
            ProtoAdapter<C673002jw> protoAdapter4 = C673002jw.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 9, c5281023z2.podcast_episode_play_addr);
            protoAdapter4.encodeWithTag(protoWriter, 10, c5281023z2.podcast_episode_cover_image);
            protoAdapter2.encodeWithTag(protoWriter, 11, c5281023z2.podcast_episode_title);
            protoAdapter.encodeWithTag(protoWriter, 12, c5281023z2.podcast_episode_is_branded_content);
            protoAdapter3.encodeWithTag(protoWriter, 13, c5281023z2.podcast_episode_duration_milliseconds);
            protoAdapter2.encodeWithTag(protoWriter, 14, c5281023z2.podcast_feed_title);
            protoWriter.writeBytes(c5281023z2.unknownFields());
        }
    };
    public Boolean audio_is_audible;
    public Boolean audio_is_listenable;
    public Boolean audio_is_podcast;
    public String background_color;
    public Integer follow_display;
    public Boolean is_podcast_preview;
    public List<String> podcast_episode_authors;
    public C673002jw podcast_episode_cover_image;
    public Long podcast_episode_duration_milliseconds;
    public Long podcast_episode_id;
    public Boolean podcast_episode_is_branded_content;
    public C673002jw podcast_episode_play_addr;
    public String podcast_episode_title;
    public String podcast_feed_title;

    public C5281023z() {
        super(ADAPTER, ByteString.EMPTY);
        this.podcast_episode_authors = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
