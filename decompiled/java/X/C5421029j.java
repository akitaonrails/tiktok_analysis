package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5421029j extends Message<C5421029j, C577202Mw> {
    public static final ProtoAdapter<C5421029j> ADAPTER = new ProtoAdapter<C5421029j>() { // from class: X.025M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5421029j decode(ProtoReader protoReader) {
            C5421029j c5421029j = new C5421029j();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5421029j.sku_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c5421029j.product_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c5421029j.power_by_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5421029j.power_by = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5421029j.insurance_plan_detail.add(C02BB.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c5421029j.insurance_token = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5421029j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5421029j c5421029j) {
            C5421029j c5421029j2 = c5421029j;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5421029j2.sku_id) + protoAdapter.encodedSizeWithTag(2, c5421029j2.product_id) + C029C.ADAPTER.encodedSizeWithTag(3, c5421029j2.power_by_icon);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5421029j2.power_by) + C02BB.ADAPTER.asRepeated().encodedSizeWithTag(5, c5421029j2.insurance_plan_detail) + protoAdapter2.encodedSizeWithTag(6, c5421029j2.insurance_token) + c5421029j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5421029j c5421029j) {
        }
    };
    public List<C02BB> insurance_plan_detail;
    public String insurance_token;
    public String power_by;
    public C029C power_by_icon;
    public Long product_id;
    public Long sku_id;

    public C5421029j() {
        super(ADAPTER, ByteString.EMPTY);
        this.insurance_plan_detail = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C577202Mw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
