package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C762402yM extends Message<C762402yM, C762302yL> {
    public static final ProtoAdapter<C762402yM> ADAPTER = new ProtoAdapter<C762402yM>() { // from class: X.02yN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C762402yM decode(ProtoReader protoReader) {
            C762402yM c762402yM = new C762402yM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c762402yM.tag_value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c762402yM.tag_name = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c762402yM;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C762402yM c762402yM) {
            C762402yM c762402yM2 = c762402yM;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c762402yM2.tag_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, c762402yM2.tag_value) + c762402yM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C762402yM c762402yM) {
        }
    };
    public Integer tag_name;
    public String tag_value;

    public C762402yM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C762302yL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
