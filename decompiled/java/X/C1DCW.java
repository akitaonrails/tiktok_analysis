package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DCW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCW extends Message<C1DCW, C1DCX> {
    public static final ProtoAdapter<C1DCW> ADAPTER = new ProtoAdapter<C1DCW>() { // from class: X.1DCR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DCW decode(ProtoReader protoReader) {
            C1DCX c1dcx = new C1DCX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dcx.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c1dcx.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1dcx.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c1dcx.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c1dcx.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c1dcx.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c1dcx.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c1dcx.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1dcx.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dcx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dcx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DCW c1dcw) {
            C1DCW c1dcw2 = c1dcw;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1dcw2.favourite_poi) + protoAdapter.encodedSizeWithTag(2, c1dcw2.share_poi) + protoAdapter.encodedSizeWithTag(3, c1dcw2.click_product_shelf_item) + protoAdapter.encodedSizeWithTag(4, c1dcw2.enter_poi_webview) + protoAdapter.encodedSizeWithTag(5, c1dcw2.enter_order_submit_page) + protoAdapter.encodedSizeWithTag(6, c1dcw2.click_submit_order) + protoAdapter.encodedSizeWithTag(7, c1dcw2.submit_order_result);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, c1dcw2.poi_all_staytime) + protoAdapter2.encodedSizeWithTag(9, c1dcw2.poi_detail_staytime) + c1dcw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DCW c1dcw) {
            C1DCW c1dcw2 = c1dcw;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1dcw2.favourite_poi);
            protoAdapter.encodeWithTag(protoWriter, 2, c1dcw2.share_poi);
            protoAdapter.encodeWithTag(protoWriter, 3, c1dcw2.click_product_shelf_item);
            protoAdapter.encodeWithTag(protoWriter, 4, c1dcw2.enter_poi_webview);
            protoAdapter.encodeWithTag(protoWriter, 5, c1dcw2.enter_order_submit_page);
            protoAdapter.encodeWithTag(protoWriter, 6, c1dcw2.click_submit_order);
            protoAdapter.encodeWithTag(protoWriter, 7, c1dcw2.submit_order_result);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 8, c1dcw2.poi_all_staytime);
            protoAdapter2.encodeWithTag(protoWriter, 9, c1dcw2.poi_detail_staytime);
            protoWriter.writeBytes(c1dcw2.unknownFields());
        }
    };
    public Boolean click_product_shelf_item;
    public Boolean click_submit_order;
    public Boolean enter_order_submit_page;
    public Boolean enter_poi_webview;
    public Boolean favourite_poi;
    public Long poi_all_staytime;
    public Long poi_detail_staytime;
    public Boolean share_poi;
    public Boolean submit_order_result;

    @Override // com.squareup.wire.Message
    public C1DCX newBuilder() {
        return null;
    }

    public C1DCW(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l, Long l2) {
        this(bool, bool2, bool3, bool4, bool5, bool6, bool7, l, l2, ByteString.EMPTY);
    }

    public C1DCW(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.favourite_poi = bool;
        this.share_poi = bool2;
        this.click_product_shelf_item = bool3;
        this.enter_poi_webview = bool4;
        this.enter_order_submit_page = bool5;
        this.click_submit_order = bool6;
        this.submit_order_result = bool7;
        this.poi_all_staytime = l;
        this.poi_detail_staytime = l2;
    }
}
