package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C638102eJ extends Message<C638102eJ, C638202eK> {
    public static final ProtoAdapter<C638102eJ> ADAPTER = new ProtoAdapter<C638102eJ>() { // from class: X.02eI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C638102eJ decode(ProtoReader protoReader) {
            C638102eJ c638102eJ = new C638102eJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c638102eJ.business_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c638102eJ.component_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c638102eJ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C638102eJ c638102eJ) {
            C638102eJ c638102eJ2 = c638102eJ;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c638102eJ2.component_key) + protoAdapter.encodedSizeWithTag(2, c638102eJ2.business_id) + c638102eJ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C638102eJ c638102eJ) {
            C638102eJ c638102eJ2 = c638102eJ;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c638102eJ2.component_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c638102eJ2.business_id);
            protoWriter.writeBytes(c638102eJ2.unknownFields());
        }
    };
    public String business_id;
    public String component_key;

    public C638102eJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C638202eK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
