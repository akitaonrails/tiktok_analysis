package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224651C5f extends Message<C2224651C5f, C2224661C5g> {
    public static final ProtoAdapter<C2224651C5f> ADAPTER = new ProtoAdapter<C2224651C5f>() { // from class: X.1C5e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224651C5f decode(ProtoReader protoReader) {
            C2224651C5f c2224651C5f = new C2224651C5f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2224651C5f.dark_icon = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2224651C5f.light_icon = C02U1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224651C5f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224651C5f c2224651C5f) {
            C2224651C5f c2224651C5f2 = c2224651C5f;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2224651C5f2.light_icon) + protoAdapter.encodedSizeWithTag(2, c2224651C5f2.dark_icon) + c2224651C5f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224651C5f c2224651C5f) {
        }
    };
    public C02U1 dark_icon;
    public C02U1 light_icon;

    public C2224651C5f() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224661C5g newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
