package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCN extends Message<C1CCN, C1CCO> {
    public static final ProtoAdapter<C1CCN> ADAPTER = new ProtoAdapter<C1CCN>() { // from class: X.1CCM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCN decode(ProtoReader protoReader) {
            C1CCN c1ccn = new C1CCN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1ccn.category_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1ccn.category_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1ccn.comment_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1ccn.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1ccn.sub_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1ccn.sub_description_header = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ccn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CCN c1ccn) {
            C1CCN c1ccn2 = c1ccn;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1ccn2.category_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1ccn2.category_name) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1ccn2.comment_count) + protoAdapter.encodedSizeWithTag(4, c1ccn2.description) + protoAdapter.encodedSizeWithTag(5, c1ccn2.sub_description) + protoAdapter.encodedSizeWithTag(6, c1ccn2.sub_description_header) + c1ccn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CCN c1ccn) {
            C1CCN c1ccn2 = c1ccn;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1ccn2.category_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1ccn2.category_name);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1ccn2.comment_count);
            protoAdapter.encodeWithTag(protoWriter, 4, c1ccn2.description);
            protoAdapter.encodeWithTag(protoWriter, 5, c1ccn2.sub_description);
            protoAdapter.encodeWithTag(protoWriter, 6, c1ccn2.sub_description_header);
            protoWriter.writeBytes(c1ccn2.unknownFields());
        }
    };
    public String category_name;
    public Integer category_type;
    public Long comment_count;
    public String description;
    public String sub_description;
    public String sub_description_header;

    public C1CCN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CCO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
