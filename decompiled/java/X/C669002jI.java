package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C669002jI extends Message<C669002jI, C669102jJ> {
    public static final ProtoAdapter<C669002jI> ADAPTER = new ProtoAdapter<C669002jI>() { // from class: X.02jH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C669002jI decode(ProtoReader protoReader) {
            C669002jI c669002jI = new C669002jI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c669002jI.similar_tag = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c669002jI;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C669002jI c669002jI) {
            C669002jI c669002jI2 = c669002jI;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c669002jI2.similar_tag) + c669002jI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C669002jI c669002jI) {
            C669002jI c669002jI2 = c669002jI;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c669002jI2.similar_tag);
            protoWriter.writeBytes(c669002jI2.unknownFields());
        }
    };
    public Boolean similar_tag;

    public C669002jI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C669102jJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
