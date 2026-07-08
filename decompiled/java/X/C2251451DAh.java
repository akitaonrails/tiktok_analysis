package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251451DAh extends Message<C2251451DAh, C2251461DAi> {
    public static final ProtoAdapter<C2251451DAh> ADAPTER = new ProtoAdapter<C2251451DAh>() { // from class: X.1DAg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251451DAh decode(ProtoReader protoReader) {
            C2251451DAh c2251451DAh = new C2251451DAh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251451DAh.local_price_full = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251451DAh.local_price_discounted = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251451DAh.saving = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251451DAh.local_currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2251451DAh.package_group_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251451DAh.price_point_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2251451DAh.local_currency_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2251451DAh.ip_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251451DAh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251451DAh c2251451DAh) {
            C2251451DAh c2251451DAh2 = c2251451DAh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251451DAh2.local_price_full) + protoAdapter.encodedSizeWithTag(2, c2251451DAh2.local_price_discounted) + protoAdapter.encodedSizeWithTag(3, c2251451DAh2.saving) + protoAdapter.encodedSizeWithTag(4, c2251451DAh2.local_currency_symbol) + protoAdapter.encodedSizeWithTag(5, c2251451DAh2.package_group_id) + protoAdapter.encodedSizeWithTag(6, c2251451DAh2.price_point_id) + protoAdapter.encodedSizeWithTag(7, c2251451DAh2.local_currency_code) + protoAdapter.encodedSizeWithTag(8, c2251451DAh2.ip_region) + c2251451DAh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251451DAh c2251451DAh) {
            C2251451DAh c2251451DAh2 = c2251451DAh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251451DAh2.local_price_full);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251451DAh2.local_price_discounted);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251451DAh2.saving);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251451DAh2.local_currency_symbol);
            protoAdapter.encodeWithTag(protoWriter, 5, c2251451DAh2.package_group_id);
            protoAdapter.encodeWithTag(protoWriter, 6, c2251451DAh2.price_point_id);
            protoAdapter.encodeWithTag(protoWriter, 7, c2251451DAh2.local_currency_code);
            protoAdapter.encodeWithTag(protoWriter, 8, c2251451DAh2.ip_region);
            protoWriter.writeBytes(c2251451DAh2.unknownFields());
        }
    };
    public String ip_region;
    public String local_currency_code;
    public String local_currency_symbol;
    public String local_price_discounted;
    public String local_price_full;
    public String package_group_id;
    public String price_point_id;
    public String saving;

    public C2251451DAh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251461DAi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
