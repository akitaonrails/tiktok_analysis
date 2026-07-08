package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223401C0k extends Message<C2223401C0k, C2223411C0l> {
    public static final ProtoAdapter<C2223401C0k> ADAPTER = new ProtoAdapter<C2223401C0k>() { // from class: X.1C0j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223401C0k decode(ProtoReader protoReader) {
            C2223401C0k c2223401C0k = new C2223401C0k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223401C0k.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223401C0k.element_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223401C0k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223401C0k c2223401C0k) {
            C2223401C0k c2223401C0k2 = c2223401C0k;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c2223401C0k2.element_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2223401C0k2.text) + c2223401C0k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223401C0k c2223401C0k) {
        }
    };
    public Integer element_type;
    public String text;

    public C2223401C0k() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223411C0l newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
