package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FQ extends Message<C02FQ, C564102Hv> {
    public static final ProtoAdapter<C02FQ> ADAPTER = new ProtoAdapter<C02FQ>() { // from class: X.028H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FQ decode(ProtoReader protoReader) {
            C02FQ c02fq = new C02FQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02fq.label_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02fq.label_url = C673002jw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FQ c02fq) {
            C02FQ c02fq2 = c02fq;
            return C673002jw.ADAPTER.encodedSizeWithTag(1, c02fq2.label_url) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02fq2.label_type) + c02fq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FQ c02fq) {
            C02FQ c02fq2 = c02fq;
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 1, c02fq2.label_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c02fq2.label_type);
            protoWriter.writeBytes(c02fq2.unknownFields());
        }
    };
    public Integer label_type;
    public C673002jw label_url;

    public C02FQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C564102Hv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
