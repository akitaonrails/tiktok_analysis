package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C669302jL extends Message<C669302jL, C669402jM> {
    public static final ProtoAdapter<C669302jL> ADAPTER = new ProtoAdapter<C669302jL>() { // from class: X.02jK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C669302jL decode(ProtoReader protoReader) {
            C669302jL c669302jL = new C669302jL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c669302jL.golden_cache_duration = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c669302jL;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C669302jL c669302jL) {
            C669302jL c669302jL2 = c669302jL;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c669302jL2.golden_cache_duration) + c669302jL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C669302jL c669302jL) {
            C669302jL c669302jL2 = c669302jL;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c669302jL2.golden_cache_duration);
            protoWriter.writeBytes(c669302jL2.unknownFields());
        }
    };
    public Integer golden_cache_duration;

    public C669302jL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C669402jM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
