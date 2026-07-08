package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02f5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C642902f5 extends Message<C642902f5, C643002f6> {
    public static final ProtoAdapter<C642902f5> ADAPTER = new ProtoAdapter<C642902f5>() { // from class: X.02f4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C642902f5 decode(ProtoReader protoReader) {
            C642902f5 c642902f5 = new C642902f5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c642902f5.action_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c642902f5.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c642902f5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C642902f5 c642902f5) {
            C642902f5 c642902f52 = c642902f5;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c642902f52.text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c642902f52.action_type) + c642902f52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C642902f5 c642902f5) {
        }
    };
    public Integer action_type;
    public String text;

    public C642902f5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C643002f6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
