package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C637502eD extends Message<C637502eD, C637602eE> {
    public static final ProtoAdapter<C637502eD> ADAPTER = new ProtoAdapter<C637502eD>() { // from class: X.02eC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C637502eD decode(ProtoReader protoReader) {
            C637502eD c637502eD = new C637502eD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c637502eD.data = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c637502eD.link = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c637502eD;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C637502eD c637502eD) {
            C637502eD c637502eD2 = c637502eD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c637502eD2.link) + protoAdapter.encodedSizeWithTag(2, c637502eD2.data) + c637502eD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C637502eD c637502eD) {
            C637502eD c637502eD2 = c637502eD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c637502eD2.link);
            protoAdapter.encodeWithTag(protoWriter, 2, c637502eD2.data);
            protoWriter.writeBytes(c637502eD2.unknownFields());
        }
    };
    public String data;
    public String link;

    public C637502eD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C637602eE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
