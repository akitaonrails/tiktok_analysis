package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CF extends Message<C02CF, C02JR> {
    public static final ProtoAdapter<C02CF> ADAPTER = new ProtoAdapter<C02CF>() { // from class: X.025I
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CF decode(ProtoReader protoReader) {
            C02CF c02cf = new C02CF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cf.id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c02cf.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02cf.app_id = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02cf.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02cf.avatar = C1C9Q.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02cf.uniq_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CF c02cf) {
            C02CF c02cf2 = c02cf;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c02cf2.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02cf2.sec_uid) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02cf2.app_id) + protoAdapter.encodedSizeWithTag(4, c02cf2.nickname) + C1C9Q.ADAPTER.encodedSizeWithTag(5, c02cf2.avatar) + protoAdapter.encodedSizeWithTag(6, c02cf2.uniq_id) + c02cf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CF c02cf) {
            C02CF c02cf2 = c02cf;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02cf2.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02cf2.sec_uid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02cf2.app_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c02cf2.nickname);
            C1C9Q.ADAPTER.encodeWithTag(protoWriter, 5, c02cf2.avatar);
            protoAdapter.encodeWithTag(protoWriter, 6, c02cf2.uniq_id);
            protoWriter.writeBytes(c02cf2.unknownFields());
        }
    };
    public Integer app_id;
    public C1C9Q avatar;
    public Long id;
    public String nickname;
    public String sec_uid;
    public String uniq_id;

    public C02CF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
