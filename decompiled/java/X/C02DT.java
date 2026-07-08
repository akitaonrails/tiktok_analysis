package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DT extends Message<C02DT, C02L1> {
    public static final ProtoAdapter<C02DT> ADAPTER = new ProtoAdapter<C02DT>() { // from class: X.026q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DT decode(ProtoReader protoReader) {
            C02DT c02dt = new C02DT();
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
                                        c02dt.blur_like_action = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02dt.blur_comment_action = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02dt.disable_reaction = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02dt.disable_comment = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02dt.disable_like = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DT c02dt) {
            C02DT c02dt2 = c02dt;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02dt2.disable_like) + protoAdapter.encodedSizeWithTag(2, c02dt2.disable_comment) + protoAdapter.encodedSizeWithTag(3, c02dt2.disable_reaction);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02dt2.blur_comment_action) + protoAdapter2.encodedSizeWithTag(5, c02dt2.blur_like_action) + c02dt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DT c02dt) {
            C02DT c02dt2 = c02dt;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c02dt2.disable_like);
            protoAdapter.encodeWithTag(protoWriter, 2, c02dt2.disable_comment);
            protoAdapter.encodeWithTag(protoWriter, 3, c02dt2.disable_reaction);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02dt2.blur_comment_action);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02dt2.blur_like_action);
            protoWriter.writeBytes(c02dt2.unknownFields());
        }
    };
    public Integer blur_comment_action;
    public Integer blur_like_action;
    public Boolean disable_comment;
    public Boolean disable_like;
    public Boolean disable_reaction;

    public C02DT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02L1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
