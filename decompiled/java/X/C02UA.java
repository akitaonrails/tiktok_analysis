package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02UA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02UA extends Message<C02UA, C02UB> {
    public static final ProtoAdapter<C02UA> ADAPTER = new ProtoAdapter<C02UA>() { // from class: X.02U9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02UA decode(ProtoReader protoReader) {
            C02UA c02ua = new C02UA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ua.enable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c02ua.find_similar_intent_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c02ua.ask_tako_intent_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02ua.related_videos_intent_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02ua.long_press_panel_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02ua.title_smart_search_panel_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02ua.ai_overview_intent_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ua;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02UA c02ua) {
            C02UA c02ua2 = c02ua;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c02ua2.enable);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ua2.find_similar_intent_type) + protoAdapter.encodedSizeWithTag(3, c02ua2.ask_tako_intent_type) + protoAdapter.encodedSizeWithTag(4, c02ua2.related_videos_intent_type) + protoAdapter.encodedSizeWithTag(5, c02ua2.long_press_panel_type) + protoAdapter.encodedSizeWithTag(6, c02ua2.title_smart_search_panel_type) + protoAdapter.encodedSizeWithTag(7, c02ua2.ai_overview_intent_type) + c02ua2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02UA c02ua) {
            C02UA c02ua2 = c02ua;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02ua2.enable);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c02ua2.find_similar_intent_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ua2.ask_tako_intent_type);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ua2.related_videos_intent_type);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ua2.long_press_panel_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c02ua2.title_smart_search_panel_type);
            protoAdapter.encodeWithTag(protoWriter, 7, c02ua2.ai_overview_intent_type);
            protoWriter.writeBytes(c02ua2.unknownFields());
        }
    };
    public Integer ai_overview_intent_type;
    public Integer ask_tako_intent_type;
    public Boolean enable;
    public Integer find_similar_intent_type;
    public Integer long_press_panel_type;
    public Integer related_videos_intent_type;
    public Integer title_smart_search_panel_type;

    public C02UA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02UB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
