package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C645902fZ extends Message<C645902fZ, C646202fc> {
    public static final ProtoAdapter<C645902fZ> ADAPTER = new ProtoAdapter<C645902fZ>() { // from class: X.02fY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C645902fZ decode(ProtoReader protoReader) {
            C645902fZ c645902fZ = new C645902fZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c645902fZ.message = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c645902fZ.state = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c645902fZ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C645902fZ c645902fZ) {
            C645902fZ c645902fZ2 = c645902fZ;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c645902fZ2.state) + ProtoAdapter.STRING.encodedSizeWithTag(2, c645902fZ2.message) + c645902fZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C645902fZ c645902fZ) {
            C645902fZ c645902fZ2 = c645902fZ;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c645902fZ2.state);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c645902fZ2.message);
            protoWriter.writeBytes(c645902fZ2.unknownFields());
        }
    };
    public String message;
    public Integer state;

    public C645902fZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C646202fc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
