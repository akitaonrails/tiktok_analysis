package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C616502ap extends Message<C616502ap, C616602aq> {
    public static final ProtoAdapter<C616502ap> ADAPTER = new ProtoAdapter<C616502ap>() { // from class: X.02ao
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C616502ap decode(ProtoReader protoReader) {
            C616502ap c616502ap = new C616502ap();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c616502ap.latest_unread_video_created_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c616502ap.unread_count = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c616502ap;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C616502ap c616502ap) {
            C616502ap c616502ap2 = c616502ap;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c616502ap2.unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(2, c616502ap2.latest_unread_video_created_time) + c616502ap2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C616502ap c616502ap) {
            C616502ap c616502ap2 = c616502ap;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c616502ap2.unread_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c616502ap2.latest_unread_video_created_time);
            protoWriter.writeBytes(c616502ap2.unknownFields());
        }
    };
    public Long latest_unread_video_created_time;
    public Integer unread_count;

    public C616502ap() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C616602aq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
