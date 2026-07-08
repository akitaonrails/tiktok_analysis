package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C596802Uk extends Message<C596802Uk, C596902Ul> {
    public static final ProtoAdapter<C596802Uk> ADAPTER = new ProtoAdapter<C596802Uk>() { // from class: X.02Uj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C596802Uk decode(ProtoReader protoReader) {
            C596802Uk c596802Uk = new C596802Uk();
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
                                        c596802Uk.creator_guidance_status = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c596802Uk.moderation_creator_segment = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c596802Uk.moderation_user_label_status = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c596802Uk.moderation_overlabel_warning = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c596802Uk.moderation_aigc_label_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c596802Uk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C596802Uk c596802Uk) {
            C596802Uk c596802Uk2 = c596802Uk;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c596802Uk2.moderation_aigc_label_type) + protoAdapter.encodedSizeWithTag(2, c596802Uk2.moderation_overlabel_warning) + protoAdapter.encodedSizeWithTag(3, c596802Uk2.moderation_user_label_status) + ProtoAdapter.STRING.encodedSizeWithTag(4, c596802Uk2.moderation_creator_segment) + protoAdapter.encodedSizeWithTag(5, c596802Uk2.creator_guidance_status) + c596802Uk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C596802Uk c596802Uk) {
            C596802Uk c596802Uk2 = c596802Uk;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c596802Uk2.moderation_aigc_label_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c596802Uk2.moderation_overlabel_warning);
            protoAdapter.encodeWithTag(protoWriter, 3, c596802Uk2.moderation_user_label_status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c596802Uk2.moderation_creator_segment);
            protoAdapter.encodeWithTag(protoWriter, 5, c596802Uk2.creator_guidance_status);
            protoWriter.writeBytes(c596802Uk2.unknownFields());
        }
    };
    public Integer creator_guidance_status;
    public Integer moderation_aigc_label_type;
    public String moderation_creator_segment;
    public Integer moderation_overlabel_warning;
    public Integer moderation_user_label_status;

    public C596802Uk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C596902Ul newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
