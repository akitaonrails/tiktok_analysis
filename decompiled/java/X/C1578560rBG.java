package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578560rBG extends Message<C1578560rBG, C1578550rBF> {
    public static final ProtoAdapter<C1578560rBG> ADAPTER = new ProtoAdapter<C1578560rBG>() { // from class: X.0rBH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578560rBG decode(ProtoReader protoReader) {
            C1578560rBG c1578560rBG = new C1578560rBG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1578560rBG.is_multi_language_success = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1578560rBG.language_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578560rBG;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578560rBG c1578560rBG) {
            C1578560rBG c1578560rBG2 = c1578560rBG;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1578560rBG2.language_code) + protoAdapter.encodedSizeWithTag(2, c1578560rBG2.is_multi_language_success) + c1578560rBG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578560rBG c1578560rBG) {
            C1578560rBG c1578560rBG2 = c1578560rBG;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1578560rBG2.language_code);
            protoAdapter.encodeWithTag(protoWriter, 2, c1578560rBG2.is_multi_language_success);
            protoWriter.writeBytes(c1578560rBG2.unknownFields());
        }
    };
    public String is_multi_language_success;
    public String language_code;

    public C1578560rBG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1578550rBF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
