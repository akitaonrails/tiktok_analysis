package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027U, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027U extends Message<C027U, C02MB> {
    public static final ProtoAdapter<C027U> ADAPTER = new ProtoAdapter<C027U>() { // from class: X.023j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027U decode(ProtoReader protoReader) {
            C027U c027u = new C027U();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027u.user_list.add(C557402Fg.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c027u.total = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c027u.anchor = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c027u.button = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c027u.school_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c027u.school_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c027u.viewer_verify_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c027u.popup_config = C02FO.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c027u.school_content_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027u;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027U c027u) {
            C027U c027u2 = c027u;
            int iEncodedSizeWithTag = C557402Fg.ADAPTER.asRepeated().encodedSizeWithTag(1, c027u2.user_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c027u2.total);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c027u2.anchor) + protoAdapter2.encodedSizeWithTag(4, c027u2.button) + protoAdapter2.encodedSizeWithTag(5, c027u2.school_name) + protoAdapter2.encodedSizeWithTag(6, c027u2.school_id) + protoAdapter.encodedSizeWithTag(7, c027u2.viewer_verify_status) + C02FO.ADAPTER.encodedSizeWithTag(8, c027u2.popup_config) + protoAdapter.encodedSizeWithTag(9, c027u2.school_content_type) + c027u2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027U c027u) {
            C027U c027u2 = c027u;
            C557402Fg.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c027u2.user_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c027u2.total);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c027u2.anchor);
            protoAdapter2.encodeWithTag(protoWriter, 4, c027u2.button);
            protoAdapter2.encodeWithTag(protoWriter, 5, c027u2.school_name);
            protoAdapter2.encodeWithTag(protoWriter, 6, c027u2.school_id);
            protoAdapter.encodeWithTag(protoWriter, 7, c027u2.viewer_verify_status);
            C02FO.ADAPTER.encodeWithTag(protoWriter, 8, c027u2.popup_config);
            protoAdapter.encodeWithTag(protoWriter, 9, c027u2.school_content_type);
            protoWriter.writeBytes(c027u2.unknownFields());
        }
    };
    public String anchor;
    public String button;
    public C02FO popup_config;
    public Integer school_content_type;
    public String school_id;
    public String school_name;
    public Integer total;
    public List<C557402Fg> user_list;
    public Integer viewer_verify_status;

    public C027U() {
        super(ADAPTER, ByteString.EMPTY);
        this.user_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
