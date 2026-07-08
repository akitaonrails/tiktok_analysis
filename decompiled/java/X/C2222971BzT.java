package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1BzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222971BzT extends Message<C2222971BzT, C2222981BzU> {
    public static final ProtoAdapter<C2222971BzT> ADAPTER = new ProtoAdapter<C2222971BzT>() { // from class: X.1BzS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2222971BzT decode(ProtoReader protoReader) {
            C2222971BzT c2222971BzT = new C2222971BzT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2222971BzT.external_title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2222971BzT.display_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2222971BzT.link_address = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2222971BzT;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2222971BzT c2222971BzT) {
            C2222971BzT c2222971BzT2 = c2222971BzT;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2222971BzT2.link_address) + protoAdapter.encodedSizeWithTag(2, c2222971BzT2.display_text) + protoAdapter.encodedSizeWithTag(3, c2222971BzT2.external_title) + c2222971BzT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2222971BzT c2222971BzT) {
            C2222971BzT c2222971BzT2 = c2222971BzT;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2222971BzT2.link_address);
            protoAdapter.encodeWithTag(protoWriter, 2, c2222971BzT2.display_text);
            protoAdapter.encodeWithTag(protoWriter, 3, c2222971BzT2.external_title);
            protoWriter.writeBytes(c2222971BzT2.unknownFields());
        }
    };
    public String display_text;
    public String external_title;
    public String link_address;

    public C2222971BzT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2222981BzU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
