package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C694402nO extends Message<C694402nO, C694302nN> {
    public static final ProtoAdapter<C694402nO> ADAPTER = new ProtoAdapter<C694402nO>() { // from class: X.02nP
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C694402nO decode(ProtoReader protoReader) {
            C694402nO c694402nO = new C694402nO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c694402nO.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c694402nO.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c694402nO.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c694402nO.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c694402nO.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c694402nO.da_info.putAll(this.LIZ.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c694402nO;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C694402nO c694402nO) {
            C694402nO c694402nO2 = c694402nO;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c694402nO2.text) + protoAdapter.encodedSizeWithTag(2, c694402nO2.name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c694402nO2.style) + C029C.ADAPTER.encodedSizeWithTag(4, c694402nO2.icon) + protoAdapter2.encodedSizeWithTag(5, c694402nO2.type) + this.LIZ.encodedSizeWithTag(6, c694402nO2.da_info) + c694402nO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C694402nO c694402nO) {
        }
    };
    public Map<String, String> da_info;
    public C029C icon;
    public String name;
    public Integer style;
    public String text;
    public Integer type;

    @Override // com.squareup.wire.Message
    public C694302nN newBuilder() {
        return null;
    }

    public C694402nO() {
        super(ADAPTER, ByteString.EMPTY);
        this.da_info = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
