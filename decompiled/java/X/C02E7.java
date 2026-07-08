package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02E7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02E7 extends Message<C02E7, C02LC> {
    public static final ProtoAdapter<C02E7> ADAPTER = new ProtoAdapter<C02E7>() { // from class: X.026J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02E7 decode(ProtoReader protoReader) {
            C02E7 c02e7 = new C02E7();
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
                                    c02e7.extra_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02e7.rate_score = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c02e7.type = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02e7.candidate_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02e7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02E7 c02e7) {
            C02E7 c02e72 = c02e7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02e72.candidate_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02e72.type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c02e72.rate_score) + protoAdapter.encodedSizeWithTag(4, c02e72.extra_info) + c02e72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02E7 c02e7) {
            C02E7 c02e72 = c02e7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02e72.candidate_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c02e72.type);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, c02e72.rate_score);
            protoAdapter.encodeWithTag(protoWriter, 4, c02e72.extra_info);
            protoWriter.writeBytes(c02e72.unknownFields());
        }
    };
    public String candidate_id;
    public String extra_info;
    public Double rate_score;
    public Long type;

    public C02E7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
