package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229381CNk extends Message<C2229381CNk, C2229391CNl> {
    public static final ProtoAdapter<C2229381CNk> ADAPTER = new ProtoAdapter<C2229381CNk>() { // from class: X.1CNj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229381CNk decode(ProtoReader protoReader) {
            C2229381CNk c2229381CNk = new C2229381CNk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c2229381CNk.goods_amount_breakdown = C2229411CNn.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229381CNk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229381CNk c2229381CNk) {
            C2229381CNk c2229381CNk2 = c2229381CNk;
            return C2229411CNn.ADAPTER.encodedSizeWithTag(1, c2229381CNk2.goods_amount_breakdown) + c2229381CNk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2229381CNk c2229381CNk) {
        }
    };
    public C2229411CNn goods_amount_breakdown;

    public C2229381CNk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2229391CNl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
