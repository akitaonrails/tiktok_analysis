package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224681C5i extends Message<C2224681C5i, C2224691C5j> {
    public static final ProtoAdapter<C2224681C5i> ADAPTER = new ProtoAdapter<C2224681C5i>() { // from class: X.1C5h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224681C5i decode(ProtoReader protoReader) {
            C2224681C5i c2224681C5i = new C2224681C5i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2224681C5i.color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2224681C5i.dark_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2224681C5i.bundle_img = C2224651C5f.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224681C5i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224681C5i c2224681C5i) {
            C2224681C5i c2224681C5i2 = c2224681C5i;
            int iEncodedSizeWithTag = C2224651C5f.ADAPTER.encodedSizeWithTag(1, c2224681C5i2.bundle_img);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2224681C5i2.dark_color) + protoAdapter.encodedSizeWithTag(3, c2224681C5i2.color) + c2224681C5i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224681C5i c2224681C5i) {
        }
    };
    public C2224651C5f bundle_img;
    public String color;
    public String dark_color;

    public C2224681C5i() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224691C5j newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
