package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C675502kL extends Message<C675502kL, C675602kM> {
    public static final ProtoAdapter<C675502kL> ADAPTER = new ProtoAdapter<C675502kL>() { // from class: X.02kK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C675502kL decode(ProtoReader protoReader) {
            C675502kL c675502kL = new C675502kL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c675502kL.tracer_info_value = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c675502kL;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C675502kL c675502kL) {
            C675502kL c675502kL2 = c675502kL;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c675502kL2.tracer_info_value) + c675502kL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C675502kL c675502kL) {
            C675502kL c675502kL2 = c675502kL;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c675502kL2.tracer_info_value);
            protoWriter.writeBytes(c675502kL2.unknownFields());
        }
    };
    public String tracer_info_value;

    public C675502kL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C675602kM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
