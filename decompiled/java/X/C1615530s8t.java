package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0s8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615530s8t extends Message<C1615530s8t, C1615540s8u> {
    public static final ProtoAdapter<C1615530s8t> ADAPTER = new ProtoAdapter<C1615530s8t>() { // from class: X.0s8s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1615530s8t decode(ProtoReader protoReader) {
            C1615530s8t c1615530s8t = new C1615530s8t();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1615530s8t.continue_watching_trailer = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1615530s8t.continue_watching_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1615530s8t.continue_watching_video_index = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1615530s8t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1615530s8t c1615530s8t) {
            C1615530s8t c1615530s8t2 = c1615530s8t;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1615530s8t2.continue_watching_video_index) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1615530s8t2.continue_watching_status) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c1615530s8t2.continue_watching_trailer) + c1615530s8t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1615530s8t c1615530s8t) {
            C1615530s8t c1615530s8t2 = c1615530s8t;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1615530s8t2.continue_watching_video_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c1615530s8t2.continue_watching_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c1615530s8t2.continue_watching_trailer);
            protoWriter.writeBytes(c1615530s8t2.unknownFields());
        }
    };
    public Integer continue_watching_status;
    public Boolean continue_watching_trailer;
    public Long continue_watching_video_index;

    public C1615530s8t() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1615540s8u newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
