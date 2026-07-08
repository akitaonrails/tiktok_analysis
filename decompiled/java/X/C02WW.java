package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WW extends Message<C02WW, C02WX> {
    public static final ProtoAdapter<C02WW> ADAPTER = new ProtoAdapter<C02WW>() { // from class: X.02WV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WW decode(ProtoReader protoReader) {
            C02WW c02ww = new C02WW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02ww.popup = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ww.vas_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ww.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ww;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WW c02ww) {
            C02WW c02ww2 = c02ww;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c02ww2.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ww2.vas_name) + protoAdapter.encodedSizeWithTag(3, c02ww2.popup) + c02ww2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02WW c02ww) {
        }
    };
    public C029C icon;
    public String popup;
    public String vas_name;

    public C02WW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
