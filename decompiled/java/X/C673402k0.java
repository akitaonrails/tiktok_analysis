package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C673402k0 extends Message<C673402k0, C673502k1> {
    public static final ProtoAdapter<C673402k0> ADAPTER = new ProtoAdapter<C673402k0>() { // from class: X.02jz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C673402k0 decode(ProtoReader protoReader) {
            C673402k0 c673402k0 = new C673402k0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c673402k0.meta_key = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c673402k0.preview_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c673402k0.data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c673402k0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C673402k0 c673402k0) {
            C673402k0 c673402k02 = c673402k0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c673402k02.data) + ProtoAdapter.INT32.encodedSizeWithTag(2, c673402k02.preview_type) + protoAdapter.encodedSizeWithTag(3, c673402k02.meta_key) + c673402k02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C673402k0 c673402k0) {
            C673402k0 c673402k02 = c673402k0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c673402k02.data);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c673402k02.preview_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c673402k02.meta_key);
            protoWriter.writeBytes(c673402k02.unknownFields());
        }
    };
    public String data;
    public String meta_key;
    public Integer preview_type;

    public C673402k0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C673502k1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
