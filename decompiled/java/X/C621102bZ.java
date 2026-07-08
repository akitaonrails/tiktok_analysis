package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C621102bZ extends Message<C621102bZ, C621202ba> {
    public static final ProtoAdapter<C621102bZ> ADAPTER = new ProtoAdapter<C621102bZ>() { // from class: X.02bY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C621102bZ decode(ProtoReader protoReader) {
            C621102bZ c621102bZ = new C621102bZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        if (iNextTag != 3) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c621102bZ.original_item_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c621102bZ.original_item_duetted_count = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c621102bZ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C621102bZ c621102bZ) {
            C621102bZ c621102bZ2 = c621102bZ;
            return ProtoAdapter.INT64.encodedSizeWithTag(2, c621102bZ2.original_item_duetted_count) + ProtoAdapter.STRING.encodedSizeWithTag(3, c621102bZ2.original_item_id) + c621102bZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C621102bZ c621102bZ) {
            C621102bZ c621102bZ2 = c621102bZ;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c621102bZ2.original_item_duetted_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c621102bZ2.original_item_id);
            protoWriter.writeBytes(c621102bZ2.unknownFields());
        }
    };
    public Long original_item_duetted_count;
    public String original_item_id;

    public C621102bZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C621202ba newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
