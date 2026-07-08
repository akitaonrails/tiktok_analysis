package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556302Ev extends Message<C556302Ev, C02KK> {
    public static final ProtoAdapter<C556302Ev> ADAPTER = new ProtoAdapter<C556302Ev>() { // from class: X.028a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556302Ev decode(ProtoReader protoReader) {
            C556302Ev c556302Ev = new C556302Ev();
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
                                    c556302Ev.friend_type_str = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c556302Ev.rec_type = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c556302Ev.relation_text_key = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c556302Ev.recommend_type = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556302Ev;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556302Ev c556302Ev) {
            C556302Ev c556302Ev2 = c556302Ev;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c556302Ev2.recommend_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c556302Ev2.relation_text_key) + protoAdapter.encodedSizeWithTag(3, c556302Ev2.rec_type) + protoAdapter.encodedSizeWithTag(4, c556302Ev2.friend_type_str) + c556302Ev2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556302Ev c556302Ev) {
            C556302Ev c556302Ev2 = c556302Ev;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c556302Ev2.recommend_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c556302Ev2.relation_text_key);
            protoAdapter.encodeWithTag(protoWriter, 3, c556302Ev2.rec_type);
            protoAdapter.encodeWithTag(protoWriter, 4, c556302Ev2.friend_type_str);
            protoWriter.writeBytes(c556302Ev2.unknownFields());
        }
    };
    public String friend_type_str;
    public String rec_type;
    public Long recommend_type;
    public String relation_text_key;

    public C556302Ev() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
