package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C642002ew extends Message<C642002ew, C642102ex> {
    public static final ProtoAdapter<C642002ew> ADAPTER = new ProtoAdapter<C642002ew>() { // from class: X.02ev
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C642002ew decode(ProtoReader protoReader) {
            C642002ew c642002ew = new C642002ew();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c642002ew.tips_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c642002ew.available_status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c642002ew;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C642002ew c642002ew) {
            C642002ew c642002ew2 = c642002ew;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c642002ew2.available_status) + ProtoAdapter.STRING.encodedSizeWithTag(2, c642002ew2.tips_text) + c642002ew2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C642002ew c642002ew) {
        }
    };
    public Integer available_status;
    public String tips_text;

    public C642002ew() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C642102ex newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
