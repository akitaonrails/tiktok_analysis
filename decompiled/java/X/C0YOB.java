package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YOB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOB extends Message<C0YOB, C0YOC> {
    public static final ProtoAdapter<C0YOB> ADAPTER = new ProtoAdapter<C0YOB>() { // from class: X.0YOA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C0YOB decode(ProtoReader protoReader) {
            C0YOC c0yoc = new C0YOC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c0yoc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yoc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C0YOB c0yob) {
            return c0yob.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C0YOB c0yob) {
            protoWriter.writeBytes(c0yob.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C0YOB() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C0YOC newBuilder() {
        C0YOC c0yoc = new C0YOC();
        c0yoc.addUnknownFields(unknownFields());
        return c0yoc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "GetMediaUploadConfigRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public C0YOB(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
