package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C614102aR extends Message<C614102aR, C614202aS> {
    public static final ProtoAdapter<C614102aR> ADAPTER = new ProtoAdapter<C614102aR>() { // from class: X.02aQ
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C614102aR decode(ProtoReader protoReader) {
            C614102aR c614102aR = new C614102aR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c614102aR.extra.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c614102aR.plan_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c614102aR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C614102aR c614102aR) {
            C614102aR c614102aR2 = c614102aR;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c614102aR2.plan_id) + this.LIZ.encodedSizeWithTag(2, c614102aR2.extra) + c614102aR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C614102aR c614102aR) {
        }
    };
    public Map<String, String> extra;
    public String plan_id;

    @Override // com.squareup.wire.Message
    public C614202aS newBuilder() {
        return null;
    }

    public C614102aR() {
        super(ADAPTER, ByteString.EMPTY);
        this.extra = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
