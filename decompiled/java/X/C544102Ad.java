package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C544102Ad extends Message<C544102Ad, C02OR> {
    public static final ProtoAdapter<C544102Ad> ADAPTER = new ProtoAdapter<C544102Ad>() { // from class: X.024j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C544102Ad decode(ProtoReader protoReader) {
            C544102Ad c544102Ad = new C544102Ad();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 251) {
                        switch (iNextTag) {
                            case 1:
                                c544102Ad.identity_info_hash_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c544102Ad.identity_info_collection_page_schema = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c544102Ad.identity_info_verification_mode = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                c544102Ad.unfilled_note = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c544102Ad.filled_note = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c544102Ad.scene_code = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 7:
                                c544102Ad.filled_note_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                c544102Ad.unfilled_note_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c544102Ad.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c544102Ad;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C544102Ad c544102Ad) {
            C544102Ad c544102Ad2 = c544102Ad;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c544102Ad2.identity_info_hash_id) + protoAdapter.encodedSizeWithTag(2, c544102Ad2.identity_info_collection_page_schema) + ProtoAdapter.INT32.encodedSizeWithTag(3, c544102Ad2.identity_info_verification_mode) + protoAdapter.encodedSizeWithTag(4, c544102Ad2.unfilled_note) + protoAdapter.encodedSizeWithTag(5, c544102Ad2.filled_note) + ProtoAdapter.INT64.encodedSizeWithTag(6, c544102Ad2.scene_code);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c544102Ad2.filled_note_icon) + protoAdapter2.encodedSizeWithTag(8, c544102Ad2.unfilled_note_icon) + protoAdapter.encodedSizeWithTag(251, c544102Ad2.da_info) + c544102Ad2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C544102Ad c544102Ad) {
        }
    };
    public String da_info;
    public String filled_note;
    public C029C filled_note_icon;
    public String identity_info_collection_page_schema;
    public String identity_info_hash_id;
    public Integer identity_info_verification_mode;
    public Long scene_code;
    public String unfilled_note;
    public C029C unfilled_note_icon;

    public C544102Ad() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
