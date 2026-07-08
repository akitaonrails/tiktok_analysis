package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FS extends Message<C02FS, C02JF> {
    public static final ProtoAdapter<C02FS> ADAPTER = new ProtoAdapter<C02FS>() { // from class: X.029B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FS decode(ProtoReader protoReader) {
            C02FS c02fs = new C02FS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02fs.ui = C02TG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02fs.key = C636602e4.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FS c02fs) {
            C02FS c02fs2 = c02fs;
            return C636602e4.ADAPTER.encodedSizeWithTag(1, c02fs2.key) + C02TG.ADAPTER.encodedSizeWithTag(2, c02fs2.ui) + c02fs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FS c02fs) {
            C02FS c02fs2 = c02fs;
            C636602e4.ADAPTER.encodeWithTag(protoWriter, 1, c02fs2.key);
            C02TG.ADAPTER.encodeWithTag(protoWriter, 2, c02fs2.ui);
            protoWriter.writeBytes(c02fs2.unknownFields());
        }
    };
    public C636602e4 key;
    public C02TG ui;

    public C02FS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
