package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C744202vQ extends Message<C744202vQ, C744302vR> {
    public static final ProtoAdapter<C744202vQ> ADAPTER = new ProtoAdapter<C744202vQ>() { // from class: X.02vP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C744202vQ decode(ProtoReader protoReader) {
            C744202vQ c744202vQ = new C744202vQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c744202vQ.xl_link_rich_text = C743902vN.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c744202vQ.image = C02U1.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c744202vQ.link_rich_text = AnonymousClass0241.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c744202vQ.rich_block_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c744202vQ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C744202vQ c744202vQ) {
            C744202vQ c744202vQ2 = c744202vQ;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c744202vQ2.rich_block_type) + AnonymousClass0241.ADAPTER.encodedSizeWithTag(2, c744202vQ2.link_rich_text) + C02U1.ADAPTER.encodedSizeWithTag(3, c744202vQ2.image) + C743902vN.ADAPTER.encodedSizeWithTag(4, c744202vQ2.xl_link_rich_text) + c744202vQ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C744202vQ c744202vQ) {
        }
    };
    public C02U1 image;
    public AnonymousClass0241 link_rich_text;
    public Integer rich_block_type;
    public C743902vN xl_link_rich_text;

    public C744202vQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C744302vR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
