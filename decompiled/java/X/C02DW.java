package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DW extends Message<C02DW, C02PQ> {
    public static final ProtoAdapter<C02DW> ADAPTER = new ProtoAdapter<C02DW>() { // from class: X.027C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DW decode(ProtoReader protoReader) {
            C02DW c02dw = new C02DW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 100) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c02dw.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c02dw.promotion_icon = C029C.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02dw.promotion_threshold_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02dw.schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02dw.promotion_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02dw.promotion_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DW c02dw) {
            C02DW c02dw2 = c02dw;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02dw2.promotion_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02dw2.promotion_title) + protoAdapter.encodedSizeWithTag(3, c02dw2.schema) + protoAdapter.encodedSizeWithTag(4, c02dw2.promotion_threshold_text) + C029C.ADAPTER.encodedSizeWithTag(5, c02dw2.promotion_icon) + protoAdapter.encodedSizeWithTag(100, c02dw2.da_info) + c02dw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DW c02dw) {
        }
    };
    public String da_info;
    public C029C promotion_icon;
    public String promotion_threshold_text;
    public String promotion_title;
    public Integer promotion_type;
    public String schema;

    public C02DW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
