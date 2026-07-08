package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C645302fT extends Message<C645302fT, C645402fU> {
    public static final ProtoAdapter<C645302fT> ADAPTER = new ProtoAdapter<C645302fT>() { // from class: X.02fS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C645302fT decode(ProtoReader protoReader) {
            C645302fT c645302fT = new C645302fT();
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
                                    c645302fT.button_action_type = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c645302fT.button_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c645302fT.content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c645302fT.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c645302fT;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C645302fT c645302fT) {
            C645302fT c645302fT2 = c645302fT;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c645302fT2.title) + protoAdapter.encodedSizeWithTag(2, c645302fT2.content) + protoAdapter.encodedSizeWithTag(3, c645302fT2.button_text) + protoAdapter.encodedSizeWithTag(4, c645302fT2.button_action_type) + c645302fT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C645302fT c645302fT) {
        }
    };
    public String button_action_type;
    public String button_text;
    public String content;
    public String title;

    public C645302fT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C645402fU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
