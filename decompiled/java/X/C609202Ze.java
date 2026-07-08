package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C609202Ze extends Message<C609202Ze, C609402Zg> {
    public static final ProtoAdapter<C609202Ze> ADAPTER = new ProtoAdapter<C609202Ze>() { // from class: X.02Zf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C609202Ze decode(ProtoReader protoReader) {
            C609402Zg c609402Zg = new C609402Zg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c609402Zg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c609402Zg.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c609402Zg.LIZLLL.add(C023K.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c609402Zg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C609202Ze c609202Ze) {
            C609202Ze c609202Ze2 = c609202Ze;
            return C023K.ADAPTER.asRepeated().encodedSizeWithTag(1, c609202Ze2.promotion_items) + ProtoAdapter.STRING.encodedSizeWithTag(2, c609202Ze2.coupon_schema) + c609202Ze2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C609202Ze c609202Ze) {
        }
    };
    public String coupon_schema;
    public List<C023K> promotion_items;

    public C609202Ze() {
    }

    @Override // com.squareup.wire.Message
    public C609402Zg newBuilder() {
        return null;
    }

    public C609202Ze(List<C023K> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public C609202Ze(List<C023K> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.promotion_items = C1516540pZE.LJFF("promotion_items", list);
        this.coupon_schema = str;
    }
}
