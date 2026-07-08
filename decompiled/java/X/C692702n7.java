package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C692702n7 extends Message<C692702n7, C692602n6> {
    public static final ProtoAdapter<C692702n7> ADAPTER = new ProtoAdapter<C692702n7>() { // from class: X.02n8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C692702n7 decode(ProtoReader protoReader) {
            C692702n7 c692702n7 = new C692702n7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c692702n7.link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c692702n7.data = C1COL.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c692702n7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C692702n7 c692702n7) {
            C692702n7 c692702n72 = c692702n7;
            return C1COL.ADAPTER.encodedSizeWithTag(1, c692702n72.data) + ProtoAdapter.STRING.encodedSizeWithTag(2, c692702n72.link) + c692702n72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C692702n7 c692702n7) {
        }
    };
    public C1COL data;
    public String link;

    public C692702n7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C692602n6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
