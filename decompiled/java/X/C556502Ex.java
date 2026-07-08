package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556502Ex extends Message<C556502Ex, C570202Ke> {
    public static final ProtoAdapter<C556502Ex> ADAPTER = new ProtoAdapter<C556502Ex>() { // from class: X.027o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556502Ex decode(ProtoReader protoReader) {
            C556502Ex c556502Ex = new C556502Ex();
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
                                    c556502Ex.type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c556502Ex.color_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c556502Ex.color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c556502Ex.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556502Ex;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556502Ex c556502Ex) {
            C556502Ex c556502Ex2 = c556502Ex;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c556502Ex2.text) + protoAdapter.encodedSizeWithTag(2, c556502Ex2.color) + protoAdapter.encodedSizeWithTag(3, c556502Ex2.color_text) + ProtoAdapter.INT32.encodedSizeWithTag(4, c556502Ex2.type) + c556502Ex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556502Ex c556502Ex) {
            C556502Ex c556502Ex2 = c556502Ex;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c556502Ex2.text);
            protoAdapter.encodeWithTag(protoWriter, 2, c556502Ex2.color);
            protoAdapter.encodeWithTag(protoWriter, 3, c556502Ex2.color_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c556502Ex2.type);
            protoWriter.writeBytes(c556502Ex2.unknownFields());
        }
    };
    public String color;
    public String color_text;
    public String text;
    public Integer type;

    public C556502Ex() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C570202Ke newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
