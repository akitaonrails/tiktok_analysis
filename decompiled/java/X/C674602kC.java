package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02kC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C674602kC extends Message<C674602kC, C674702kD> {
    public static final ProtoAdapter<C674602kC> ADAPTER = new ProtoAdapter<C674602kC>() { // from class: X.02kB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C674602kC decode(ProtoReader protoReader) {
            C674602kC c674602kC = new C674602kC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c674602kC.poi_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c674602kC;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C674602kC c674602kC) {
            C674602kC c674602kC2 = c674602kC;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c674602kC2.poi_id) + c674602kC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C674602kC c674602kC) {
            C674602kC c674602kC2 = c674602kC;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c674602kC2.poi_id);
            protoWriter.writeBytes(c674602kC2.unknownFields());
        }
    };
    public String poi_id;

    public C674602kC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C674702kD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
