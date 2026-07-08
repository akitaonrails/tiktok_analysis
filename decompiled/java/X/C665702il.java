package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C665702il extends Message<C665702il, C665802im> {
    public static final ProtoAdapter<C665702il> ADAPTER = new ProtoAdapter<C665702il>() { // from class: X.02ik
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C665702il decode(ProtoReader protoReader) {
            C665702il c665702il = new C665702il();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c665702il.bc_label_display_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c665702il;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C665702il c665702il) {
            C665702il c665702il2 = c665702il;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c665702il2.bc_label_display_type) + c665702il2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C665702il c665702il) {
            C665702il c665702il2 = c665702il;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c665702il2.bc_label_display_type);
            protoWriter.writeBytes(c665702il2.unknownFields());
        }
    };
    public Integer bc_label_display_type;

    public C665702il() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C665802im newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
