package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B4 extends Message<C02B4, C565002Ie> {
    public static final ProtoAdapter<C02B4> ADAPTER = new ProtoAdapter<C02B4>() { // from class: X.024t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B4 decode(ProtoReader protoReader) {
            C02B4 c02b4 = new C02B4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02b4.word = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02b4.word_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02b4.info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02b4.penetrate_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02b4.promotion_info = C550002Ck.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02b4.words_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02b4.word_record = C02EP.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c02b4.rich_sug_info = C628702cn.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B4 c02b4) {
            C02B4 c02b42 = c02b4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02b42.word) + protoAdapter.encodedSizeWithTag(2, c02b42.word_id) + protoAdapter.encodedSizeWithTag(3, c02b42.info) + protoAdapter.encodedSizeWithTag(4, c02b42.penetrate_info) + C550002Ck.ADAPTER.encodedSizeWithTag(5, c02b42.promotion_info) + protoAdapter.encodedSizeWithTag(6, c02b42.words_type) + C02EP.ADAPTER.encodedSizeWithTag(7, c02b42.word_record) + C628702cn.ADAPTER.encodedSizeWithTag(8, c02b42.rich_sug_info) + c02b42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02B4 c02b4) {
            C02B4 c02b42 = c02b4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02b42.word);
            protoAdapter.encodeWithTag(protoWriter, 2, c02b42.word_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c02b42.info);
            protoAdapter.encodeWithTag(protoWriter, 4, c02b42.penetrate_info);
            C550002Ck.ADAPTER.encodeWithTag(protoWriter, 5, c02b42.promotion_info);
            protoAdapter.encodeWithTag(protoWriter, 6, c02b42.words_type);
            C02EP.ADAPTER.encodeWithTag(protoWriter, 7, c02b42.word_record);
            C628702cn.ADAPTER.encodeWithTag(protoWriter, 8, c02b42.rich_sug_info);
            protoWriter.writeBytes(c02b42.unknownFields());
        }
    };
    public String info;
    public String penetrate_info;
    public C550002Ck promotion_info;
    public C628702cn rich_sug_info;
    public String word;
    public String word_id;
    public C02EP word_record;
    public String words_type;

    public C02B4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C565002Ie newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
