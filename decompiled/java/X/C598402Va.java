package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C598402Va extends Message<C598402Va, C598502Vb> {
    public static final ProtoAdapter<C598402Va> ADAPTER = new ProtoAdapter<C598402Va>() { // from class: X.02VZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C598402Va decode(ProtoReader protoReader) {
            C598402Va c598402Va = new C598402Va();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c598402Va.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c598402Va.click_hint = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c598402Va.available_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c598402Va.button_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c598402Va.popup_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c598402Va.click_hint_toast_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c598402Va.button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c598402Va;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C598402Va c598402Va) {
            C598402Va c598402Va2 = c598402Va;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c598402Va2.status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c598402Va2.click_hint) + protoAdapter.encodedSizeWithTag(3, c598402Va2.available_count) + protoAdapter.encodedSizeWithTag(4, c598402Va2.button_style) + protoAdapter.encodedSizeWithTag(5, c598402Va2.popup_style) + protoAdapter2.encodedSizeWithTag(6, c598402Va2.click_hint_toast_name) + protoAdapter2.encodedSizeWithTag(7, c598402Va2.button_text) + c598402Va2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C598402Va c598402Va) {
        }
    };
    public Integer available_count;
    public Integer button_style;
    public String button_text;
    public String click_hint;
    public String click_hint_toast_name;
    public Integer popup_style;
    public Integer status;

    public C598402Va() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C598502Vb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
