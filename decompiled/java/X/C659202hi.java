package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C659202hi extends Message<C659202hi, C659302hj> {
    public static final ProtoAdapter<C659202hi> ADAPTER = new ProtoAdapter<C659202hi>() { // from class: X.02hh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C659202hi decode(ProtoReader protoReader) {
            C659202hi c659202hi = new C659202hi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c659202hi.city_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c659202hi.city_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c659202hi.region_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c659202hi.lng = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c659202hi.lat = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c659202hi.geohash = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c659202hi.address = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c659202hi.subdivision_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c659202hi.l0_geo_name_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c659202hi.l1_geo_name_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c659202hi.l2_geo_name_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c659202hi.l3_geo_name_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c659202hi.l4_geo_name_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c659202hi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C659202hi c659202hi) {
            C659202hi c659202hi2 = c659202hi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c659202hi2.city_name) + protoAdapter.encodedSizeWithTag(2, c659202hi2.city_code) + protoAdapter.encodedSizeWithTag(3, c659202hi2.region_code) + protoAdapter.encodedSizeWithTag(4, c659202hi2.lng) + protoAdapter.encodedSizeWithTag(5, c659202hi2.lat) + protoAdapter.encodedSizeWithTag(6, c659202hi2.geohash) + protoAdapter.encodedSizeWithTag(7, c659202hi2.address) + protoAdapter.encodedSizeWithTag(8, c659202hi2.subdivision_code) + protoAdapter.encodedSizeWithTag(9, c659202hi2.l0_geo_name_id) + protoAdapter.encodedSizeWithTag(10, c659202hi2.l1_geo_name_id) + protoAdapter.encodedSizeWithTag(11, c659202hi2.l2_geo_name_id) + protoAdapter.encodedSizeWithTag(12, c659202hi2.l3_geo_name_id) + protoAdapter.encodedSizeWithTag(13, c659202hi2.l4_geo_name_id) + c659202hi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C659202hi c659202hi) {
            C659202hi c659202hi2 = c659202hi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c659202hi2.city_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c659202hi2.city_code);
            protoAdapter.encodeWithTag(protoWriter, 3, c659202hi2.region_code);
            protoAdapter.encodeWithTag(protoWriter, 4, c659202hi2.lng);
            protoAdapter.encodeWithTag(protoWriter, 5, c659202hi2.lat);
            protoAdapter.encodeWithTag(protoWriter, 6, c659202hi2.geohash);
            protoAdapter.encodeWithTag(protoWriter, 7, c659202hi2.address);
            protoAdapter.encodeWithTag(protoWriter, 8, c659202hi2.subdivision_code);
            protoAdapter.encodeWithTag(protoWriter, 9, c659202hi2.l0_geo_name_id);
            protoAdapter.encodeWithTag(protoWriter, 10, c659202hi2.l1_geo_name_id);
            protoAdapter.encodeWithTag(protoWriter, 11, c659202hi2.l2_geo_name_id);
            protoAdapter.encodeWithTag(protoWriter, 12, c659202hi2.l3_geo_name_id);
            protoAdapter.encodeWithTag(protoWriter, 13, c659202hi2.l4_geo_name_id);
            protoWriter.writeBytes(c659202hi2.unknownFields());
        }
    };
    public String address;
    public String city_code;
    public String city_name;
    public String geohash;
    public String l0_geo_name_id;
    public String l1_geo_name_id;
    public String l2_geo_name_id;
    public String l3_geo_name_id;
    public String l4_geo_name_id;
    public String lat;
    public String lng;
    public String region_code;
    public String subdivision_code;

    public C659202hi() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C659302hj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
