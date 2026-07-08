package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COF extends Message<C1COF, C1COG> {
    public static final ProtoAdapter<C1COF> ADAPTER = new ProtoAdapter<C1COF>() { // from class: X.1COE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1COF decode(ProtoReader protoReader) {
            C1COF c1cof = new C1COF();
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
                                    c1cof.color_dark = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cof.font_size = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cof.font_weight = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cof.color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cof;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1COF c1cof) {
            C1COF c1cof2 = c1cof;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cof2.color) + protoAdapter.encodedSizeWithTag(2, c1cof2.font_weight) + protoAdapter.encodedSizeWithTag(3, c1cof2.font_size) + protoAdapter.encodedSizeWithTag(4, c1cof2.color_dark) + c1cof2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1COF c1cof) {
        }
    };
    public String color;
    public String color_dark;
    public String font_size;
    public String font_weight;

    public C1COF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1COG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
