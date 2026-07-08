package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554602Ee extends Message<C554602Ee, C02QR> {
    public static final ProtoAdapter<C554602Ee> ADAPTER = new ProtoAdapter<C554602Ee>() { // from class: X.02Ef
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554602Ee decode(ProtoReader protoReader) {
            C554602Ee c554602Ee = new C554602Ee();
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
                                    c554602Ee.carousel_stay_time = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c554602Ee.first_carousel_show_period = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c554602Ee.carousel_show_period = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c554602Ee.carousel_content.add(C555802Eq.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554602Ee;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554602Ee c554602Ee) {
            C554602Ee c554602Ee2 = c554602Ee;
            int iEncodedSizeWithTag = C555802Eq.ADAPTER.asRepeated().encodedSizeWithTag(1, c554602Ee2.carousel_content);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c554602Ee2.carousel_show_period) + protoAdapter.encodedSizeWithTag(3, c554602Ee2.first_carousel_show_period) + protoAdapter.encodedSizeWithTag(4, c554602Ee2.carousel_stay_time) + c554602Ee2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C554602Ee c554602Ee) {
        }
    };
    public List<C555802Eq> carousel_content;
    public Integer carousel_show_period;
    public Integer carousel_stay_time;
    public Integer first_carousel_show_period;

    public C554602Ee() {
        super(ADAPTER, ByteString.EMPTY);
        this.carousel_content = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
