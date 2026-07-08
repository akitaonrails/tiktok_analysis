package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HE extends Message<C02HE, C567002Iy> {
    public static final ProtoAdapter<C02HE> ADAPTER = new ProtoAdapter<C02HE>() { // from class: X.02HF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HE decode(ProtoReader protoReader) {
            C02HE c02he = new C02HE();
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
                                    c02he.pop_window = C02U6.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02he.url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02he.btn_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02he.module_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02he;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HE c02he) {
            C02HE c02he2 = c02he;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02he2.module_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02he2.btn_text) + protoAdapter.encodedSizeWithTag(3, c02he2.url) + C02U6.ADAPTER.encodedSizeWithTag(4, c02he2.pop_window) + c02he2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02HE c02he) {
            C02HE c02he2 = c02he;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02he2.module_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02he2.btn_text);
            protoAdapter.encodeWithTag(protoWriter, 3, c02he2.url);
            C02U6.ADAPTER.encodeWithTag(protoWriter, 4, c02he2.pop_window);
            protoWriter.writeBytes(c02he2.unknownFields());
        }
    };
    public String btn_text;
    public Integer module_type;
    public C02U6 pop_window;
    public String url;

    public C02HE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C567002Iy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
