package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C643802fE extends Message<C643802fE, C643902fF> {
    public static final ProtoAdapter<C643802fE> ADAPTER = new ProtoAdapter<C643802fE>() { // from class: X.02fD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C643802fE decode(ProtoReader protoReader) {
            C643802fE c643802fE = new C643802fE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c643802fE.dark = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c643802fE.light = C02U1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c643802fE;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C643802fE c643802fE) {
            C643802fE c643802fE2 = c643802fE;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c643802fE2.light) + protoAdapter.encodedSizeWithTag(2, c643802fE2.dark) + c643802fE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C643802fE c643802fE) {
        }
    };
    public C02U1 dark;
    public C02U1 light;

    public C643802fE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C643902fF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
