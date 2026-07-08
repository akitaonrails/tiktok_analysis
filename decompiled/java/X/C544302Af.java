package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C544302Af extends Message<C544302Af, C02IO> {
    public static final ProtoAdapter<C544302Af> ADAPTER = new ProtoAdapter<C544302Af>() { // from class: X.024b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C544302Af decode(ProtoReader protoReader) {
            C544302Af c544302Af = new C544302Af();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c544302Af.sentence = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c544302Af.challenge_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c544302Af.search_word = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c544302Af.value = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c544302Af.vb_rank = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c544302Af.vb_rank_value = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c544302Af.rank = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c544302Af.group_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c544302Af.label = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c544302Af.pattern_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c544302Af;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C544302Af c544302Af) {
            C544302Af c544302Af2 = c544302Af;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c544302Af2.sentence) + protoAdapter.encodedSizeWithTag(2, c544302Af2.challenge_id) + protoAdapter.encodedSizeWithTag(3, c544302Af2.search_word);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c544302Af2.value);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c544302Af2.vb_rank) + protoAdapter2.encodedSizeWithTag(6, c544302Af2.vb_rank_value) + protoAdapter3.encodedSizeWithTag(7, c544302Af2.rank) + protoAdapter.encodedSizeWithTag(8, c544302Af2.group_id) + protoAdapter3.encodedSizeWithTag(9, c544302Af2.label) + protoAdapter3.encodedSizeWithTag(10, c544302Af2.pattern_type) + c544302Af2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C544302Af c544302Af) {
            C544302Af c544302Af2 = c544302Af;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c544302Af2.sentence);
            protoAdapter.encodeWithTag(protoWriter, 2, c544302Af2.challenge_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c544302Af2.search_word);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 4, c544302Af2.value);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 5, c544302Af2.vb_rank);
            protoAdapter2.encodeWithTag(protoWriter, 6, c544302Af2.vb_rank_value);
            protoAdapter3.encodeWithTag(protoWriter, 7, c544302Af2.rank);
            protoAdapter.encodeWithTag(protoWriter, 8, c544302Af2.group_id);
            protoAdapter3.encodeWithTag(protoWriter, 9, c544302Af2.label);
            protoAdapter3.encodeWithTag(protoWriter, 10, c544302Af2.pattern_type);
            protoWriter.writeBytes(c544302Af2.unknownFields());
        }
    };
    public String challenge_id;
    public String group_id;
    public Integer label;
    public Integer pattern_type;
    public Integer rank;
    public String search_word;
    public String sentence;
    public Long value;
    public Integer vb_rank;
    public Long vb_rank_value;

    public C544302Af() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
