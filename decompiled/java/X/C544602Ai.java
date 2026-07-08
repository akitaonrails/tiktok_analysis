package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C544602Ai extends Message<C544602Ai, C573102Lh> {
    public static final ProtoAdapter<C544602Ai> ADAPTER = new ProtoAdapter<C544602Ai>() { // from class: X.024e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C544602Ai decode(ProtoReader protoReader) {
            C544602Ai c544602Ai = new C544602Ai();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 99) {
                        if (iNextTag != 100) {
                            switch (iNextTag) {
                                case 1:
                                    c544602Ai.type = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 2:
                                    c544602Ai.id = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    c544602Ai.icon = C673002jw.ADAPTER.decode(protoReader);
                                    break;
                                case 4:
                                    c544602Ai.title = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 5:
                                    c544602Ai.open_url = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 6:
                                    c544602Ai.web_url = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 7:
                                    c544602Ai.mp_url = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 8:
                                    c544602Ai.title_tag = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                        } else {
                            c544602Ai.log_extra = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c544602Ai.extra = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c544602Ai;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C544602Ai c544602Ai) {
            C544602Ai c544602Ai2 = c544602Ai;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c544602Ai2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c544602Ai2.id) + C673002jw.ADAPTER.encodedSizeWithTag(3, c544602Ai2.icon) + protoAdapter.encodedSizeWithTag(4, c544602Ai2.title) + protoAdapter.encodedSizeWithTag(5, c544602Ai2.open_url) + protoAdapter.encodedSizeWithTag(6, c544602Ai2.web_url) + protoAdapter.encodedSizeWithTag(7, c544602Ai2.mp_url) + protoAdapter.encodedSizeWithTag(8, c544602Ai2.title_tag) + protoAdapter.encodedSizeWithTag(99, c544602Ai2.extra) + protoAdapter.encodedSizeWithTag(100, c544602Ai2.log_extra) + c544602Ai2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C544602Ai c544602Ai) {
            C544602Ai c544602Ai2 = c544602Ai;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c544602Ai2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c544602Ai2.id);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c544602Ai2.icon);
            protoAdapter.encodeWithTag(protoWriter, 4, c544602Ai2.title);
            protoAdapter.encodeWithTag(protoWriter, 5, c544602Ai2.open_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c544602Ai2.web_url);
            protoAdapter.encodeWithTag(protoWriter, 7, c544602Ai2.mp_url);
            protoAdapter.encodeWithTag(protoWriter, 8, c544602Ai2.title_tag);
            protoAdapter.encodeWithTag(protoWriter, 99, c544602Ai2.extra);
            protoAdapter.encodeWithTag(protoWriter, 100, c544602Ai2.log_extra);
            protoWriter.writeBytes(c544602Ai2.unknownFields());
        }
    };
    public String extra;
    public C673002jw icon;
    public String id;
    public String log_extra;
    public String mp_url;
    public String open_url;
    public String title;
    public String title_tag;
    public Integer type;
    public String web_url;

    public C544602Ai() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573102Lh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
