package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ED, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ED extends Message<C02ED, C02PJ> {
    public static final ProtoAdapter<C02ED> ADAPTER = new ProtoAdapter<C02ED>() { // from class: X.029S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ED decode(ProtoReader protoReader) {
            C02ED c02ed = new C02ED();
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
                                    c02ed.addon_product_checkbox_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02ed.addon_product_link_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02ed.show_separator_between_shop_order = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02ed.display_selected_product_in_shop_group = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ed;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ED c02ed) {
            C02ED c02ed2 = c02ed;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02ed2.display_selected_product_in_shop_group) + protoAdapter.encodedSizeWithTag(2, c02ed2.show_separator_between_shop_order);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02ed2.addon_product_link_type) + protoAdapter2.encodedSizeWithTag(4, c02ed2.addon_product_checkbox_type) + c02ed2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02ED c02ed) {
        }
    };
    public Integer addon_product_checkbox_type;
    public Integer addon_product_link_type;
    public Boolean display_selected_product_in_shop_group;
    public Boolean show_separator_between_shop_order;

    public C02ED() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
