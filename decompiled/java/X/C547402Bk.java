package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547402Bk extends Message<C547402Bk, C569902Kb> {
    public static final ProtoAdapter<C547402Bk> ADAPTER = new ProtoAdapter<C547402Bk>() { // from class: X.024W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547402Bk decode(ProtoReader protoReader) {
            C547402Bk c547402Bk = new C547402Bk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c547402Bk.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c547402Bk.start = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c547402Bk.end = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c547402Bk.uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c547402Bk.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c547402Bk.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c547402Bk.avatar_url = C687802mK.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547402Bk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547402Bk c547402Bk) {
            C547402Bk c547402Bk2 = c547402Bk;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c547402Bk2.type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c547402Bk2.start) + protoAdapter.encodedSizeWithTag(3, c547402Bk2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c547402Bk2.uid) + protoAdapter2.encodedSizeWithTag(5, c547402Bk2.sec_uid) + protoAdapter2.encodedSizeWithTag(6, c547402Bk2.nickname) + C687802mK.ADAPTER.encodedSizeWithTag(7, c547402Bk2.avatar_url) + c547402Bk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C547402Bk c547402Bk) {
            C547402Bk c547402Bk2 = c547402Bk;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c547402Bk2.type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c547402Bk2.start);
            protoAdapter.encodeWithTag(protoWriter, 3, c547402Bk2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c547402Bk2.uid);
            protoAdapter2.encodeWithTag(protoWriter, 5, c547402Bk2.sec_uid);
            protoAdapter2.encodeWithTag(protoWriter, 6, c547402Bk2.nickname);
            C687802mK.ADAPTER.encodeWithTag(protoWriter, 7, c547402Bk2.avatar_url);
            protoWriter.writeBytes(c547402Bk2.unknownFields());
        }
    };
    public C687802mK avatar_url;
    public Long end;
    public String nickname;
    public String sec_uid;
    public Long start;
    public Integer type;
    public String uid;

    public C547402Bk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C569902Kb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
