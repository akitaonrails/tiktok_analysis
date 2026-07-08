package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9M, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9M extends Message<C1D9M, C1D9H> {
    public static final ProtoAdapter<C1D9M> ADAPTER = new ProtoAdapter<C1D9M>() { // from class: X.1D9N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D9M decode(ProtoReader protoReader) {
            C1D9H c1d9h = new C1D9H();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1d9h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1d9h.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1d9h.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1d9h.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1d9h.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d9h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D9M c1d9m) {
            C1D9M c1d9m2 = c1d9m;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1d9m2.deleted_room_count) + protoAdapter.encodedSizeWithTag(2, c1d9m2.min_deleted_reverse_index) + protoAdapter.encodedSizeWithTag(3, c1d9m2.unread_room_count) + protoAdapter.encodedSizeWithTag(4, c1d9m2.min_unread_reverse_index) + c1d9m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D9M c1d9m) {
            C1D9M c1d9m2 = c1d9m;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1d9m2.deleted_room_count);
            protoAdapter.encodeWithTag(protoWriter, 2, c1d9m2.min_deleted_reverse_index);
            protoAdapter.encodeWithTag(protoWriter, 3, c1d9m2.unread_room_count);
            protoAdapter.encodeWithTag(protoWriter, 4, c1d9m2.min_unread_reverse_index);
            protoWriter.writeBytes(c1d9m2.unknownFields());
        }
    };
    public Integer deleted_room_count;
    public Integer min_deleted_reverse_index;
    public Integer min_unread_reverse_index;
    public Integer unread_room_count;

    @Override // com.squareup.wire.Message
    public C1D9H newBuilder() {
        return null;
    }

    public C1D9M(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public C1D9M(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.deleted_room_count = num;
        this.min_deleted_reverse_index = num2;
        this.unread_room_count = num3;
        this.min_unread_reverse_index = num4;
    }
}
