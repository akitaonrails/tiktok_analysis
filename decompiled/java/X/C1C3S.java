package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3S extends Message<C1C3S, C1C3T> {
    public static final ProtoAdapter<C1C3S> ADAPTER = new ProtoAdapter<C1C3S>() { // from class: X.1C3R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3S decode(ProtoReader protoReader) {
            C1C3S c1c3s = new C1C3S();
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
                                    c1c3s.right_margin = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1c3s.bottom_margin = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1c3s.left_margin = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1c3s.top_margin = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3s;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3S c1c3s) {
            C1C3S c1c3s2 = c1c3s;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1c3s2.top_margin) + protoAdapter.encodedSizeWithTag(2, c1c3s2.left_margin) + protoAdapter.encodedSizeWithTag(3, c1c3s2.bottom_margin) + protoAdapter.encodedSizeWithTag(4, c1c3s2.right_margin) + c1c3s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C3S c1c3s) {
            C1C3S c1c3s2 = c1c3s;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c3s2.top_margin);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c3s2.left_margin);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c3s2.bottom_margin);
            protoAdapter.encodeWithTag(protoWriter, 4, c1c3s2.right_margin);
            protoWriter.writeBytes(c1c3s2.unknownFields());
        }
    };
    public Long bottom_margin;
    public Long left_margin;
    public Long right_margin;
    public Long top_margin;

    public C1C3S() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C3T newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
