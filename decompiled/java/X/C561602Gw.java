package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561602Gw extends Message<C561602Gw, C02Q6> {
    public static final ProtoAdapter<C561602Gw> ADAPTER = new ProtoAdapter<C561602Gw>() { // from class: X.02An
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561602Gw decode(ProtoReader protoReader) {
            C561602Gw c561602Gw = new C561602Gw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c561602Gw.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c561602Gw.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561602Gw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561602Gw c561602Gw) {
            C561602Gw c561602Gw2 = c561602Gw;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c561602Gw2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c561602Gw2.text) + c561602Gw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561602Gw c561602Gw) {
        }
    };
    public String text;
    public Integer type;

    public C561602Gw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Q6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
