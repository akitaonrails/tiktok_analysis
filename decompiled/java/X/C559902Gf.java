package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559902Gf extends Message<C559902Gf, C02KX> {
    public static final ProtoAdapter<C559902Gf> ADAPTER = new ProtoAdapter<C559902Gf>() { // from class: X.02A7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559902Gf decode(ProtoReader protoReader) {
            C559902Gf c559902Gf = new C559902Gf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c559902Gf.end = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c559902Gf.begin = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559902Gf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559902Gf c559902Gf) {
            C559902Gf c559902Gf2 = c559902Gf;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c559902Gf2.begin) + protoAdapter.encodedSizeWithTag(2, c559902Gf2.end) + c559902Gf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559902Gf c559902Gf) {
            C559902Gf c559902Gf2 = c559902Gf;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c559902Gf2.begin);
            protoAdapter.encodeWithTag(protoWriter, 2, c559902Gf2.end);
            protoWriter.writeBytes(c559902Gf2.unknownFields());
        }
    };
    public Integer begin;
    public Integer end;

    public C559902Gf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
