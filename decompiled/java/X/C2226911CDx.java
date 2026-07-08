package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226911CDx extends Message<C2226911CDx, C2226921CDy> {
    public static final ProtoAdapter<C2226911CDx> ADAPTER = new ProtoAdapter<C2226911CDx>() { // from class: X.1CDw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226911CDx decode(ProtoReader protoReader) {
            C2226911CDx c2226911CDx = new C2226911CDx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2226911CDx.collection_id = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2226911CDx.total_reviews = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2226911CDx.reviews.add(C1CE0.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226911CDx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226911CDx c2226911CDx) {
            C2226911CDx c2226911CDx2 = c2226911CDx;
            int iEncodedSizeWithTag = C1CE0.ADAPTER.asRepeated().encodedSizeWithTag(1, c2226911CDx2.reviews);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2226911CDx2.total_reviews) + protoAdapter.encodedSizeWithTag(3, c2226911CDx2.collection_id) + c2226911CDx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226911CDx c2226911CDx) {
            C2226911CDx c2226911CDx2 = c2226911CDx;
            C1CE0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2226911CDx2.reviews);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2226911CDx2.total_reviews);
            protoAdapter.encodeWithTag(protoWriter, 3, c2226911CDx2.collection_id);
            protoWriter.writeBytes(c2226911CDx2.unknownFields());
        }
    };
    public Long collection_id;
    public List<C1CE0> reviews;
    public Long total_reviews;

    public C2226911CDx() {
        super(ADAPTER, ByteString.EMPTY);
        this.reviews = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2226921CDy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
