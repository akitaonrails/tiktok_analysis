package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5420029i extends Message<C5420029i, C02LR> {
    public static final ProtoAdapter<C5420029i> ADAPTER = new ProtoAdapter<C5420029i>() { // from class: X.024Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5420029i decode(ProtoReader protoReader) {
            C5420029i c5420029i = new C5420029i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5420029i.vote_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c5420029i.ref_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c5420029i.ref_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c5420029i.question = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5420029i.options.add(C02F3.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c5420029i.select_option_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5420029i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5420029i c5420029i) {
            C5420029i c5420029i2 = c5420029i;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c5420029i2.vote_id) + protoAdapter.encodedSizeWithTag(2, c5420029i2.ref_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, c5420029i2.ref_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, c5420029i2.question) + C02F3.ADAPTER.asRepeated().encodedSizeWithTag(5, c5420029i2.options) + protoAdapter.encodedSizeWithTag(6, c5420029i2.select_option_id) + c5420029i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5420029i c5420029i) {
            C5420029i c5420029i2 = c5420029i;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c5420029i2.vote_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c5420029i2.ref_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c5420029i2.ref_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c5420029i2.question);
            C02F3.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c5420029i2.options);
            protoAdapter.encodeWithTag(protoWriter, 6, c5420029i2.select_option_id);
            protoWriter.writeBytes(c5420029i2.unknownFields());
        }
    };
    public List<C02F3> options;
    public String question;
    public Long ref_id;
    public Integer ref_type;
    public Long select_option_id;
    public Long vote_id;

    public C5420029i() {
        super(ADAPTER, ByteString.EMPTY);
        this.options = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
