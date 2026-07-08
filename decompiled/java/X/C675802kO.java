package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02kO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C675802kO extends Message<C675802kO, C675902kP> {
    public static final ProtoAdapter<C675802kO> ADAPTER = new ProtoAdapter<C675802kO>() { // from class: X.02kN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C675802kO decode(ProtoReader protoReader) {
            C675802kO c675802kO = new C675802kO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c675802kO.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c675802kO;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C675802kO c675802kO) {
            C675802kO c675802kO2 = c675802kO;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c675802kO2.text) + c675802kO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C675802kO c675802kO) {
            C675802kO c675802kO2 = c675802kO;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c675802kO2.text);
            protoWriter.writeBytes(c675802kO2.unknownFields());
        }
    };
    public String text;

    public C675802kO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C675902kP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
