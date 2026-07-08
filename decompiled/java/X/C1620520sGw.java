package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0sGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620520sGw extends Message<C1620520sGw, C1620540sGy> {
    public static final ProtoAdapter<C1620520sGw> ADAPTER = new ProtoAdapter<C1620520sGw>() { // from class: X.0sGx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1620520sGw decode(ProtoReader protoReader) {
            C1620540sGy c1620540sGy = new C1620540sGy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1620540sGy.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1620540sGy.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1620540sGy.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1620540sGy.LJI.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c1620540sGy.LJII = C1518060pbg.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1620540sGy.LJIIIIZZ = C1620500sGu.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1620540sGy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1620540sGy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1620520sGw c1620520sGw) {
            C1620520sGw c1620520sGw2 = c1620520sGw;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1620520sGw2.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1620520sGw2.status_msg) + protoAdapter.encodedSizeWithTag(3, c1620520sGw2.has_more) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(4, c1620520sGw2.aweme_list) + C1518060pbg.ADAPTER.encodedSizeWithTag(5, c1620520sGw2.extra) + C1620500sGu.ADAPTER.encodedSizeWithTag(6, c1620520sGw2.log_pb) + c1620520sGw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1620520sGw c1620520sGw) {
            C1620520sGw c1620520sGw2 = c1620520sGw;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1620520sGw2.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1620520sGw2.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c1620520sGw2.has_more);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1620520sGw2.aweme_list);
            C1518060pbg.ADAPTER.encodeWithTag(protoWriter, 5, c1620520sGw2.extra);
            C1620500sGu.ADAPTER.encodeWithTag(protoWriter, 6, c1620520sGw2.log_pb);
            protoWriter.writeBytes(c1620520sGw2.unknownFields());
        }
    };
    public List<C5186020i> aweme_list;
    public C1518060pbg extra;
    public Integer has_more;
    public C1620500sGu log_pb;
    public Integer status_code;
    public String status_msg;

    @Override // com.squareup.wire.Message
    public C1620540sGy newBuilder() {
        return null;
    }

    public C1620520sGw(Integer num, String str, Integer num2, List<C5186020i> list, C1518060pbg c1518060pbg, C1620500sGu c1620500sGu) {
        this(num, str, num2, list, c1518060pbg, c1620500sGu, ByteString.EMPTY);
    }

    public C1620520sGw(Integer num, String str, Integer num2, List<C5186020i> list, C1518060pbg c1518060pbg, C1620500sGu c1620500sGu, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.status_msg = str;
        this.has_more = num2;
        this.aweme_list = C1516540pZE.LJFF("aweme_list", list);
        this.extra = c1518060pbg;
        this.log_pb = c1620500sGu;
    }
}
