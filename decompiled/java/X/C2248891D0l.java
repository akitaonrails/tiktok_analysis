package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248891D0l extends Message<C2248891D0l, C2248911D0n> {
    public static final ProtoAdapter<C2248891D0l> ADAPTER = new ProtoAdapter<C2248891D0l>() { // from class: X.1D0m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248891D0l decode(ProtoReader protoReader) {
            C2248911D0n c2248911D0n = new C2248911D0n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2248911D0n.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2248911D0n.LIZLLL = C2248921D0o.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2248911D0n.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2248891D0l c2248891D0l) {
            C2248891D0l c2248891D0l2 = c2248891D0l;
            return C2248921D0o.ADAPTER.encodedSizeWithTag(1, c2248891D0l2.stats) + c2248891D0l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248891D0l redact(C2248891D0l c2248891D0l) {
            C2248911D0n c2248911D0nNewBuilder = c2248891D0l.newBuilder();
            c2248911D0nNewBuilder.LIZLLL = C2248921D0o.ADAPTER.redact(c2248911D0nNewBuilder.LIZLLL);
            c2248911D0nNewBuilder.clearUnknownFields();
            return c2248911D0nNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2248891D0l c2248891D0l) {
            C2248891D0l c2248891D0l2 = c2248891D0l;
            C2248921D0o.ADAPTER.encodeWithTag(protoWriter, 1, c2248891D0l2.stats);
            protoWriter.writeBytes(c2248891D0l2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcRemoteVideoStats#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2248921D0o stats;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.stats.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2248911D0n newBuilder() {
        C2248911D0n c2248911D0n = new C2248911D0n();
        c2248911D0n.LIZLLL = this.stats;
        c2248911D0n.addUnknownFields(unknownFields());
        return c2248911D0n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stats=");
        sb.append(this.stats);
        sb.replace(0, 2, "FuncParamsXa3a115e4e61f6290{");
        sb.append('}');
        return sb.toString();
    }

    public C2248891D0l(C2248921D0o c2248921D0o) {
        this(c2248921D0o, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2248891D0l)) {
            return false;
        }
        C2248891D0l c2248891D0l = (C2248891D0l) obj;
        if (unknownFields().equals(c2248891D0l.unknownFields()) && this.stats.equals(c2248891D0l.stats)) {
            return true;
        }
        return false;
    }

    public C2248891D0l(C2248921D0o c2248921D0o, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stats = c2248921D0o;
    }
}
