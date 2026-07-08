package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Z5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02Z5 extends Message<C02Z5, C02Z6> {
    public static final ProtoAdapter<C02Z5> ADAPTER = new ProtoAdapter<C02Z5>() { // from class: X.02Z4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02Z5 decode(ProtoReader protoReader) {
            C02Z5 c02z5 = new C02Z5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02z5.brand_logo = C643802fE.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02z5.brand_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02z5.brand_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02z5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02Z5 c02z5) {
            C02Z5 c02z52 = c02z5;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c02z52.brand_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02z52.brand_name) + C643802fE.ADAPTER.encodedSizeWithTag(3, c02z52.brand_logo) + c02z52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02Z5 c02z5) {
        }
    };
    public Long brand_id;
    public C643802fE brand_logo;
    public String brand_name;

    public C02Z5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Z6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
