package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C743902vN extends Message<C743902vN, C744002vO> {
    public static final ProtoAdapter<C743902vN> ADAPTER = new ProtoAdapter<C743902vN>() { // from class: X.02vM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C743902vN decode(ProtoReader protoReader) {
            C743902vN c743902vN = new C743902vN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c743902vN.li_texts.add(AnonymousClass0241.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c743902vN.xl_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c743902vN;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C743902vN c743902vN) {
            C743902vN c743902vN2 = c743902vN;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c743902vN2.xl_type) + AnonymousClass0241.ADAPTER.asRepeated().encodedSizeWithTag(2, c743902vN2.li_texts) + c743902vN2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C743902vN c743902vN) {
        }
    };
    public List<AnonymousClass0241> li_texts;
    public Integer xl_type;

    public C743902vN() {
        super(ADAPTER, ByteString.EMPTY);
        this.li_texts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C744002vO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
