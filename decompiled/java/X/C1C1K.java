package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1K, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1K extends Message<C1C1K, C1C1L> {
    public static final ProtoAdapter<C1C1K> ADAPTER = new ProtoAdapter<C1C1K>() { // from class: X.1C1J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1K decode(ProtoReader protoReader) {
            C1C1K c1c1k = new C1C1K();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c1k.label_content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c1k.label_content_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1K c1c1k) {
            C1C1K c1c1k2 = c1c1k;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1c1k2.label_content_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1c1k2.label_content) + c1c1k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C1K c1c1k) {
        }
    };
    public String label_content;
    public Integer label_content_type;

    public C1C1K() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C1L newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
