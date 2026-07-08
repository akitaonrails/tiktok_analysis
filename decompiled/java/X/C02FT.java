package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FT extends Message<C02FT, C571702Kt> {
    public static final ProtoAdapter<C02FT> ADAPTER = new ProtoAdapter<C02FT>() { // from class: X.028K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FT decode(ProtoReader protoReader) {
            C02FT c02ft = new C02FT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02ft.count = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02ft.post_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ft;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FT c02ft) {
            C02FT c02ft2 = c02ft;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02ft2.post_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02ft2.count) + c02ft2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FT c02ft) {
            C02FT c02ft2 = c02ft;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02ft2.post_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c02ft2.count);
            protoWriter.writeBytes(c02ft2.unknownFields());
        }
    };
    public Long count;
    public Integer post_type;

    public C02FT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571702Kt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
