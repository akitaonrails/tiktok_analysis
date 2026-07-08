package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C617702b1 extends Message<C617702b1, C617802b2> {
    public static final ProtoAdapter<C617702b1> ADAPTER = new ProtoAdapter<C617702b1>() { // from class: X.02b0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C617702b1 decode(ProtoReader protoReader) {
            C617702b1 c617702b1 = new C617702b1();
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
                                    c617702b1.term_link = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c617702b1.short_address = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c617702b1.full_address = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c617702b1.create_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c617702b1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C617702b1 c617702b1) {
            C617702b1 c617702b12 = c617702b1;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c617702b12.create_time);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c617702b12.full_address) + protoAdapter.encodedSizeWithTag(3, c617702b12.short_address) + protoAdapter.encodedSizeWithTag(4, c617702b12.term_link) + c617702b12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C617702b1 c617702b1) {
            C617702b1 c617702b12 = c617702b1;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c617702b12.create_time);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c617702b12.full_address);
            protoAdapter.encodeWithTag(protoWriter, 3, c617702b12.short_address);
            protoAdapter.encodeWithTag(protoWriter, 4, c617702b12.term_link);
            protoWriter.writeBytes(c617702b12.unknownFields());
        }
    };
    public Long create_time;
    public String full_address;
    public String short_address;
    public String term_link;

    public C617702b1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C617802b2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
