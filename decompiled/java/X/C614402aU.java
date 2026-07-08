package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C614402aU extends Message<C614402aU, C614502aV> {
    public static final ProtoAdapter<C614402aU> ADAPTER = new ProtoAdapter<C614402aU>() { // from class: X.02aT
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C614402aU decode(ProtoReader protoReader) {
            C614402aU c614402aU = new C614402aU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c614402aU.arguments.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c614402aU.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c614402aU;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C614402aU c614402aU) {
            C614402aU c614402aU2 = c614402aU;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c614402aU2.text) + this.LIZ.encodedSizeWithTag(2, c614402aU2.arguments) + c614402aU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C614402aU c614402aU) {
        }
    };
    public Map<String, String> arguments;
    public String text;

    @Override // com.squareup.wire.Message
    public C614502aV newBuilder() {
        return null;
    }

    public C614402aU() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
