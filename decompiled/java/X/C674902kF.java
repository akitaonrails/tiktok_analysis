package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02kF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C674902kF extends Message<C674902kF, C675002kG> {
    public static final ProtoAdapter<C674902kF> ADAPTER = new ProtoAdapter<C674902kF>() { // from class: X.02kE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C674902kF decode(ProtoReader protoReader) {
            C674902kF c674902kF = new C674902kF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c674902kF.dynamic_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c674902kF;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C674902kF c674902kF) {
            C674902kF c674902kF2 = c674902kF;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c674902kF2.dynamic_info) + c674902kF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C674902kF c674902kF) {
            C674902kF c674902kF2 = c674902kF;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c674902kF2.dynamic_info);
            protoWriter.writeBytes(c674902kF2.unknownFields());
        }
    };
    public String dynamic_info;

    public C674902kF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C675002kG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
