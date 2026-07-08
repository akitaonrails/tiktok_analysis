package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEO extends Message<C1CEO, C1CEP> {
    public static final ProtoAdapter<C1CEO> ADAPTER = new ProtoAdapter<C1CEO>() { // from class: X.1CEN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEO decode(ProtoReader protoReader) {
            C1CEO c1ceo = new C1CEO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1ceo.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1ceo.max_line = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1ceo.show_fold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c1ceo.margin = C1CEL.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1ceo.once = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c1ceo.gap = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c1ceo.items.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            c1ceo.padding = C1CEL.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ceo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CEO c1ceo) {
            C1CEO c1ceo2 = c1ceo;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1ceo2.type) + protoAdapter.encodedSizeWithTag(2, c1ceo2.max_line);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1ceo2.show_fold);
            ProtoAdapter<C1CEL> protoAdapter3 = C1CEL.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c1ceo2.margin) + protoAdapter2.encodedSizeWithTag(5, c1ceo2.once) + protoAdapter.encodedSizeWithTag(6, c1ceo2.gap) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, c1ceo2.items) + protoAdapter3.encodedSizeWithTag(8, c1ceo2.padding) + c1ceo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CEO c1ceo) {
        }
    };
    public Integer gap;
    public List<String> items;
    public C1CEL margin;
    public Integer max_line;
    public Boolean once;
    public C1CEL padding;
    public Boolean show_fold;
    public Integer type;

    public C1CEO() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1CEP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
