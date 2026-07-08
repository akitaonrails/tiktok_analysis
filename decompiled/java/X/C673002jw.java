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

/* JADX INFO: renamed from: X.02jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C673002jw extends Message<C673002jw, C673202jy> {
    public static final ProtoAdapter<C673002jw> ADAPTER = new ProtoAdapter<C673002jw>() { // from class: X.02jx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C673002jw decode(ProtoReader protoReader) {
            C673202jy c673202jy = new C673202jy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c673202jy.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c673202jy.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c673202jy.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c673202jy.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c673202jy.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c673202jy.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c673202jy.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c673202jy.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c673202jy.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c673202jy.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c673202jy.LJIILIIL = C757702xb.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c673202jy.LJIILJJIL = C673402k0.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c673202jy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c673202jy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C673002jw c673002jw) {
            C673002jw c673002jw2 = c673002jw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c673002jw2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(2, c673002jw2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c673002jw2.width) + protoAdapter2.encodedSizeWithTag(4, c673002jw2.height) + protoAdapter.encodedSizeWithTag(5, c673002jw2.url_key) + ProtoAdapter.INT64.encodedSizeWithTag(6, c673002jw2.data_size) + protoAdapter.encodedSizeWithTag(7, c673002jw2.file_hash) + protoAdapter.encodedSizeWithTag(8, c673002jw2.file_cs) + protoAdapter.encodedSizeWithTag(9, c673002jw2.player_access_key) + protoAdapter.encodedSizeWithTag(10, c673002jw2.file_id) + C757702xb.ADAPTER.encodedSizeWithTag(11, c673002jw2.image_media_model) + C673402k0.ADAPTER.encodedSizeWithTag(12, c673002jw2.preview) + c673002jw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C673002jw c673002jw) {
            C673002jw c673002jw2 = c673002jw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c673002jw2.uri);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c673002jw2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c673002jw2.width);
            protoAdapter2.encodeWithTag(protoWriter, 4, c673002jw2.height);
            protoAdapter.encodeWithTag(protoWriter, 5, c673002jw2.url_key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, c673002jw2.data_size);
            protoAdapter.encodeWithTag(protoWriter, 7, c673002jw2.file_hash);
            protoAdapter.encodeWithTag(protoWriter, 8, c673002jw2.file_cs);
            protoAdapter.encodeWithTag(protoWriter, 9, c673002jw2.player_access_key);
            protoAdapter.encodeWithTag(protoWriter, 10, c673002jw2.file_id);
            C757702xb.ADAPTER.encodeWithTag(protoWriter, 11, c673002jw2.image_media_model);
            C673402k0.ADAPTER.encodeWithTag(protoWriter, 12, c673002jw2.preview);
            protoWriter.writeBytes(c673002jw2.unknownFields());
        }
    };
    public Long data_size;
    public String file_cs;
    public String file_hash;
    public String file_id;
    public Integer height;
    public C757702xb image_media_model;
    public String player_access_key;
    public C673402k0 preview;
    public String uri;
    public String url_key;
    public List<String> url_list;
    public Integer width;

    public C673002jw() {
    }

    @Override // com.squareup.wire.Message
    public C673202jy newBuilder() {
        return null;
    }

    public C673002jw(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5, String str6, C757702xb c757702xb, C673402k0 c673402k0) {
        this(str, list, num, num2, str2, l, str3, str4, str5, str6, c757702xb, c673402k0, ByteString.EMPTY);
    }

    public C673002jw(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, String str5, String str6, C757702xb c757702xb, C673402k0 c673402k0, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.url_list = C1516540pZE.LJFF("url_list", list);
        this.width = num;
        this.height = num2;
        this.url_key = str2;
        this.data_size = l;
        this.file_hash = str3;
        this.file_cs = str4;
        this.player_access_key = str5;
        this.file_id = str6;
        this.image_media_model = c757702xb;
        this.preview = c673402k0;
    }
}
