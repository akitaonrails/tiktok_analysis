package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C599102Vh extends Message<C599102Vh, C599202Vi> {
    public static final ProtoAdapter<C599102Vh> ADAPTER = new ProtoAdapter<C599102Vh>() { // from class: X.02Vg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C599102Vh decode(ProtoReader protoReader) {
            C599102Vh c599102Vh = new C599102Vh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c599102Vh.icon = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c599102Vh.content = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c599102Vh.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c599102Vh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C599102Vh c599102Vh) {
            C599102Vh c599102Vh2 = c599102Vh;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c599102Vh2.title) + protoAdapter.encodedSizeWithTag(2, c599102Vh2.content) + C029C.ADAPTER.encodedSizeWithTag(3, c599102Vh2.icon) + c599102Vh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C599102Vh c599102Vh) {
        }
    };
    public C5431029t content;
    public C029C icon;
    public C5431029t title;

    public C599102Vh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C599202Vi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
