package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EH extends Message<C02EH, C564602Ia> {
    public static final ProtoAdapter<C02EH> ADAPTER = new ProtoAdapter<C02EH>() { // from class: X.026w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EH decode(ProtoReader protoReader) {
            C02EH c02eh = new C02EH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02eh.sticker_type = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02eh.url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02eh.data = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02eh.id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02eh.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02eh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EH c02eh) {
            C02EH c02eh2 = c02eh;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02eh2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02eh2.id) + protoAdapter2.encodedSizeWithTag(3, c02eh2.data) + protoAdapter2.encodedSizeWithTag(4, c02eh2.url) + protoAdapter.encodedSizeWithTag(5, c02eh2.sticker_type) + c02eh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EH c02eh) {
            C02EH c02eh2 = c02eh;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02eh2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02eh2.id);
            protoAdapter2.encodeWithTag(protoWriter, 3, c02eh2.data);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02eh2.url);
            protoAdapter.encodeWithTag(protoWriter, 5, c02eh2.sticker_type);
            protoWriter.writeBytes(c02eh2.unknownFields());
        }
    };
    public String data;
    public String id;
    public Integer sticker_type;
    public Integer type;
    public String url;

    public C02EH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C564602Ia newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
