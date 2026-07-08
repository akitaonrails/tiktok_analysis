package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C618302b7 extends Message<C618302b7, C618402b8> {
    public static final ProtoAdapter<C618302b7> ADAPTER = new ProtoAdapter<C618302b7>() { // from class: X.02b6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C618302b7 decode(ProtoReader protoReader) {
            C618302b7 c618302b7 = new C618302b7();
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
                                    c618302b7.rich_text = C5431029t.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c618302b7.text_color = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c618302b7.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c618302b7.key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c618302b7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C618302b7 c618302b7) {
            C618302b7 c618302b72 = c618302b7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c618302b72.key) + protoAdapter.encodedSizeWithTag(2, c618302b72.text) + ProtoAdapter.INT32.encodedSizeWithTag(3, c618302b72.text_color) + C5431029t.ADAPTER.encodedSizeWithTag(4, c618302b72.rich_text) + c618302b72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C618302b7 c618302b7) {
        }
    };
    public String key;
    public C5431029t rich_text;
    public String text;
    public Integer text_color;

    public C618302b7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C618402b8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
