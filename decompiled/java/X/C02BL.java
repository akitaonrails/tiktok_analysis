package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BL extends Message<C02BL, C02OJ> {
    public static final ProtoAdapter<C02BL> ADAPTER = new ProtoAdapter<C02BL>() { // from class: X.0260
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BL decode(ProtoReader protoReader) {
            C02BL c02bl = new C02BL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bl.main_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02bl.backup_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bl.url_expire = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02bl.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02bl.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02bl.file_hash = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02bl.format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02bl.size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02bl.bitrate = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02bl.video_quality = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BL c02bl) {
            C02BL c02bl2 = c02bl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02bl2.main_url) + protoAdapter.encodedSizeWithTag(2, c02bl2.backup_url);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02bl2.url_expire) + protoAdapter2.encodedSizeWithTag(4, c02bl2.width) + protoAdapter2.encodedSizeWithTag(5, c02bl2.height) + protoAdapter.encodedSizeWithTag(6, c02bl2.file_hash) + protoAdapter.encodedSizeWithTag(7, c02bl2.format) + protoAdapter2.encodedSizeWithTag(8, c02bl2.size) + protoAdapter2.encodedSizeWithTag(9, c02bl2.bitrate) + protoAdapter.encodedSizeWithTag(10, c02bl2.video_quality) + c02bl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BL c02bl) {
        }
    };
    public String backup_url;
    public Integer bitrate;
    public String file_hash;
    public String format;
    public Integer height;
    public String main_url;
    public Integer size;
    public Integer url_expire;
    public String video_quality;
    public Integer width;

    public C02BL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
