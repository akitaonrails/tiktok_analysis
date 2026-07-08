package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C4 extends Message<C02C4, C02LF> {
    public static final ProtoAdapter<C02C4> ADAPTER = new ProtoAdapter<C02C4>() { // from class: X.024r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C4 decode(ProtoReader protoReader) {
            C02C4 c02c4 = new C02C4();
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
                                        c02c4.repost_bubble_timing = C02FW.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02c4.repost_initiate_score = ProtoAdapter.FLOAT.decode(protoReader);
                                }
                            } else {
                                c02c4.repost_initiate_predict = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02c4.friends_recall_info = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02c4.user_upvoted = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C4 c02c4) {
            C02C4 c02c42 = c02c4;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c02c42.user_upvoted) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02c42.friends_recall_info) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02c42.repost_initiate_predict) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, c02c42.repost_initiate_score) + C02FW.ADAPTER.encodedSizeWithTag(5, c02c42.repost_bubble_timing) + c02c42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02C4 c02c4) {
            C02C4 c02c42 = c02c4;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02c42.user_upvoted);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c02c42.friends_recall_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02c42.repost_initiate_predict);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, c02c42.repost_initiate_score);
            C02FW.ADAPTER.encodeWithTag(protoWriter, 5, c02c42.repost_bubble_timing);
            protoWriter.writeBytes(c02c42.unknownFields());
        }
    };
    public String friends_recall_info;
    public C02FW repost_bubble_timing;
    public Integer repost_initiate_predict;
    public Float repost_initiate_score;
    public Boolean user_upvoted;

    public C02C4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
