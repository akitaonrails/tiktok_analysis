package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C618602bA extends Message<C618602bA, C618702bB> {
    public static final ProtoAdapter<C618602bA> ADAPTER = new ProtoAdapter<C618602bA>() { // from class: X.02b9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C618602bA decode(ProtoReader protoReader) {
            C618602bA c618602bA = new C618602bA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c618602bA.token = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c618602bA.dark_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c618602bA.color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c618602bA;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C618602bA c618602bA) {
            C618602bA c618602bA2 = c618602bA;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c618602bA2.color) + protoAdapter.encodedSizeWithTag(2, c618602bA2.dark_color) + protoAdapter.encodedSizeWithTag(3, c618602bA2.token) + c618602bA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C618602bA c618602bA) {
        }
    };
    public String color;
    public String dark_color;
    public String token;

    public C618602bA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C618702bB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
