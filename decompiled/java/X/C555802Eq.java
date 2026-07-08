package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555802Eq extends Message<C555802Eq, C02QS> {
    public static final ProtoAdapter<C555802Eq> ADAPTER = new ProtoAdapter<C555802Eq>() { // from class: X.029T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555802Eq decode(ProtoReader protoReader) {
            C555802Eq c555802Eq = new C555802Eq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 255) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c555802Eq.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c555802Eq.page_header_carousel_desc = C02XL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c555802Eq.page_header_carousel_icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555802Eq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555802Eq c555802Eq) {
            C555802Eq c555802Eq2 = c555802Eq;
            return C029C.ADAPTER.encodedSizeWithTag(1, c555802Eq2.page_header_carousel_icon) + C02XL.ADAPTER.encodedSizeWithTag(2, c555802Eq2.page_header_carousel_desc) + ProtoAdapter.STRING.encodedSizeWithTag(255, c555802Eq2.da_info) + c555802Eq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C555802Eq c555802Eq) {
        }
    };
    public String da_info;
    public C02XL page_header_carousel_desc;
    public C029C page_header_carousel_icon;

    public C555802Eq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
