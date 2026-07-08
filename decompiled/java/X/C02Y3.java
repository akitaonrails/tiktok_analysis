package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Y3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02Y3 extends Message<C02Y3, C02Y7> {
    public static final ProtoAdapter<C02Y3> ADAPTER = new ProtoAdapter<C02Y3>() { // from class: X.02Y2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02Y3 decode(ProtoReader protoReader) {
            C02Y3 c02y3 = new C02Y3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02y3.is_dynamic = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02y3.width = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02y3.height = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02y3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02Y3 c02y3) {
            C02Y3 c02y32 = c02y3;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c02y32.height) + protoAdapter.encodedSizeWithTag(2, c02y32.width) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02y32.is_dynamic) + c02y32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02Y3 c02y3) {
            C02Y3 c02y32 = c02y3;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02y32.height);
            protoAdapter.encodeWithTag(protoWriter, 2, c02y32.width);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02y32.is_dynamic);
            protoWriter.writeBytes(c02y32.unknownFields());
        }
    };
    public Long height;
    public Boolean is_dynamic;
    public Long width;

    public C02Y3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Y7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
