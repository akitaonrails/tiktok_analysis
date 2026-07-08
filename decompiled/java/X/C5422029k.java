package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.029k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5422029k extends Message<C5422029k, C02NW> {
    public static final ProtoAdapter<C5422029k> ADAPTER = new ProtoAdapter<C5422029k>() { // from class: X.024Z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5422029k decode(ProtoReader protoReader) {
            C5422029k c5422029k = new C5422029k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5422029k.hint_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5422029k.identity_info_option = C554302Eb.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5422029k.identity_info_panel = C02BC.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5422029k.identity_required = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c5422029k.identity_info_collection_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c5422029k.recipient_identity_info = C544102Ad.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5422029k.enable_address_identity = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c5422029k.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5422029k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5422029k c5422029k) {
            C5422029k c5422029k2 = c5422029k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5422029k2.hint_text) + C554302Eb.ADAPTER.encodedSizeWithTag(2, c5422029k2.identity_info_option) + C02BC.ADAPTER.encodedSizeWithTag(3, c5422029k2.identity_info_panel);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5422029k2.identity_required) + ProtoAdapter.INT32.encodedSizeWithTag(5, c5422029k2.identity_info_collection_style) + C544102Ad.ADAPTER.encodedSizeWithTag(6, c5422029k2.recipient_identity_info) + protoAdapter2.encodedSizeWithTag(7, c5422029k2.enable_address_identity) + protoAdapter.encodedSizeWithTag(8, c5422029k2.title) + c5422029k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5422029k c5422029k) {
        }
    };
    public Boolean enable_address_identity;
    public String hint_text;
    public Integer identity_info_collection_style;
    public C554302Eb identity_info_option;
    public C02BC identity_info_panel;
    public Boolean identity_required;
    public C544102Ad recipient_identity_info;
    public String title;

    public C5422029k() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
