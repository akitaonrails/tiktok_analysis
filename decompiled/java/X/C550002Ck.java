package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550002Ck extends Message<C550002Ck, C02I9> {
    public static final ProtoAdapter<C550002Ck> ADAPTER = new ProtoAdapter<C550002Ck>() { // from class: X.02Cl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550002Ck decode(ProtoReader protoReader) {
            C550002Ck c550002Ck = new C550002Ck();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550002Ck.promotion_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c550002Ck.promotion_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c550002Ck.promotion_style = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c550002Ck.promotion_icon = C02UM.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c550002Ck.promotion_text_style = C619602bK.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c550002Ck.query_promotion_priority = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c550002Ck.background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c550002Ck.background_image = C02UM.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c550002Ck.bcm_standard_track = C636902e7.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550002Ck;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550002Ck c550002Ck) {
            C550002Ck c550002Ck2 = c550002Ck;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c550002Ck2.promotion_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c550002Ck2.promotion_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, c550002Ck2.promotion_style);
            ProtoAdapter<C02UM> protoAdapter3 = C02UM.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c550002Ck2.promotion_icon) + C619602bK.ADAPTER.encodedSizeWithTag(5, c550002Ck2.promotion_text_style) + protoAdapter2.encodedSizeWithTag(6, c550002Ck2.query_promotion_priority) + protoAdapter.encodedSizeWithTag(7, c550002Ck2.background_color) + protoAdapter3.encodedSizeWithTag(8, c550002Ck2.background_image) + C636902e7.ADAPTER.encodedSizeWithTag(9, c550002Ck2.bcm_standard_track) + c550002Ck2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550002Ck c550002Ck) {
            C550002Ck c550002Ck2 = c550002Ck;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c550002Ck2.promotion_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c550002Ck2.promotion_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c550002Ck2.promotion_style);
            ProtoAdapter<C02UM> protoAdapter3 = C02UM.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 4, c550002Ck2.promotion_icon);
            C619602bK.ADAPTER.encodeWithTag(protoWriter, 5, c550002Ck2.promotion_text_style);
            protoAdapter2.encodeWithTag(protoWriter, 6, c550002Ck2.query_promotion_priority);
            protoAdapter.encodeWithTag(protoWriter, 7, c550002Ck2.background_color);
            protoAdapter3.encodeWithTag(protoWriter, 8, c550002Ck2.background_image);
            C636902e7.ADAPTER.encodeWithTag(protoWriter, 9, c550002Ck2.bcm_standard_track);
            protoWriter.writeBytes(c550002Ck2.unknownFields());
        }
    };
    public String background_color;
    public C02UM background_image;
    public C636902e7 bcm_standard_track;
    public C02UM promotion_icon;
    public Long promotion_style;
    public String promotion_text;
    public C619602bK promotion_text_style;
    public Integer promotion_type;
    public Integer query_promotion_priority;

    public C550002Ck() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02I9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
