package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCW extends Message<C1CCW, C1CCY> {
    public static final ProtoAdapter<C1CCW> ADAPTER = new ProtoAdapter<C1CCW>() { // from class: X.1CCX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCW decode(ProtoReader protoReader) {
            C1CCY c1ccy = new C1CCY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ccy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ccy.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ccy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CCW c1ccw) {
            C1CCW c1ccw2 = c1ccw;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1ccw2.ret) + c1ccw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCW redact(C1CCW c1ccw) {
            C1CCY c1ccyNewBuilder = c1ccw.newBuilder();
            c1ccyNewBuilder.clearUnknownFields();
            return c1ccyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CCW c1ccw) {
            C1CCW c1ccw2 = c1ccw;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1ccw2.ret);
            protoWriter.writeBytes(c1ccw2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CCY newBuilder() {
        C1CCY c1ccy = new C1CCY();
        c1ccy.LIZLLL = this.ret;
        c1ccy.addUnknownFields(unknownFields());
        return c1ccy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX0bf8b5c665c57f35{");
        sb.append('}');
        return sb.toString();
    }

    public C1CCW(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CCW)) {
            return false;
        }
        C1CCW c1ccw = (C1CCW) obj;
        if (unknownFields().equals(c1ccw.unknownFields()) && this.ret.equals(c1ccw.ret)) {
            return true;
        }
        return false;
    }

    public C1CCW(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = str;
    }
}
