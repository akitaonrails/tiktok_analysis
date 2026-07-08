package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.028B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C028B extends Message<C028B, C579702Nv> {
    public static final ProtoAdapter<C028B> ADAPTER = new ProtoAdapter<C028B>() { // from class: X.0255
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C028B decode(ProtoReader protoReader) {
            C028B c028b = new C028B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c028b.button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c028b.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c028b.note = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c028b.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c028b.bind_status = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c028b.supported_bind_commute_types.add(C639302eV.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c028b.is_need_pre_fetch_activate_url = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c028b.is_need_pre_bind_verify = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c028b.need_link_to_tts = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c028b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C028B c028b) {
            C028B c028b2 = c028b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c028b2.button_text) + protoAdapter.encodedSizeWithTag(2, c028b2.title) + protoAdapter.encodedSizeWithTag(3, c028b2.note) + protoAdapter.encodedSizeWithTag(4, c028b2.schema) + protoAdapter.encodedSizeWithTag(5, c028b2.bind_status) + C639302eV.ADAPTER.asRepeated().encodedSizeWithTag(6, c028b2.supported_bind_commute_types);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c028b2.is_need_pre_fetch_activate_url) + protoAdapter2.encodedSizeWithTag(8, c028b2.is_need_pre_bind_verify) + protoAdapter2.encodedSizeWithTag(9, c028b2.need_link_to_tts) + c028b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C028B c028b) {
        }
    };
    public String bind_status;
    public String button_text;
    public Boolean is_need_pre_bind_verify;
    public Boolean is_need_pre_fetch_activate_url;
    public Boolean need_link_to_tts;
    public String note;
    public String schema;
    public List<C639302eV> supported_bind_commute_types;
    public String title;

    public C028B() {
        super(ADAPTER, ByteString.EMPTY);
        this.supported_bind_commute_types = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C579702Nv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
