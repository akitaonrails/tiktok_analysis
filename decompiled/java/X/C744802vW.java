package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C744802vW extends Message<C744802vW, C744902vX> {
    public static final ProtoAdapter<C744802vW> ADAPTER = new ProtoAdapter<C744802vW>() { // from class: X.02vV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C744802vW decode(ProtoReader protoReader) {
            C744802vW c744802vW = new C744802vW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c744802vW.is_sub_asset_full_payment = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c744802vW.is_force_pay_with_sub_asset = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c744802vW;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C744802vW c744802vW) {
            C744802vW c744802vW2 = c744802vW;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c744802vW2.is_force_pay_with_sub_asset) + protoAdapter.encodedSizeWithTag(2, c744802vW2.is_sub_asset_full_payment) + c744802vW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C744802vW c744802vW) {
        }
    };
    public Boolean is_force_pay_with_sub_asset;
    public Boolean is_sub_asset_full_payment;

    public C744802vW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C744902vX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
