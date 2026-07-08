package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554202Ea extends Message<C554202Ea, C576002Mk> {
    public static final ProtoAdapter<C554202Ea> ADAPTER = new ProtoAdapter<C554202Ea>() { // from class: X.029V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554202Ea decode(ProtoReader protoReader) {
            C554202Ea c554202Ea = new C554202Ea();
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
                                        c554202Ea.copy_icon = C029C.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c554202Ea.button_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c554202Ea.phone_num = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c554202Ea.message = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c554202Ea.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554202Ea;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554202Ea c554202Ea) {
            C554202Ea c554202Ea2 = c554202Ea;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c554202Ea2.title) + protoAdapter.encodedSizeWithTag(2, c554202Ea2.message) + protoAdapter.encodedSizeWithTag(3, c554202Ea2.phone_num) + protoAdapter.encodedSizeWithTag(4, c554202Ea2.button_text) + C029C.ADAPTER.encodedSizeWithTag(5, c554202Ea2.copy_icon) + c554202Ea2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C554202Ea c554202Ea) {
        }
    };
    public String button_text;
    public C029C copy_icon;
    public String message;
    public String phone_num;
    public String title;

    public C554202Ea() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C576002Mk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
