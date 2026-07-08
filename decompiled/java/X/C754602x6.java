package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02x6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C754602x6 extends Message<C754602x6, C754502x5> {
    public static final ProtoAdapter<C754602x6> ADAPTER = new ProtoAdapter<C754602x6>() { // from class: X.02x7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C754602x6 decode(ProtoReader protoReader) {
            C754602x6 c754602x6 = new C754602x6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c754602x6.bold = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c754602x6.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c754602x6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C754602x6 c754602x6) {
            C754602x6 c754602x62 = c754602x6;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c754602x62.title) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c754602x62.bold) + c754602x62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C754602x6 c754602x6) {
        }
    };
    public Boolean bold;
    public String title;

    public C754602x6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C754502x5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
