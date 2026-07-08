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

/* JADX INFO: renamed from: X.1DAY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAY extends Message<C1DAY, C1DAZ> {
    public static final ProtoAdapter<C1DAY> ADAPTER = new ProtoAdapter<C1DAY>() { // from class: X.1DAX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAY decode(ProtoReader protoReader) {
            C1DAY c1day = new C1DAY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1day.uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1day.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c1day.data_size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1day.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1day.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c1day.url_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1day.file_hash = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1day.file_cs = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1day.player_access_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1day.file_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1day;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAY c1day) {
            C1DAY c1day2 = c1day;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1day2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(2, c1day2.url_list) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1day2.data_size);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c1day2.width) + protoAdapter2.encodedSizeWithTag(5, c1day2.height) + protoAdapter.encodedSizeWithTag(6, c1day2.url_key) + protoAdapter.encodedSizeWithTag(7, c1day2.file_hash) + protoAdapter.encodedSizeWithTag(8, c1day2.file_cs) + protoAdapter.encodedSizeWithTag(9, c1day2.player_access_key) + protoAdapter.encodedSizeWithTag(10, c1day2.file_id) + c1day2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DAY c1day) {
        }
    };
    public Long data_size;
    public String file_cs;
    public String file_hash;
    public String file_id;
    public Integer height;
    public String player_access_key;
    public String uri;
    public String url_key;
    public List<String> url_list;
    public Integer width;

    public C1DAY() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1DAZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
