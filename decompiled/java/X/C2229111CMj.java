package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229111CMj extends Message<C2229111CMj, C2229131CMl> {
    public static final ProtoAdapter<C2229111CMj> ADAPTER = new ProtoAdapter<C2229111CMj>() { // from class: X.1CMk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229111CMj decode(ProtoReader protoReader) {
            C2229131CMl c2229131CMl = new C2229131CMl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229131CMl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229131CMl.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2229131CMl.LIZLLL = C2229081CMg.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229131CMl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229111CMj c2229111CMj) {
            C2229111CMj c2229111CMj2 = c2229111CMj;
            return C2229081CMg.ADAPTER.encodedSizeWithTag(1, c2229111CMj2.request) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2229111CMj2.callback) + c2229111CMj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229111CMj redact(C2229111CMj c2229111CMj) {
            C2229131CMl c2229131CMlNewBuilder = c2229111CMj.newBuilder();
            c2229131CMlNewBuilder.LIZLLL = C2229081CMg.ADAPTER.redact(c2229131CMlNewBuilder.LIZLLL);
            c2229131CMlNewBuilder.clearUnknownFields();
            return c2229131CMlNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229111CMj c2229111CMj) {
            C2229111CMj c2229111CMj2 = c2229111CMj;
            C2229081CMg.ADAPTER.encodeWithTag(protoWriter, 1, c2229111CMj2.request);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2229111CMj2.callback);
            protoWriter.writeBytes(c2229111CMj2.unknownFields());
        }
    };
    public static final Long DEFAULT_CALLBACK = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRequest#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229081CMg request;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.request.hashCode()) * 37) + this.callback.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229131CMl newBuilder() {
        C2229131CMl c2229131CMl = new C2229131CMl();
        c2229131CMl.LIZLLL = this.request;
        c2229131CMl.LJ = this.callback;
        c2229131CMl.addUnknownFields(unknownFields());
        return c2229131CMl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXd1ecf67d7a47d0b4{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229111CMj)) {
            return false;
        }
        C2229111CMj c2229111CMj = (C2229111CMj) obj;
        if (unknownFields().equals(c2229111CMj.unknownFields()) && this.request.equals(c2229111CMj.request) && this.callback.equals(c2229111CMj.callback)) {
            return true;
        }
        return false;
    }

    public C2229111CMj(C2229081CMg c2229081CMg, Long l) {
        this(c2229081CMg, l, ByteString.EMPTY);
    }

    public C2229111CMj(C2229081CMg c2229081CMg, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.request = c2229081CMg;
        this.callback = l;
    }
}
