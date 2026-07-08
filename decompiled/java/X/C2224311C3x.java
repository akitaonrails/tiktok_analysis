package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224311C3x extends Message<C2224311C3x, C2224321C3y> {
    public static final ProtoAdapter<C2224311C3x> ADAPTER = new ProtoAdapter<C2224311C3x>() { // from class: X.1C3w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224311C3x decode(ProtoReader protoReader) {
            C2224311C3x c2224311C3x = new C2224311C3x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2224311C3x.require_amount = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2224311C3x.discount_limit = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2224311C3x.face_value = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224311C3x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224311C3x c2224311C3x) {
            C2224311C3x c2224311C3x2 = c2224311C3x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2224311C3x2.face_value) + protoAdapter.encodedSizeWithTag(2, c2224311C3x2.discount_limit) + protoAdapter.encodedSizeWithTag(3, c2224311C3x2.require_amount) + c2224311C3x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224311C3x c2224311C3x) {
        }
    };
    public String discount_limit;
    public String face_value;
    public String require_amount;

    public C2224311C3x() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224321C3y newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
