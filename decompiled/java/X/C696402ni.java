package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C696402ni extends Message<C696402ni, C696502nj> {
    public static final ProtoAdapter<C696402ni> ADAPTER = new ProtoAdapter<C696402ni>() { // from class: X.02nh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C696402ni decode(ProtoReader protoReader) {
            C696402ni c696402ni = new C696402ni();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c696402ni.benefit_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c696402ni.normal_benefit_base = C750702wT.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c696402ni.overlay_benefit_base = C750702wT.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c696402ni.normal_shop_benefit_details.add(C543802Aa.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c696402ni.overlay_shop_benefit_details.add(C543802Aa.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c696402ni.seven_part_screen_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c696402ni;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C696402ni c696402ni) {
            C696402ni c696402ni2 = c696402ni;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c696402ni2.benefit_type);
            ProtoAdapter<C750702wT> protoAdapter = C750702wT.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c696402ni2.normal_benefit_base) + protoAdapter.encodedSizeWithTag(3, c696402ni2.overlay_benefit_base);
            ProtoAdapter<C543802Aa> protoAdapter2 = C543802Aa.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter2.asRepeated().encodedSizeWithTag(4, c696402ni2.normal_shop_benefit_details) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c696402ni2.overlay_shop_benefit_details) + ProtoAdapter.STRING.encodedSizeWithTag(6, c696402ni2.seven_part_screen_schema) + c696402ni2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C696402ni c696402ni) {
        }
    };
    public Integer benefit_type;
    public C750702wT normal_benefit_base;
    public List<C543802Aa> normal_shop_benefit_details;
    public C750702wT overlay_benefit_base;
    public List<C543802Aa> overlay_shop_benefit_details;
    public String seven_part_screen_schema;

    public C696402ni() {
        super(ADAPTER, ByteString.EMPTY);
        this.normal_shop_benefit_details = C1516540pZE.LJIIIIZZ();
        this.overlay_shop_benefit_details = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C696502nj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
