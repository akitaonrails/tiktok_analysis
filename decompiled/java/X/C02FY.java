package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FY extends Message<C02FY, C577002Mu> {
    public static final ProtoAdapter<C02FY> ADAPTER = new ProtoAdapter<C02FY>() { // from class: X.02AB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FY decode(ProtoReader protoReader) {
            C02FY c02fy = new C02FY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02fy.window_sec = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02fy.limit = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FY c02fy) {
            C02FY c02fy2 = c02fy;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02fy2.limit) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02fy2.window_sec) + c02fy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FY c02fy) {
        }
    };
    public Integer limit;
    public Long window_sec;

    public C02FY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C577002Mu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
