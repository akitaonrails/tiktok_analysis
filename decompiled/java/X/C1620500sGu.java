package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0sGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620500sGu extends Message<C1620500sGu, C1620510sGv> {
    public static final ProtoAdapter<C1620500sGu> ADAPTER = new ProtoAdapter<C1620500sGu>() { // from class: X.0sGt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1620500sGu decode(ProtoReader protoReader) {
            C1620500sGu c1620500sGu = new C1620500sGu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1620500sGu.impr_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1620500sGu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1620500sGu c1620500sGu) {
            C1620500sGu c1620500sGu2 = c1620500sGu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1620500sGu2.impr_id) + c1620500sGu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1620500sGu c1620500sGu) {
            C1620500sGu c1620500sGu2 = c1620500sGu;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1620500sGu2.impr_id);
            protoWriter.writeBytes(c1620500sGu2.unknownFields());
        }
    };
    public String impr_id;

    public C1620500sGu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1620510sGv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
