package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225771C9n extends Message<C2225771C9n, C2225791C9p> {
    public static final ProtoAdapter<C2225771C9n> ADAPTER = new ProtoAdapter<C2225771C9n>() { // from class: X.1C9o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225771C9n decode(ProtoReader protoReader) {
            C2225791C9p c2225791C9p = new C2225791C9p();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2225791C9p.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2225791C9p.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2225791C9p.LIZLLL = C2225731C9j.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225791C9p.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225771C9n c2225771C9n) {
            C2225771C9n c2225771C9n2 = c2225771C9n;
            return C2225731C9j.ADAPTER.encodedSizeWithTag(1, c2225771C9n2.task) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2225771C9n2.callback) + c2225771C9n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225771C9n redact(C2225771C9n c2225771C9n) {
            C2225791C9p c2225791C9pNewBuilder = c2225771C9n.newBuilder();
            c2225791C9pNewBuilder.LIZLLL = C2225731C9j.ADAPTER.redact(c2225791C9pNewBuilder.LIZLLL);
            c2225791C9pNewBuilder.clearUnknownFields();
            return c2225791C9pNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225771C9n c2225771C9n) {
            C2225771C9n c2225771C9n2 = c2225771C9n;
            C2225731C9j.ADAPTER.encodeWithTag(protoWriter, 1, c2225771C9n2.task);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2225771C9n2.callback);
            protoWriter.writeBytes(c2225771C9n2.unknownFields());
        }
    };
    public static final Long DEFAULT_CALLBACK = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicTask#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2225731C9j task;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.task.hashCode()) * 37) + this.callback.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225791C9p newBuilder() {
        C2225791C9p c2225791C9p = new C2225791C9p();
        c2225791C9p.LIZLLL = this.task;
        c2225791C9p.LJ = this.callback;
        c2225791C9p.addUnknownFields(unknownFields());
        return c2225791C9p;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", task=");
        sb.append(this.task);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXf5c2e2015be3de31{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225771C9n)) {
            return false;
        }
        C2225771C9n c2225771C9n = (C2225771C9n) obj;
        if (unknownFields().equals(c2225771C9n.unknownFields()) && this.task.equals(c2225771C9n.task) && this.callback.equals(c2225771C9n.callback)) {
            return true;
        }
        return false;
    }

    public C2225771C9n(C2225731C9j c2225731C9j, Long l) {
        this(c2225731C9j, l, ByteString.EMPTY);
    }

    public C2225771C9n(C2225731C9j c2225731C9j, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.task = c2225731C9j;
        this.callback = l;
    }
}
