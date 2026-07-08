package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Bzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223151Bzl extends Message<C2223151Bzl, C2223161Bzm> {
    public static final ProtoAdapter<C2223151Bzl> ADAPTER = new ProtoAdapter<C2223151Bzl>() { // from class: X.1Bzk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223151Bzl decode(ProtoReader protoReader) {
            C2223151Bzl c2223151Bzl = new C2223151Bzl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c2223151Bzl.impr_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223151Bzl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223151Bzl c2223151Bzl) {
            C2223151Bzl c2223151Bzl2 = c2223151Bzl;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2223151Bzl2.impr_id) + c2223151Bzl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223151Bzl c2223151Bzl) {
            C2223151Bzl c2223151Bzl2 = c2223151Bzl;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2223151Bzl2.impr_id);
            protoWriter.writeBytes(c2223151Bzl2.unknownFields());
        }
    };
    public String impr_id;

    public C2223151Bzl() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223161Bzm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
