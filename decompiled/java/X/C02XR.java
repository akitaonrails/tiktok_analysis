package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02XR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02XR extends Message<C02XR, C02XS> {
    public static final ProtoAdapter<C02XR> ADAPTER = new ProtoAdapter<C02XR>() { // from class: X.02XQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02XR decode(ProtoReader protoReader) {
            C02XR c02xr = new C02XR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02xr.countdown_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02xr.end_time = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02xr.start_time = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02xr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02XR c02xr) {
            C02XR c02xr2 = c02xr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02xr2.start_time) + protoAdapter.encodedSizeWithTag(2, c02xr2.end_time) + protoAdapter.encodedSizeWithTag(3, c02xr2.countdown_text) + c02xr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02XR c02xr) {
        }
    };
    public String countdown_text;
    public String end_time;
    public String start_time;

    public C02XR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02XS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
