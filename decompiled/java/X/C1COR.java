package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COR extends Message<C1COR, C1COS> {
    public static final ProtoAdapter<C1COR> ADAPTER = new ProtoAdapter<C1COR>() { // from class: X.1COQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1COR decode(ProtoReader protoReader) {
            C1COR c1cor = new C1COR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1cor.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cor.schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cor.text = C1COL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cor.title = C1COL.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cor;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1COR c1cor) {
            C1COR c1cor2 = c1cor;
            ProtoAdapter<C1COL> protoAdapter = C1COL.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cor2.title) + protoAdapter.encodedSizeWithTag(2, c1cor2.text);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1cor2.schema) + protoAdapter2.encodedSizeWithTag(4, c1cor2.da_info) + c1cor2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1COR c1cor) {
        }
    };
    public String da_info;
    public String schema;
    public C1COL text;
    public C1COL title;

    public C1COR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1COS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
