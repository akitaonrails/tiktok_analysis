package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CV extends Message<C02CV, C02QU> {
    public static final ProtoAdapter<C02CV> ADAPTER = new ProtoAdapter<C02CV>() { // from class: X.027I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CV decode(ProtoReader protoReader) {
            C02CV c02cv = new C02CV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cv.strategy = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02cv.block_title_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02cv.block_notice_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02cv.block_description_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02cv.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02cv.close_panel_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02cv.add_items_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02cv.unqualified_activity_amount_to_threshold = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CV c02cv) {
            C02CV c02cv2 = c02cv;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02cv2.strategy);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02cv2.block_title_text) + protoAdapter.encodedSizeWithTag(3, c02cv2.block_notice_text) + protoAdapter.encodedSizeWithTag(4, c02cv2.block_description_text) + protoAdapter.encodedSizeWithTag(5, c02cv2.schema) + protoAdapter.encodedSizeWithTag(6, c02cv2.close_panel_button_text) + protoAdapter.encodedSizeWithTag(7, c02cv2.add_items_button_text) + protoAdapter.encodedSizeWithTag(8, c02cv2.unqualified_activity_amount_to_threshold) + c02cv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CV c02cv) {
        }
    };
    public String add_items_button_text;
    public String block_description_text;
    public String block_notice_text;
    public String block_title_text;
    public String close_panel_button_text;
    public String schema;
    public Integer strategy;
    public String unqualified_activity_amount_to_threshold;

    public C02CV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
