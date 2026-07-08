package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C598802Ve extends Message<C598802Ve, C598902Vf> {
    public static final ProtoAdapter<C598802Ve> ADAPTER = new ProtoAdapter<C598802Ve>() { // from class: X.02Vd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C598802Ve decode(ProtoReader protoReader) {
            C598802Ve c598802Ve = new C598802Ve();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c598802Ve.duration = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c598802Ve.end = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c598802Ve.start = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c598802Ve;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C598802Ve c598802Ve) {
            C598802Ve c598802Ve2 = c598802Ve;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c598802Ve2.start) + protoAdapter.encodedSizeWithTag(2, c598802Ve2.end) + protoAdapter.encodedSizeWithTag(3, c598802Ve2.duration) + c598802Ve2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C598802Ve c598802Ve) {
            C598802Ve c598802Ve2 = c598802Ve;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c598802Ve2.start);
            protoAdapter.encodeWithTag(protoWriter, 2, c598802Ve2.end);
            protoAdapter.encodeWithTag(protoWriter, 3, c598802Ve2.duration);
            protoWriter.writeBytes(c598802Ve2.unknownFields());
        }
    };
    public Double duration;
    public Double end;
    public Double start;

    public C598802Ve() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C598902Vf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
