package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550302Cn extends Message<C550302Cn, C02J3> {
    public static final ProtoAdapter<C550302Cn> ADAPTER = new ProtoAdapter<C550302Cn>() { // from class: X.025q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550302Cn decode(ProtoReader protoReader) {
            C550302Cn c550302Cn = new C550302Cn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550302Cn.sticker_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c550302Cn.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c550302Cn.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c550302Cn.sticker_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c550302Cn.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c550302Cn.open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550302Cn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550302Cn c550302Cn) {
            C550302Cn c550302Cn2 = c550302Cn;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c550302Cn2.sticker_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c550302Cn2.link) + protoAdapter.encodedSizeWithTag(3, c550302Cn2.title) + protoAdapter.encodedSizeWithTag(4, c550302Cn2.sticker_id) + C673002jw.ADAPTER.encodedSizeWithTag(5, c550302Cn2.icon_url) + protoAdapter.encodedSizeWithTag(6, c550302Cn2.open_url) + c550302Cn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550302Cn c550302Cn) {
            C550302Cn c550302Cn2 = c550302Cn;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c550302Cn2.sticker_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c550302Cn2.link);
            protoAdapter.encodeWithTag(protoWriter, 3, c550302Cn2.title);
            protoAdapter.encodeWithTag(protoWriter, 4, c550302Cn2.sticker_id);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, c550302Cn2.icon_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c550302Cn2.open_url);
            protoWriter.writeBytes(c550302Cn2.unknownFields());
        }
    };
    public C673002jw icon_url;
    public String link;
    public String open_url;
    public String sticker_id;
    public Integer sticker_type;
    public String title;

    public C550302Cn() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02J3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
