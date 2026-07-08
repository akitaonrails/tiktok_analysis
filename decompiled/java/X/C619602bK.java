package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C619602bK extends Message<C619602bK, C619702bL> {
    public static final ProtoAdapter<C619602bK> ADAPTER = new ProtoAdapter<C619602bK>() { // from class: X.02bJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C619602bK decode(ProtoReader protoReader) {
            C619602bK c619602bK = new C619602bK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c619602bK.font_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c619602bK.font_size = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c619602bK;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C619602bK c619602bK) {
            C619602bK c619602bK2 = c619602bK;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c619602bK2.font_size) + ProtoAdapter.STRING.encodedSizeWithTag(2, c619602bK2.font_color) + c619602bK2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C619602bK c619602bK) {
            C619602bK c619602bK2 = c619602bK;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c619602bK2.font_size);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c619602bK2.font_color);
            protoWriter.writeBytes(c619602bK2.unknownFields());
        }
    };
    public String font_color;
    public Integer font_size;

    public C619602bK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C619702bL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
