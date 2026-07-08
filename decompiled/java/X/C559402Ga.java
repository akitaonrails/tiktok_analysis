package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559402Ga extends Message<C559402Ga, C02IV> {
    public static final ProtoAdapter<C559402Ga> ADAPTER = new ProtoAdapter<C559402Ga>() { // from class: X.02Dy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559402Ga decode(ProtoReader protoReader) {
            C559402Ga c559402Ga = new C559402Ga();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c559402Ga.negative_prompt_details = C553902Dx.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c559402Ga.positive_prompt_details = C553902Dx.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559402Ga;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559402Ga c559402Ga) {
            C559402Ga c559402Ga2 = c559402Ga;
            ProtoAdapter<C553902Dx> protoAdapter = C553902Dx.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c559402Ga2.positive_prompt_details) + protoAdapter.encodedSizeWithTag(2, c559402Ga2.negative_prompt_details) + c559402Ga2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559402Ga c559402Ga) {
            C559402Ga c559402Ga2 = c559402Ga;
            ProtoAdapter<C553902Dx> protoAdapter = C553902Dx.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c559402Ga2.positive_prompt_details);
            protoAdapter.encodeWithTag(protoWriter, 2, c559402Ga2.negative_prompt_details);
            protoWriter.writeBytes(c559402Ga2.unknownFields());
        }
    };
    public C553902Dx negative_prompt_details;
    public C553902Dx positive_prompt_details;

    public C559402Ga() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
