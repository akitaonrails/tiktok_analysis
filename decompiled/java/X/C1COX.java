package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COX extends Message<C1COX, C1COY> {
    public static final ProtoAdapter<C1COX> ADAPTER = new ProtoAdapter<C1COX>() { // from class: X.1COW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1COX decode(ProtoReader protoReader) {
            C1COX c1cox = new C1COX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cox.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1cox.title = C1COL.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1cox.text = C1COL.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1cox.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cox.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1cox.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cox;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1COX c1cox) {
            C1COX c1cox2 = c1cox;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cox2.name);
            ProtoAdapter<C1COL> protoAdapter2 = C1COL.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1cox2.title) + protoAdapter2.encodedSizeWithTag(3, c1cox2.text) + protoAdapter.encodedSizeWithTag(4, c1cox2.schema) + C029C.ADAPTER.encodedSizeWithTag(5, c1cox2.icon) + protoAdapter.encodedSizeWithTag(6, c1cox2.da_info) + c1cox2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1COX c1cox) {
        }
    };
    public String da_info;
    public C029C icon;
    public String name;
    public String schema;
    public C1COL text;
    public C1COL title;

    public C1COX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1COY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
