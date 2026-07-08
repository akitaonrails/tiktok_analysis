package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G4 extends Message<C02G4, C575502Mf> {
    public static final ProtoAdapter<C02G4> ADAPTER = new ProtoAdapter<C02G4>() { // from class: X.029U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G4 decode(ProtoReader protoReader) {
            C02G4 c02g4 = new C02G4();
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
                                    c02g4.platform_rate_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02g4.description = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02g4.value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g4.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G4 c02g4) {
            C02G4 c02g42 = c02g4;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02g42.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02g42.value) + protoAdapter2.encodedSizeWithTag(3, c02g42.description) + protoAdapter.encodedSizeWithTag(4, c02g42.platform_rate_type) + c02g42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02G4 c02g4) {
        }
    };
    public String description;
    public Integer platform_rate_type;
    public Integer type;
    public String value;

    public C02G4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C575502Mf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
