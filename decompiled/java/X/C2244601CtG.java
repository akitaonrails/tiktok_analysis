package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244601CtG extends Message<C2244601CtG, C2244621CtI> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer id;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.ActionParams#ADAPTER", tag = 4)
    public final C2244701CtQ params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String text;
    public static final ProtoAdapter<C2244601CtG> ADAPTER = new ProtoAdapter<C2244601CtG>() { // from class: X.1CtH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244601CtG decode(ProtoReader protoReader) {
            C2244621CtI c2244621CtI = new C2244621CtI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2244621CtI.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2244621CtI.LJI = C2244701CtQ.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2244621CtI.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2244621CtI.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2244621CtI.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244621CtI.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244601CtG c2244601CtG) {
            C2244601CtG c2244601CtG2 = c2244601CtG;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2244601CtG2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2244601CtG2.text) + protoAdapter.encodedSizeWithTag(3, c2244601CtG2.action) + C2244701CtQ.ADAPTER.encodedSizeWithTag(4, c2244601CtG2.params) + c2244601CtG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244601CtG redact(C2244601CtG c2244601CtG) {
            C2244621CtI c2244621CtINewBuilder = c2244601CtG.newBuilder();
            C2244701CtQ c2244701CtQ = c2244621CtINewBuilder.LJI;
            if (c2244701CtQ != null) {
                c2244621CtINewBuilder.LJI = C2244701CtQ.ADAPTER.redact(c2244701CtQ);
            }
            c2244621CtINewBuilder.clearUnknownFields();
            return c2244621CtINewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244601CtG c2244601CtG) {
            C2244601CtG c2244601CtG2 = c2244601CtG;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244601CtG2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2244601CtG2.text);
            protoAdapter.encodeWithTag(protoWriter, 3, c2244601CtG2.action);
            C2244701CtQ.ADAPTER.encodeWithTag(protoWriter, 4, c2244601CtG2.params);
            protoWriter.writeBytes(c2244601CtG2.unknownFields());
        }
    };
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_ACTION = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.id;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num2 = this.action;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        C2244701CtQ c2244701CtQ = this.params;
        int iHashCode5 = iHashCode4 + (c2244701CtQ != null ? c2244701CtQ.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2244621CtI newBuilder() {
        C2244621CtI c2244621CtI = new C2244621CtI();
        c2244621CtI.LIZLLL = this.id;
        c2244621CtI.LJ = this.text;
        c2244621CtI.LJFF = this.action;
        c2244621CtI.LJI = this.params;
        c2244621CtI.addUnknownFields(unknownFields());
        return c2244621CtI;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.params != null) {
            sb.append(", params=");
            sb.append(this.params);
        }
        sb.replace(0, 2, "Option{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244601CtG)) {
            return false;
        }
        C2244601CtG c2244601CtG = (C2244601CtG) obj;
        if (unknownFields().equals(c2244601CtG.unknownFields()) && C1516540pZE.LJ(this.id, c2244601CtG.id) && C1516540pZE.LJ(this.text, c2244601CtG.text) && C1516540pZE.LJ(this.action, c2244601CtG.action) && C1516540pZE.LJ(this.params, c2244601CtG.params)) {
            return true;
        }
        return false;
    }

    public C2244601CtG(Integer num, String str, Integer num2, C2244701CtQ c2244701CtQ) {
        this(num, str, num2, c2244701CtQ, ByteString.EMPTY);
    }

    public C2244601CtG(Integer num, String str, Integer num2, C2244701CtQ c2244701CtQ, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = num;
        this.text = str;
        this.action = num2;
        this.params = c2244701CtQ;
    }
}
