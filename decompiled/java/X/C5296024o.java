package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.024o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5296024o extends Message<C5296024o, C572002Kw> {
    public static final ProtoAdapter<C5296024o> ADAPTER = new ProtoAdapter<C5296024o>() { // from class: X.023D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5296024o decode(ProtoReader protoReader) {
            C5296024o c5296024o = new C5296024o();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5296024o.prompt_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5296024o.cameo_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c5296024o.task_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5296024o.orig_item_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c5296024o.cast_uids.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            c5296024o.seed = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 21:
                                    c5296024o.prompt_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 22:
                                    c5296024o.cameo_infos.add(C552302Dh.ADAPTER.decode(protoReader));
                                    break;
                                case 23:
                                    c5296024o.root_item_id = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    c5296024o.is_ref_image = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 25:
                                    c5296024o.auto_generate = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 26:
                                    c5296024o.cast_face_sel = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5296024o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5296024o c5296024o) {
            C5296024o c5296024o2 = c5296024o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5296024o2.prompt_id) + protoAdapter.asRepeated().encodedSizeWithTag(2, c5296024o2.cameo_ids) + protoAdapter.encodedSizeWithTag(3, c5296024o2.task_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5296024o2.orig_item_id) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c5296024o2.cast_uids) + protoAdapter2.encodedSizeWithTag(6, c5296024o2.seed) + protoAdapter.encodedSizeWithTag(21, c5296024o2.prompt_text) + C552302Dh.ADAPTER.asRepeated().encodedSizeWithTag(22, c5296024o2.cameo_infos) + protoAdapter2.encodedSizeWithTag(23, c5296024o2.root_item_id);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(24, c5296024o2.is_ref_image) + protoAdapter3.encodedSizeWithTag(25, c5296024o2.auto_generate) + protoAdapter.encodedSizeWithTag(26, c5296024o2.cast_face_sel) + c5296024o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5296024o c5296024o) {
            C5296024o c5296024o2 = c5296024o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5296024o2.prompt_id);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c5296024o2.cameo_ids);
            protoAdapter.encodeWithTag(protoWriter, 3, c5296024o2.task_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 4, c5296024o2.orig_item_id);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, c5296024o2.cast_uids);
            protoAdapter2.encodeWithTag(protoWriter, 6, c5296024o2.seed);
            protoAdapter.encodeWithTag(protoWriter, 21, c5296024o2.prompt_text);
            C552302Dh.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, c5296024o2.cameo_infos);
            protoAdapter2.encodeWithTag(protoWriter, 23, c5296024o2.root_item_id);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 24, c5296024o2.is_ref_image);
            protoAdapter3.encodeWithTag(protoWriter, 25, c5296024o2.auto_generate);
            protoAdapter.encodeWithTag(protoWriter, 26, c5296024o2.cast_face_sel);
            protoWriter.writeBytes(c5296024o2.unknownFields());
        }
    };
    public Boolean auto_generate;
    public List<String> cameo_ids;
    public List<C552302Dh> cameo_infos;
    public String cast_face_sel;
    public List<Long> cast_uids;
    public Boolean is_ref_image;
    public Long orig_item_id;
    public String prompt_id;
    public String prompt_text;
    public Long root_item_id;
    public Long seed;
    public String task_id;

    public C5296024o() {
        super(ADAPTER, ByteString.EMPTY);
        this.cameo_ids = C1516540pZE.LJIIIIZZ();
        this.cast_uids = C1516540pZE.LJIIIIZZ();
        this.cameo_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C572002Kw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
