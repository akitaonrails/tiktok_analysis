package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D6 extends Message<C02D6, C577402My> {
    public static final ProtoAdapter<C02D6> ADAPTER = new ProtoAdapter<C02D6>() { // from class: X.027G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D6 decode(ProtoReader protoReader) {
            C02D6 c02d6 = new C02D6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02d6.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02d6.geoname_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02d6.code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02d6.longitude = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02d6.latitude = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02d6.district_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02d6.address_base = C026T.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D6 c02d6) {
            C02D6 c02d62 = c02d6;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02d62.name) + protoAdapter.encodedSizeWithTag(2, c02d62.geoname_id) + protoAdapter.encodedSizeWithTag(3, c02d62.code) + protoAdapter.encodedSizeWithTag(4, c02d62.longitude) + protoAdapter.encodedSizeWithTag(5, c02d62.latitude) + protoAdapter.encodedSizeWithTag(6, c02d62.district_key) + C026T.ADAPTER.encodedSizeWithTag(7, c02d62.address_base) + c02d62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02D6 c02d6) {
        }
    };
    public C026T address_base;
    public String code;
    public String district_key;
    public String geoname_id;
    public String latitude;
    public String longitude;
    public String name;

    public C02D6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C577402My newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
