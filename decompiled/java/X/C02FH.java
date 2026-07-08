package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FH extends Message<C02FH, C02PI> {
    public static final ProtoAdapter<C02FH> ADAPTER = new ProtoAdapter<C02FH>() { // from class: X.02AM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FH decode(ProtoReader protoReader) {
            C02FH c02fh = new C02FH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 255) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02fh.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fh.specification_link = C02YY.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02fh.value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fh.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FH c02fh) {
            C02FH c02fh2 = c02fh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fh2.name) + protoAdapter.encodedSizeWithTag(2, c02fh2.value) + C02YY.ADAPTER.encodedSizeWithTag(3, c02fh2.specification_link) + protoAdapter.encodedSizeWithTag(255, c02fh2.da_info) + c02fh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FH c02fh) {
        }
    };
    public String da_info;
    public String name;
    public C02YY specification_link;
    public String value;

    public C02FH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
