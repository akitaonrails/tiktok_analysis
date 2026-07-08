package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.029t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5431029t extends Message<C5431029t, C02NH> {
    public static final ProtoAdapter<C5431029t> ADAPTER = new ProtoAdapter<C5431029t>() { // from class: X.029s
        public final ProtoAdapter<Map<String, C5432029u>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C5432029u.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5431029t decode(ProtoReader protoReader) {
            C5431029t c5431029t = new C5431029t();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5431029t.template = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5431029t.arguments.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 3:
                            c5431029t.text_attribute = C5428029q.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5431029t.wrapper_attribute = C1CEO.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5431029t.extra_info = C648402fy.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5431029t.text_alignment = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5431029t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5431029t c5431029t) {
            C5431029t c5431029t2 = c5431029t;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c5431029t2.template) + this.LIZ.encodedSizeWithTag(2, c5431029t2.arguments) + C5428029q.ADAPTER.encodedSizeWithTag(3, c5431029t2.text_attribute) + C1CEO.ADAPTER.encodedSizeWithTag(4, c5431029t2.wrapper_attribute) + C648402fy.ADAPTER.encodedSizeWithTag(5, c5431029t2.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(6, c5431029t2.text_alignment) + c5431029t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5431029t c5431029t) {
        }
    };
    public Map<String, C5432029u> arguments;
    public C648402fy extra_info;
    public String template;
    public Integer text_alignment;
    public C5428029q text_attribute;
    public C1CEO wrapper_attribute;

    @Override // com.squareup.wire.Message
    public C02NH newBuilder() {
        return null;
    }

    public C5431029t() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
