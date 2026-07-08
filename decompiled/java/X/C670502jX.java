package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C670502jX extends Message<C670502jX, C670602jY> {
    public static final ProtoAdapter<C670502jX> ADAPTER = new ProtoAdapter<C670502jX>() { // from class: X.02jW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C670502jX decode(ProtoReader protoReader) {
            C670502jX c670502jX = new C670502jX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c670502jX.celebration_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c670502jX;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C670502jX c670502jX) {
            C670502jX c670502jX2 = c670502jX;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c670502jX2.celebration_type) + c670502jX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C670502jX c670502jX) {
            C670502jX c670502jX2 = c670502jX;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c670502jX2.celebration_type);
            protoWriter.writeBytes(c670502jX2.unknownFields());
        }
    };
    public Integer celebration_type;

    public C670502jX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C670602jY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
