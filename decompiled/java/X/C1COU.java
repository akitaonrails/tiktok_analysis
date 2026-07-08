package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COU extends Message<C1COU, C1COV> {
    public static final ProtoAdapter<C1COU> ADAPTER = new ProtoAdapter<C1COU>() { // from class: X.1COT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1COU decode(ProtoReader protoReader) {
            C1COV c1cov = new C1COV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cov.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cov.LJ = C1COL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cov.LIZLLL = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cov.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1COU c1cou) {
            C1COU c1cou2 = c1cou;
            return C029C.ADAPTER.encodedSizeWithTag(1, c1cou2.icon) + C1COL.ADAPTER.encodedSizeWithTag(2, c1cou2.text) + c1cou2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1COU c1cou) {
        }
    };
    public C029C icon;
    public C1COL text;

    @Override // com.squareup.wire.Message
    public C1COV newBuilder() {
        return null;
    }

    public C1COU(C029C c029c, C1COL c1col) {
        this(c029c, c1col, ByteString.EMPTY);
    }

    public C1COU(C029C c029c, C1COL c1col, ByteString byteString) {
        super(ADAPTER, byteString);
        this.icon = c029c;
        this.text = c1col;
    }
}
