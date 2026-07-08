package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C694102nL extends Message<C694102nL, C694002nK> {
    public static final ProtoAdapter<C694102nL> ADAPTER = new ProtoAdapter<C694102nL>() { // from class: X.02nM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C694102nL decode(ProtoReader protoReader) {
            C694102nL c694102nL = new C694102nL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 23) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c694102nL.popup_prompt = C751002wW.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c694102nL.quantity = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c694102nL.notice_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c694102nL.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c694102nL;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C694102nL c694102nL) {
            C694102nL c694102nL2 = c694102nL;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c694102nL2.desc) + ProtoAdapter.INT32.encodedSizeWithTag(2, c694102nL2.notice_type) + C751002wW.ADAPTER.encodedSizeWithTag(23, c694102nL2.popup_prompt) + ProtoAdapter.INT64.encodedSizeWithTag(3, c694102nL2.quantity) + c694102nL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C694102nL c694102nL) {
        }
    };
    public String desc;
    public Integer notice_type;
    public C751002wW popup_prompt;
    public Long quantity;

    public C694102nL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C694002nK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
