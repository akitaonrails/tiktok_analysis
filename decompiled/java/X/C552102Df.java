package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552102Df extends Message<C552102Df, C02NY> {
    public static final ProtoAdapter<C552102Df> ADAPTER = new ProtoAdapter<C552102Df>() { // from class: X.029e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552102Df decode(ProtoReader protoReader) {
            C552102Df c552102Df = new C552102Df();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c552102Df.wallet_icon = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c552102Df.wallet_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c552102Df.clock_icon = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c552102Df.clock_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c552102Df.bag_icon = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c552102Df.bag_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c552102Df.legal_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552102Df;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552102Df c552102Df) {
            C552102Df c552102Df2 = c552102Df;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c552102Df2.wallet_icon) + protoAdapter.encodedSizeWithTag(2, c552102Df2.wallet_text) + protoAdapter.encodedSizeWithTag(3, c552102Df2.clock_icon) + protoAdapter.encodedSizeWithTag(4, c552102Df2.clock_text) + protoAdapter.encodedSizeWithTag(5, c552102Df2.bag_icon) + protoAdapter.encodedSizeWithTag(6, c552102Df2.bag_text) + protoAdapter.encodedSizeWithTag(7, c552102Df2.legal_text) + c552102Df2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C552102Df c552102Df) {
        }
    };
    public String bag_icon;
    public String bag_text;
    public String clock_icon;
    public String clock_text;
    public String legal_text;
    public String wallet_icon;
    public String wallet_text;

    public C552102Df() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
