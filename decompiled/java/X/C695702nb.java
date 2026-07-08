package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C695702nb extends Message<C695702nb, C695602na> {
    public static final ProtoAdapter<C695702nb> ADAPTER = new ProtoAdapter<C695702nb>() { // from class: X.02nc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C695702nb decode(ProtoReader protoReader) {
            C695702nb c695702nb = new C695702nb();
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
                                        c695702nb.valid_time_text = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c695702nb.threshold_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c695702nb.discount_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c695702nb.voucher_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c695702nb.instance_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c695702nb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C695702nb c695702nb) {
            C695702nb c695702nb2 = c695702nb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c695702nb2.instance_key) + protoAdapter.encodedSizeWithTag(2, c695702nb2.voucher_id) + protoAdapter.encodedSizeWithTag(3, c695702nb2.discount_text) + protoAdapter.encodedSizeWithTag(4, c695702nb2.threshold_text) + protoAdapter.encodedSizeWithTag(5, c695702nb2.valid_time_text) + c695702nb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C695702nb c695702nb) {
        }
    };
    public String discount_text;
    public String instance_key;
    public String threshold_text;
    public String valid_time_text;
    public String voucher_id;

    public C695702nb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C695602na newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
