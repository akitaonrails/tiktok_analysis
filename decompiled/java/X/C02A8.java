package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02A8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02A8 extends Message<C02A8, C580202Oa> {
    public static final ProtoAdapter<C02A8> ADAPTER = new ProtoAdapter<C02A8>() { // from class: X.025C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02A8 decode(ProtoReader protoReader) {
            C02A8 c02a8 = new C02A8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c02a8.toast_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                c02a8.message = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c02a8.duration = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                c02a8.icon = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c02a8.icon_weight = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 6:
                                c02a8.icon_height = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 7:
                                c02a8.schema_disclosure_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                c02a8.schema = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c02a8.position = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c02a8.action_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c02a8.icon_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c02a8.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02a8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02A8 c02a8) {
            C02A8 c02a82 = c02a8;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02a82.toast_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02a82.message) + protoAdapter.encodedSizeWithTag(3, c02a82.duration) + protoAdapter2.encodedSizeWithTag(4, c02a82.icon) + protoAdapter.encodedSizeWithTag(5, c02a82.icon_weight) + protoAdapter.encodedSizeWithTag(6, c02a82.icon_height) + protoAdapter2.encodedSizeWithTag(7, c02a82.schema_disclosure_text) + protoAdapter2.encodedSizeWithTag(8, c02a82.schema) + protoAdapter.encodedSizeWithTag(9, c02a82.position) + protoAdapter.encodedSizeWithTag(10, c02a82.action_type) + protoAdapter.encodedSizeWithTag(11, c02a82.icon_type) + protoAdapter2.encodedSizeWithTag(200, c02a82.da_info) + c02a82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02A8 c02a8) {
        }
    };
    public Integer action_type;
    public String da_info;
    public Integer duration;
    public String icon;
    public Integer icon_height;
    public Integer icon_type;
    public Integer icon_weight;
    public String message;
    public Integer position;
    public String schema;
    public String schema_disclosure_text;
    public Integer toast_type;

    public C02A8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580202Oa newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
