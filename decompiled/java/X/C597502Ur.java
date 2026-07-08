package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C597502Ur extends Message<C597502Ur, C597602Us> {
    public static final ProtoAdapter<C597502Ur> ADAPTER = new ProtoAdapter<C597502Ur>() { // from class: X.02Uq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C597502Ur decode(ProtoReader protoReader) {
            C597502Ur c597502Ur = new C597502Ur();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c597502Ur.wait_time = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c597502Ur.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c597502Ur.image_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c597502Ur;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C597502Ur c597502Ur) {
            C597502Ur c597502Ur2 = c597502Ur;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c597502Ur2.image_url) + protoAdapter.encodedSizeWithTag(2, c597502Ur2.text) + ProtoAdapter.INT32.encodedSizeWithTag(3, c597502Ur2.wait_time) + c597502Ur2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C597502Ur c597502Ur) {
            C597502Ur c597502Ur2 = c597502Ur;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c597502Ur2.image_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c597502Ur2.text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c597502Ur2.wait_time);
            protoWriter.writeBytes(c597502Ur2.unknownFields());
        }
    };
    public String image_url;
    public String text;
    public Integer wait_time;

    public C597502Ur() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C597602Us newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
