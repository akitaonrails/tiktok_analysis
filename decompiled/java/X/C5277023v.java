package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.023v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5277023v extends Message<C5277023v, C585902Qf> {
    public static final ProtoAdapter<C5277023v> ADAPTER = new ProtoAdapter<C5277023v>() { // from class: X.022r
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5277023v decode(ProtoReader protoReader) {
            C5277023v c5277023v = new C5277023v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5277023v.input_items.add(AnonymousClass0239.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c5277023v.district = C02D6.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5277023v.client_config.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 4:
                            c5277023v.has_auto_locate_button = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c5277023v.is_store_and_priority_region_equal = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c5277023v.privacy_policy_statement = AnonymousClass0241.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5277023v.address_location = C686102m3.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5277023v.address_rights = C02ZH.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5277023v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5277023v c5277023v) {
            C5277023v c5277023v2 = c5277023v;
            int iEncodedSizeWithTag = AnonymousClass0239.ADAPTER.asRepeated().encodedSizeWithTag(1, c5277023v2.input_items) + C02D6.ADAPTER.encodedSizeWithTag(2, c5277023v2.district) + this.LIZ.encodedSizeWithTag(3, c5277023v2.client_config);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c5277023v2.has_auto_locate_button) + protoAdapter.encodedSizeWithTag(5, c5277023v2.is_store_and_priority_region_equal) + AnonymousClass0241.ADAPTER.encodedSizeWithTag(6, c5277023v2.privacy_policy_statement) + C686102m3.ADAPTER.encodedSizeWithTag(7, c5277023v2.address_location) + C02ZH.ADAPTER.encodedSizeWithTag(8, c5277023v2.address_rights) + c5277023v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5277023v c5277023v) {
        }
    };
    public C686102m3 address_location;
    public C02ZH address_rights;
    public Map<String, String> client_config;
    public C02D6 district;
    public Boolean has_auto_locate_button;
    public List<AnonymousClass0239> input_items;
    public Boolean is_store_and_priority_region_equal;
    public AnonymousClass0241 privacy_policy_statement;

    @Override // com.squareup.wire.Message
    public C585902Qf newBuilder() {
        return null;
    }

    public C5277023v() {
        super(ADAPTER, ByteString.EMPTY);
        this.input_items = C1516540pZE.LJIIIIZZ();
        this.client_config = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
