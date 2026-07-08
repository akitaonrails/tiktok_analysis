package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02n1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C692102n1 extends Message<C692102n1, C692002n0> {
    public static final ProtoAdapter<C692102n1> ADAPTER = new ProtoAdapter<C692102n1>() { // from class: X.02n2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C692102n1 decode(ProtoReader protoReader) {
            C692102n1 c692102n1 = new C692102n1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c692102n1.image_dark = C02U1.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c692102n1.image_light = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c692102n1.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c692102n1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C692102n1 c692102n1) {
            C692102n1 c692102n12 = c692102n1;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c692102n12.type);
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c692102n12.image_light) + protoAdapter.encodedSizeWithTag(3, c692102n12.image_dark) + c692102n12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C692102n1 c692102n1) {
        }
    };
    public C02U1 image_dark;
    public C02U1 image_light;
    public Integer type;

    public C692102n1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C692002n0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
