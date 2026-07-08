package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HU extends Message<C02HU, C575702Mh> {
    public static final ProtoAdapter<C02HU> ADAPTER = new ProtoAdapter<C02HU>() { // from class: X.02HV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HU decode(ProtoReader protoReader) {
            C02HU c02hu = new C02HU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02hu.unavailable_info = C02HX.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02hu.unavailable_info_id = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HU c02hu) {
            C02HU c02hu2 = c02hu;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02hu2.unavailable_info_id) + C02HX.ADAPTER.encodedSizeWithTag(2, c02hu2.unavailable_info) + c02hu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02HU c02hu) {
        }
    };
    public C02HX unavailable_info;
    public Integer unavailable_info_id;

    public C02HU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C575702Mh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
