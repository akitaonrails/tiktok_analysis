package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DQ extends Message<C02DQ, C02IZ> {
    public static final ProtoAdapter<C02DQ> ADAPTER = new ProtoAdapter<C02DQ>() { // from class: X.026l
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DQ decode(ProtoReader protoReader) {
            C02DQ c02dq = new C02DQ();
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
                                        c02dq.fake_landscape_video_type = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02dq.right = ProtoAdapter.FLOAT.decode(protoReader);
                                }
                            } else {
                                c02dq.left = ProtoAdapter.FLOAT.decode(protoReader);
                            }
                        } else {
                            c02dq.bottom = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c02dq.top = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DQ c02dq) {
            C02DQ c02dq2 = c02dq;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.encodedSizeWithTag(1, c02dq2.top) + protoAdapter.encodedSizeWithTag(2, c02dq2.bottom) + protoAdapter.encodedSizeWithTag(3, c02dq2.left) + protoAdapter.encodedSizeWithTag(4, c02dq2.right) + ProtoAdapter.INT32.encodedSizeWithTag(5, c02dq2.fake_landscape_video_type) + c02dq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DQ c02dq) {
            C02DQ c02dq2 = c02dq;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(protoWriter, 1, c02dq2.top);
            protoAdapter.encodeWithTag(protoWriter, 2, c02dq2.bottom);
            protoAdapter.encodeWithTag(protoWriter, 3, c02dq2.left);
            protoAdapter.encodeWithTag(protoWriter, 4, c02dq2.right);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c02dq2.fake_landscape_video_type);
            protoWriter.writeBytes(c02dq2.unknownFields());
        }
    };
    public Float bottom;
    public Integer fake_landscape_video_type;
    public Float left;
    public Float right;
    public Float top;

    public C02DQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
