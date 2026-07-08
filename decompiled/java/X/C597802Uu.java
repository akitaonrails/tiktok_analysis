package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C597802Uu extends Message<C597802Uu, C597902Uv> {
    public static final ProtoAdapter<C597802Uu> ADAPTER = new ProtoAdapter<C597802Uu>() { // from class: X.02Ut
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C597802Uu decode(ProtoReader protoReader) {
            C597802Uu c597802Uu = new C597802Uu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c597802Uu.status = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c597802Uu.hashtag_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c597802Uu.hashtag_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c597802Uu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C597802Uu c597802Uu) {
            C597802Uu c597802Uu2 = c597802Uu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c597802Uu2.hashtag_name) + protoAdapter.encodedSizeWithTag(2, c597802Uu2.hashtag_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, c597802Uu2.status) + c597802Uu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C597802Uu c597802Uu) {
            C597802Uu c597802Uu2 = c597802Uu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c597802Uu2.hashtag_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c597802Uu2.hashtag_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c597802Uu2.status);
            protoWriter.writeBytes(c597802Uu2.unknownFields());
        }
    };
    public String hashtag_id;
    public String hashtag_name;
    public Integer status;

    public C597802Uu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C597902Uv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
