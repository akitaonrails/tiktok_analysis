package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9N extends Message<C1C9N, C1C9O> {
    public static final ProtoAdapter<C1C9N> ADAPTER = new ProtoAdapter<C1C9N>() { // from class: X.1C9M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C9N decode(ProtoReader protoReader) {
            C1C9N c1c9n = new C1C9N();
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
                                    c1c9n.live_photo_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1c9n.original = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1c9n.duration = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1c9n.video_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c9n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C9N c1c9n) {
            C1C9N c1c9n2 = c1c9n;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c1c9n2.video_id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, c1c9n2.duration);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1c9n2.original) + protoAdapter.encodedSizeWithTag(4, c1c9n2.live_photo_type) + c1c9n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C9N c1c9n) {
            C1C9N c1c9n2 = c1c9n;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1c9n2.video_id);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, c1c9n2.duration);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 3, c1c9n2.original);
            protoAdapter.encodeWithTag(protoWriter, 4, c1c9n2.live_photo_type);
            protoWriter.writeBytes(c1c9n2.unknownFields());
        }
    };
    public Double duration;
    public Integer live_photo_type;
    public Integer original;
    public String video_id;

    public C1C9N() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C9O newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
