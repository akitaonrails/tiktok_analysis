package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561502Gv extends Message<C561502Gv, C584902Pv> {
    public static final ProtoAdapter<C561502Gv> ADAPTER = new ProtoAdapter<C561502Gv>() { // from class: X.02BR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561502Gv decode(ProtoReader protoReader) {
            C561502Gv c561502Gv = new C561502Gv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c561502Gv.logistics_expression_area = C02AS.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c561502Gv.selected_logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561502Gv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561502Gv c561502Gv) {
            C561502Gv c561502Gv2 = c561502Gv;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c561502Gv2.selected_logistics_service_id) + C02AS.ADAPTER.encodedSizeWithTag(2, c561502Gv2.logistics_expression_area) + c561502Gv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561502Gv c561502Gv) {
        }
    };
    public C02AS logistics_expression_area;
    public String selected_logistics_service_id;

    public C561502Gv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C584902Pv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
