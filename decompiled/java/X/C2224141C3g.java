package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224141C3g extends Message<C2224141C3g, C2224151C3h> {
    public static final ProtoAdapter<C2224141C3g> ADAPTER = new ProtoAdapter<C2224141C3g>() { // from class: X.1C3f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224141C3g decode(ProtoReader protoReader) {
            C2224141C3g c2224141C3g = new C2224141C3g();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2224141C3g.signal_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c2224141C3g.signal_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2224141C3g.string_value = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2224141C3g.string_value_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            c2224141C3g.int_value = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2224141C3g.int_value_list.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224141C3g;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224141C3g c2224141C3g) {
            C2224141C3g c2224141C3g2 = c2224141C3g;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c2224141C3g2.signal_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2224141C3g2.signal_name) + protoAdapter.encodedSizeWithTag(3, c2224141C3g2.string_value) + protoAdapter.asRepeated().encodedSizeWithTag(4, c2224141C3g2.string_value_list);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, c2224141C3g2.int_value) + protoAdapter2.asRepeated().encodedSizeWithTag(6, c2224141C3g2.int_value_list) + c2224141C3g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224141C3g c2224141C3g) {
            C2224141C3g c2224141C3g2 = c2224141C3g;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c2224141C3g2.signal_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c2224141C3g2.signal_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c2224141C3g2.string_value);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, c2224141C3g2.string_value_list);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 5, c2224141C3g2.int_value);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, c2224141C3g2.int_value_list);
            protoWriter.writeBytes(c2224141C3g2.unknownFields());
        }
    };
    public Long int_value;
    public List<Long> int_value_list;
    public String signal_name;
    public Integer signal_type;
    public String string_value;
    public List<String> string_value_list;

    public C2224141C3g() {
        super(ADAPTER, ByteString.EMPTY);
        this.string_value_list = C1516540pZE.LJIIIIZZ();
        this.int_value_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2224151C3h newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
