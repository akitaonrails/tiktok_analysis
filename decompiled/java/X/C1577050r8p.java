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

/* JADX INFO: renamed from: X.0r8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577050r8p extends Message<C1577050r8p, C1577040r8o> {
    public static final ProtoAdapter<C1577050r8p> ADAPTER = new ProtoAdapter<C1577050r8p>() { // from class: X.0r8q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1577050r8p decode(ProtoReader protoReader) {
            C1577040r8o c1577040r8o = new C1577040r8o();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1577040r8o.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1577040r8o.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1577040r8o.LJFF.add(C1578280rAo.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c1577040r8o.LJI = C1578280rAo.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1577040r8o.LJII.add(C1578210rAh.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c1577040r8o.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c1577040r8o.LJIIIZ = C1577190r93.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c1577040r8o.LJIIJ = C1578240rAk.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1577040r8o.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1577040r8o.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1577040r8o.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1577040r8o.LJIILJJIL.add(C1578210rAh.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1577040r8o.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1577040r8o.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1577050r8p c1577050r8p) {
            C1577050r8p c1577050r8p2 = c1577050r8p;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1577050r8p2.cursor);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1577050r8p2.has_more);
            ProtoAdapter<C1578280rAo> protoAdapter3 = C1578280rAo.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(3, c1577050r8p2.scenes) + protoAdapter3.encodedSizeWithTag(4, c1577050r8p2.current_scene);
            ProtoAdapter<C1578210rAh> protoAdapter4 = C1578210rAh.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.asRepeated().encodedSizeWithTag(5, c1577050r8p2.collections) + protoAdapter2.encodedSizeWithTag(6, c1577050r8p2.reload) + C1577190r93.ADAPTER.encodedSizeWithTag(7, c1577050r8p2.banner_config) + C1578240rAk.ADAPTER.encodedSizeWithTag(8, c1577050r8p2.skylight_model) + ProtoAdapter.INT32.encodedSizeWithTag(9, c1577050r8p2.drama_tab_block_reason) + protoAdapter.encodedSizeWithTag(10, c1577050r8p2.drama_tab_block_text) + protoAdapter.encodedSizeWithTag(11, c1577050r8p2.feedback_link) + protoAdapter4.asRepeated().encodedSizeWithTag(12, c1577050r8p2.safe_collections) + c1577050r8p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1577050r8p c1577050r8p) {
            C1577050r8p c1577050r8p2 = c1577050r8p;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1577050r8p2.cursor);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1577050r8p2.has_more);
            ProtoAdapter<C1578280rAo> protoAdapter3 = C1578280rAo.ADAPTER;
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 3, c1577050r8p2.scenes);
            protoAdapter3.encodeWithTag(protoWriter, 4, c1577050r8p2.current_scene);
            ProtoAdapter<C1578210rAh> protoAdapter4 = C1578210rAh.ADAPTER;
            protoAdapter4.asRepeated().encodeWithTag(protoWriter, 5, c1577050r8p2.collections);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1577050r8p2.reload);
            C1577190r93.ADAPTER.encodeWithTag(protoWriter, 7, c1577050r8p2.banner_config);
            C1578240rAk.ADAPTER.encodeWithTag(protoWriter, 8, c1577050r8p2.skylight_model);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, c1577050r8p2.drama_tab_block_reason);
            protoAdapter.encodeWithTag(protoWriter, 10, c1577050r8p2.drama_tab_block_text);
            protoAdapter.encodeWithTag(protoWriter, 11, c1577050r8p2.feedback_link);
            protoAdapter4.asRepeated().encodeWithTag(protoWriter, 12, c1577050r8p2.safe_collections);
            protoWriter.writeBytes(c1577050r8p2.unknownFields());
        }
    };
    public C1577190r93 banner_config;
    public List<C1578210rAh> collections;
    public C1578280rAo current_scene;
    public String cursor;
    public Integer drama_tab_block_reason;
    public String drama_tab_block_text;
    public String feedback_link;
    public Boolean has_more;
    public Boolean reload;
    public List<C1578210rAh> safe_collections;
    public List<C1578280rAo> scenes;
    public C1578240rAk skylight_model;

    @Override // com.squareup.wire.Message
    public C1577040r8o newBuilder() {
        return null;
    }

    public C1577050r8p(String str, Boolean bool, List<C1578280rAo> list, C1578280rAo c1578280rAo, List<C1578210rAh> list2, Boolean bool2, C1577190r93 c1577190r93, C1578240rAk c1578240rAk, Integer num, String str2, String str3, List<C1578210rAh> list3) {
        this(str, bool, list, c1578280rAo, list2, bool2, c1577190r93, c1578240rAk, num, str2, str3, list3, ByteString.EMPTY);
    }

    public C1577050r8p(String str, Boolean bool, List<C1578280rAo> list, C1578280rAo c1578280rAo, List<C1578210rAh> list2, Boolean bool2, C1577190r93 c1577190r93, C1578240rAk c1578240rAk, Integer num, String str2, String str3, List<C1578210rAh> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = str;
        this.has_more = bool;
        this.scenes = C1516540pZE.LJFF("scenes", list);
        this.current_scene = c1578280rAo;
        this.collections = C1516540pZE.LJFF("collections", list2);
        this.reload = bool2;
        this.banner_config = c1577190r93;
        this.skylight_model = c1578240rAk;
        this.drama_tab_block_reason = num;
        this.drama_tab_block_text = str2;
        this.feedback_link = str3;
        this.safe_collections = C1516540pZE.LJFF("safe_collections", list3);
    }
}
