package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547202Bi extends Message<C547202Bi, C02QV> {
    public static final ProtoAdapter<C547202Bi> ADAPTER = new ProtoAdapter<C547202Bi>() { // from class: X.027f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547202Bi decode(ProtoReader protoReader) {
            C547202Bi c547202Bi = new C547202Bi();
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
                                    c547202Bi.carousel_stay_time = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c547202Bi.first_carousel_show_period = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c547202Bi.carousel_show_period = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c547202Bi.right_details.add(C5220021q.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547202Bi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547202Bi c547202Bi) {
            C547202Bi c547202Bi2 = c547202Bi;
            int iEncodedSizeWithTag = C5220021q.ADAPTER.asRepeated().encodedSizeWithTag(1, c547202Bi2.right_details);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c547202Bi2.carousel_show_period) + protoAdapter.encodedSizeWithTag(3, c547202Bi2.first_carousel_show_period) + protoAdapter.encodedSizeWithTag(4, c547202Bi2.carousel_stay_time) + c547202Bi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C547202Bi c547202Bi) {
        }
    };
    public Integer carousel_show_period;
    public Integer carousel_stay_time;
    public Integer first_carousel_show_period;
    public List<C5220021q> right_details;

    public C547202Bi() {
        super(ADAPTER, ByteString.EMPTY);
        this.right_details = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
