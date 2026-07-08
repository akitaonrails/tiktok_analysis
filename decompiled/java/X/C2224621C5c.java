package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224621C5c extends Message<C2224621C5c, C2224631C5d> {
    public static final ProtoAdapter<C2224621C5c> ADAPTER = new ProtoAdapter<C2224621C5c>() { // from class: X.1C5b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224621C5c decode(ProtoReader protoReader) {
            C2224621C5c c2224621C5c = new C2224621C5c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2224621C5c.color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2224621C5c.dark_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2224621C5c.bundle_img = C1C5Z.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224621C5c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224621C5c c2224621C5c) {
            C2224621C5c c2224621C5c2 = c2224621C5c;
            int iEncodedSizeWithTag = C1C5Z.ADAPTER.encodedSizeWithTag(1, c2224621C5c2.bundle_img);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2224621C5c2.dark_color) + protoAdapter.encodedSizeWithTag(3, c2224621C5c2.color) + c2224621C5c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224621C5c c2224621C5c) {
        }
    };
    public C1C5Z bundle_img;
    public String color;
    public String dark_color;

    public C2224621C5c() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224631C5d newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
