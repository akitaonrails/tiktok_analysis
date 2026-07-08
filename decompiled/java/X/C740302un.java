package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C740302un extends Message<C740302un, C740402uo> {
    public static final ProtoAdapter<C740302un> ADAPTER = new ProtoAdapter<C740302un>() { // from class: X.02um
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C740302un decode(ProtoReader protoReader) {
            C740302un c740302un = new C740302un();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c740302un.text_color = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c740302un.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c740302un;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C740302un c740302un) {
            C740302un c740302un2 = c740302un;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c740302un2.text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c740302un2.text_color) + c740302un2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C740302un c740302un) {
        }
    };
    public String text;
    public Integer text_color;

    public C740302un() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C740402uo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
