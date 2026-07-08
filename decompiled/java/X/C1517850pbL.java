package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517850pbL extends Message<C1517850pbL, C1517860pbM> {
    public static final ProtoAdapter<C1517850pbL> ADAPTER = new ProtoAdapter<C1517850pbL>() { // from class: X.0pbK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517850pbL decode(ProtoReader protoReader) {
            C1517850pbL c1517850pbL = new C1517850pbL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1517850pbL.login_platform = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1517850pbL.login_type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517850pbL;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517850pbL c1517850pbL) {
            C1517850pbL c1517850pbL2 = c1517850pbL;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1517850pbL2.login_type) + protoAdapter.encodedSizeWithTag(2, c1517850pbL2.login_platform) + c1517850pbL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517850pbL c1517850pbL) {
            C1517850pbL c1517850pbL2 = c1517850pbL;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1517850pbL2.login_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c1517850pbL2.login_platform);
            protoWriter.writeBytes(c1517850pbL2.unknownFields());
        }
    };
    public String login_platform;
    public String login_type;

    @Override // com.squareup.wire.Message
    public C1517860pbM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1517850pbL(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C1517850pbL(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.login_type = str;
        this.login_platform = str2;
    }
}
