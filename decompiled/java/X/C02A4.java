package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02A4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02A4 extends Message<C02A4, C02JP> {
    public static final ProtoAdapter<C02A4> ADAPTER = new ProtoAdapter<C02A4>() { // from class: X.024d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02A4 decode(ProtoReader protoReader) {
            C02A4 c02a4 = new C02A4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02a4.allow_download = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c02a4.share_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c02a4.show_progress_bar = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02a4.draft_progress_bar = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02a4.allow_duet = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c02a4.allow_react = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c02a4.prevent_download_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c02a4.allow_dynamic_wallpaper = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02a4.timer_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02a4.allow_music = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02a4.allow_stitch = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02a4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02A4 c02a4) {
            C02A4 c02a42 = c02a4;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02a42.allow_download);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02a42.share_type) + protoAdapter2.encodedSizeWithTag(3, c02a42.show_progress_bar) + protoAdapter2.encodedSizeWithTag(4, c02a42.draft_progress_bar) + protoAdapter.encodedSizeWithTag(5, c02a42.allow_duet) + protoAdapter.encodedSizeWithTag(6, c02a42.allow_react) + protoAdapter2.encodedSizeWithTag(7, c02a42.prevent_download_type) + protoAdapter.encodedSizeWithTag(8, c02a42.allow_dynamic_wallpaper) + protoAdapter2.encodedSizeWithTag(9, c02a42.timer_status) + protoAdapter.encodedSizeWithTag(10, c02a42.allow_music) + protoAdapter.encodedSizeWithTag(11, c02a42.allow_stitch) + c02a42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02A4 c02a4) {
            C02A4 c02a42 = c02a4;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c02a42.allow_download);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02a42.share_type);
            protoAdapter2.encodeWithTag(protoWriter, 3, c02a42.show_progress_bar);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02a42.draft_progress_bar);
            protoAdapter.encodeWithTag(protoWriter, 5, c02a42.allow_duet);
            protoAdapter.encodeWithTag(protoWriter, 6, c02a42.allow_react);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02a42.prevent_download_type);
            protoAdapter.encodeWithTag(protoWriter, 8, c02a42.allow_dynamic_wallpaper);
            protoAdapter2.encodeWithTag(protoWriter, 9, c02a42.timer_status);
            protoAdapter.encodeWithTag(protoWriter, 10, c02a42.allow_music);
            protoAdapter.encodeWithTag(protoWriter, 11, c02a42.allow_stitch);
            protoWriter.writeBytes(c02a42.unknownFields());
        }
    };
    public Boolean allow_download;
    public Boolean allow_duet;
    public Boolean allow_dynamic_wallpaper;
    public Boolean allow_music;
    public Boolean allow_react;
    public Boolean allow_stitch;
    public Integer draft_progress_bar;
    public Integer prevent_download_type;
    public Integer share_type;
    public Integer show_progress_bar;
    public Integer timer_status;

    public C02A4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
