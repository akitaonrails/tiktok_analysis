package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229411CNn extends Message<C2229411CNn, C2229421CNo> {
    public static final ProtoAdapter<C2229411CNn> ADAPTER = new ProtoAdapter<C2229411CNn>() { // from class: X.1CNm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229411CNn decode(ProtoReader protoReader) {
            C2229411CNn c2229411CNn = new C2229411CNn();
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
                                        c2229411CNn.discount = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2229411CNn.handling = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2229411CNn.shipping = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2229411CNn.tax = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2229411CNn.item_total = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229411CNn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229411CNn c2229411CNn) {
            C2229411CNn c2229411CNn2 = c2229411CNn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2229411CNn2.item_total) + protoAdapter.encodedSizeWithTag(2, c2229411CNn2.tax) + protoAdapter.encodedSizeWithTag(3, c2229411CNn2.shipping) + protoAdapter.encodedSizeWithTag(4, c2229411CNn2.handling) + protoAdapter.encodedSizeWithTag(5, c2229411CNn2.discount) + c2229411CNn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2229411CNn c2229411CNn) {
        }
    };
    public String discount;
    public String handling;
    public String item_total;
    public String shipping;
    public String tax;

    public C2229411CNn() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2229421CNo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
