package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DCT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCT extends Message<C1DCT, C1DCV> {
    public static final ProtoAdapter<C1DCT> ADAPTER = new ProtoAdapter<C1DCT>() { // from class: X.1DCP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DCT decode(ProtoReader protoReader) {
            C1DCV c1dcv = new C1DCV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 71) {
                        if (iNextTag != 72) {
                            switch (iNextTag) {
                                case 1:
                                    c1dcv.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    c1dcv.LJ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 3:
                                    c1dcv.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 4:
                                    c1dcv.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 5:
                                    c1dcv.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 6:
                                    c1dcv.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 7:
                                    c1dcv.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 8:
                                    c1dcv.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1dcv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c1dcv.LJIIL = C1518290pc3.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1dcv.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dcv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DCT c1dct) {
            C1DCT c1dct2 = c1dct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1dct2.id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1dct2.model_type);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1dct2.is_ad) + protoAdapter2.encodedSizeWithTag(4, c1dct2.is_ecom) + protoAdapter.encodedSizeWithTag(5, c1dct2.ad_id) + protoAdapter.encodedSizeWithTag(6, c1dct2.creative_id) + ProtoAdapter.INT64.encodedSizeWithTag(7, c1dct2.timestamp) + protoAdapter2.encodedSizeWithTag(8, c1dct2.is_cache) + protoAdapter2.encodedSizeWithTag(71, c1dct2.is_live) + C1518290pc3.ADAPTER.encodedSizeWithTag(72, c1dct2.live_hot_refresh_info) + c1dct2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DCT c1dct) {
            C1DCT c1dct2 = c1dct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1dct2.id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c1dct2.model_type);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1dct2.is_ad);
            protoAdapter2.encodeWithTag(protoWriter, 4, c1dct2.is_ecom);
            protoAdapter.encodeWithTag(protoWriter, 5, c1dct2.ad_id);
            protoAdapter.encodeWithTag(protoWriter, 6, c1dct2.creative_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, c1dct2.timestamp);
            protoAdapter2.encodeWithTag(protoWriter, 8, c1dct2.is_cache);
            protoAdapter2.encodeWithTag(protoWriter, 71, c1dct2.is_live);
            C1518290pc3.ADAPTER.encodeWithTag(protoWriter, 72, c1dct2.live_hot_refresh_info);
            protoWriter.writeBytes(c1dct2.unknownFields());
        }
    };
    public String ad_id;
    public String creative_id;
    public String id;
    public Boolean is_ad;
    public Boolean is_cache;
    public Boolean is_ecom;
    public Boolean is_live;
    public C1518290pc3 live_hot_refresh_info;
    public Integer model_type;
    public Long timestamp;

    @Override // com.squareup.wire.Message
    public C1DCV newBuilder() {
        return null;
    }

    public C1DCT(String str, Integer num, Boolean bool, Boolean bool2, String str2, String str3, Long l, Boolean bool3, Boolean bool4, C1518290pc3 c1518290pc3) {
        this(str, num, bool, bool2, str2, str3, l, bool3, bool4, c1518290pc3, ByteString.EMPTY);
    }

    public C1DCT(String str, Integer num, Boolean bool, Boolean bool2, String str2, String str3, Long l, Boolean bool3, Boolean bool4, C1518290pc3 c1518290pc3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.model_type = num;
        this.is_ad = bool;
        this.is_ecom = bool2;
        this.ad_id = str2;
        this.creative_id = str3;
        this.timestamp = l;
        this.is_cache = bool3;
        this.is_live = bool4;
        this.live_hot_refresh_info = c1518290pc3;
    }
}
