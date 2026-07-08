package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02q9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C711502q9 extends Message<C711502q9, C711402q8> {
    public static final ProtoAdapter<C711502q9> ADAPTER = new ProtoAdapter<C711502q9>() { // from class: X.02qA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C711502q9 decode(ProtoReader protoReader) {
            C711502q9 c711502q9 = new C711502q9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c711502q9.origin_reason = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c711502q9.to_date = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c711502q9.from_date = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c711502q9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C711502q9 c711502q9) {
            C711502q9 c711502q92 = c711502q9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c711502q92.from_date) + protoAdapter.encodedSizeWithTag(2, c711502q92.to_date) + protoAdapter.encodedSizeWithTag(3, c711502q92.origin_reason) + c711502q92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C711502q9 c711502q9) {
        }
    };
    public String from_date;
    public String origin_reason;
    public String to_date;

    public C711502q9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C711402q8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
