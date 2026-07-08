package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ZA extends Message<C02ZA, C02ZC> {
    public static final ProtoAdapter<C02ZA> ADAPTER = new ProtoAdapter<C02ZA>() { // from class: X.02Z9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ZA decode(ProtoReader protoReader) {
            C02ZA c02za = new C02ZA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02za.alignment = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02za.size = C644102fH.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02za.color = C618602bA.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02za;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ZA c02za) {
            C02ZA c02za2 = c02za;
            return C618602bA.ADAPTER.encodedSizeWithTag(1, c02za2.color) + C644102fH.ADAPTER.encodedSizeWithTag(2, c02za2.size) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02za2.alignment) + c02za2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02ZA c02za) {
        }
    };
    public Integer alignment;
    public C618602bA color;
    public C644102fH size;

    public C02ZA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ZC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
