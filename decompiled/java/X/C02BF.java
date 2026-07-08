package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BF extends Message<C02BF, C566102Ip> {
    public static final ProtoAdapter<C02BF> ADAPTER = new ProtoAdapter<C02BF>() { // from class: X.0250
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BF decode(ProtoReader protoReader) {
            C02BF c02bf = new C02BF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bf.creative_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c02bf.ad_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02bf.log_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02bf.incentive_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02bf.ad_url_type = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c02bf.system_origin = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c02bf.is_ba_roi2 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c02bf.is_lead_live_roi2 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02bf.onsite_click_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BF c02bf) {
            C02BF c02bf2 = c02bf;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02bf2.creative_id) + protoAdapter.encodedSizeWithTag(2, c02bf2.ad_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02bf2.log_extra) + protoAdapter2.encodedSizeWithTag(4, c02bf2.incentive_info) + protoAdapter.encodedSizeWithTag(5, c02bf2.ad_url_type) + protoAdapter.encodedSizeWithTag(6, c02bf2.system_origin);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c02bf2.is_ba_roi2) + protoAdapter3.encodedSizeWithTag(8, c02bf2.is_lead_live_roi2) + protoAdapter2.encodedSizeWithTag(9, c02bf2.onsite_click_id) + c02bf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02BF c02bf) {
            C02BF c02bf2 = c02bf;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02bf2.creative_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02bf2.ad_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02bf2.log_extra);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02bf2.incentive_info);
            protoAdapter.encodeWithTag(protoWriter, 5, c02bf2.ad_url_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c02bf2.system_origin);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 7, c02bf2.is_ba_roi2);
            protoAdapter3.encodeWithTag(protoWriter, 8, c02bf2.is_lead_live_roi2);
            protoAdapter2.encodeWithTag(protoWriter, 9, c02bf2.onsite_click_id);
            protoWriter.writeBytes(c02bf2.unknownFields());
        }
    };
    public Long ad_id;
    public Long ad_url_type;
    public Long creative_id;
    public String incentive_info;
    public Boolean is_ba_roi2;
    public Boolean is_lead_live_roi2;
    public String log_extra;
    public String onsite_click_id;
    public Long system_origin;

    public C02BF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C566102Ip newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
