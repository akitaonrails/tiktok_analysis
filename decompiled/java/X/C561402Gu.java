package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561402Gu extends Message<C561402Gu, C02PF> {
    public static final ProtoAdapter<C561402Gu> ADAPTER = new ProtoAdapter<C561402Gu>() { // from class: X.02Am
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561402Gu decode(ProtoReader protoReader) {
            C561402Gu c561402Gu = new C561402Gu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c561402Gu.label_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c561402Gu.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561402Gu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561402Gu c561402Gu) {
            C561402Gu c561402Gu2 = c561402Gu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c561402Gu2.text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c561402Gu2.label_type) + c561402Gu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561402Gu c561402Gu) {
        }
    };
    public Integer label_type;
    public String text;

    public C561402Gu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
