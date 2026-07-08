package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557302Ff extends Message<C557302Ff, C586602Qm> {
    public static final ProtoAdapter<C557302Ff> ADAPTER = new ProtoAdapter<C557302Ff>() { // from class: X.02AF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557302Ff decode(ProtoReader protoReader) {
            C557302Ff c557302Ff = new C557302Ff();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c557302Ff.dialog_content = C5293024l.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c557302Ff.popup_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557302Ff;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557302Ff c557302Ff) {
            C557302Ff c557302Ff2 = c557302Ff;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c557302Ff2.popup_type) + C5293024l.ADAPTER.encodedSizeWithTag(2, c557302Ff2.dialog_content) + c557302Ff2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C557302Ff c557302Ff) {
        }
    };
    public C5293024l dialog_content;
    public Integer popup_type;

    public C557302Ff() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C586602Qm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
