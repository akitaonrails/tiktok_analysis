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

/* JADX INFO: renamed from: X.1Dij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263551Dij extends Message<C2263551Dij, C2263561Dik> {
    public static final ProtoAdapter<C2263551Dij> ADAPTER = new ProtoAdapter<C2263551Dij>() { // from class: X.1Dii
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2263551Dij decode(ProtoReader protoReader) {
            C2263561Dik c2263561Dik = new C2263561Dik();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2263561Dik.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2263561Dik.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2263561Dik.LJFF.add(C1DAG.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c2263561Dik.LJI = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2263561Dik.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2263561Dik.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c2263561Dik.LJIIIZ = C1C6D.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2263561Dik.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2263561Dik.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2263561Dik.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2263561Dik.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2263561Dik.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2263551Dij c2263551Dij) {
            C2263551Dij c2263551Dij2 = c2263551Dij;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2263551Dij2.name) + protoAdapter.encodedSizeWithTag(2, c2263551Dij2.title) + C1DAG.ADAPTER.asRepeated().encodedSizeWithTag(3, c2263551Dij2.descriptions) + C029C.ADAPTER.encodedSizeWithTag(4, c2263551Dij2.icon);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c2263551Dij2.disabled) + protoAdapter2.encodedSizeWithTag(6, c2263551Dij2.selected) + C1C6D.ADAPTER.encodedSizeWithTag(7, c2263551Dij2.hyper_link) + protoAdapter.encodedSizeWithTag(8, c2263551Dij2.list_type) + protoAdapter.encodedSizeWithTag(9, c2263551Dij2.list_status) + protoAdapter.encodedSizeWithTag(10, c2263551Dij2.id) + c2263551Dij2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2263551Dij c2263551Dij) {
        }
    };
    public List<C1DAG> descriptions;
    public Boolean disabled;
    public C1C6D hyper_link;
    public C029C icon;
    public String id;
    public String list_status;
    public String list_type;
    public String name;
    public Boolean selected;
    public String title;

    @Override // com.squareup.wire.Message
    public C2263561Dik newBuilder() {
        return null;
    }

    public C2263551Dij(String str, String str2, List<C1DAG> list, C029C c029c, Boolean bool, Boolean bool2, C1C6D c1c6d, String str3, String str4, String str5) {
        this(str, str2, list, c029c, bool, bool2, c1c6d, str3, str4, str5, ByteString.EMPTY);
    }

    public C2263551Dij(String str, String str2, List<C1DAG> list, C029C c029c, Boolean bool, Boolean bool2, C1C6D c1c6d, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.title = str2;
        this.descriptions = C1516540pZE.LJFF("descriptions", list);
        this.icon = c029c;
        this.disabled = bool;
        this.selected = bool2;
        this.hyper_link = c1c6d;
        this.list_type = str3;
        this.list_status = str4;
        this.id = str5;
    }
}
