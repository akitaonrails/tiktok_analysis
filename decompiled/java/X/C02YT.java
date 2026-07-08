package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02YT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YT extends Message<C02YT, C02YW> {
    public static final ProtoAdapter<C02YT> ADAPTER = new ProtoAdapter<C02YT>() { // from class: X.02YS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YT decode(ProtoReader protoReader) {
            C02YT c02yt = new C02YT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02yt.icon = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02yt.desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02yt.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02yt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YT c02yt) {
            C02YT c02yt2 = c02yt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02yt2.title) + protoAdapter.encodedSizeWithTag(2, c02yt2.desc) + C029C.ADAPTER.encodedSizeWithTag(3, c02yt2.icon) + c02yt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02YT c02yt) {
        }
    };
    public String desc;
    public C029C icon;
    public String title;

    public C02YT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02YW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
