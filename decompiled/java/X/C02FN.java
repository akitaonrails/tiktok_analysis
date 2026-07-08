package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FN extends Message<C02FN, C568102Jj> {
    public static final ProtoAdapter<C02FN> ADAPTER = new ProtoAdapter<C02FN>() { // from class: X.029Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FN decode(ProtoReader protoReader) {
            C02FN c02fn = new C02FN();
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
                                        c02fn.style_image_url = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02fn.model_key = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fn.model_prompt = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fn.prompt_type = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fn.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FN c02fn) {
            C02FN c02fn2 = c02fn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fn2.text) + protoAdapter.encodedSizeWithTag(2, c02fn2.prompt_type) + protoAdapter.encodedSizeWithTag(3, c02fn2.model_prompt) + protoAdapter.encodedSizeWithTag(4, c02fn2.model_key) + protoAdapter.encodedSizeWithTag(5, c02fn2.style_image_url) + c02fn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FN c02fn) {
            C02FN c02fn2 = c02fn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02fn2.text);
            protoAdapter.encodeWithTag(protoWriter, 2, c02fn2.prompt_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c02fn2.model_prompt);
            protoAdapter.encodeWithTag(protoWriter, 4, c02fn2.model_key);
            protoAdapter.encodeWithTag(protoWriter, 5, c02fn2.style_image_url);
            protoWriter.writeBytes(c02fn2.unknownFields());
        }
    };
    public String model_key;
    public String model_prompt;
    public String prompt_type;
    public String style_image_url;
    public String text;

    public C02FN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C568102Jj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
