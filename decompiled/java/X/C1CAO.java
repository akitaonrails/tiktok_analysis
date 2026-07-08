package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAO extends Message<C1CAO, C1CAP> {
    public static final ProtoAdapter<C1CAO> ADAPTER = new ProtoAdapter<C1CAO>() { // from class: X.1CAN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CAO decode(ProtoReader protoReader) {
            C1CAO c1cao = new C1CAO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cao.original_aweme_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1cao.stitch_trim_start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1cao.stitch_trim_end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1cao.root_aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cao.parent_aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1cao.is_restitch = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cao;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CAO c1cao) {
            C1CAO c1cao2 = c1cao;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cao2.original_aweme_id) + protoAdapter.encodedSizeWithTag(2, c1cao2.stitch_trim_start_time) + protoAdapter.encodedSizeWithTag(3, c1cao2.stitch_trim_end_time);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c1cao2.root_aweme_id) + protoAdapter2.encodedSizeWithTag(5, c1cao2.parent_aweme_id) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c1cao2.is_restitch) + c1cao2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CAO c1cao) {
            C1CAO c1cao2 = c1cao;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cao2.original_aweme_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cao2.stitch_trim_start_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cao2.stitch_trim_end_time);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c1cao2.root_aweme_id);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1cao2.parent_aweme_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c1cao2.is_restitch);
            protoWriter.writeBytes(c1cao2.unknownFields());
        }
    };
    public Boolean is_restitch;
    public Long original_aweme_id;
    public String parent_aweme_id;
    public String root_aweme_id;
    public Long stitch_trim_end_time;
    public Long stitch_trim_start_time;

    public C1CAO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CAP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
