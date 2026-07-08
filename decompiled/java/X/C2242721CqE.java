package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242721CqE extends Message<C2242721CqE, C2242741CqG> {
    public static final ProtoAdapter<C2242721CqE> ADAPTER = new ProtoAdapter<C2242721CqE>() { // from class: X.1CqF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242721CqE decode(ProtoReader protoReader) {
            C2242741CqG c2242741CqG = new C2242741CqG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2242741CqG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c2242741CqG.LJI = C0IBA.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2242741CqG.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c2242741CqG.LJFF = C2244321Cso.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2242741CqG.LJ = C2243521CrW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2242741CqG.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242741CqG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242721CqE c2242721CqE) {
            C2242721CqE c2242721CqE2 = c2242721CqE;
            return C2244091CsR.ADAPTER.encodedSizeWithTag(1, c2242721CqE2.image) + C2243521CrW.ADAPTER.encodedSizeWithTag(2, c2242721CqE2.text) + C2244321Cso.ADAPTER.encodedSizeWithTag(3, c2242721CqE2.link_info) + C0IBA.ADAPTER.encodedSizeWithTag(4, c2242721CqE2.status) + c2242721CqE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242721CqE redact(C2242721CqE c2242721CqE) {
            C2242741CqG c2242741CqGNewBuilder = c2242721CqE.newBuilder();
            C2244091CsR c2244091CsR = c2242741CqGNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2242741CqGNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2243521CrW c2243521CrW = c2242741CqGNewBuilder.LJ;
            if (c2243521CrW != null) {
                c2242741CqGNewBuilder.LJ = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2244321Cso c2244321Cso = c2242741CqGNewBuilder.LJFF;
            if (c2244321Cso != null) {
                c2242741CqGNewBuilder.LJFF = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            c2242741CqGNewBuilder.clearUnknownFields();
            return c2242741CqGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242721CqE c2242721CqE) {
            C2242721CqE c2242721CqE2 = c2242721CqE;
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 1, c2242721CqE2.image);
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 2, c2242721CqE2.text);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 3, c2242721CqE2.link_info);
            C0IBA.ADAPTER.encodeWithTag(protoWriter, 4, c2242721CqE2.status);
            protoWriter.writeBytes(c2242721CqE2.unknownFields());
        }
    };
    public static final C0IBA DEFAULT_STATUS = C0IBA.UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackStatus#ADAPTER", tag = 4)
    public final C0IBA status;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final C2243521CrW text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode2 = (iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.text;
        int iHashCode3 = (iHashCode2 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode4 = (iHashCode3 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C0IBA c0iba = this.status;
        int iHashCode5 = iHashCode4 + (c0iba != null ? c0iba.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2242741CqG newBuilder() {
        C2242741CqG c2242741CqG = new C2242741CqG();
        c2242741CqG.LIZLLL = this.image;
        c2242741CqG.LJ = this.text;
        c2242741CqG.LJFF = this.link_info;
        c2242741CqG.LJI = this.status;
        c2242741CqG.addUnknownFields(unknownFields());
        return c2242741CqG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        sb.replace(0, 2, "VideoCardFallbackInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242721CqE)) {
            return false;
        }
        C2242721CqE c2242721CqE = (C2242721CqE) obj;
        if (unknownFields().equals(c2242721CqE.unknownFields()) && C1516540pZE.LJ(this.image, c2242721CqE.image) && C1516540pZE.LJ(this.text, c2242721CqE.text) && C1516540pZE.LJ(this.link_info, c2242721CqE.link_info) && C1516540pZE.LJ(this.status, c2242721CqE.status)) {
            return true;
        }
        return false;
    }

    public C2242721CqE(C2244091CsR c2244091CsR, C2243521CrW c2243521CrW, C2244321Cso c2244321Cso, C0IBA c0iba) {
        this(c2244091CsR, c2243521CrW, c2244321Cso, c0iba, ByteString.EMPTY);
    }

    public C2242721CqE(C2244091CsR c2244091CsR, C2243521CrW c2243521CrW, C2244321Cso c2244321Cso, C0IBA c0iba, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = c2244091CsR;
        this.text = c2243521CrW;
        this.link_info = c2244321Cso;
        this.status = c0iba;
    }
}
