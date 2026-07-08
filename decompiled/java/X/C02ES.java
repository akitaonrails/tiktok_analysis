package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ES, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ES extends Message<C02ES, C571302Kp> {
    public static final ProtoAdapter<C02ES> ADAPTER = new ProtoAdapter<C02ES>() { // from class: X.02ET
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ES decode(ProtoReader protoReader) {
            C02ES c02es = new C02ES();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02es.scenario = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02es.type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02es.event = C611102Zx.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02es.left_icon = C621702bf.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02es.title = C675802kO.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02es.right_icon = C621702bf.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c02es.banner_action = C02SY.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02es;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ES c02es) {
            C02ES c02es2 = c02es;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02es2.scenario) + protoAdapter.encodedSizeWithTag(2, c02es2.type) + C611102Zx.ADAPTER.encodedSizeWithTag(3, c02es2.event);
            ProtoAdapter<C621702bf> protoAdapter2 = C621702bf.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02es2.left_icon) + C675802kO.ADAPTER.encodedSizeWithTag(5, c02es2.title) + protoAdapter2.encodedSizeWithTag(6, c02es2.right_icon) + C02SY.ADAPTER.encodedSizeWithTag(7, c02es2.banner_action) + c02es2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02ES c02es) {
            C02ES c02es2 = c02es;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02es2.scenario);
            protoAdapter.encodeWithTag(protoWriter, 2, c02es2.type);
            C611102Zx.ADAPTER.encodeWithTag(protoWriter, 3, c02es2.event);
            ProtoAdapter<C621702bf> protoAdapter2 = C621702bf.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02es2.left_icon);
            C675802kO.ADAPTER.encodeWithTag(protoWriter, 5, c02es2.title);
            protoAdapter2.encodeWithTag(protoWriter, 6, c02es2.right_icon);
            C02SY.ADAPTER.encodeWithTag(protoWriter, 7, c02es2.banner_action);
            protoWriter.writeBytes(c02es2.unknownFields());
        }
    };
    public C02SY banner_action;
    public C611102Zx event;
    public C621702bf left_icon;
    public C621702bf right_icon;
    public String scenario;
    public C675802kO title;
    public String type;

    public C02ES() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571302Kp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
