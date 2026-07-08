package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C631202dC extends Message<C631202dC, C631602dG> {
    public static final ProtoAdapter<C631202dC> ADAPTER = new ProtoAdapter<C631202dC>() { // from class: X.02dB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C631202dC decode(ProtoReader protoReader) {
            C631202dC c631202dC = new C631202dC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c631202dC.policy_statement = AnonymousClass0241.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c631202dC.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c631202dC.icons.add(C029C.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c631202dC.more_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c631202dC.more_contents.add(C671702jj.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c631202dC.module_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c631202dC;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C631202dC c631202dC) {
            C631202dC c631202dC2 = c631202dC;
            int iEncodedSizeWithTag = AnonymousClass0241.ADAPTER.encodedSizeWithTag(1, c631202dC2.policy_statement);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c631202dC2.title) + C029C.ADAPTER.asRepeated().encodedSizeWithTag(3, c631202dC2.icons) + protoAdapter.encodedSizeWithTag(4, c631202dC2.more_text) + C671702jj.ADAPTER.asRepeated().encodedSizeWithTag(5, c631202dC2.more_contents) + protoAdapter.encodedSizeWithTag(6, c631202dC2.module_name) + c631202dC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C631202dC c631202dC) {
        }
    };
    public List<C029C> icons;
    public String module_name;
    public List<C671702jj> more_contents;
    public String more_text;
    public AnonymousClass0241 policy_statement;
    public String title;

    public C631202dC() {
        super(ADAPTER, ByteString.EMPTY);
        this.icons = C1516540pZE.LJIIIIZZ();
        this.more_contents = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C631602dG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
