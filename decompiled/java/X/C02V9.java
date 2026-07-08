package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02V9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02V9 extends Message<C02V9, C02VA> {
    public static final ProtoAdapter<C02V9> ADAPTER = new ProtoAdapter<C02V9>() { // from class: X.02V8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02V9 decode(ProtoReader protoReader) {
            C02V9 c02v9 = new C02V9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02v9.action = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02v9.icon = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02v9.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02v9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02V9 c02v9) {
            C02V9 c02v92 = c02v9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02v92.text) + C673002jw.ADAPTER.encodedSizeWithTag(2, c02v92.icon) + protoAdapter.encodedSizeWithTag(3, c02v92.action) + c02v92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02V9 c02v9) {
            C02V9 c02v92 = c02v9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02v92.text);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c02v92.icon);
            protoAdapter.encodeWithTag(protoWriter, 3, c02v92.action);
            protoWriter.writeBytes(c02v92.unknownFields());
        }
    };
    public String action;
    public C673002jw icon;
    public String text;

    public C02V9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
