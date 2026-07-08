package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C629602cw extends Message<C629602cw, C629702cx> {
    public static final ProtoAdapter<C629602cw> ADAPTER = new ProtoAdapter<C629602cw>() { // from class: X.02cv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C629602cw decode(ProtoReader protoReader) {
            C629602cw c629602cw = new C629602cw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c629602cw.quantity_minus_support_edit = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c629602cw.default_add_cart_quantity = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c629602cw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C629602cw c629602cw) {
            C629602cw c629602cw2 = c629602cw;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c629602cw2.default_add_cart_quantity) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c629602cw2.quantity_minus_support_edit) + c629602cw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C629602cw c629602cw) {
        }
    };
    public Integer default_add_cart_quantity;
    public Boolean quantity_minus_support_edit;

    public C629602cw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C629702cx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
