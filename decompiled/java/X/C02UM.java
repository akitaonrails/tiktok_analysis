package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02UM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02UM extends Message<C02UM, C02UN> {
    public static final ProtoAdapter<C02UM> ADAPTER = new ProtoAdapter<C02UM>() { // from class: X.02UL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02UM decode(ProtoReader protoReader) {
            C02UM c02um = new C02UM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02um.height = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02um.width = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02um.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02um;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02UM c02um) {
            C02UM c02um2 = c02um;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c02um2.url_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02um2.width) + protoAdapter.encodedSizeWithTag(3, c02um2.height) + c02um2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02UM c02um) {
            C02UM c02um2 = c02um;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c02um2.url_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c02um2.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c02um2.height);
            protoWriter.writeBytes(c02um2.unknownFields());
        }
    };
    public Integer height;
    public List<String> url_list;
    public Integer width;

    public C02UM() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02UN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
