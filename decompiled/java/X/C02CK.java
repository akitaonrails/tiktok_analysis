package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CK extends Message<C02CK, C576402Mo> {
    public static final ProtoAdapter<C02CK> ADAPTER = new ProtoAdapter<C02CK>() { // from class: X.0270
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CK decode(ProtoReader protoReader) {
            C02CK c02ck = new C02CK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ck.sns_period_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02ck.display_info = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02ck.sub_display_info = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02ck.sns_option_module = C556902Fb.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02ck.sns_period_module = C02C7.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02ck.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ck;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CK c02ck) {
            C02CK c02ck2 = c02ck;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02ck2.sns_period_link);
            ProtoAdapter<C5431029t> protoAdapter2 = C5431029t.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02ck2.display_info) + protoAdapter2.encodedSizeWithTag(3, c02ck2.sub_display_info) + C556902Fb.ADAPTER.encodedSizeWithTag(4, c02ck2.sns_option_module) + C02C7.ADAPTER.encodedSizeWithTag(5, c02ck2.sns_period_module) + protoAdapter.encodedSizeWithTag(6, c02ck2.da_info) + c02ck2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CK c02ck) {
        }
    };
    public String da_info;
    public C5431029t display_info;
    public C556902Fb sns_option_module;
    public String sns_period_link;
    public C02C7 sns_period_module;
    public C5431029t sub_display_info;

    public C02CK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C576402Mo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
