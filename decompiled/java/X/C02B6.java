package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B6 extends Message<C02B6, C02KA> {
    public static final ProtoAdapter<C02B6> ADAPTER = new ProtoAdapter<C02B6>() { // from class: X.024D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B6 decode(ProtoReader protoReader) {
            C02B6 c02b6 = new C02B6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02b6.aweme_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c02b6.comment_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02b6.alias_comment_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c02b6.user_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02b6.comment_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02b6.comment_user_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c02b6.user_avatar = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c02b6.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B6 c02b6) {
            C02B6 c02b62 = c02b6;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02b62.aweme_id) + protoAdapter.encodedSizeWithTag(2, c02b62.comment_id) + protoAdapter.encodedSizeWithTag(3, c02b62.alias_comment_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02b62.user_name) + protoAdapter2.encodedSizeWithTag(5, c02b62.comment_msg) + protoAdapter.encodedSizeWithTag(6, c02b62.comment_user_id) + C673002jw.ADAPTER.encodedSizeWithTag(7, c02b62.user_avatar) + ProtoAdapter.INT32.encodedSizeWithTag(8, c02b62.collect_stat) + c02b62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02B6 c02b6) {
            C02B6 c02b62 = c02b6;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02b62.aweme_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02b62.comment_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c02b62.alias_comment_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02b62.user_name);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02b62.comment_msg);
            protoAdapter.encodeWithTag(protoWriter, 6, c02b62.comment_user_id);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 7, c02b62.user_avatar);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, c02b62.collect_stat);
            protoWriter.writeBytes(c02b62.unknownFields());
        }
    };
    public Long alias_comment_id;
    public Long aweme_id;
    public Integer collect_stat;
    public Long comment_id;
    public String comment_msg;
    public Long comment_user_id;
    public C673002jw user_avatar;
    public String user_name;

    public C02B6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
