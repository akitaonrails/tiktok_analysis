package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CA extends Message<C02CA, C583202Pe> {
    public static final ProtoAdapter<C02CA> ADAPTER = new ProtoAdapter<C02CA>() { // from class: X.02C9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CA decode(ProtoReader protoReader) {
            C02CA c02ca = new C02CA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02ca.stay_time = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02ca.start_to_show_time = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02ca.dynamic_selling_points.add(C02C8.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ca;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CA c02ca) {
            C02CA c02ca2 = c02ca;
            int iEncodedSizeWithTag = C02C8.ADAPTER.asRepeated().encodedSizeWithTag(1, c02ca2.dynamic_selling_points);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ca2.start_to_show_time) + protoAdapter.encodedSizeWithTag(3, c02ca2.stay_time) + c02ca2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CA c02ca) {
        }
    };
    public List<C02C8> dynamic_selling_points;
    public Integer start_to_show_time;
    public Integer stay_time;

    public C02CA() {
        super(ADAPTER, ByteString.EMPTY);
        this.dynamic_selling_points = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C583202Pe newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
