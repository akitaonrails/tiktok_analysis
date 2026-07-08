package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D7 extends Message<C02D7, C02Q5> {
    public static final ProtoAdapter<C02D7> ADAPTER = new ProtoAdapter<C02D7>() { // from class: X.029d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D7 decode(ProtoReader protoReader) {
            C02D7 c02d7 = new C02D7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02d7.order_notes_text = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02d7.order_notes_hint = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02d7.order_message_header = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02d7.order_notes_edit = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02d7.express_edt_placeholder = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02d7.order_notes_title = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c02d7.order_notes_save_button = C618302b7.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D7 c02d7) {
            C02D7 c02d72 = c02d7;
            ProtoAdapter<C618302b7> protoAdapter = C618302b7.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c02d72.order_notes_text) + protoAdapter.encodedSizeWithTag(2, c02d72.order_notes_hint) + protoAdapter.encodedSizeWithTag(3, c02d72.order_message_header) + protoAdapter.encodedSizeWithTag(4, c02d72.order_notes_edit) + protoAdapter.encodedSizeWithTag(5, c02d72.express_edt_placeholder) + protoAdapter.encodedSizeWithTag(6, c02d72.order_notes_title) + protoAdapter.encodedSizeWithTag(7, c02d72.order_notes_save_button) + c02d72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02D7 c02d7) {
        }
    };
    public C618302b7 express_edt_placeholder;
    public C618302b7 order_message_header;
    public C618302b7 order_notes_edit;
    public C618302b7 order_notes_hint;
    public C618302b7 order_notes_save_button;
    public C618302b7 order_notes_text;
    public C618302b7 order_notes_title;

    public C02D7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Q5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
