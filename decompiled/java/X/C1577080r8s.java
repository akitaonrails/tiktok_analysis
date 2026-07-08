package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0r8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577080r8s extends Message<C1577080r8s, C1577030r8n> {
    public static final ProtoAdapter<C1577080r8s> ADAPTER = new ProtoAdapter<C1577080r8s>() { // from class: X.0r8r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1577080r8s decode(ProtoReader protoReader) {
            C1577030r8n c1577030r8n = new C1577030r8n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 10) {
                        switch (iNextTag) {
                            case 1:
                                c1577030r8n.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                c1577030r8n.LJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c1577030r8n.LJFF = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                c1577030r8n.LJI.add(C5186020i.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                c1577030r8n.LJII = C1577210r95.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c1577030r8n.LJIIIIZZ = C1578240rAk.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c1577030r8n.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                c1577030r8n.LJIIJ = C1577130r8x.ADAPTER.decode(protoReader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case 100:
                                        c1577030r8n.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 101:
                                        c1577030r8n.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 102:
                                        c1577030r8n.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 103:
                                        c1577030r8n.LJIILL = C1578240rAk.ADAPTER.decode(protoReader);
                                        break;
                                    default:
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1577030r8n.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        break;
                                }
                                break;
                        }
                    } else {
                        c1577030r8n.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1577030r8n.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1577080r8s c1577080r8s) {
            C1577080r8s c1577080r8s2 = c1577080r8s;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1577080r8s2.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1577080r8s2.status_msg) + protoAdapter.encodedSizeWithTag(3, c1577080r8s2.has_more) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(4, c1577080r8s2.awemes) + C1577210r95.ADAPTER.encodedSizeWithTag(5, c1577080r8s2.log_pb);
            ProtoAdapter<C1578240rAk> protoAdapter3 = C1578240rAk.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c1577080r8s2.skylight_model) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c1577080r8s2.should_show_limited_free_pop) + C1577130r8x.ADAPTER.encodedSizeWithTag(8, c1577080r8s2.limited_free_pop_up_config) + protoAdapter.encodedSizeWithTag(10, c1577080r8s2.landing_tab) + protoAdapter.encodedSizeWithTag(100, c1577080r8s2.drama_tab_block_reason) + protoAdapter2.encodedSizeWithTag(101, c1577080r8s2.drama_tab_block_text) + protoAdapter2.encodedSizeWithTag(102, c1577080r8s2.feedback_link) + protoAdapter3.encodedSizeWithTag(103, c1577080r8s2.skylight_model_v2) + c1577080r8s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1577080r8s c1577080r8s) {
            C1577080r8s c1577080r8s2 = c1577080r8s;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1577080r8s2.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1577080r8s2.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c1577080r8s2.has_more);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1577080r8s2.awemes);
            C1577210r95.ADAPTER.encodeWithTag(protoWriter, 5, c1577080r8s2.log_pb);
            ProtoAdapter<C1578240rAk> protoAdapter3 = C1578240rAk.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 6, c1577080r8s2.skylight_model);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c1577080r8s2.should_show_limited_free_pop);
            C1577130r8x.ADAPTER.encodeWithTag(protoWriter, 8, c1577080r8s2.limited_free_pop_up_config);
            protoAdapter.encodeWithTag(protoWriter, 10, c1577080r8s2.landing_tab);
            protoAdapter.encodeWithTag(protoWriter, 100, c1577080r8s2.drama_tab_block_reason);
            protoAdapter2.encodeWithTag(protoWriter, 101, c1577080r8s2.drama_tab_block_text);
            protoAdapter2.encodeWithTag(protoWriter, 102, c1577080r8s2.feedback_link);
            protoAdapter3.encodeWithTag(protoWriter, 103, c1577080r8s2.skylight_model_v2);
            protoWriter.writeBytes(c1577080r8s2.unknownFields());
        }
    };
    public List<C5186020i> awemes;
    public Integer drama_tab_block_reason;
    public String drama_tab_block_text;
    public String feedback_link;
    public Integer has_more;
    public Integer landing_tab;
    public C1577130r8x limited_free_pop_up_config;
    public C1577210r95 log_pb;
    public Boolean should_show_limited_free_pop;
    public C1578240rAk skylight_model;
    public C1578240rAk skylight_model_v2;
    public Integer status_code;
    public String status_msg;

    @Override // com.squareup.wire.Message
    public C1577030r8n newBuilder() {
        return null;
    }

    public C1577080r8s(Integer num, String str, Integer num2, List<C5186020i> list, C1577210r95 c1577210r95, C1578240rAk c1578240rAk, Boolean bool, C1577130r8x c1577130r8x, Integer num3, Integer num4, String str2, String str3, C1578240rAk c1578240rAk2) {
        this(num, str, num2, list, c1577210r95, c1578240rAk, bool, c1577130r8x, num3, num4, str2, str3, c1578240rAk2, ByteString.EMPTY);
    }

    public C1577080r8s(Integer num, String str, Integer num2, List<C5186020i> list, C1577210r95 c1577210r95, C1578240rAk c1578240rAk, Boolean bool, C1577130r8x c1577130r8x, Integer num3, Integer num4, String str2, String str3, C1578240rAk c1578240rAk2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.status_msg = str;
        this.has_more = num2;
        this.awemes = C1516540pZE.LJFF("awemes", list);
        this.log_pb = c1577210r95;
        this.skylight_model = c1578240rAk;
        this.should_show_limited_free_pop = bool;
        this.limited_free_pop_up_config = c1577130r8x;
        this.landing_tab = num3;
        this.drama_tab_block_reason = num4;
        this.drama_tab_block_text = str2;
        this.feedback_link = str3;
        this.skylight_model_v2 = c1578240rAk2;
    }
}
