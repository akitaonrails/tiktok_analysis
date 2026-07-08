package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6T extends Message<C1C6T, C1C6S> {
    public static final ProtoAdapter<C1C6T> ADAPTER = new ProtoAdapter<C1C6T>() { // from class: X.1C6U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C6T decode(ProtoReader protoReader) {
            C1C6T c1c6t = new C1C6T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1c6t.icon_dark_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c6t.icon_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c6t.content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c6t.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C6T c1c6t) {
            C1C6T c1c6t2 = c1c6t;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c6t2.title) + protoAdapter.encodedSizeWithTag(2, c1c6t2.content) + protoAdapter.encodedSizeWithTag(3, c1c6t2.icon_url) + protoAdapter.encodedSizeWithTag(4, c1c6t2.icon_dark_url) + c1c6t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C6T c1c6t) {
        }
    };
    public String content;
    public String icon_dark_url;
    public String icon_url;
    public String title;

    public C1C6T() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C6S newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
