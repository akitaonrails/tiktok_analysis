package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02W8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02W8 extends Message<C02W8, C02W9> {
    public static final ProtoAdapter<C02W8> ADAPTER = new ProtoAdapter<C02W8>() { // from class: X.02W7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02W8 decode(ProtoReader protoReader) {
            C02W8 c02w8 = new C02W8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02w8.ios_ver = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02w8.android_ver = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02w8.emoji_content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02w8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02W8 c02w8) {
            C02W8 c02w82 = c02w8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02w82.emoji_content) + protoAdapter.encodedSizeWithTag(2, c02w82.android_ver) + protoAdapter.encodedSizeWithTag(3, c02w82.ios_ver) + c02w82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02W8 c02w8) {
            C02W8 c02w82 = c02w8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02w82.emoji_content);
            protoAdapter.encodeWithTag(protoWriter, 2, c02w82.android_ver);
            protoAdapter.encodeWithTag(protoWriter, 3, c02w82.ios_ver);
            protoWriter.writeBytes(c02w82.unknownFields());
        }
    };
    public String android_ver;
    public String emoji_content;
    public String ios_ver;

    public C02W8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02W9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
