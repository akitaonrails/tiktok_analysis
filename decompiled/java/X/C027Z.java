package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027Z extends Message<C027Z, C570902Kl> {
    public static final ProtoAdapter<C027Z> ADAPTER = new ProtoAdapter<C027Z>() { // from class: X.023l
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027Z decode(ProtoReader protoReader) {
            C027Z c027z = new C027Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027z.has_entrance = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c027z.prompt_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c027z.task_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c027z.airemix_first_gid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c027z.airemix_gameplay = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c027z.cameo_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            c027z.is_ref_image = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c027z.prompt_source = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c027z.cameo_infos.add(C552302Dh.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027Z c027z) {
            C027Z c027z2 = c027z;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c027z2.has_entrance);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c027z2.prompt_id) + protoAdapter2.encodedSizeWithTag(3, c027z2.task_id) + protoAdapter2.encodedSizeWithTag(4, c027z2.airemix_first_gid) + protoAdapter2.encodedSizeWithTag(5, c027z2.airemix_gameplay) + protoAdapter2.asRepeated().encodedSizeWithTag(6, c027z2.cameo_ids) + protoAdapter.encodedSizeWithTag(7, c027z2.is_ref_image) + protoAdapter2.encodedSizeWithTag(8, c027z2.prompt_source) + C552302Dh.ADAPTER.asRepeated().encodedSizeWithTag(9, c027z2.cameo_infos) + c027z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027Z c027z) {
            C027Z c027z2 = c027z;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c027z2.has_entrance);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c027z2.prompt_id);
            protoAdapter2.encodeWithTag(protoWriter, 3, c027z2.task_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, c027z2.airemix_first_gid);
            protoAdapter2.encodeWithTag(protoWriter, 5, c027z2.airemix_gameplay);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, c027z2.cameo_ids);
            protoAdapter.encodeWithTag(protoWriter, 7, c027z2.is_ref_image);
            protoAdapter2.encodeWithTag(protoWriter, 8, c027z2.prompt_source);
            C552302Dh.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, c027z2.cameo_infos);
            protoWriter.writeBytes(c027z2.unknownFields());
        }
    };
    public String airemix_first_gid;
    public String airemix_gameplay;
    public List<String> cameo_ids;
    public List<C552302Dh> cameo_infos;
    public Boolean has_entrance;
    public Boolean is_ref_image;
    public String prompt_id;
    public String prompt_source;
    public String task_id;

    public C027Z() {
        super(ADAPTER, ByteString.EMPTY);
        this.cameo_ids = C1516540pZE.LJIIIIZZ();
        this.cameo_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C570902Kl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
