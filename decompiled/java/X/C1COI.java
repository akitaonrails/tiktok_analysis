package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COI extends Message<C1COI, C1COJ> {
    public static final ProtoAdapter<C1COI> ADAPTER = new ProtoAdapter<C1COI>() { // from class: X.1COH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1COI decode(ProtoReader protoReader) {
            C1COI c1coi = new C1COI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1coi.data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1coi.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1coi.time_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1coi.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1coi.style = C1COF.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1coi.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1coi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1COI c1coi) {
            C1COI c1coi2 = c1coi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1coi2.data) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1coi2.type) + protoAdapter.encodedSizeWithTag(3, c1coi2.time_format) + protoAdapter.encodedSizeWithTag(4, c1coi2.link) + C1COF.ADAPTER.encodedSizeWithTag(5, c1coi2.style) + protoAdapter.encodedSizeWithTag(6, c1coi2.name) + c1coi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1COI c1coi) {
        }
    };
    public String data;
    public String link;
    public String name;
    public C1COF style;
    public String time_format;
    public Integer type;

    public C1COI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1COJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
