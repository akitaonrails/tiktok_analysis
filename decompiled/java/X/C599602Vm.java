package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C599602Vm extends Message<C599602Vm, C599802Vo> {
    public static final ProtoAdapter<C599602Vm> ADAPTER = new ProtoAdapter<C599602Vm>() { // from class: X.02Vn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C599602Vm decode(ProtoReader protoReader) {
            C599602Vm c599602Vm = new C599602Vm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c599602Vm.text_logo = C613802aO.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c599602Vm.shop_background_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c599602Vm.image = C02U1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c599602Vm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C599602Vm c599602Vm) {
            C599602Vm c599602Vm2 = c599602Vm;
            return C02U1.ADAPTER.encodedSizeWithTag(1, c599602Vm2.image) + ProtoAdapter.INT32.encodedSizeWithTag(2, c599602Vm2.shop_background_type) + C613802aO.ADAPTER.encodedSizeWithTag(3, c599602Vm2.text_logo) + c599602Vm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C599602Vm c599602Vm) {
        }
    };
    public C02U1 image;
    public Integer shop_background_type;
    public C613802aO text_logo;

    public C599602Vm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C599802Vo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
