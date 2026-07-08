package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223461C0q extends Message<C2223461C0q, C2223471C0r> {
    public static final ProtoAdapter<C2223461C0q> ADAPTER = new ProtoAdapter<C2223461C0q>() { // from class: X.1C0p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223461C0q decode(ProtoReader protoReader) {
            C2223461C0q c2223461C0q = new C2223461C0q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2223461C0q.dynamic_patch = C1C0Y.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2223461C0q.is_click = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2223461C0q.pass_extra.add(C2223431C0n.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c2223461C0q.reply_msg_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2223461C0q.reply_uuid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2223461C0q.sug_card_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2223461C0q.sug_id_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            c2223461C0q.sug_key_map.add(C2223491C0t.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2223461C0q.sug_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2223461C0q.sug_show_type = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2223461C0q.sug_source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223461C0q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223461C0q c2223461C0q) {
            C2223461C0q c2223461C0q2 = c2223461C0q;
            int iEncodedSizeWithTag = C1C0Y.ADAPTER.encodedSizeWithTag(1, c2223461C0q2.dynamic_patch) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2223461C0q2.is_click) + C2223431C0n.ADAPTER.asRepeated().encodedSizeWithTag(3, c2223461C0q2.pass_extra);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c2223461C0q2.reply_msg_id) + protoAdapter.encodedSizeWithTag(5, c2223461C0q2.reply_uuid);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, c2223461C0q2.sug_card_type) + protoAdapter.asRepeated().encodedSizeWithTag(7, c2223461C0q2.sug_id_list) + C2223491C0t.ADAPTER.asRepeated().encodedSizeWithTag(8, c2223461C0q2.sug_key_map) + protoAdapter.asRepeated().encodedSizeWithTag(9, c2223461C0q2.sug_list) + ProtoAdapter.INT64.encodedSizeWithTag(10, c2223461C0q2.sug_show_type) + protoAdapter2.encodedSizeWithTag(11, c2223461C0q2.sug_source) + c2223461C0q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223461C0q c2223461C0q) {
            C2223461C0q c2223461C0q2 = c2223461C0q;
            C1C0Y.ADAPTER.encodeWithTag(protoWriter, 1, c2223461C0q2.dynamic_patch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2223461C0q2.is_click);
            C2223431C0n.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c2223461C0q2.pass_extra);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c2223461C0q2.reply_msg_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c2223461C0q2.reply_uuid);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 6, c2223461C0q2.sug_card_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, c2223461C0q2.sug_id_list);
            C2223491C0t.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c2223461C0q2.sug_key_map);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, c2223461C0q2.sug_list);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, c2223461C0q2.sug_show_type);
            protoAdapter2.encodeWithTag(protoWriter, 11, c2223461C0q2.sug_source);
            protoWriter.writeBytes(c2223461C0q2.unknownFields());
        }
    };
    public C1C0Y dynamic_patch;
    public Boolean is_click;
    public List<C2223431C0n> pass_extra;
    public String reply_msg_id;
    public String reply_uuid;
    public Integer sug_card_type;
    public List<String> sug_id_list;
    public List<C2223491C0t> sug_key_map;
    public List<String> sug_list;
    public Long sug_show_type;
    public Integer sug_source;

    public C2223461C0q() {
        super(ADAPTER, ByteString.EMPTY);
        this.pass_extra = C1516540pZE.LJIIIIZZ();
        this.sug_id_list = C1516540pZE.LJIIIIZZ();
        this.sug_key_map = C1516540pZE.LJIIIIZZ();
        this.sug_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2223471C0r newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
