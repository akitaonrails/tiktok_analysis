package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C592602Su extends Message<C592602Su, C593102Sz> {
    public static final ProtoAdapter<C592602Su> ADAPTER = new ProtoAdapter<C592602Su>() { // from class: X.02Sr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C592602Su decode(ProtoReader protoReader) {
            C592602Su c592602Su = new C592602Su();
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
                                    c592602Su.breathe_times = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c592602Su.type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c592602Su.search_word = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c592602Su.word = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c592602Su;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C592602Su c592602Su) {
            C592602Su c592602Su2 = c592602Su;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c592602Su2.word) + protoAdapter.encodedSizeWithTag(2, c592602Su2.search_word);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c592602Su2.type) + protoAdapter2.encodedSizeWithTag(4, c592602Su2.breathe_times) + c592602Su2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C592602Su c592602Su) {
            C592602Su c592602Su2 = c592602Su;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c592602Su2.word);
            protoAdapter.encodeWithTag(protoWriter, 2, c592602Su2.search_word);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c592602Su2.type);
            protoAdapter2.encodeWithTag(protoWriter, 4, c592602Su2.breathe_times);
            protoWriter.writeBytes(c592602Su2.unknownFields());
        }
    };
    public Integer breathe_times;
    public String search_word;
    public Integer type;
    public String word;

    public C592602Su() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C593102Sz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
