package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527080pqE extends Message<C1527080pqE, C1527200pqQ> {
    public static final ProtoAdapter<C1527080pqE> ADAPTER = new ProtoAdapter<C1527080pqE>() { // from class: X.0pqD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527080pqE decode(ProtoReader protoReader) {
            C1527200pqQ c1527200pqQ = new C1527200pqQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1527200pqQ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1527200pqQ.LJI = ProtoAdapter.BYTES.decode(protoReader);
                                }
                            } else {
                                c1527200pqQ.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c1527200pqQ.LJ = EnumC1527610pr5.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1527200pqQ.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1527200pqQ.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1527200pqQ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1527080pqE c1527080pqE) {
            C1527080pqE c1527080pqE2 = c1527080pqE;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1527080pqE2.business) + EnumC1527610pr5.ADAPTER.encodedSizeWithTag(2, c1527080pqE2.consume_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, c1527080pqE2.md5) + ProtoAdapter.BYTES.encodedSizeWithTag(4, c1527080pqE2.data) + c1527080pqE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527080pqE redact(C1527080pqE c1527080pqE) {
            C1527200pqQ c1527200pqQNewBuilder = c1527080pqE.newBuilder();
            c1527200pqQNewBuilder.clearUnknownFields();
            return c1527200pqQNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1527080pqE c1527080pqE) {
            C1527080pqE c1527080pqE2 = c1527080pqE;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1527080pqE2.business);
            EnumC1527610pr5.ADAPTER.encodeWithTag(protoWriter, 2, c1527080pqE2.consume_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c1527080pqE2.md5);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, c1527080pqE2.data);
            protoWriter.writeBytes(c1527080pqE2.unknownFields());
        }
    };
    public static final Integer DEFAULT_BUSINESS = 0;
    public static final EnumC1527610pr5 DEFAULT_CONSUME_TYPE = EnumC1527610pr5.OneByOne;
    public static final ByteString DEFAULT_DATA = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer business;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.ConsumeType#ADAPTER", tag = 2)
    public final EnumC1527610pr5 consume_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 4)
    public final ByteString data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String md5;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.business.hashCode()) * 37;
        EnumC1527610pr5 enumC1527610pr5 = this.consume_type;
        int iHashCode2 = (iHashCode + (enumC1527610pr5 != null ? enumC1527610pr5.hashCode() : 0)) * 37;
        String str = this.md5;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.data;
        int iHashCode4 = iHashCode3 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1527200pqQ newBuilder() {
        C1527200pqQ c1527200pqQ = new C1527200pqQ();
        c1527200pqQ.LIZLLL = this.business;
        c1527200pqQ.LJ = this.consume_type;
        c1527200pqQ.LJFF = this.md5;
        c1527200pqQ.LJI = this.data;
        c1527200pqQ.addUnknownFields(unknownFields());
        return c1527200pqQ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", business=");
        sb.append(this.business);
        if (this.consume_type != null) {
            sb.append(", consume_type=");
            sb.append(this.consume_type);
        }
        if (this.md5 != null) {
            sb.append(", md5=");
            sb.append(this.md5);
        }
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "BsyncPayload{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1527080pqE)) {
            return false;
        }
        C1527080pqE c1527080pqE = (C1527080pqE) obj;
        if (unknownFields().equals(c1527080pqE.unknownFields()) && this.business.equals(c1527080pqE.business) && C1516540pZE.LJ(this.consume_type, c1527080pqE.consume_type) && C1516540pZE.LJ(this.md5, c1527080pqE.md5) && C1516540pZE.LJ(this.data, c1527080pqE.data)) {
            return true;
        }
        return false;
    }

    public C1527080pqE(Integer num, EnumC1527610pr5 enumC1527610pr5, String str, ByteString byteString) {
        this(num, enumC1527610pr5, str, byteString, ByteString.EMPTY);
    }

    public C1527080pqE(Integer num, EnumC1527610pr5 enumC1527610pr5, String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.business = num;
        this.consume_type = enumC1527610pr5;
        this.md5 = str;
        this.data = byteString;
    }
}
