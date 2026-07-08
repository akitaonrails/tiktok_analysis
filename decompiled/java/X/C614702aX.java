package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C614702aX extends Message<C614702aX, C614802aY> {
    public static final ProtoAdapter<C614702aX> ADAPTER = new ProtoAdapter<C614702aX>() { // from class: X.02aW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C614702aX decode(ProtoReader protoReader) {
            C614702aX c614702aX = new C614702aX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c614702aX.amount_display_text = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c614702aX.expiry_time = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c614702aX.price_str = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c614702aX.amount = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c614702aX.currency = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c614702aX;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C614702aX c614702aX) {
            C614702aX c614702aX2 = c614702aX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c614702aX2.currency) + protoAdapter.encodedSizeWithTag(2, c614702aX2.amount) + protoAdapter.encodedSizeWithTag(3, c614702aX2.price_str) + protoAdapter.encodedSizeWithTag(4, c614702aX2.expiry_time) + protoAdapter.encodedSizeWithTag(5, c614702aX2.amount_display_text) + c614702aX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C614702aX c614702aX) {
        }
    };
    public String amount;
    public String amount_display_text;
    public String currency;
    public String expiry_time;
    public String price_str;

    public C614702aX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C614802aY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
