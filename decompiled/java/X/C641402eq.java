package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C641402eq extends Message<C641402eq, C641502er> {
    public static final ProtoAdapter<C641402eq> ADAPTER = new ProtoAdapter<C641402eq>() { // from class: X.02ep
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C641402eq decode(ProtoReader protoReader) {
            C641402eq c641402eq = new C641402eq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c641402eq.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c641402eq.schema_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c641402eq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C641402eq c641402eq) {
            C641402eq c641402eq2 = c641402eq;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c641402eq2.schema_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c641402eq2.schema) + c641402eq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C641402eq c641402eq) {
        }
    };
    public String schema;
    public Integer schema_type;

    public C641402eq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C641502er newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
