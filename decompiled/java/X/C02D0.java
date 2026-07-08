package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D0 extends Message<C02D0, C02QB> {
    public static final ProtoAdapter<C02D0> ADAPTER = new ProtoAdapter<C02D0>() { // from class: X.02D1
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D0 decode(ProtoReader protoReader) {
            C02D0 c02d0 = new C02D0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02d0.fulfilled_by = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02d0.popup = C613202aI.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02d0.arguments.putAll(this.LIZ.decode(protoReader));
                            }
                        } else {
                            c02d0.template = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02d0.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D0 c02d0) {
            C02D0 c02d02 = c02d0;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c02d02.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02d02.template) + this.LIZ.encodedSizeWithTag(3, c02d02.arguments) + C613202aI.ADAPTER.encodedSizeWithTag(4, c02d02.popup) + protoAdapter.encodedSizeWithTag(5, c02d02.fulfilled_by) + c02d02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02D0 c02d0) {
        }
    };
    public Map<String, String> arguments;
    public String fulfilled_by;
    public C029C icon;
    public C613202aI popup;
    public String template;

    @Override // com.squareup.wire.Message
    public C02QB newBuilder() {
        return null;
    }

    public C02D0() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
