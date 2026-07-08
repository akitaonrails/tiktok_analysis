package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226621CCu extends Message<C2226621CCu, C2226631CCv> {
    public static final ProtoAdapter<C2226621CCu> ADAPTER = new ProtoAdapter<C2226621CCu>() { // from class: X.1CCt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226621CCu decode(ProtoReader protoReader) {
            C2226631CCv c2226631CCv = new C2226631CCv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226631CCv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226631CCv.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226631CCv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226621CCu c2226621CCu) {
            C2226621CCu c2226621CCu2 = c2226621CCu;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2226621CCu2.enable_multi_guest_moderator) + c2226621CCu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226621CCu redact(C2226621CCu c2226621CCu) {
            C2226631CCv c2226631CCvNewBuilder = c2226621CCu.newBuilder();
            c2226631CCvNewBuilder.clearUnknownFields();
            return c2226631CCvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226621CCu c2226621CCu) {
            C2226621CCu c2226621CCu2 = c2226621CCu;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2226621CCu2.enable_multi_guest_moderator);
            protoWriter.writeBytes(c2226621CCu2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_ENABLE_MULTI_GUEST_MODERATOR = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean enable_multi_guest_moderator;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.enable_multi_guest_moderator.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226631CCv newBuilder() {
        C2226631CCv c2226631CCv = new C2226631CCv();
        c2226631CCv.LIZLLL = this.enable_multi_guest_moderator;
        c2226631CCv.addUnknownFields(unknownFields());
        return c2226631CCv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", enable_multi_guest_moderator=");
        sb.append(this.enable_multi_guest_moderator);
        sb.replace(0, 2, "FuncParamsXc6d9f9a25d48f654{");
        sb.append('}');
        return sb.toString();
    }

    public C2226621CCu(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226621CCu)) {
            return false;
        }
        C2226621CCu c2226621CCu = (C2226621CCu) obj;
        if (unknownFields().equals(c2226621CCu.unknownFields()) && this.enable_multi_guest_moderator.equals(c2226621CCu.enable_multi_guest_moderator)) {
            return true;
        }
        return false;
    }

    public C2226621CCu(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_multi_guest_moderator = bool;
    }
}
