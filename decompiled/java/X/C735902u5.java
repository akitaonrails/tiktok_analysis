package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02u5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C735902u5 extends Message<C735902u5, C736002u6> {
    public static final ProtoAdapter<C735902u5> ADAPTER = new ProtoAdapter<C735902u5>() { // from class: X.02u4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C735902u5 decode(ProtoReader protoReader) {
            C735902u5 c735902u5 = new C735902u5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c735902u5.quantity_to_add = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c735902u5.can_add_to_cart = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c735902u5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C735902u5 c735902u5) {
            C735902u5 c735902u52 = c735902u5;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c735902u52.can_add_to_cart) + ProtoAdapter.INT32.encodedSizeWithTag(2, c735902u52.quantity_to_add) + c735902u52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C735902u5 c735902u5) {
        }
    };
    public Boolean can_add_to_cart;
    public Integer quantity_to_add;

    public C735902u5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C736002u6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
