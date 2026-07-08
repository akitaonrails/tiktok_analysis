package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.028z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5411028z extends Message<C5411028z, C572902Lf> {
    public static final ProtoAdapter<C5411028z> ADAPTER = new ProtoAdapter<C5411028z>() { // from class: X.024U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5411028z decode(ProtoReader protoReader) {
            C5411028z c5411028z = new C5411028z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5411028z.reason_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5411028z.sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c5411028z.middle_info.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            c5411028z.middle_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5411028z.user_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c5411028z.item_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c5411028z.friend_type_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5411028z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5411028z c5411028z) {
            C5411028z c5411028z2 = c5411028z;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5411028z2.reason_type) + protoAdapter.encodedSizeWithTag(2, c5411028z2.sub_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(3, c5411028z2.middle_info) + protoAdapter.encodedSizeWithTag(4, c5411028z2.middle_count) + protoAdapter2.encodedSizeWithTag(5, c5411028z2.user_id) + protoAdapter2.encodedSizeWithTag(6, c5411028z2.item_id) + ProtoAdapter.STRING.encodedSizeWithTag(7, c5411028z2.friend_type_str) + c5411028z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5411028z c5411028z) {
            C5411028z c5411028z2 = c5411028z;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c5411028z2.reason_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c5411028z2.sub_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, c5411028z2.middle_info);
            protoAdapter.encodeWithTag(protoWriter, 4, c5411028z2.middle_count);
            protoAdapter2.encodeWithTag(protoWriter, 5, c5411028z2.user_id);
            protoAdapter2.encodeWithTag(protoWriter, 6, c5411028z2.item_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, c5411028z2.friend_type_str);
            protoWriter.writeBytes(c5411028z2.unknownFields());
        }
    };
    public String friend_type_str;
    public Long item_id;
    public Integer middle_count;
    public List<Long> middle_info;
    public Integer reason_type;
    public Integer sub_type;
    public Long user_id;

    public C5411028z() {
        super(ADAPTER, ByteString.EMPTY);
        this.middle_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C572902Lf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
