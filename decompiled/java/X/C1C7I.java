package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C7I, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7I extends Message<C1C7I, C1C7J> {
    public static final ProtoAdapter<C1C7I> ADAPTER = new ProtoAdapter<C1C7I>() { // from class: X.1C7H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C7I decode(ProtoReader protoReader) {
            C1C7I c1c7i = new C1C7I();
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
                                    c1c7i.size_guide_image = C02U1.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1c7i.buyer_reference = C1C7F.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1c7i.size_chart = C1C0P.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c7i.feedback_vote_data = C1C7L.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c7i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C7I c1c7i) {
            C1C7I c1c7i2 = c1c7i;
            return C1C7L.ADAPTER.encodedSizeWithTag(1, c1c7i2.feedback_vote_data) + C1C0P.ADAPTER.encodedSizeWithTag(2, c1c7i2.size_chart) + C1C7F.ADAPTER.encodedSizeWithTag(3, c1c7i2.buyer_reference) + C02U1.ADAPTER.encodedSizeWithTag(4, c1c7i2.size_guide_image) + c1c7i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C7I c1c7i) {
        }
    };
    public C1C7F buyer_reference;
    public C1C7L feedback_vote_data;
    public C1C0P size_chart;
    public C02U1 size_guide_image;

    public C1C7I() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C7J newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
