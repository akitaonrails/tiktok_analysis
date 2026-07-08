package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243341CrE extends Message<C2243341CrE, C2243421CrM> {
    public static final ProtoAdapter<C2243341CrE> ADAPTER = new ProtoAdapter<C2243341CrE>() { // from class: X.1CrF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243341CrE decode(ProtoReader protoReader) {
            C2243421CrM c2243421CrM = new C2243421CrM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2243421CrM.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c2243421CrM.LJI = EnumC2243411CrL.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2243421CrM.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c2243421CrM.LJFF = C2244321Cso.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243421CrM.LJ = C2243521CrW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243421CrM.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243421CrM.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243341CrE c2243341CrE) {
            C2243341CrE c2243341CrE2 = c2243341CrE;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2243341CrE2.text) + protoAdapter.encodedSizeWithTag(2, c2243341CrE2.hint) + C2244321Cso.ADAPTER.encodedSizeWithTag(3, c2243341CrE2.link) + EnumC2243411CrL.ADAPTER.encodedSizeWithTag(4, c2243341CrE2.type) + c2243341CrE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243341CrE redact(C2243341CrE c2243341CrE) {
            C2243421CrM c2243421CrMNewBuilder = c2243341CrE.newBuilder();
            C2243521CrW c2243521CrW = c2243421CrMNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2243421CrMNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2243521CrW c2243521CrW2 = c2243421CrMNewBuilder.LJ;
            if (c2243521CrW2 != null) {
                c2243421CrMNewBuilder.LJ = C2243521CrW.ADAPTER.redact(c2243521CrW2);
            }
            C2244321Cso c2244321Cso = c2243421CrMNewBuilder.LJFF;
            if (c2244321Cso != null) {
                c2243421CrMNewBuilder.LJFF = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            c2243421CrMNewBuilder.clearUnknownFields();
            return c2243421CrMNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243341CrE c2243341CrE) {
            C2243341CrE c2243341CrE2 = c2243341CrE;
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2243341CrE2.text);
            protoAdapter.encodeWithTag(protoWriter, 2, c2243341CrE2.hint);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 3, c2243341CrE2.link);
            EnumC2243411CrL.ADAPTER.encodeWithTag(protoWriter, 4, c2243341CrE2.type);
            protoWriter.writeBytes(c2243341CrE2.unknownFields());
        }
    };
    public static final EnumC2243411CrL DEFAULT_TYPE = EnumC2243411CrL.DEFAULT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final C2243521CrW hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C2244321Cso link;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ButtonType#ADAPTER", tag = 4)
    public final EnumC2243411CrL type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.text;
        int iHashCode2 = (iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW2 = this.hint;
        int iHashCode3 = (iHashCode2 + (c2243521CrW2 != null ? c2243521CrW2.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link;
        int iHashCode4 = (iHashCode3 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        EnumC2243411CrL enumC2243411CrL = this.type;
        int iHashCode5 = iHashCode4 + (enumC2243411CrL != null ? enumC2243411CrL.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2243421CrM newBuilder() {
        C2243421CrM c2243421CrM = new C2243421CrM();
        c2243421CrM.LIZLLL = this.text;
        c2243421CrM.LJ = this.hint;
        c2243421CrM.LJFF = this.link;
        c2243421CrM.LJI = this.type;
        c2243421CrM.addUnknownFields(unknownFields());
        return c2243421CrM;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.hint != null) {
            sb.append(", hint=");
            sb.append(this.hint);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        sb.replace(0, 2, "InfoCardButton{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243341CrE)) {
            return false;
        }
        C2243341CrE c2243341CrE = (C2243341CrE) obj;
        if (unknownFields().equals(c2243341CrE.unknownFields()) && C1516540pZE.LJ(this.text, c2243341CrE.text) && C1516540pZE.LJ(this.hint, c2243341CrE.hint) && C1516540pZE.LJ(this.link, c2243341CrE.link) && C1516540pZE.LJ(this.type, c2243341CrE.type)) {
            return true;
        }
        return false;
    }

    public C2243341CrE(C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2244321Cso c2244321Cso, EnumC2243411CrL enumC2243411CrL) {
        this(c2243521CrW, c2243521CrW2, c2244321Cso, enumC2243411CrL, ByteString.EMPTY);
    }

    public C2243341CrE(C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2244321Cso c2244321Cso, EnumC2243411CrL enumC2243411CrL, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = c2243521CrW;
        this.hint = c2243521CrW2;
        this.link = c2244321Cso;
        this.type = enumC2243411CrL;
    }
}
