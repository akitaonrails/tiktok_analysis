package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B3 extends Message<C02B3, C581902Or> {
    public static final ProtoAdapter<C02B3> ADAPTER = new ProtoAdapter<C02B3>() { // from class: X.0256
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B3 decode(ProtoReader protoReader) {
            C02B3 c02b3 = new C02B3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 5) {
                                    if (iNextTag != 7) {
                                        if (iNextTag != 200) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c02b3.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c02b3.extra.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c02b3.schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02b3.button_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02b3.content = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02b3.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B3 c02b3) {
            C02B3 c02b32 = c02b3;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02b32.title) + protoAdapter.encodedSizeWithTag(2, c02b32.content);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02b32.button_text) + protoAdapter2.encodedSizeWithTag(5, c02b32.schema) + this.LIZ.encodedSizeWithTag(7, c02b32.extra) + protoAdapter2.encodedSizeWithTag(200, c02b32.da_info) + c02b32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02B3 c02b3) {
        }
    };
    public String button_text;
    public C5431029t content;
    public String da_info;
    public Map<String, String> extra;
    public String schema;
    public C5431029t title;

    @Override // com.squareup.wire.Message
    public C581902Or newBuilder() {
        return null;
    }

    public C02B3() {
        super(ADAPTER, ByteString.EMPTY);
        this.extra = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
