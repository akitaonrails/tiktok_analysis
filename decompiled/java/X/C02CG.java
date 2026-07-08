package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CG extends Message<C02CG, C570802Kk> {
    public static final ProtoAdapter<C02CG> ADAPTER = new ProtoAdapter<C02CG>() { // from class: X.024w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CG decode(ProtoReader protoReader) {
            C02CG c02cg = new C02CG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cg.entrance = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02cg.link = C02HY.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02cg.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02cg.subtitle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02cg.button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02cg.subscribed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c02cg.product_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CG c02cg) {
            C02CG c02cg2 = c02cg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02cg2.entrance) + C02HY.ADAPTER.encodedSizeWithTag(2, c02cg2.link) + protoAdapter.encodedSizeWithTag(3, c02cg2.title) + protoAdapter.encodedSizeWithTag(4, c02cg2.subtitle) + protoAdapter.encodedSizeWithTag(5, c02cg2.button_text) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c02cg2.subscribed) + ProtoAdapter.INT32.encodedSizeWithTag(7, c02cg2.product_status) + c02cg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CG c02cg) {
            C02CG c02cg2 = c02cg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cg2.entrance);
            C02HY.ADAPTER.encodeWithTag(protoWriter, 2, c02cg2.link);
            protoAdapter.encodeWithTag(protoWriter, 3, c02cg2.title);
            protoAdapter.encodeWithTag(protoWriter, 4, c02cg2.subtitle);
            protoAdapter.encodeWithTag(protoWriter, 5, c02cg2.button_text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c02cg2.subscribed);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, c02cg2.product_status);
            protoWriter.writeBytes(c02cg2.unknownFields());
        }
    };
    public String button_text;
    public String entrance;
    public C02HY link;
    public Integer product_status;
    public Boolean subscribed;
    public String subtitle;
    public String title;

    public C02CG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C570802Kk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
