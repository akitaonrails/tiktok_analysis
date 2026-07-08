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

/* JADX INFO: renamed from: X.023a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5256023a extends Message<C5256023a, C576902Mt> {
    public static final ProtoAdapter<C5256023a> ADAPTER = new ProtoAdapter<C5256023a>() { // from class: X.022Z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5256023a decode(ProtoReader protoReader) {
            C5256023a c5256023a = new C5256023a();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 16) {
                        switch (iNextTag) {
                            case 1:
                                c5256023a.id = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 2:
                                c5256023a.type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                c5256023a.text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c5256023a.extra_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c5256023a.icon = C698202o0.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c5256023a.countdown = C705702pD.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c5256023a.default_style = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                c5256023a.schema = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c5256023a.status = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c5256023a.claimed_status = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c5256023a.background = C2224621C5c.ADAPTER.decode(protoReader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case 99:
                                        c5256023a.id_str = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 100:
                                        c5256023a.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 101:
                                        c5256023a.feature.add(C02H9.ADAPTER.decode(protoReader));
                                        break;
                                    default:
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        break;
                                }
                                break;
                        }
                    } else {
                        c5256023a.instance_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5256023a;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5256023a c5256023a) {
            C5256023a c5256023a2 = c5256023a;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c5256023a2.id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c5256023a2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c5256023a2.text) + protoAdapter2.encodedSizeWithTag(4, c5256023a2.extra_text) + C698202o0.ADAPTER.encodedSizeWithTag(5, c5256023a2.icon) + C705702pD.ADAPTER.encodedSizeWithTag(6, c5256023a2.countdown) + protoAdapter.encodedSizeWithTag(7, c5256023a2.default_style) + protoAdapter2.encodedSizeWithTag(8, c5256023a2.schema) + protoAdapter.encodedSizeWithTag(9, c5256023a2.status) + protoAdapter.encodedSizeWithTag(10, c5256023a2.claimed_status) + C2224621C5c.ADAPTER.encodedSizeWithTag(11, c5256023a2.background) + protoAdapter2.encodedSizeWithTag(16, c5256023a2.instance_key) + protoAdapter2.encodedSizeWithTag(99, c5256023a2.id_str) + protoAdapter2.encodedSizeWithTag(100, c5256023a2.da_info) + C02H9.ADAPTER.asRepeated().encodedSizeWithTag(101, c5256023a2.feature) + c5256023a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5256023a c5256023a) {
        }
    };
    public C2224621C5c background;
    public Integer claimed_status;
    public C705702pD countdown;
    public String da_info;
    public Integer default_style;
    public String extra_text;
    public List<C02H9> feature;
    public C698202o0 icon;
    public Long id;
    public String id_str;
    public String instance_key;
    public String schema;
    public Integer status;
    public String text;
    public Integer type;

    public C5256023a() {
        super(ADAPTER, ByteString.EMPTY);
        this.feature = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C576902Mt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
