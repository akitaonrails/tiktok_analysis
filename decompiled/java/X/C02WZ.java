package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WZ extends Message<C02WZ, C601002Wa> {
    public static final ProtoAdapter<C02WZ> ADAPTER = new ProtoAdapter<C02WZ>() { // from class: X.02WY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WZ decode(ProtoReader protoReader) {
            C02WZ c02wz = new C02WZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02wz.edit_bundle_quantity_toast = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02wz.title_light_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02wz.sku_card_style_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02wz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WZ c02wz) {
            C02WZ c02wz2 = c02wz;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02wz2.sku_card_style_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02wz2.title_light_text) + protoAdapter.encodedSizeWithTag(3, c02wz2.edit_bundle_quantity_toast) + c02wz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02WZ c02wz) {
        }
    };
    public String edit_bundle_quantity_toast;
    public Integer sku_card_style_type;
    public String title_light_text;

    public C02WZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C601002Wa newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
