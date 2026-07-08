package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02f2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C642602f2 extends Message<C642602f2, C642702f3> {
    public static final ProtoAdapter<C642602f2> ADAPTER = new ProtoAdapter<C642602f2>() { // from class: X.02f1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C642602f2 decode(ProtoReader protoReader) {
            C642602f2 c642602f2 = new C642602f2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c642602f2.abnormal_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c642602f2.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c642602f2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C642602f2 c642602f2) {
            C642602f2 c642602f22 = c642602f2;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c642602f22.desc) + ProtoAdapter.INT32.encodedSizeWithTag(2, c642602f22.abnormal_type) + c642602f22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C642602f2 c642602f2) {
        }
    };
    public Integer abnormal_type;
    public String desc;

    public C642602f2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C642702f3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
