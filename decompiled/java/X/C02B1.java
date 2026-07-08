package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B1 extends Message<C02B1, C02NL> {
    public static final ProtoAdapter<C02B1> ADAPTER = new ProtoAdapter<C02B1>() { // from class: X.0254
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B1 decode(ProtoReader protoReader) {
            C02B1 c02b1 = new C02B1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02b1.promotion_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c02b1.label_type = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02b1.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02b1.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02b1.count_down = C648102fv.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02b1.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02b1.selling_point_style = C02BJ.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B1 c02b1) {
            C02B1 c02b12 = c02b1;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02b12.promotion_id) + protoAdapter.encodedSizeWithTag(2, c02b12.label_type) + C029C.ADAPTER.encodedSizeWithTag(3, c02b12.icon);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02b12.text) + C648102fv.ADAPTER.encodedSizeWithTag(5, c02b12.count_down) + protoAdapter2.encodedSizeWithTag(6, c02b12.da_info) + C02BJ.ADAPTER.encodedSizeWithTag(7, c02b12.selling_point_style) + c02b12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02B1 c02b1) {
        }
    };
    public C648102fv count_down;
    public String da_info;
    public C029C icon;
    public Long label_type;
    public Long promotion_id;
    public C02BJ selling_point_style;
    public String text;

    public C02B1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
