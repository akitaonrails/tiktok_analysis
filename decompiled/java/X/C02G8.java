package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G8 extends Message<C02G8, C576702Mr> {
    public static final ProtoAdapter<C02G8> ADAPTER = new ProtoAdapter<C02G8>() { // from class: X.02BP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G8 decode(ProtoReader protoReader) {
            C02G8 c02g8 = new C02G8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02g8.oneclick_page = C629002cq.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02g8.second_pay_page = C629002cq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02g8.recommend_and_paypage = C629002cq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G8 c02g8) {
            C02G8 c02g82 = c02g8;
            ProtoAdapter<C629002cq> protoAdapter = C629002cq.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c02g82.recommend_and_paypage) + protoAdapter.encodedSizeWithTag(2, c02g82.second_pay_page) + protoAdapter.encodedSizeWithTag(3, c02g82.oneclick_page) + c02g82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02G8 c02g8) {
        }
    };
    public C629002cq oneclick_page;
    public C629002cq recommend_and_paypage;
    public C629002cq second_pay_page;

    public C02G8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C576702Mr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
