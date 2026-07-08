package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B7 extends Message<C02B7, C02KY> {
    public static final ProtoAdapter<C02B7> ADAPTER = new ProtoAdapter<C02B7>() { // from class: X.024E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B7 decode(ProtoReader protoReader) {
            C02B7 c02b7 = new C02B7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02b7.uid = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c02b7.avatar = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02b7.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02b7.remark_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02b7.avatar_larger = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02b7.avatar_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c02b7.follow_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c02b7.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B7 c02b7) {
            C02B7 c02b72 = c02b7;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c02b72.uid);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02b72.avatar);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c02b72.nickname) + protoAdapter2.encodedSizeWithTag(4, c02b72.remark_name) + protoAdapter.encodedSizeWithTag(5, c02b72.avatar_larger) + protoAdapter.encodedSizeWithTag(6, c02b72.avatar_thumb) + ProtoAdapter.INT32.encodedSizeWithTag(7, c02b72.follow_status) + protoAdapter2.encodedSizeWithTag(8, c02b72.sec_uid) + c02b72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02B7 c02b7) {
            C02B7 c02b72 = c02b7;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02b72.uid);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c02b72.avatar);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02b72.nickname);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02b72.remark_name);
            protoAdapter.encodeWithTag(protoWriter, 5, c02b72.avatar_larger);
            protoAdapter.encodeWithTag(protoWriter, 6, c02b72.avatar_thumb);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, c02b72.follow_status);
            protoAdapter2.encodeWithTag(protoWriter, 8, c02b72.sec_uid);
            protoWriter.writeBytes(c02b72.unknownFields());
        }
    };
    public C673002jw avatar;
    public C673002jw avatar_larger;
    public C673002jw avatar_thumb;
    public Integer follow_status;
    public String nickname;
    public String remark_name;
    public String sec_uid;
    public Long uid;

    public C02B7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
