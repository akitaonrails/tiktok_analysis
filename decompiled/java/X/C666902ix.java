package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C666902ix extends Message<C666902ix, C667002iy> {
    public static final ProtoAdapter<C666902ix> ADAPTER = new ProtoAdapter<C666902ix>() { // from class: X.02iw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C666902ix decode(ProtoReader protoReader) {
            C666902ix c666902ix = new C666902ix();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c666902ix.show_tako_account = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c666902ix;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C666902ix c666902ix) {
            C666902ix c666902ix2 = c666902ix;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c666902ix2.show_tako_account) + c666902ix2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C666902ix c666902ix) {
            C666902ix c666902ix2 = c666902ix;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c666902ix2.show_tako_account);
            protoWriter.writeBytes(c666902ix2.unknownFields());
        }
    };
    public Integer show_tako_account;

    public C666902ix() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C667002iy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
