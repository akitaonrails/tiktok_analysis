package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02TS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02TS extends Message<C02TS, C02TT> {
    public static final ProtoAdapter<C02TS> ADAPTER = new ProtoAdapter<C02TS>() { // from class: X.02TR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02TS decode(ProtoReader protoReader) {
            C02TS c02ts = new C02TS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        if (iNextTag != 3) {
                            if (iNextTag != 4) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02ts.sales_text_ec_richtext = C5431029t.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02ts.sales_specification_schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ts.sales_text = AnonymousClass0241.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ts;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02TS c02ts) {
            C02TS c02ts2 = c02ts;
            return AnonymousClass0241.ADAPTER.encodedSizeWithTag(2, c02ts2.sales_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02ts2.sales_specification_schema) + C5431029t.ADAPTER.encodedSizeWithTag(4, c02ts2.sales_text_ec_richtext) + c02ts2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02TS c02ts) {
        }
    };
    public String sales_specification_schema;
    public AnonymousClass0241 sales_text;
    public C5431029t sales_text_ec_richtext;

    public C02TS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02TT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
