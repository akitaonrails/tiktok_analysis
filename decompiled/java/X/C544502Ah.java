package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C544502Ah extends Message<C544502Ah, C02LD> {
    public static final ProtoAdapter<C544502Ah> ADAPTER = new ProtoAdapter<C544502Ah>() { // from class: X.024I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C544502Ah decode(ProtoReader protoReader) {
            C544502Ah c544502Ah = new C544502Ah();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c544502Ah.comment = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c544502Ah.profile = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c544502Ah.comment_pro = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 4:
                            c544502Ah.profile_pro = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 5:
                            c544502Ah.comment_thres = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 6:
                            c544502Ah.profile_thres = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            c544502Ah.comment_median_time = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 8:
                            c544502Ah.profile_median_time = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c544502Ah.model_v2 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c544502Ah.predict_config = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c544502Ah;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C544502Ah c544502Ah) {
            C544502Ah c544502Ah2 = c544502Ah;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c544502Ah2.comment) + protoAdapter.encodedSizeWithTag(2, c544502Ah2.profile);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c544502Ah2.comment_pro) + protoAdapter2.encodedSizeWithTag(4, c544502Ah2.profile_pro) + protoAdapter2.encodedSizeWithTag(5, c544502Ah2.comment_thres) + protoAdapter2.encodedSizeWithTag(6, c544502Ah2.profile_thres) + protoAdapter2.encodedSizeWithTag(7, c544502Ah2.comment_median_time) + protoAdapter2.encodedSizeWithTag(8, c544502Ah2.profile_median_time) + protoAdapter.encodedSizeWithTag(9, c544502Ah2.model_v2) + ProtoAdapter.STRING.encodedSizeWithTag(10, c544502Ah2.predict_config) + c544502Ah2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C544502Ah c544502Ah) {
            C544502Ah c544502Ah2 = c544502Ah;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c544502Ah2.comment);
            protoAdapter.encodeWithTag(protoWriter, 2, c544502Ah2.profile);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            protoAdapter2.encodeWithTag(protoWriter, 3, c544502Ah2.comment_pro);
            protoAdapter2.encodeWithTag(protoWriter, 4, c544502Ah2.profile_pro);
            protoAdapter2.encodeWithTag(protoWriter, 5, c544502Ah2.comment_thres);
            protoAdapter2.encodeWithTag(protoWriter, 6, c544502Ah2.profile_thres);
            protoAdapter2.encodeWithTag(protoWriter, 7, c544502Ah2.comment_median_time);
            protoAdapter2.encodeWithTag(protoWriter, 8, c544502Ah2.profile_median_time);
            protoAdapter.encodeWithTag(protoWriter, 9, c544502Ah2.model_v2);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, c544502Ah2.predict_config);
            protoWriter.writeBytes(c544502Ah2.unknownFields());
        }
    };
    public Integer comment;
    public Double comment_median_time;
    public Double comment_pro;
    public Double comment_thres;
    public Integer model_v2;
    public String predict_config;
    public Integer profile;
    public Double profile_median_time;
    public Double profile_pro;
    public Double profile_thres;

    public C544502Ah() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
