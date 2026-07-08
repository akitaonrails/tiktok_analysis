package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUF extends Message<C1CUF, C1CUH> {
    public static final ProtoAdapter<C1CUF> ADAPTER = new ProtoAdapter<C1CUF>() { // from class: X.1CUG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUF decode(ProtoReader protoReader) {
            C1CUH c1cuh = new C1CUH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cuh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cuh.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cuh.LIZLLL = C1CUI.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cuh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CUF c1cuf) {
            C1CUF c1cuf2 = c1cuf;
            return C1CUI.ADAPTER.encodedSizeWithTag(1, c1cuf2.biz_extra) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1cuf2.retry_count) + c1cuf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUF redact(C1CUF c1cuf) {
            C1CUH c1cuhNewBuilder = c1cuf.newBuilder();
            C1CUI c1cui = c1cuhNewBuilder.LIZLLL;
            if (c1cui != null) {
                c1cuhNewBuilder.LIZLLL = C1CUI.ADAPTER.redact(c1cui);
            }
            c1cuhNewBuilder.clearUnknownFields();
            return c1cuhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CUF c1cuf) {
            C1CUF c1cuf2 = c1cuf;
            C1CUI.ADAPTER.encodeWithTag(protoWriter, 1, c1cuf2.biz_extra);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1cuf2.retry_count);
            protoWriter.writeBytes(c1cuf2.unknownFields());
        }
    };
    public static final Long DEFAULT_RETRY_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicJoinChannelRspBizExtra#ADAPTER", tag = 1)
    public final C1CUI biz_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long retry_count;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C1CUI c1cui = this.biz_extra;
        int iHashCode2 = ((iHashCode + (c1cui != null ? c1cui.hashCode() : 0)) * 37) + this.retry_count.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CUH newBuilder() {
        C1CUH c1cuh = new C1CUH();
        c1cuh.LIZLLL = this.biz_extra;
        c1cuh.LJ = this.retry_count;
        c1cuh.addUnknownFields(unknownFields());
        return c1cuh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.biz_extra != null) {
            sb.append(", biz_extra=");
            sb.append(this.biz_extra);
        }
        sb.append(", retry_count=");
        sb.append(this.retry_count);
        sb.replace(0, 2, "FuncParamsXcb9fdf7e4ac869b9{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CUF)) {
            return false;
        }
        C1CUF c1cuf = (C1CUF) obj;
        if (unknownFields().equals(c1cuf.unknownFields()) && C1516540pZE.LJ(this.biz_extra, c1cuf.biz_extra) && this.retry_count.equals(c1cuf.retry_count)) {
            return true;
        }
        return false;
    }

    public C1CUF(C1CUI c1cui, Long l) {
        this(c1cui, l, ByteString.EMPTY);
    }

    public C1CUF(C1CUI c1cui, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_extra = c1cui;
        this.retry_count = l;
    }
}
