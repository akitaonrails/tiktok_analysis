package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230671CSj extends Message<C2230671CSj, C2230691CSl> {
    public static final ProtoAdapter<C2230671CSj> ADAPTER = new ProtoAdapter<C2230671CSj>() { // from class: X.1CSk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230671CSj decode(ProtoReader protoReader) {
            C2230691CSl c2230691CSl = new C2230691CSl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2230691CSl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2230691CSl.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2230691CSl.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230691CSl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230671CSj c2230671CSj) {
            C2230671CSj c2230671CSj2 = c2230671CSj;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2230671CSj2.height) + protoAdapter.encodedSizeWithTag(2, c2230671CSj2.width) + c2230671CSj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230671CSj redact(C2230671CSj c2230671CSj) {
            C2230691CSl c2230691CSlNewBuilder = c2230671CSj.newBuilder();
            c2230691CSlNewBuilder.clearUnknownFields();
            return c2230691CSlNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230671CSj c2230671CSj) {
            C2230671CSj c2230671CSj2 = c2230671CSj;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230671CSj2.height);
            protoAdapter.encodeWithTag(protoWriter, 2, c2230671CSj2.width);
            protoWriter.writeBytes(c2230671CSj2.unknownFields());
        }
    };
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer width;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.width;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2230691CSl newBuilder() {
        C2230691CSl c2230691CSl = new C2230691CSl();
        c2230691CSl.LIZLLL = this.height;
        c2230691CSl.LJ = this.width;
        c2230691CSl.addUnknownFields(unknownFields());
        return c2230691CSl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        sb.replace(0, 2, "ButtonStyle{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230671CSj)) {
            return false;
        }
        C2230671CSj c2230671CSj = (C2230671CSj) obj;
        if (unknownFields().equals(c2230671CSj.unknownFields()) && C1516540pZE.LJ(this.height, c2230671CSj.height) && C1516540pZE.LJ(this.width, c2230671CSj.width)) {
            return true;
        }
        return false;
    }

    public C2230671CSj(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public C2230671CSj(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.height = num;
        this.width = num2;
    }
}
