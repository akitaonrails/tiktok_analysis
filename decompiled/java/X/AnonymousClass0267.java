package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0267, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0267 extends Message<AnonymousClass0267, C570302Kf> {
    public static final ProtoAdapter<AnonymousClass0267> ADAPTER = new ProtoAdapter<AnonymousClass0267>() { // from class: X.023R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0267 decode(ProtoReader protoReader) {
            AnonymousClass0267 anonymousClass0267 = new AnonymousClass0267();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 21) {
                        switch (iNextTag) {
                            case 1:
                                anonymousClass0267.prompt_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                anonymousClass0267.task_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                anonymousClass0267.root_item_id = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 4:
                                anonymousClass0267.orig_item_id = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                anonymousClass0267.cast_uids.add(ProtoAdapter.INT64.decode(protoReader));
                                break;
                            case 6:
                                anonymousClass0267.cameo_ids.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 7:
                                anonymousClass0267.orig_prompt_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                anonymousClass0267.root_prompt_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                anonymousClass0267.image_ai_index_list.add(ProtoAdapter.INT64.decode(protoReader));
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        anonymousClass0267.cameo_infos.add(C552302Dh.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0267;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0267 anonymousClass0267) {
            AnonymousClass0267 anonymousClass02672 = anonymousClass0267;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02672.prompt_id) + protoAdapter.encodedSizeWithTag(2, anonymousClass02672.task_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02672.root_item_id) + protoAdapter2.encodedSizeWithTag(4, anonymousClass02672.orig_item_id) + protoAdapter2.asRepeated().encodedSizeWithTag(5, anonymousClass02672.cast_uids) + protoAdapter.asRepeated().encodedSizeWithTag(6, anonymousClass02672.cameo_ids) + protoAdapter.encodedSizeWithTag(7, anonymousClass02672.orig_prompt_id) + protoAdapter.encodedSizeWithTag(8, anonymousClass02672.root_prompt_id) + protoAdapter2.asRepeated().encodedSizeWithTag(9, anonymousClass02672.image_ai_index_list) + C552302Dh.ADAPTER.asRepeated().encodedSizeWithTag(21, anonymousClass02672.cameo_infos) + anonymousClass02672.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0267 anonymousClass0267) {
            AnonymousClass0267 anonymousClass02672 = anonymousClass0267;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02672.prompt_id);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02672.task_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, anonymousClass02672.root_item_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, anonymousClass02672.orig_item_id);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, anonymousClass02672.cast_uids);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, anonymousClass02672.cameo_ids);
            protoAdapter.encodeWithTag(protoWriter, 7, anonymousClass02672.orig_prompt_id);
            protoAdapter.encodeWithTag(protoWriter, 8, anonymousClass02672.root_prompt_id);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 9, anonymousClass02672.image_ai_index_list);
            C552302Dh.ADAPTER.asRepeated().encodeWithTag(protoWriter, 21, anonymousClass02672.cameo_infos);
            protoWriter.writeBytes(anonymousClass02672.unknownFields());
        }
    };
    public List<String> cameo_ids;
    public List<C552302Dh> cameo_infos;
    public List<Long> cast_uids;
    public List<Long> image_ai_index_list;
    public Long orig_item_id;
    public String orig_prompt_id;
    public String prompt_id;
    public Long root_item_id;
    public String root_prompt_id;
    public String task_id;

    public AnonymousClass0267() {
        super(ADAPTER, ByteString.EMPTY);
        this.cast_uids = C1516540pZE.LJIIIIZZ();
        this.cameo_ids = C1516540pZE.LJIIIIZZ();
        this.image_ai_index_list = C1516540pZE.LJIIIIZZ();
        this.cameo_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C570302Kf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
