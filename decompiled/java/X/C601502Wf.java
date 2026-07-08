package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C601502Wf extends Message<C601502Wf, C601602Wg> {
    public static final ProtoAdapter<C601502Wf> ADAPTER = new ProtoAdapter<C601502Wf>() { // from class: X.02We
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C601502Wf decode(ProtoReader protoReader) {
            C601502Wf c601502Wf = new C601502Wf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c601502Wf.discount_desc = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c601502Wf.discount_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c601502Wf.discount_icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c601502Wf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C601502Wf c601502Wf) {
            C601502Wf c601502Wf2 = c601502Wf;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c601502Wf2.discount_icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c601502Wf2.discount_text) + protoAdapter.encodedSizeWithTag(3, c601502Wf2.discount_desc) + c601502Wf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C601502Wf c601502Wf) {
        }
    };
    public String discount_desc;
    public C029C discount_icon;
    public String discount_text;

    public C601502Wf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C601602Wg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
