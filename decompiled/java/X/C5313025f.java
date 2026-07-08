package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.025f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5313025f extends Message<C5313025f, C565302Ih> {
    public static final ProtoAdapter<C5313025f> ADAPTER = new ProtoAdapter<C5313025f>() { // from class: X.022M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5313025f decode(ProtoReader protoReader) {
            C5313025f c5313025f = new C5313025f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5313025f.first_src = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5313025f.last_src = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5313025f.dedup_src = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5313025f.first_aigc_src = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5313025f.last_aigc_src = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5313025f.dedup_err = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5313025f.aigc_src = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5313025f.is_tiktok = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5313025f.is_capcut = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5313025f.total_src = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5313025f.total_err = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5313025f.total_img = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5313025f.total_vid = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c5313025f.upload_dur = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 15:
                            c5313025f.total_audio = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c5313025f.c2pa_extra_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5313025f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5313025f c5313025f) {
            C5313025f c5313025f2 = c5313025f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5313025f2.first_src) + protoAdapter.encodedSizeWithTag(2, c5313025f2.last_src) + protoAdapter.encodedSizeWithTag(3, c5313025f2.dedup_src) + protoAdapter.encodedSizeWithTag(4, c5313025f2.first_aigc_src) + protoAdapter.encodedSizeWithTag(5, c5313025f2.last_aigc_src) + protoAdapter.encodedSizeWithTag(6, c5313025f2.dedup_err) + protoAdapter.encodedSizeWithTag(7, c5313025f2.aigc_src);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, c5313025f2.is_tiktok) + protoAdapter2.encodedSizeWithTag(9, c5313025f2.is_capcut);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(10, c5313025f2.total_src) + protoAdapter3.encodedSizeWithTag(11, c5313025f2.total_err) + protoAdapter3.encodedSizeWithTag(12, c5313025f2.total_img) + protoAdapter3.encodedSizeWithTag(13, c5313025f2.total_vid) + ProtoAdapter.DOUBLE.encodedSizeWithTag(14, c5313025f2.upload_dur) + protoAdapter3.encodedSizeWithTag(15, c5313025f2.total_audio) + protoAdapter.encodedSizeWithTag(16, c5313025f2.c2pa_extra_data) + c5313025f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5313025f c5313025f) {
            C5313025f c5313025f2 = c5313025f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5313025f2.first_src);
            protoAdapter.encodeWithTag(protoWriter, 2, c5313025f2.last_src);
            protoAdapter.encodeWithTag(protoWriter, 3, c5313025f2.dedup_src);
            protoAdapter.encodeWithTag(protoWriter, 4, c5313025f2.first_aigc_src);
            protoAdapter.encodeWithTag(protoWriter, 5, c5313025f2.last_aigc_src);
            protoAdapter.encodeWithTag(protoWriter, 6, c5313025f2.dedup_err);
            protoAdapter.encodeWithTag(protoWriter, 7, c5313025f2.aigc_src);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 8, c5313025f2.is_tiktok);
            protoAdapter2.encodeWithTag(protoWriter, 9, c5313025f2.is_capcut);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 10, c5313025f2.total_src);
            protoAdapter3.encodeWithTag(protoWriter, 11, c5313025f2.total_err);
            protoAdapter3.encodeWithTag(protoWriter, 12, c5313025f2.total_img);
            protoAdapter3.encodeWithTag(protoWriter, 13, c5313025f2.total_vid);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 14, c5313025f2.upload_dur);
            protoAdapter3.encodeWithTag(protoWriter, 15, c5313025f2.total_audio);
            protoAdapter.encodeWithTag(protoWriter, 16, c5313025f2.c2pa_extra_data);
            protoWriter.writeBytes(c5313025f2.unknownFields());
        }
    };
    public String aigc_src;
    public String c2pa_extra_data;
    public String dedup_err;
    public String dedup_src;
    public String first_aigc_src;
    public String first_src;
    public Boolean is_capcut;
    public Boolean is_tiktok;
    public String last_aigc_src;
    public String last_src;
    public Long total_audio;
    public Long total_err;
    public Long total_img;
    public Long total_src;
    public Long total_vid;
    public Double upload_dur;

    public C5313025f() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C565302Ih newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
