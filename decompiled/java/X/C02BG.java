package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BG extends Message<C02BG, C02J1> {
    public static final ProtoAdapter<C02BG> ADAPTER = new ProtoAdapter<C02BG>() { // from class: X.024c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BG decode(ProtoReader protoReader) {
            C02BG c02bg = new C02BG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bg.conversation_short_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c02bg.group_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bg.group_avatar_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02bg.access_criteria_copy = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02bg.verify_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02bg.sticker_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02bg.event_track_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02bg.group_member_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02bg.group_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BG c02bg) {
            C02BG c02bg2 = c02bg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02bg2.conversation_short_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02bg2.group_name) + protoAdapter2.encodedSizeWithTag(3, c02bg2.group_avatar_url) + protoAdapter2.encodedSizeWithTag(4, c02bg2.access_criteria_copy);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c02bg2.verify_status) + protoAdapter3.encodedSizeWithTag(6, c02bg2.sticker_style) + protoAdapter2.encodedSizeWithTag(7, c02bg2.event_track_data) + protoAdapter.encodedSizeWithTag(8, c02bg2.group_member_count) + protoAdapter2.encodedSizeWithTag(9, c02bg2.group_description) + c02bg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02BG c02bg) {
            C02BG c02bg2 = c02bg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02bg2.conversation_short_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02bg2.group_name);
            protoAdapter2.encodeWithTag(protoWriter, 3, c02bg2.group_avatar_url);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02bg2.access_criteria_copy);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 5, c02bg2.verify_status);
            protoAdapter3.encodeWithTag(protoWriter, 6, c02bg2.sticker_style);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02bg2.event_track_data);
            protoAdapter.encodeWithTag(protoWriter, 8, c02bg2.group_member_count);
            protoAdapter2.encodeWithTag(protoWriter, 9, c02bg2.group_description);
            protoWriter.writeBytes(c02bg2.unknownFields());
        }
    };
    public String access_criteria_copy;
    public Long conversation_short_id;
    public String event_track_data;
    public String group_avatar_url;
    public String group_description;
    public Long group_member_count;
    public String group_name;
    public Integer sticker_style;
    public Integer verify_status;

    public C02BG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02J1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
