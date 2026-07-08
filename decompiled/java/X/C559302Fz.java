package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559302Fz extends Message<C559302Fz, C02LY> {
    public static final ProtoAdapter<C559302Fz> ADAPTER = new ProtoAdapter<C559302Fz>() { // from class: X.028g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559302Fz decode(ProtoReader protoReader) {
            C559302Fz c559302Fz = new C559302Fz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c559302Fz.avatar = C02EQ.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c559302Fz.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c559302Fz.id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559302Fz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559302Fz c559302Fz) {
            C559302Fz c559302Fz2 = c559302Fz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c559302Fz2.id) + protoAdapter.encodedSizeWithTag(2, c559302Fz2.name) + C02EQ.ADAPTER.encodedSizeWithTag(3, c559302Fz2.avatar) + c559302Fz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559302Fz c559302Fz) {
            C559302Fz c559302Fz2 = c559302Fz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c559302Fz2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c559302Fz2.name);
            C02EQ.ADAPTER.encodeWithTag(protoWriter, 3, c559302Fz2.avatar);
            protoWriter.writeBytes(c559302Fz2.unknownFields());
        }
    };
    public C02EQ avatar;
    public String id;
    public String name;

    public C559302Fz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
