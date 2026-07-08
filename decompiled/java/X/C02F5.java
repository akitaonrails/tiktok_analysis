package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F5 extends Message<C02F5, C02MM> {
    public static final ProtoAdapter<C02F5> ADAPTER = new ProtoAdapter<C02F5>() { // from class: X.02Ek
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F5 decode(ProtoReader protoReader) {
            C02F5 c02f5 = new C02F5();
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
                                    c02f5.bottom = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02f5.right = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02f5.left = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02f5.top = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F5 c02f5) {
            C02F5 c02f52 = c02f5;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02f52.top) + protoAdapter.encodedSizeWithTag(2, c02f52.left) + protoAdapter.encodedSizeWithTag(3, c02f52.right) + protoAdapter.encodedSizeWithTag(4, c02f52.bottom) + c02f52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02F5 c02f5) {
            C02F5 c02f52 = c02f5;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02f52.top);
            protoAdapter.encodeWithTag(protoWriter, 2, c02f52.left);
            protoAdapter.encodeWithTag(protoWriter, 3, c02f52.right);
            protoAdapter.encodeWithTag(protoWriter, 4, c02f52.bottom);
            protoWriter.writeBytes(c02f52.unknownFields());
        }
    };
    public Integer bottom;
    public Integer left;
    public Integer right;
    public Integer top;

    public C02F5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
