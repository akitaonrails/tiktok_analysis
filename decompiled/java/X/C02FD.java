package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FD extends Message<C02FD, C02OQ> {
    public static final ProtoAdapter<C02FD> ADAPTER = new ProtoAdapter<C02FD>() { // from class: X.029Z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FD decode(ProtoReader protoReader) {
            C02FD c02fd = new C02FD();
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
                                    c02fd.name_en = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fd.link = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fd.btn_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fd.privacy_policy_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FD c02fd) {
            C02FD c02fd2 = c02fd;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02fd2.privacy_policy_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02fd2.btn_text) + protoAdapter.encodedSizeWithTag(3, c02fd2.link) + protoAdapter.encodedSizeWithTag(4, c02fd2.name_en) + c02fd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FD c02fd) {
        }
    };
    public String btn_text;
    public String link;
    public String name_en;
    public Integer privacy_policy_type;

    public C02FD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
