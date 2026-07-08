package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C600602Vw extends Message<C600602Vw, C600702Vx> {
    public static final ProtoAdapter<C600602Vw> ADAPTER = new ProtoAdapter<C600602Vw>() { // from class: X.02Vv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C600602Vw decode(ProtoReader protoReader) {
            C600602Vw c600602Vw = new C600602Vw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c600602Vw.size = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c600602Vw.color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c600602Vw.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c600602Vw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C600602Vw c600602Vw) {
            C600602Vw c600602Vw2 = c600602Vw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c600602Vw2.text) + protoAdapter.encodedSizeWithTag(2, c600602Vw2.color) + protoAdapter.encodedSizeWithTag(3, c600602Vw2.size) + c600602Vw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C600602Vw c600602Vw) {
            C600602Vw c600602Vw2 = c600602Vw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c600602Vw2.text);
            protoAdapter.encodeWithTag(protoWriter, 2, c600602Vw2.color);
            protoAdapter.encodeWithTag(protoWriter, 3, c600602Vw2.size);
            protoWriter.writeBytes(c600602Vw2.unknownFields());
        }
    };
    public String color;
    public String size;
    public String text;

    public C600602Vw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C600702Vx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
