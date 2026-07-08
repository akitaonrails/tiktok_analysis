package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C548302Bt extends Message<C548302Bt, C02IG> {
    public static final ProtoAdapter<C548302Bt> ADAPTER = new ProtoAdapter<C548302Bt>() { // from class: X.025P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C548302Bt decode(ProtoReader protoReader) {
            C548302Bt c548302Bt = new C548302Bt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c548302Bt.main_entrance_lynx_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c548302Bt.main_entrance_channel = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c548302Bt.lynx_card_config = C02Y5.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c548302Bt.load_entrance_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c548302Bt.biz_dynamic_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c548302Bt.biz_channel = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c548302Bt.biz_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c548302Bt.biz_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c548302Bt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C548302Bt c548302Bt) {
            C548302Bt c548302Bt2 = c548302Bt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c548302Bt2.main_entrance_lynx_url) + protoAdapter.encodedSizeWithTag(2, c548302Bt2.main_entrance_channel) + C02Y5.ADAPTER.encodedSizeWithTag(3, c548302Bt2.lynx_card_config) + ProtoAdapter.INT32.encodedSizeWithTag(4, c548302Bt2.load_entrance_type) + protoAdapter.encodedSizeWithTag(5, c548302Bt2.biz_dynamic_url) + protoAdapter.encodedSizeWithTag(6, c548302Bt2.biz_channel) + protoAdapter.encodedSizeWithTag(7, c548302Bt2.biz_data) + protoAdapter.encodedSizeWithTag(8, c548302Bt2.biz_info) + c548302Bt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C548302Bt c548302Bt) {
            C548302Bt c548302Bt2 = c548302Bt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c548302Bt2.main_entrance_lynx_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c548302Bt2.main_entrance_channel);
            C02Y5.ADAPTER.encodeWithTag(protoWriter, 3, c548302Bt2.lynx_card_config);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c548302Bt2.load_entrance_type);
            protoAdapter.encodeWithTag(protoWriter, 5, c548302Bt2.biz_dynamic_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c548302Bt2.biz_channel);
            protoAdapter.encodeWithTag(protoWriter, 7, c548302Bt2.biz_data);
            protoAdapter.encodeWithTag(protoWriter, 8, c548302Bt2.biz_info);
            protoWriter.writeBytes(c548302Bt2.unknownFields());
        }
    };
    public String biz_channel;
    public String biz_data;
    public String biz_dynamic_url;
    public String biz_info;
    public Integer load_entrance_type;
    public C02Y5 lynx_card_config;
    public String main_entrance_channel;
    public String main_entrance_lynx_url;

    public C548302Bt() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
