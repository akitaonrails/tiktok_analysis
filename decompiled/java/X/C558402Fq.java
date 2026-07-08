package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C558402Fq extends Message<C558402Fq, C569502Jx> {
    public static final ProtoAdapter<C558402Fq> ADAPTER = new ProtoAdapter<C558402Fq>() { // from class: X.02Fp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C558402Fq decode(ProtoReader protoReader) {
            C558402Fq c558402Fq = new C558402Fq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c558402Fq.head_icon = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c558402Fq.tail_action = C590202Rw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c558402Fq.content = C558202Fo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c558402Fq.deprecated = C673002jw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c558402Fq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C558402Fq c558402Fq) {
            C558402Fq c558402Fq2 = c558402Fq;
            return C673002jw.ADAPTER.encodedSizeWithTag(1, c558402Fq2.deprecated) + C558202Fo.ADAPTER.encodedSizeWithTag(2, c558402Fq2.content) + C590202Rw.ADAPTER.encodedSizeWithTag(3, c558402Fq2.tail_action) + ProtoAdapter.STRING.encodedSizeWithTag(4, c558402Fq2.head_icon) + c558402Fq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C558402Fq c558402Fq) {
            C558402Fq c558402Fq2 = c558402Fq;
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 1, c558402Fq2.deprecated);
            C558202Fo.ADAPTER.encodeWithTag(protoWriter, 2, c558402Fq2.content);
            C590202Rw.ADAPTER.encodeWithTag(protoWriter, 3, c558402Fq2.tail_action);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c558402Fq2.head_icon);
            protoWriter.writeBytes(c558402Fq2.unknownFields());
        }
    };
    public C558202Fo content;
    public C673002jw deprecated;
    public String head_icon;
    public C590202Rw tail_action;

    public C558402Fq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C569502Jx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
