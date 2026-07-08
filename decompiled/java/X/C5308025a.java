package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.025a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5308025a extends Message<C5308025a, C02PU> {
    public static final ProtoAdapter<C5308025a> ADAPTER = new ProtoAdapter<C5308025a>() { // from class: X.022i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5308025a decode(ProtoReader protoReader) {
            C5308025a c5308025a = new C5308025a();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c5308025a.button_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c5308025a.subtext_area = C02DP.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c5308025a.hide_total_price = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                c5308025a.tooltips = C02CL.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c5308025a.button_style = C644702fN.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c5308025a.button_text_list.add(C561602Gw.ADAPTER.decode(protoReader));
                                break;
                            case 7:
                                c5308025a.hide_price_sub_text_savings = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                c5308025a.button_text_rich_text = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c5308025a.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5308025a;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5308025a c5308025a) {
            C5308025a c5308025a2 = c5308025a;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5308025a2.button_text) + C02DP.ADAPTER.encodedSizeWithTag(2, c5308025a2.subtext_area);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5308025a2.hide_total_price) + C02CL.ADAPTER.encodedSizeWithTag(4, c5308025a2.tooltips) + C644702fN.ADAPTER.encodedSizeWithTag(5, c5308025a2.button_style) + C561602Gw.ADAPTER.asRepeated().encodedSizeWithTag(6, c5308025a2.button_text_list) + protoAdapter2.encodedSizeWithTag(7, c5308025a2.hide_price_sub_text_savings) + C5431029t.ADAPTER.encodedSizeWithTag(8, c5308025a2.button_text_rich_text) + protoAdapter.encodedSizeWithTag(200, c5308025a2.da_info) + c5308025a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5308025a c5308025a) {
        }
    };
    public C644702fN button_style;
    public String button_text;
    public List<C561602Gw> button_text_list;
    public C5431029t button_text_rich_text;
    public String da_info;
    public Boolean hide_price_sub_text_savings;
    public Boolean hide_total_price;
    public C02DP subtext_area;
    public C02CL tooltips;

    public C5308025a() {
        super(ADAPTER, ByteString.EMPTY);
        this.button_text_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
