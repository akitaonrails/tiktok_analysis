package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HO extends Message<C02HO, C02KP> {
    public static final ProtoAdapter<C02HO> ADAPTER = new ProtoAdapter<C02HO>() { // from class: X.02HP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HO decode(ProtoReader protoReader) {
            C02HO c02ho = new C02HO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02ho.avatar_meta_info = C02HR.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02ho.avatar_category = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ho;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HO c02ho) {
            C02HO c02ho2 = c02ho;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02ho2.avatar_category) + C02HR.ADAPTER.encodedSizeWithTag(2, c02ho2.avatar_meta_info) + c02ho2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02HO c02ho) {
            C02HO c02ho2 = c02ho;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02ho2.avatar_category);
            C02HR.ADAPTER.encodeWithTag(protoWriter, 2, c02ho2.avatar_meta_info);
            protoWriter.writeBytes(c02ho2.unknownFields());
        }
    };
    public Integer avatar_category;
    public C02HR avatar_meta_info;

    public C02HO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
