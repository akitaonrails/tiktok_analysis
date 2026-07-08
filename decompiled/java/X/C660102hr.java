package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C660102hr extends Message<C660102hr, C660202hs> {
    public static final ProtoAdapter<C660102hr> ADAPTER = new ProtoAdapter<C660102hr>() { // from class: X.02hq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C660102hr decode(ProtoReader protoReader) {
            C660102hr c660102hr = new C660102hr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 5) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c660102hr.payment_points = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c660102hr.fund_source = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c660102hr.original_payment_amount = C614702aX.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c660102hr.actual_payment_amount = C614702aX.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c660102hr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C660102hr c660102hr) {
            C660102hr c660102hr2 = c660102hr;
            ProtoAdapter<C614702aX> protoAdapter = C614702aX.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c660102hr2.actual_payment_amount) + protoAdapter.encodedSizeWithTag(2, c660102hr2.original_payment_amount) + ProtoAdapter.INT64.encodedSizeWithTag(3, c660102hr2.fund_source) + ProtoAdapter.STRING.encodedSizeWithTag(5, c660102hr2.payment_points) + c660102hr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C660102hr c660102hr) {
        }
    };
    public C614702aX actual_payment_amount;
    public Long fund_source;
    public C614702aX original_payment_amount;
    public String payment_points;

    public C660102hr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C660202hs newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
