package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C611102Zx extends Message<C611102Zx, C611202Zy> {
    public static final ProtoAdapter<C611102Zx> ADAPTER = new ProtoAdapter<C611102Zx>() { // from class: X.02Zw
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C611102Zx decode(ProtoReader protoReader) {
            C611102Zx c611102Zx = new C611102Zx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c611102Zx.params.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c611102Zx.event_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c611102Zx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C611102Zx c611102Zx) {
            C611102Zx c611102Zx2 = c611102Zx;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c611102Zx2.event_name) + this.LIZ.encodedSizeWithTag(2, c611102Zx2.params) + c611102Zx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C611102Zx c611102Zx) {
            C611102Zx c611102Zx2 = c611102Zx;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c611102Zx2.event_name);
            this.LIZ.encodeWithTag(protoWriter, 2, c611102Zx2.params);
            protoWriter.writeBytes(c611102Zx2.unknownFields());
        }
    };
    public String event_name;
    public Map<String, String> params;

    @Override // com.squareup.wire.Message
    public C611202Zy newBuilder() {
        return null;
    }

    public C611102Zx() {
        super(ADAPTER, ByteString.EMPTY);
        this.params = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
