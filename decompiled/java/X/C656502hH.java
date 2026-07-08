package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C656502hH extends Message<C656502hH, C656602hI> {
    public static final ProtoAdapter<C656502hH> ADAPTER = new ProtoAdapter<C656502hH>() { // from class: X.02hG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C656502hH decode(ProtoReader protoReader) {
            C656502hH c656502hH = new C656502hH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c656502hH.description = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c656502hH.rating = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c656502hH;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C656502hH c656502hH) {
            C656502hH c656502hH2 = c656502hH;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c656502hH2.rating) + protoAdapter.encodedSizeWithTag(2, c656502hH2.description) + c656502hH2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C656502hH c656502hH) {
            C656502hH c656502hH2 = c656502hH;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c656502hH2.rating);
            protoAdapter.encodeWithTag(protoWriter, 2, c656502hH2.description);
            protoWriter.writeBytes(c656502hH2.unknownFields());
        }
    };
    public String description;
    public String rating;

    public C656502hH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C656602hI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
