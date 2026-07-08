package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02y1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C760302y1 extends Message<C760302y1, C760402y2> {
    public static final ProtoAdapter<C760302y1> ADAPTER = new ProtoAdapter<C760302y1>() { // from class: X.02y0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C760302y1 decode(ProtoReader protoReader) {
            C760302y1 c760302y1 = new C760302y1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c760302y1.encrypt_key = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c760302y1.phone_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c760302y1.phone_number = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c760302y1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C760302y1 c760302y1) {
            C760302y1 c760302y12 = c760302y1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c760302y12.phone_number) + protoAdapter.encodedSizeWithTag(2, c760302y12.phone_id) + protoAdapter.encodedSizeWithTag(3, c760302y12.encrypt_key) + c760302y12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C760302y1 c760302y1) {
            C760302y1 c760302y12 = c760302y1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c760302y12.phone_number);
            protoAdapter.encodeWithTag(protoWriter, 2, c760302y12.phone_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c760302y12.encrypt_key);
            protoWriter.writeBytes(c760302y12.unknownFields());
        }
    };
    public String encrypt_key;
    public String phone_id;
    public String phone_number;

    public C760302y1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C760402y2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
