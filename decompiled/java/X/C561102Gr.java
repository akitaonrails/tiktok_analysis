package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561102Gr extends Message<C561102Gr, C02P8> {
    public static final ProtoAdapter<C561102Gr> ADAPTER = new ProtoAdapter<C561102Gr>() { // from class: X.02AL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561102Gr decode(ProtoReader protoReader) {
            C561102Gr c561102Gr = new C561102Gr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c561102Gr.terms_content = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c561102Gr.sub_title = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c561102Gr.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561102Gr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561102Gr c561102Gr) {
            C561102Gr c561102Gr2 = c561102Gr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c561102Gr2.title) + C5431029t.ADAPTER.encodedSizeWithTag(2, c561102Gr2.sub_title) + protoAdapter.encodedSizeWithTag(3, c561102Gr2.terms_content) + c561102Gr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561102Gr c561102Gr) {
        }
    };
    public C5431029t sub_title;
    public String terms_content;
    public String title;

    public C561102Gr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02P8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
