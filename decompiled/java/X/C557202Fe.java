package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557202Fe extends Message<C557202Fe, C583802Pk> {
    public static final ProtoAdapter<C557202Fe> ADAPTER = new ProtoAdapter<C557202Fe>() { // from class: X.02AE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557202Fe decode(ProtoReader protoReader) {
            C557202Fe c557202Fe = new C557202Fe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c557202Fe.benefit_rich_text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c557202Fe.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557202Fe;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557202Fe c557202Fe) {
            C557202Fe c557202Fe2 = c557202Fe;
            return C029C.ADAPTER.encodedSizeWithTag(1, c557202Fe2.icon) + C5431029t.ADAPTER.encodedSizeWithTag(2, c557202Fe2.benefit_rich_text) + c557202Fe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C557202Fe c557202Fe) {
        }
    };
    public C5431029t benefit_rich_text;
    public C029C icon;

    public C557202Fe() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C583802Pk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
