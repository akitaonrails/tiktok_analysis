package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D2 extends Message<C02D2, C586202Qi> {
    public static final ProtoAdapter<C02D2> ADAPTER = new ProtoAdapter<C02D2>() { // from class: X.027z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D2 decode(ProtoReader protoReader) {
            C02D2 c02d2 = new C02D2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02d2.dialog_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02d2.dialog_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02d2.retention_promotion_snap_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02d2.enable_retention_dialog = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c02d2.is_need_operation = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c02d2.animation_style_info = C642302ez.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D2 c02d2) {
            C02D2 c02d22 = c02d2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02d22.dialog_schema) + protoAdapter.encodedSizeWithTag(2, c02d22.dialog_data) + protoAdapter.encodedSizeWithTag(3, c02d22.retention_promotion_snap_info);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02d22.enable_retention_dialog) + protoAdapter2.encodedSizeWithTag(5, c02d22.is_need_operation) + C642302ez.ADAPTER.encodedSizeWithTag(6, c02d22.animation_style_info) + c02d22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02D2 c02d2) {
        }
    };
    public C642302ez animation_style_info;
    public String dialog_data;
    public String dialog_schema;
    public Boolean enable_retention_dialog;
    public Boolean is_need_operation;
    public String retention_promotion_snap_info;

    public C02D2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C586202Qi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
