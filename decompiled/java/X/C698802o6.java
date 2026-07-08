package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02o6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C698802o6 extends Message<C698802o6, C698902o7> {
    public static final ProtoAdapter<C698802o6> ADAPTER = new ProtoAdapter<C698802o6>() { // from class: X.02o5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C698802o6 decode(ProtoReader protoReader) {
            C698802o6 c698802o6 = new C698802o6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c698802o6.logistics_panel_shipping_display_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c698802o6.shipping_dialog = C606802Yg.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c698802o6.shipping_display_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c698802o6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C698802o6 c698802o6) {
            C698802o6 c698802o62 = c698802o6;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c698802o62.shipping_display_text) + C606802Yg.ADAPTER.encodedSizeWithTag(2, c698802o62.shipping_dialog) + protoAdapter.encodedSizeWithTag(3, c698802o62.logistics_panel_shipping_display_text) + c698802o62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C698802o6 c698802o6) {
        }
    };
    public String logistics_panel_shipping_display_text;
    public C606802Yg shipping_dialog;
    public String shipping_display_text;

    public C698802o6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C698902o7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
