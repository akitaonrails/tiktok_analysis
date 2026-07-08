package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561002Gq extends Message<C561002Gq, C02O9> {
    public static final ProtoAdapter<C561002Gq> ADAPTER = new ProtoAdapter<C561002Gq>() { // from class: X.02BQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561002Gq decode(ProtoReader protoReader) {
            C561002Gq c561002Gq = new C561002Gq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c561002Gq.pm_explanation_popup = C5427029p.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c561002Gq.type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561002Gq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561002Gq c561002Gq) {
            C561002Gq c561002Gq2 = c561002Gq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c561002Gq2.type) + C5427029p.ADAPTER.encodedSizeWithTag(2, c561002Gq2.pm_explanation_popup) + c561002Gq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561002Gq c561002Gq) {
        }
    };
    public C5427029p pm_explanation_popup;
    public String type;

    public C561002Gq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02O9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
