package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556602Ey extends Message<C556602Ey, C571202Ko> {
    public static final ProtoAdapter<C556602Ey> ADAPTER = new ProtoAdapter<C556602Ey>() { // from class: X.029F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556602Ey decode(ProtoReader protoReader) {
            C556602Ey c556602Ey = new C556602Ey();
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
                                    c556602Ey.video_duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                                }
                            } else {
                                c556602Ey.audition_duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c556602Ey.shoot_duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c556602Ey.duration_precision = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556602Ey;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556602Ey c556602Ey) {
            C556602Ey c556602Ey2 = c556602Ey;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c556602Ey2.duration_precision) + protoAdapter.encodedSizeWithTag(2, c556602Ey2.shoot_duration_precision) + protoAdapter.encodedSizeWithTag(3, c556602Ey2.audition_duration_precision) + protoAdapter.encodedSizeWithTag(4, c556602Ey2.video_duration_precision) + c556602Ey2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556602Ey c556602Ey) {
            C556602Ey c556602Ey2 = c556602Ey;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c556602Ey2.duration_precision);
            protoAdapter.encodeWithTag(protoWriter, 2, c556602Ey2.shoot_duration_precision);
            protoAdapter.encodeWithTag(protoWriter, 3, c556602Ey2.audition_duration_precision);
            protoAdapter.encodeWithTag(protoWriter, 4, c556602Ey2.video_duration_precision);
            protoWriter.writeBytes(c556602Ey2.unknownFields());
        }
    };
    public Double audition_duration_precision;
    public Double duration_precision;
    public Double shoot_duration_precision;
    public Double video_duration_precision;

    public C556602Ey() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571202Ko newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
