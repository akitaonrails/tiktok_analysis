package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WN extends Message<C02WN, C02WO> {
    public static final ProtoAdapter<C02WN> ADAPTER = new ProtoAdapter<C02WN>() { // from class: X.02WM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WN decode(ProtoReader protoReader) {
            C02WN c02wn = new C02WN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02wn.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02wn.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02wn.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02wn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WN c02wn) {
            C02WN c02wn2 = c02wn;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c02wn2.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02wn2.title) + protoAdapter.encodedSizeWithTag(3, c02wn2.sub_title) + c02wn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02WN c02wn) {
        }
    };
    public C029C icon;
    public String sub_title;
    public String title;

    public C02WN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
