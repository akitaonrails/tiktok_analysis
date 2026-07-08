package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAJ extends Message<C1DAJ, C1DAK> {
    public static final ProtoAdapter<C1DAJ> ADAPTER = new ProtoAdapter<C1DAJ>() { // from class: X.1DAI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAJ decode(ProtoReader protoReader) {
            C1DAJ c1daj = new C1DAJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1daj.quick_write_review_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1daj.writeable_sku_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1daj.quick_write_review_schema_v2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1daj.quick_write_review_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1daj.activity_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1daj.quick_write_review_desc_v2 = C1DAG.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1daj.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1daj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAJ c1daj) {
            C1DAJ c1daj2 = c1daj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1daj2.quick_write_review_schema) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1daj2.writeable_sku_count) + protoAdapter.encodedSizeWithTag(3, c1daj2.quick_write_review_schema_v2) + protoAdapter.encodedSizeWithTag(4, c1daj2.quick_write_review_desc) + protoAdapter.encodedSizeWithTag(5, c1daj2.activity_type) + C1DAG.ADAPTER.encodedSizeWithTag(6, c1daj2.quick_write_review_desc_v2) + protoAdapter.encodedSizeWithTag(7, c1daj2.da_info) + c1daj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DAJ c1daj) {
        }
    };
    public String activity_type;
    public String da_info;
    public String quick_write_review_desc;
    public C1DAG quick_write_review_desc_v2;
    public String quick_write_review_schema;
    public String quick_write_review_schema_v2;
    public Integer writeable_sku_count;

    public C1DAJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1DAK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
