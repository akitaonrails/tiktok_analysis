package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02W5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02W5 extends Message<C02W5, C02W6> {
    public static final ProtoAdapter<C02W5> ADAPTER = new ProtoAdapter<C02W5>() { // from class: X.02W4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02W5 decode(ProtoReader protoReader) {
            C02W5 c02w5 = new C02W5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02w5.tag_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02w5.related_tag = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02w5.content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02w5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02W5 c02w5) {
            C02W5 c02w52 = c02w5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02w52.content) + protoAdapter.encodedSizeWithTag(2, c02w52.related_tag) + protoAdapter.encodedSizeWithTag(3, c02w52.tag_name) + c02w52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02W5 c02w5) {
            C02W5 c02w52 = c02w5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02w52.content);
            protoAdapter.encodeWithTag(protoWriter, 2, c02w52.related_tag);
            protoAdapter.encodeWithTag(protoWriter, 3, c02w52.tag_name);
            protoWriter.writeBytes(c02w52.unknownFields());
        }
    };
    public String content;
    public String related_tag;
    public String tag_name;

    public C02W5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02W6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
