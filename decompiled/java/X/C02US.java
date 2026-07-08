package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02US, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02US extends Message<C02US, C02UT> {
    public static final ProtoAdapter<C02US> ADAPTER = new ProtoAdapter<C02US>() { // from class: X.02UR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02US decode(ProtoReader protoReader) {
            C02US c02us = new C02US();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02us.topic_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02us.topic_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02us.topic_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02us;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02US c02us) {
            C02US c02us2 = c02us;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c02us2.topic_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02us2.topic_text) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02us2.topic_type) + c02us2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02US c02us) {
            C02US c02us2 = c02us;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02us2.topic_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c02us2.topic_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02us2.topic_type);
            protoWriter.writeBytes(c02us2.unknownFields());
        }
    };
    public Long topic_id;
    public String topic_text;
    public Integer topic_type;

    public C02US() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02UT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
