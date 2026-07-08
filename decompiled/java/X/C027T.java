package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027T extends Message<C027T, C02LH> {
    public static final ProtoAdapter<C027T> ADAPTER = new ProtoAdapter<C027T>() { // from class: X.024T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027T decode(ProtoReader protoReader) {
            C027T c027t = new C027T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027t.download_general = C02BE.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c027t.download_mask_panel = C02BE.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c027t.download_share_panel = C02BE.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c027t.share_list_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c027t.share_general = C02BE.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c027t.platform_list.add(C02BE.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c027t.share_third_platform = C02BE.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c027t.share_action_list.add(C02BE.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c027t.press_action_list.add(C02BE.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027T c027t) {
            C027T c027t2 = c027t;
            ProtoAdapter<C02BE> protoAdapter = C02BE.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c027t2.download_general) + protoAdapter.encodedSizeWithTag(2, c027t2.download_mask_panel) + protoAdapter.encodedSizeWithTag(3, c027t2.download_share_panel) + ProtoAdapter.INT32.encodedSizeWithTag(4, c027t2.share_list_status) + protoAdapter.encodedSizeWithTag(5, c027t2.share_general) + protoAdapter.asRepeated().encodedSizeWithTag(6, c027t2.platform_list) + protoAdapter.encodedSizeWithTag(7, c027t2.share_third_platform) + protoAdapter.asRepeated().encodedSizeWithTag(8, c027t2.share_action_list) + protoAdapter.asRepeated().encodedSizeWithTag(9, c027t2.press_action_list) + c027t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027T c027t) {
            C027T c027t2 = c027t;
            ProtoAdapter<C02BE> protoAdapter = C02BE.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c027t2.download_general);
            protoAdapter.encodeWithTag(protoWriter, 2, c027t2.download_mask_panel);
            protoAdapter.encodeWithTag(protoWriter, 3, c027t2.download_share_panel);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c027t2.share_list_status);
            protoAdapter.encodeWithTag(protoWriter, 5, c027t2.share_general);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, c027t2.platform_list);
            protoAdapter.encodeWithTag(protoWriter, 7, c027t2.share_third_platform);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, c027t2.share_action_list);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, c027t2.press_action_list);
            protoWriter.writeBytes(c027t2.unknownFields());
        }
    };
    public C02BE download_general;
    public C02BE download_mask_panel;
    public C02BE download_share_panel;
    public List<C02BE> platform_list;
    public List<C02BE> press_action_list;
    public List<C02BE> share_action_list;
    public C02BE share_general;
    public Integer share_list_status;
    public C02BE share_third_platform;

    public C027T() {
        super(ADAPTER, ByteString.EMPTY);
        this.platform_list = C1516540pZE.LJIIIIZZ();
        this.share_action_list = C1516540pZE.LJIIIIZZ();
        this.press_action_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
