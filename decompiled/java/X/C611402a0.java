package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C611402a0 extends Message<C611402a0, C611502a1> {
    public static final ProtoAdapter<C611402a0> ADAPTER = new ProtoAdapter<C611402a0>() { // from class: X.02Zz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C611402a0 decode(ProtoReader protoReader) {
            C611402a0 c611402a0 = new C611402a0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c611402a0.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c611402a0.spu_deduction_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c611402a0.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c611402a0.voucher_countdown = C5409028x.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c611402a0.coupon_logo = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c611402a0.coupon_background_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c611402a0.coupon_background_border_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c611402a0.hide_coupon_label = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c611402a0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C611402a0 c611402a0) {
            C611402a0 c611402a02 = c611402a0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c611402a02.title) + protoAdapter.encodedSizeWithTag(2, c611402a02.spu_deduction_text) + protoAdapter.encodedSizeWithTag(3, c611402a02.schema) + C5409028x.ADAPTER.encodedSizeWithTag(4, c611402a02.voucher_countdown) + C02U1.ADAPTER.encodedSizeWithTag(5, c611402a02.coupon_logo);
            ProtoAdapter<C618602bA> protoAdapter2 = C618602bA.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c611402a02.coupon_background_color) + protoAdapter2.encodedSizeWithTag(7, c611402a02.coupon_background_border_color) + ProtoAdapter.BOOL.encodedSizeWithTag(8, c611402a02.hide_coupon_label) + c611402a02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C611402a0 c611402a0) {
        }
    };
    public C618602bA coupon_background_border_color;
    public C618602bA coupon_background_color;
    public C02U1 coupon_logo;
    public Boolean hide_coupon_label;
    public String schema;
    public String spu_deduction_text;
    public String title;
    public C5409028x voucher_countdown;

    public C611402a0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C611502a1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
