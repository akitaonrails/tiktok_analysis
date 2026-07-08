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

/* JADX INFO: renamed from: X.02Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C593402Tc extends Message<C593402Tc, C593502Td> {
    public static final ProtoAdapter<C593402Tc> ADAPTER = new ProtoAdapter<C593402Tc>() { // from class: X.02Tb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C593402Tc decode(ProtoReader protoReader) {
            C593402Tc c593402Tc = new C593402Tc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c593402Tc.uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c593402Tc.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c593402Tc.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c593402Tc.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c593402Tc.url_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c593402Tc.data_size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c593402Tc.file_hash = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c593402Tc.invalid = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c593402Tc.file_cs = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c593402Tc.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c593402Tc.url_sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c593402Tc.md5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c593402Tc.player_access_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c593402Tc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C593402Tc c593402Tc) {
            C593402Tc c593402Tc2 = c593402Tc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c593402Tc2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(2, c593402Tc2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c593402Tc2.width) + protoAdapter2.encodedSizeWithTag(4, c593402Tc2.height) + protoAdapter.encodedSizeWithTag(5, c593402Tc2.url_key) + ProtoAdapter.INT64.encodedSizeWithTag(6, c593402Tc2.data_size) + protoAdapter.encodedSizeWithTag(7, c593402Tc2.file_hash) + ProtoAdapter.BOOL.encodedSizeWithTag(8, c593402Tc2.invalid) + protoAdapter.encodedSizeWithTag(9, c593402Tc2.file_cs) + protoAdapter2.encodedSizeWithTag(10, c593402Tc2.type) + protoAdapter2.encodedSizeWithTag(11, c593402Tc2.url_sub_type) + protoAdapter.encodedSizeWithTag(12, c593402Tc2.md5) + protoAdapter.encodedSizeWithTag(13, c593402Tc2.player_access_key) + c593402Tc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C593402Tc c593402Tc) {
        }
    };
    public Long data_size;
    public String file_cs;
    public String file_hash;
    public Integer height;
    public Boolean invalid;
    public String md5;
    public String player_access_key;
    public Integer type;
    public String uri;
    public String url_key;
    public List<String> url_list;
    public Integer url_sub_type;
    public Integer width;

    public C593402Tc() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C593502Td newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
