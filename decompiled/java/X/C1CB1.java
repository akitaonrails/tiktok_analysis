package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CB1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CB1 extends Message<C1CB1, C1CB2> {
    public static final ProtoAdapter<C1CB1> ADAPTER = new ProtoAdapter<C1CB1>() { // from class: X.1CB0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CB1 decode(ProtoReader protoReader) {
            C1CB1 c1cb1 = new C1CB1();
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
                                    c1cb1.pop_up = C2226051CAp.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1cb1.sheet = C606402Yc.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1cb1.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cb1.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cb1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CB1 c1cb1) {
            C1CB1 c1cb12 = c1cb1;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1cb12.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cb12.schema) + C606402Yc.ADAPTER.encodedSizeWithTag(3, c1cb12.sheet) + C2226051CAp.ADAPTER.encodedSizeWithTag(4, c1cb12.pop_up) + c1cb12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CB1 c1cb1) {
        }
    };
    public C2226051CAp pop_up;
    public String schema;
    public C606402Yc sheet;
    public Integer type;

    public C1CB1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CB2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
