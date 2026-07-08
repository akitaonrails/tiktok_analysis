package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CQ extends Message<C02CQ, C02M7> {
    public static final ProtoAdapter<C02CQ> ADAPTER = new ProtoAdapter<C02CQ>() { // from class: X.025V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CQ decode(ProtoReader protoReader) {
            C02CQ c02cq = new C02CQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cq.emoji_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02cq.prompt_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02cq.android_ver = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02cq.ios_ver = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02cq.user_slider_value = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02cq.answer_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c02cq.answer_avg = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CQ c02cq) {
            C02CQ c02cq2 = c02cq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02cq2.emoji_content) + protoAdapter.encodedSizeWithTag(2, c02cq2.prompt_text) + protoAdapter.encodedSizeWithTag(3, c02cq2.android_ver) + protoAdapter.encodedSizeWithTag(4, c02cq2.ios_ver) + ProtoAdapter.INT32.encodedSizeWithTag(5, c02cq2.user_slider_value);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c02cq2.answer_count) + protoAdapter2.encodedSizeWithTag(7, c02cq2.answer_avg) + c02cq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CQ c02cq) {
            C02CQ c02cq2 = c02cq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cq2.emoji_content);
            protoAdapter.encodeWithTag(protoWriter, 2, c02cq2.prompt_text);
            protoAdapter.encodeWithTag(protoWriter, 3, c02cq2.android_ver);
            protoAdapter.encodeWithTag(protoWriter, 4, c02cq2.ios_ver);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c02cq2.user_slider_value);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 6, c02cq2.answer_count);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02cq2.answer_avg);
            protoWriter.writeBytes(c02cq2.unknownFields());
        }
    };
    public String android_ver;
    public Long answer_avg;
    public Long answer_count;
    public String emoji_content;
    public String ios_ver;
    public String prompt_text;
    public Integer user_slider_value;

    public C02CQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02M7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
