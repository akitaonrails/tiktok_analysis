package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AW extends Message<C02AW, C579402Ns> {
    public static final ProtoAdapter<C02AW> ADAPTER = new ProtoAdapter<C02AW>() { // from class: X.026M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AW decode(ProtoReader protoReader) {
            C02AW c02aw = new C02AW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02aw.shop_performance_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02aw.shop_performance_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02aw.shop_performance_value = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02aw.detailed_metrics.add(C02G3.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c02aw.detail_page_entry_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02aw.detail_page_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02aw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AW c02aw) {
            C02AW c02aw2 = c02aw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02aw2.shop_performance_title) + protoAdapter.encodedSizeWithTag(2, c02aw2.shop_performance_content) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02aw2.shop_performance_value) + C02G3.ADAPTER.asRepeated().encodedSizeWithTag(4, c02aw2.detailed_metrics) + protoAdapter.encodedSizeWithTag(5, c02aw2.detail_page_entry_text) + protoAdapter.encodedSizeWithTag(6, c02aw2.detail_page_url) + c02aw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02AW c02aw) {
        }
    };
    public String detail_page_entry_text;
    public String detail_page_url;
    public List<C02G3> detailed_metrics;
    public String shop_performance_content;
    public String shop_performance_title;
    public Integer shop_performance_value;

    public C02AW() {
        super(ADAPTER, ByteString.EMPTY);
        this.detailed_metrics = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C579402Ns newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
