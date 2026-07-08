package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02e7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C636902e7 extends Message<C636902e7, C637002e8> {
    public static final ProtoAdapter<C636902e7> ADAPTER = new ProtoAdapter<C636902e7>() { // from class: X.02e6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C636902e7 decode(ProtoReader protoReader) {
            C636902e7 c636902e7 = new C636902e7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c636902e7.chain_param = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c636902e7.track_param = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c636902e7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C636902e7 c636902e7) {
            C636902e7 c636902e72 = c636902e7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c636902e72.track_param) + protoAdapter.encodedSizeWithTag(2, c636902e72.chain_param) + c636902e72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C636902e7 c636902e7) {
            C636902e7 c636902e72 = c636902e7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c636902e72.track_param);
            protoAdapter.encodeWithTag(protoWriter, 2, c636902e72.chain_param);
            protoWriter.writeBytes(c636902e72.unknownFields());
        }
    };
    public String chain_param;
    public String track_param;

    public C636902e7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C637002e8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
