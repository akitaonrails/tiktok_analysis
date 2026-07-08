package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02H0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02H0 extends Message<C02H0, C02QE> {
    public static final ProtoAdapter<C02H0> ADAPTER = new ProtoAdapter<C02H0>() { // from class: X.02AO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02H0 decode(ProtoReader protoReader) {
            C02H0 c02h0 = new C02H0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02h0.icon = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02h0.toast_content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02h0.toast_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02h0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02H0 c02h0) {
            C02H0 c02h02 = c02h0;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02h02.toast_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02h02.toast_content) + protoAdapter.encodedSizeWithTag(3, c02h02.icon) + c02h02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02H0 c02h0) {
        }
    };
    public String icon;
    public String toast_content;
    public Integer toast_type;

    public C02H0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
