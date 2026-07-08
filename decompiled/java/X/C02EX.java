package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EX extends Message<C02EX, C572102Kx> {
    public static final ProtoAdapter<C02EX> ADAPTER = new ProtoAdapter<C02EX>() { // from class: X.028d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EX decode(ProtoReader protoReader) {
            C02EX c02ex = new C02EX();
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
                                        c02ex.avatar_300x300 = C673002jw.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02ex.avatar_168x168 = C673002jw.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02ex.avatar_thumb = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02ex.avatar_medium = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02ex.avatar_larger = C673002jw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ex;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EX c02ex) {
            C02EX c02ex2 = c02ex;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c02ex2.avatar_larger) + protoAdapter.encodedSizeWithTag(2, c02ex2.avatar_medium) + protoAdapter.encodedSizeWithTag(3, c02ex2.avatar_thumb) + protoAdapter.encodedSizeWithTag(4, c02ex2.avatar_168x168) + protoAdapter.encodedSizeWithTag(5, c02ex2.avatar_300x300) + c02ex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EX c02ex) {
            C02EX c02ex2 = c02ex;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ex2.avatar_larger);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ex2.avatar_medium);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ex2.avatar_thumb);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ex2.avatar_168x168);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ex2.avatar_300x300);
            protoWriter.writeBytes(c02ex2.unknownFields());
        }
    };
    public C673002jw avatar_168x168;
    public C673002jw avatar_300x300;
    public C673002jw avatar_larger;
    public C673002jw avatar_medium;
    public C673002jw avatar_thumb;

    public C02EX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C572102Kx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
