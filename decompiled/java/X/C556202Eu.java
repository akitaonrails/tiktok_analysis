package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556202Eu extends Message<C556202Eu, C569302Jv> {
    public static final ProtoAdapter<C556202Eu> ADAPTER = new ProtoAdapter<C556202Eu>() { // from class: X.028Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556202Eu decode(ProtoReader protoReader) {
            C556202Eu c556202Eu = new C556202Eu();
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
                                    c556202Eu.feed_mall_button_score = ProtoAdapter.FLOAT.decode(protoReader);
                                }
                            } else {
                                c556202Eu.mall_words_click = ProtoAdapter.FLOAT.decode(protoReader);
                            }
                        } else {
                            c556202Eu.mall_words_show = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c556202Eu.video_search_rec_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556202Eu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556202Eu c556202Eu) {
            C556202Eu c556202Eu2 = c556202Eu;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c556202Eu2.video_search_rec_info);
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c556202Eu2.mall_words_show) + protoAdapter.encodedSizeWithTag(3, c556202Eu2.mall_words_click) + protoAdapter.encodedSizeWithTag(4, c556202Eu2.feed_mall_button_score) + c556202Eu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556202Eu c556202Eu) {
            C556202Eu c556202Eu2 = c556202Eu;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c556202Eu2.video_search_rec_info);
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(protoWriter, 2, c556202Eu2.mall_words_show);
            protoAdapter.encodeWithTag(protoWriter, 3, c556202Eu2.mall_words_click);
            protoAdapter.encodeWithTag(protoWriter, 4, c556202Eu2.feed_mall_button_score);
            protoWriter.writeBytes(c556202Eu2.unknownFields());
        }
    };
    public Float feed_mall_button_score;
    public Float mall_words_click;
    public Float mall_words_show;
    public String video_search_rec_info;

    public C556202Eu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C569302Jv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
