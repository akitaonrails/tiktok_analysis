package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244161CsY extends Message<C2244161CsY, C2244251Csh> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer width;
    public static final ProtoAdapter<C2244161CsY> ADAPTER = new ProtoAdapter<C2244161CsY>() { // from class: X.1CsZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244161CsY decode(ProtoReader protoReader) {
            C2244251Csh c2244251Csh = new C2244251Csh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2244251Csh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2244251Csh.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2244251Csh.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244251Csh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244161CsY c2244161CsY) {
            C2244161CsY c2244161CsY2 = c2244161CsY;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2244161CsY2.width) + protoAdapter.encodedSizeWithTag(2, c2244161CsY2.height) + c2244161CsY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244161CsY redact(C2244161CsY c2244161CsY) {
            C2244251Csh c2244251CshNewBuilder = c2244161CsY.newBuilder();
            c2244251CshNewBuilder.clearUnknownFields();
            return c2244251CshNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244161CsY c2244161CsY) {
            C2244161CsY c2244161CsY2 = c2244161CsY;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244161CsY2.width);
            protoAdapter.encodeWithTag(protoWriter, 2, c2244161CsY2.height);
            protoWriter.writeBytes(c2244161CsY2.unknownFields());
        }
    };
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.height;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2244251Csh newBuilder() {
        C2244251Csh c2244251Csh = new C2244251Csh();
        c2244251Csh.LIZLLL = this.width;
        c2244251Csh.LJ = this.height;
        c2244251Csh.addUnknownFields(unknownFields());
        return c2244251Csh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        sb.replace(0, 2, "Resolution{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244161CsY)) {
            return false;
        }
        C2244161CsY c2244161CsY = (C2244161CsY) obj;
        if (unknownFields().equals(c2244161CsY.unknownFields()) && C1516540pZE.LJ(this.width, c2244161CsY.width) && C1516540pZE.LJ(this.height, c2244161CsY.height)) {
            return true;
        }
        return false;
    }

    public C2244161CsY(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public C2244161CsY(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.width = num;
        this.height = num2;
    }
}
