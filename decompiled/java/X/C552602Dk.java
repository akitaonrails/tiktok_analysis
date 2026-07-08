package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552602Dk extends Message<C552602Dk, C572302Kz> {
    public static final ProtoAdapter<C552602Dk> ADAPTER = new ProtoAdapter<C552602Dk>() { // from class: X.026E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552602Dk decode(ProtoReader protoReader) {
            C552602Dk c552602Dk = new C552602Dk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c552602Dk.bbox = C555902Er.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c552602Dk.tag_coord = C626902cV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c552602Dk.frame_time = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552602Dk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552602Dk c552602Dk) {
            C552602Dk c552602Dk2 = c552602Dk;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c552602Dk2.frame_time) + C626902cV.ADAPTER.encodedSizeWithTag(2, c552602Dk2.tag_coord) + C555902Er.ADAPTER.encodedSizeWithTag(3, c552602Dk2.bbox) + c552602Dk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C552602Dk c552602Dk) {
            C552602Dk c552602Dk2 = c552602Dk;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c552602Dk2.frame_time);
            C626902cV.ADAPTER.encodeWithTag(protoWriter, 2, c552602Dk2.tag_coord);
            C555902Er.ADAPTER.encodeWithTag(protoWriter, 3, c552602Dk2.bbox);
            protoWriter.writeBytes(c552602Dk2.unknownFields());
        }
    };
    public C555902Er bbox;
    public Integer frame_time;
    public C626902cV tag_coord;

    public C552602Dk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C572302Kz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
