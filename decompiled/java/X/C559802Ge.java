package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559802Ge extends Message<C559802Ge, C02KI> {
    public static final ProtoAdapter<C559802Ge> ADAPTER = new ProtoAdapter<C559802Ge>() { // from class: X.02A6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559802Ge decode(ProtoReader protoReader) {
            C559802Ge c559802Ge = new C559802Ge();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c559802Ge.end = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c559802Ge.begin = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559802Ge;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559802Ge c559802Ge) {
            C559802Ge c559802Ge2 = c559802Ge;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c559802Ge2.begin) + protoAdapter.encodedSizeWithTag(2, c559802Ge2.end) + c559802Ge2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559802Ge c559802Ge) {
            C559802Ge c559802Ge2 = c559802Ge;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c559802Ge2.begin);
            protoAdapter.encodeWithTag(protoWriter, 2, c559802Ge2.end);
            protoWriter.writeBytes(c559802Ge2.unknownFields());
        }
    };
    public Integer begin;
    public Integer end;

    public C559802Ge() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
