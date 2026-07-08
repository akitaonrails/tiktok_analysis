package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F3 extends Message<C02F3, C02LG> {
    public static final ProtoAdapter<C02F3> ADAPTER = new ProtoAdapter<C02F3>() { // from class: X.027q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F3 decode(ProtoReader protoReader) {
            C02F3 c02f3 = new C02F3();
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
                                    c02f3.option = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02f3.vote_count = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c02f3.option_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02f3.option_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F3 c02f3) {
            C02F3 c02f32 = c02f3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02f32.option_text);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02f32.option_id) + protoAdapter2.encodedSizeWithTag(3, c02f32.vote_count) + protoAdapter.encodedSizeWithTag(4, c02f32.option) + c02f32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02F3 c02f3) {
            C02F3 c02f32 = c02f3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02f32.option_text);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02f32.option_id);
            protoAdapter2.encodeWithTag(protoWriter, 3, c02f32.vote_count);
            protoAdapter.encodeWithTag(protoWriter, 4, c02f32.option);
            protoWriter.writeBytes(c02f32.unknownFields());
        }
    };
    public String option;
    public Long option_id;
    public String option_text;
    public Long vote_count;

    public C02F3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
