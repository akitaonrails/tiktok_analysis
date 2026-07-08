package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554502Ed extends Message<C554502Ed, C02PP> {
    public static final ProtoAdapter<C554502Ed> ADAPTER = new ProtoAdapter<C554502Ed>() { // from class: X.029b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554502Ed decode(ProtoReader protoReader) {
            C554502Ed c554502Ed = new C554502Ed();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 200) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c554502Ed.da_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c554502Ed.button_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c554502Ed.discount_back_desc_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c554502Ed.discount_back_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c554502Ed.reduction_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554502Ed;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554502Ed c554502Ed) {
            C554502Ed c554502Ed2 = c554502Ed;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c554502Ed2.reduction_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c554502Ed2.discount_back_title) + protoAdapter.encodedSizeWithTag(3, c554502Ed2.discount_back_desc_text) + protoAdapter.encodedSizeWithTag(4, c554502Ed2.button_text) + protoAdapter.encodedSizeWithTag(200, c554502Ed2.da_info) + c554502Ed2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C554502Ed c554502Ed) {
        }
    };
    public String button_text;
    public String da_info;
    public String discount_back_desc_text;
    public String discount_back_title;
    public Integer reduction_type;

    public C554502Ed() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
