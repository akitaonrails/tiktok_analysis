package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C635102dp extends Message<C635102dp, C635202dq> {
    public static final ProtoAdapter<C635102dp> ADAPTER = new ProtoAdapter<C635102dp>() { // from class: X.02do
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C635102dp decode(ProtoReader protoReader) {
            C635102dp c635102dp = new C635102dp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c635102dp.business_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c635102dp.component_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c635102dp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C635102dp c635102dp) {
            C635102dp c635102dp2 = c635102dp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c635102dp2.component_key) + protoAdapter.encodedSizeWithTag(2, c635102dp2.business_id) + c635102dp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C635102dp c635102dp) {
            C635102dp c635102dp2 = c635102dp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c635102dp2.component_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c635102dp2.business_id);
            protoWriter.writeBytes(c635102dp2.unknownFields());
        }
    };
    public String business_id;
    public String component_key;

    public C635102dp() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C635202dq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
