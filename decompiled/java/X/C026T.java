package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.026T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C026T extends Message<C026T, C02NF> {
    public static final ProtoAdapter<C026T> ADAPTER = new ProtoAdapter<C026T>() { // from class: X.023y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C026T decode(ProtoReader protoReader) {
            C026T c026t = new C026T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 99) {
                        switch (iNextTag) {
                            case 1:
                                c026t.gen_id_l0 = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 2:
                                c026t.gen_name_l0 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c026t.gen_id_l1 = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                c026t.gen_name_l1 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c026t.gen_id_l2 = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                c026t.gen_name_l2 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c026t.gen_id_l3 = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 8:
                                c026t.gen_name_l3 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c026t.gen_id_l4 = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c026t.gen_name_l4 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c026t.postcode = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c026t.postcode_id = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c026t.post_town = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                c026t.post_town_id = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 15:
                                c026t.longitude = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 16:
                                c026t.latitude = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c026t.extra = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c026t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C026T c026t) {
            C026T c026t2 = c026t;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c026t2.gen_id_l0);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c026t2.gen_name_l0) + protoAdapter.encodedSizeWithTag(3, c026t2.gen_id_l1) + protoAdapter2.encodedSizeWithTag(4, c026t2.gen_name_l1) + protoAdapter.encodedSizeWithTag(5, c026t2.gen_id_l2) + protoAdapter2.encodedSizeWithTag(6, c026t2.gen_name_l2) + protoAdapter.encodedSizeWithTag(7, c026t2.gen_id_l3) + protoAdapter2.encodedSizeWithTag(8, c026t2.gen_name_l3) + protoAdapter.encodedSizeWithTag(9, c026t2.gen_id_l4) + protoAdapter2.encodedSizeWithTag(10, c026t2.gen_name_l4) + protoAdapter2.encodedSizeWithTag(11, c026t2.postcode) + protoAdapter.encodedSizeWithTag(12, c026t2.postcode_id) + protoAdapter2.encodedSizeWithTag(13, c026t2.post_town) + protoAdapter.encodedSizeWithTag(14, c026t2.post_town_id) + protoAdapter2.encodedSizeWithTag(15, c026t2.longitude) + protoAdapter2.encodedSizeWithTag(16, c026t2.latitude) + protoAdapter2.encodedSizeWithTag(99, c026t2.extra) + c026t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C026T c026t) {
        }
    };
    public String extra;
    public Long gen_id_l0;
    public Long gen_id_l1;
    public Long gen_id_l2;
    public Long gen_id_l3;
    public Long gen_id_l4;
    public String gen_name_l0;
    public String gen_name_l1;
    public String gen_name_l2;
    public String gen_name_l3;
    public String gen_name_l4;
    public String latitude;
    public String longitude;
    public String post_town;
    public Long post_town_id;
    public String postcode;
    public Long postcode_id;

    public C026T() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
