package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CE extends Message<C02CE, C566302Ir> {
    public static final ProtoAdapter<C02CE> ADAPTER = new ProtoAdapter<C02CE>() { // from class: X.024v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CE decode(ProtoReader protoReader) {
            C02CE c02ce = new C02CE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ce.item_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c02ce.progress_bar_num = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02ce.viewed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c02ce.aweme_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02ce.expire_at = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c02ce.post_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ce;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CE c02ce) {
            C02CE c02ce2 = c02ce;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02ce2.item_id) + protoAdapter.encodedSizeWithTag(2, c02ce2.progress_bar_num) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02ce2.viewed);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02ce2.aweme_type) + protoAdapter.encodedSizeWithTag(5, c02ce2.expire_at) + protoAdapter2.encodedSizeWithTag(6, c02ce2.post_type) + c02ce2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CE c02ce) {
            C02CE c02ce2 = c02ce;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ce2.item_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ce2.progress_bar_num);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02ce2.viewed);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02ce2.aweme_type);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ce2.expire_at);
            protoAdapter2.encodeWithTag(protoWriter, 6, c02ce2.post_type);
            protoWriter.writeBytes(c02ce2.unknownFields());
        }
    };
    public Integer aweme_type;
    public Long expire_at;
    public Long item_id;
    public Integer post_type;
    public Long progress_bar_num;
    public Boolean viewed;

    public C02CE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C566302Ir newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
