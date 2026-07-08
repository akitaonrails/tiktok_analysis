package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C645602fW extends Message<C645602fW, C645702fX> {
    public static final ProtoAdapter<C645602fW> ADAPTER = new ProtoAdapter<C645602fW>() { // from class: X.02fV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C645602fW decode(ProtoReader protoReader) {
            C645602fW c645602fW = new C645602fW();
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
                                    c645602fW.button_action_type = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c645602fW.button_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c645602fW.content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c645602fW.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c645602fW;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C645602fW c645602fW) {
            C645602fW c645602fW2 = c645602fW;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c645602fW2.title) + protoAdapter.encodedSizeWithTag(2, c645602fW2.content) + protoAdapter.encodedSizeWithTag(3, c645602fW2.button_text) + protoAdapter.encodedSizeWithTag(4, c645602fW2.button_action_type) + c645602fW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C645602fW c645602fW) {
        }
    };
    public String button_action_type;
    public String button_text;
    public String content;
    public String title;

    public C645602fW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C645702fX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
