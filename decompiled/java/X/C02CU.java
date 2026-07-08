package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CU extends Message<C02CU, C02K1> {
    public static final ProtoAdapter<C02CU> ADAPTER = new ProtoAdapter<C02CU>() { // from class: X.025Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CU decode(ProtoReader protoReader) {
            C02CU c02cu = new C02CU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cu.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02cu.icon = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02cu.fans_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02cu.open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02cu.apple_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02cu.download_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02cu.package_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02cu.app_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CU c02cu) {
            C02CU c02cu2 = c02cu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02cu2.name) + protoAdapter.encodedSizeWithTag(2, c02cu2.icon) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02cu2.fans_count) + protoAdapter.encodedSizeWithTag(4, c02cu2.open_url) + protoAdapter.encodedSizeWithTag(5, c02cu2.apple_id) + protoAdapter.encodedSizeWithTag(6, c02cu2.download_url) + protoAdapter.encodedSizeWithTag(7, c02cu2.package_name) + protoAdapter.encodedSizeWithTag(8, c02cu2.app_name) + c02cu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CU c02cu) {
            C02CU c02cu2 = c02cu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cu2.name);
            protoAdapter.encodeWithTag(protoWriter, 2, c02cu2.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02cu2.fans_count);
            protoAdapter.encodeWithTag(protoWriter, 4, c02cu2.open_url);
            protoAdapter.encodeWithTag(protoWriter, 5, c02cu2.apple_id);
            protoAdapter.encodeWithTag(protoWriter, 6, c02cu2.download_url);
            protoAdapter.encodeWithTag(protoWriter, 7, c02cu2.package_name);
            protoAdapter.encodeWithTag(protoWriter, 8, c02cu2.app_name);
            protoWriter.writeBytes(c02cu2.unknownFields());
        }
    };
    public String app_name;
    public String apple_id;
    public String download_url;
    public Integer fans_count;
    public String icon;
    public String name;
    public String open_url;
    public String package_name;

    public C02CU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02K1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
