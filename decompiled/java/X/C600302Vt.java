package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C600302Vt extends Message<C600302Vt, C600402Vu> {
    public static final ProtoAdapter<C600302Vt> ADAPTER = new ProtoAdapter<C600302Vt>() { // from class: X.02Vs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C600302Vt decode(ProtoReader protoReader) {
            C600302Vt c600302Vt = new C600302Vt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c600302Vt.end = C651102gP.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c600302Vt.start = C651102gP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c600302Vt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C600302Vt c600302Vt) {
            C600302Vt c600302Vt2 = c600302Vt;
            ProtoAdapter<C651102gP> protoAdapter = C651102gP.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c600302Vt2.start) + protoAdapter.encodedSizeWithTag(2, c600302Vt2.end) + c600302Vt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C600302Vt c600302Vt) {
        }
    };
    public C651102gP end;
    public C651102gP start;

    public C600302Vt() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C600402Vu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
