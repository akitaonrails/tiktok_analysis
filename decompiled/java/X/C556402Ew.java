package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556402Ew extends Message<C556402Ew, C570002Kc> {
    public static final ProtoAdapter<C556402Ew> ADAPTER = new ProtoAdapter<C556402Ew>() { // from class: X.028c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556402Ew decode(ProtoReader protoReader) {
            C556402Ew c556402Ew = new C556402Ew();
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
                                    c556402Ew.word_record = C02EP.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c556402Ew.info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c556402Ew.word_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c556402Ew.word = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556402Ew;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556402Ew c556402Ew) {
            C556402Ew c556402Ew2 = c556402Ew;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c556402Ew2.word) + protoAdapter.encodedSizeWithTag(2, c556402Ew2.word_id) + protoAdapter.encodedSizeWithTag(3, c556402Ew2.info) + C02EP.ADAPTER.encodedSizeWithTag(4, c556402Ew2.word_record) + c556402Ew2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556402Ew c556402Ew) {
            C556402Ew c556402Ew2 = c556402Ew;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c556402Ew2.word);
            protoAdapter.encodeWithTag(protoWriter, 2, c556402Ew2.word_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c556402Ew2.info);
            C02EP.ADAPTER.encodeWithTag(protoWriter, 4, c556402Ew2.word_record);
            protoWriter.writeBytes(c556402Ew2.unknownFields());
        }
    };
    public String info;
    public String word;
    public String word_id;
    public C02EP word_record;

    public C556402Ew() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C570002Kc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
