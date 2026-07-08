package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C712902qN extends Message<C712902qN, C713002qO> {
    public static final ProtoAdapter<C712902qN> ADAPTER = new ProtoAdapter<C712902qN>() { // from class: X.02qM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C712902qN decode(ProtoReader protoReader) {
            C712902qN c712902qN = new C712902qN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c712902qN.background_color = C618602bA.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c712902qN.content = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c712902qN;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C712902qN c712902qN) {
            C712902qN c712902qN2 = c712902qN;
            return C5431029t.ADAPTER.encodedSizeWithTag(1, c712902qN2.content) + C618602bA.ADAPTER.encodedSizeWithTag(2, c712902qN2.background_color) + c712902qN2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C712902qN c712902qN) {
        }
    };
    public C618602bA background_color;
    public C5431029t content;

    public C712902qN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C713002qO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
