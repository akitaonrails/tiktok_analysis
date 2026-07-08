package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C637202eA extends Message<C637202eA, C637302eB> {
    public static final ProtoAdapter<C637202eA> ADAPTER = new ProtoAdapter<C637202eA>() { // from class: X.02e9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C637202eA decode(ProtoReader protoReader) {
            C637202eA c637202eA = new C637202eA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c637202eA.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c637202eA.bg_color = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c637202eA;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C637202eA c637202eA) {
            C637202eA c637202eA2 = c637202eA;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c637202eA2.bg_color) + protoAdapter.encodedSizeWithTag(2, c637202eA2.text) + c637202eA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C637202eA c637202eA) {
            C637202eA c637202eA2 = c637202eA;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c637202eA2.bg_color);
            protoAdapter.encodeWithTag(protoWriter, 2, c637202eA2.text);
            protoWriter.writeBytes(c637202eA2.unknownFields());
        }
    };
    public String bg_color;
    public String text;

    public C637202eA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C637302eB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
