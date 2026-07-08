package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C732502tX extends Message<C732502tX, C732602tY> {
    public static final ProtoAdapter<C732502tX> ADAPTER = new ProtoAdapter<C732502tX>() { // from class: X.02tW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C732502tX decode(ProtoReader protoReader) {
            C732502tX c732502tX = new C732502tX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c732502tX.reason = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c732502tX.status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c732502tX;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C732502tX c732502tX) {
            C732502tX c732502tX2 = c732502tX;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c732502tX2.status) + ProtoAdapter.STRING.encodedSizeWithTag(2, c732502tX2.reason) + c732502tX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C732502tX c732502tX) {
            C732502tX c732502tX2 = c732502tX;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c732502tX2.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c732502tX2.reason);
            protoWriter.writeBytes(c732502tX2.unknownFields());
        }
    };
    public String reason;
    public Integer status;

    public C732502tX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C732602tY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
