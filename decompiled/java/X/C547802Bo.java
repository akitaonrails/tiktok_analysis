package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547802Bo extends Message<C547802Bo, C579202Nq> {
    public static final ProtoAdapter<C547802Bo> ADAPTER = new ProtoAdapter<C547802Bo>() { // from class: X.025X
        public final ProtoAdapter<Map<String, C544002Ac>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C544002Ac.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547802Bo decode(ProtoReader protoReader) {
            C547802Bo c547802Bo = new C547802Bo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c547802Bo.text_dark_color = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c547802Bo.text_color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c547802Bo.arguments.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c547802Bo.template = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547802Bo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547802Bo c547802Bo) {
            C547802Bo c547802Bo2 = c547802Bo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c547802Bo2.template) + this.LIZ.encodedSizeWithTag(2, c547802Bo2.arguments) + protoAdapter.encodedSizeWithTag(3, c547802Bo2.text_color) + protoAdapter.encodedSizeWithTag(4, c547802Bo2.text_dark_color) + c547802Bo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C547802Bo c547802Bo) {
        }
    };
    public Map<String, C544002Ac> arguments;
    public String template;
    public String text_color;
    public String text_dark_color;

    @Override // com.squareup.wire.Message
    public C579202Nq newBuilder() {
        return null;
    }

    public C547802Bo() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
