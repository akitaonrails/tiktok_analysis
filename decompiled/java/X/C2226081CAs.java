package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226081CAs extends Message<C2226081CAs, C2226091CAt> {
    public static final ProtoAdapter<C2226081CAs> ADAPTER = new ProtoAdapter<C2226081CAs>() { // from class: X.1CAr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226081CAs decode(ProtoReader protoReader) {
            C2226081CAs c2226081CAs = new C2226081CAs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2226081CAs.padding = C1CB4.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2226081CAs.margin = C1CB4.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2226081CAs.ec_rich_text = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226081CAs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226081CAs c2226081CAs) {
            C2226081CAs c2226081CAs2 = c2226081CAs;
            int iEncodedSizeWithTag = C5431029t.ADAPTER.encodedSizeWithTag(1, c2226081CAs2.ec_rich_text);
            ProtoAdapter<C1CB4> protoAdapter = C1CB4.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2226081CAs2.margin) + protoAdapter.encodedSizeWithTag(3, c2226081CAs2.padding) + c2226081CAs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2226081CAs c2226081CAs) {
        }
    };
    public C5431029t ec_rich_text;
    public C1CB4 margin;
    public C1CB4 padding;

    public C2226081CAs() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2226091CAt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
