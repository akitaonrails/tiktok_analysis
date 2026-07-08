package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223371C0h extends Message<C2223371C0h, C2223381C0i> {
    public static final ProtoAdapter<C2223371C0h> ADAPTER = new ProtoAdapter<C2223371C0h>() { // from class: X.1C0g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223371C0h decode(ProtoReader protoReader) {
            C2223371C0h c2223371C0h = new C2223371C0h();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223371C0h.scope_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223371C0h.dynamic_scope_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223371C0h;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223371C0h c2223371C0h) {
            C2223371C0h c2223371C0h2 = c2223371C0h;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c2223371C0h2.dynamic_scope_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2223371C0h2.scope_id) + c2223371C0h2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223371C0h c2223371C0h) {
        }
    };
    public Integer dynamic_scope_type;
    public String scope_id;

    public C2223371C0h() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223381C0i newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
