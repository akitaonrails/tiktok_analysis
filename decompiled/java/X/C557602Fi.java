package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557602Fi extends Message<C557602Fi, C02IT> {
    public static final ProtoAdapter<C557602Fi> ADAPTER = new ProtoAdapter<C557602Fi>() { // from class: X.028T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557602Fi decode(ProtoReader protoReader) {
            C557602Fi c557602Fi = new C557602Fi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c557602Fi.stage = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c557602Fi.reason = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c557602Fi.operator = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557602Fi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557602Fi c557602Fi) {
            C557602Fi c557602Fi2 = c557602Fi;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c557602Fi2.operator) + ProtoAdapter.STRING.encodedSizeWithTag(2, c557602Fi2.reason) + protoAdapter.encodedSizeWithTag(3, c557602Fi2.stage) + c557602Fi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C557602Fi c557602Fi) {
            C557602Fi c557602Fi2 = c557602Fi;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c557602Fi2.operator);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c557602Fi2.reason);
            protoAdapter.encodeWithTag(protoWriter, 3, c557602Fi2.stage);
            protoWriter.writeBytes(c557602Fi2.unknownFields());
        }
    };
    public Integer operator;
    public String reason;
    public Integer stage;

    public C557602Fi() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
