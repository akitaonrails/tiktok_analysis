package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AY extends Message<C02AY, C02JT> {
    public static final ProtoAdapter<C02AY> ADAPTER = new ProtoAdapter<C02AY>() { // from class: X.023o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AY decode(ProtoReader protoReader) {
            C02AY c02ay = new C02AY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ay.show_mask = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c02ay.mask_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c02ay.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02ay.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02ay.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02ay.cancel_mask_label = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02ay.pop_window = C02HE.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c02ay.birthday_edit_module = C02HE.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02ay.policy_module = C02HE.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ay;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AY c02ay) {
            C02AY c02ay2 = c02ay;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c02ay2.show_mask);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ay2.mask_type) + protoAdapter.encodedSizeWithTag(3, c02ay2.status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c02ay2.title) + protoAdapter2.encodedSizeWithTag(5, c02ay2.content) + protoAdapter2.encodedSizeWithTag(6, c02ay2.cancel_mask_label);
            ProtoAdapter<C02HE> protoAdapter3 = C02HE.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(7, c02ay2.pop_window) + protoAdapter3.encodedSizeWithTag(8, c02ay2.birthday_edit_module) + protoAdapter3.encodedSizeWithTag(9, c02ay2.policy_module) + c02ay2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02AY c02ay) {
            C02AY c02ay2 = c02ay;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02ay2.show_mask);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c02ay2.mask_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ay2.status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02ay2.title);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02ay2.content);
            protoAdapter2.encodeWithTag(protoWriter, 6, c02ay2.cancel_mask_label);
            ProtoAdapter<C02HE> protoAdapter3 = C02HE.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 7, c02ay2.pop_window);
            protoAdapter3.encodeWithTag(protoWriter, 8, c02ay2.birthday_edit_module);
            protoAdapter3.encodeWithTag(protoWriter, 9, c02ay2.policy_module);
            protoWriter.writeBytes(c02ay2.unknownFields());
        }
    };
    public C02HE birthday_edit_module;
    public String cancel_mask_label;
    public String content;
    public Integer mask_type;
    public C02HE policy_module;
    public C02HE pop_window;
    public Boolean show_mask;
    public Integer status;
    public String title;

    public C02AY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
