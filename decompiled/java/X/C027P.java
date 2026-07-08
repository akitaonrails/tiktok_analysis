package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.027P, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027P extends Message<C027P, C02QI> {
    public static final ProtoAdapter<C027P> ADAPTER = new ProtoAdapter<C027P>() { // from class: X.023T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027P decode(ProtoReader protoReader) {
            C027P c027p = new C027P();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                c027p.position_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                c027p.background = C599902Vp.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c027p.start_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c027p.start_text = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c027p.end_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c027p.end_text = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c027p.banner_countdown = C02YA.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                c027p.jump_schema = C641402eq.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c027p.end_suffix_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c027p.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027P c027p) {
            C027P c027p2 = c027p;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c027p2.position_type) + C599902Vp.ADAPTER.encodedSizeWithTag(2, c027p2.background);
            ProtoAdapter<C029C> protoAdapter = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c027p2.start_icon);
            ProtoAdapter<C5431029t> protoAdapter2 = C5431029t.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c027p2.start_text) + protoAdapter.encodedSizeWithTag(5, c027p2.end_icon) + protoAdapter2.encodedSizeWithTag(6, c027p2.end_text) + C02YA.ADAPTER.encodedSizeWithTag(7, c027p2.banner_countdown) + C641402eq.ADAPTER.encodedSizeWithTag(8, c027p2.jump_schema) + protoAdapter.encodedSizeWithTag(9, c027p2.end_suffix_icon) + ProtoAdapter.STRING.encodedSizeWithTag(255, c027p2.da_info) + c027p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C027P c027p) {
        }
    };
    public C599902Vp background;
    public C02YA banner_countdown;
    public String da_info;
    public C029C end_icon;
    public C029C end_suffix_icon;
    public C5431029t end_text;
    public C641402eq jump_schema;
    public Integer position_type;
    public C029C start_icon;
    public C5431029t start_text;

    public C027P() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
