package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243061Cqm extends Message<C2243061Cqm, C2243111Cqr> {
    public static final ProtoAdapter<C2243061Cqm> ADAPTER = new ProtoAdapter<C2243061Cqm>() { // from class: X.1Cqn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243061Cqm decode(ProtoReader protoReader) {
            C2243111Cqr c2243111Cqr = new C2243111Cqr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2243111Cqr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2243111Cqr.LJI = C2243081Cqo.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2243111Cqr.LJFF = C2243521CrW.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243111Cqr.LJ = C2243521CrW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243111Cqr.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243111Cqr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243061Cqm c2243061Cqm) {
            C2243061Cqm c2243061Cqm2 = c2243061Cqm;
            int iEncodedSizeWithTag = C2244091CsR.ADAPTER.encodedSizeWithTag(1, c2243061Cqm2.image);
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2243061Cqm2.title) + protoAdapter.encodedSizeWithTag(3, c2243061Cqm2.subtitle) + C2243081Cqo.ADAPTER.encodedSizeWithTag(4, c2243061Cqm2.button) + c2243061Cqm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243061Cqm redact(C2243061Cqm c2243061Cqm) {
            C2243111Cqr c2243111CqrNewBuilder = c2243061Cqm.newBuilder();
            C2244091CsR c2244091CsR = c2243111CqrNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2243111CqrNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2243521CrW c2243521CrW = c2243111CqrNewBuilder.LJ;
            if (c2243521CrW != null) {
                c2243111CqrNewBuilder.LJ = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2243521CrW c2243521CrW2 = c2243111CqrNewBuilder.LJFF;
            if (c2243521CrW2 != null) {
                c2243111CqrNewBuilder.LJFF = C2243521CrW.ADAPTER.redact(c2243521CrW2);
            }
            C2243081Cqo c2243081Cqo = c2243111CqrNewBuilder.LJI;
            if (c2243081Cqo != null) {
                c2243111CqrNewBuilder.LJI = C2243081Cqo.ADAPTER.redact(c2243081Cqo);
            }
            c2243111CqrNewBuilder.clearUnknownFields();
            return c2243111CqrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243061Cqm c2243061Cqm) {
            C2243061Cqm c2243061Cqm2 = c2243061Cqm;
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 1, c2243061Cqm2.image);
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c2243061Cqm2.title);
            protoAdapter.encodeWithTag(protoWriter, 3, c2243061Cqm2.subtitle);
            C2243081Cqo.ADAPTER.encodeWithTag(protoWriter, 4, c2243061Cqm2.button);
            protoWriter.writeBytes(c2243061Cqm2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Button#ADAPTER", tag = 4)
    public final C2243081Cqo button;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final C2243521CrW subtitle;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final C2243521CrW title;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode2 = (iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.title;
        int iHashCode3 = (iHashCode2 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW2 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (c2243521CrW2 != null ? c2243521CrW2.hashCode() : 0)) * 37;
        C2243081Cqo c2243081Cqo = this.button;
        int iHashCode5 = iHashCode4 + (c2243081Cqo != null ? c2243081Cqo.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2243111Cqr newBuilder() {
        C2243111Cqr c2243111Cqr = new C2243111Cqr();
        c2243111Cqr.LIZLLL = this.image;
        c2243111Cqr.LJ = this.title;
        c2243111Cqr.LJFF = this.subtitle;
        c2243111Cqr.LJI = this.button;
        c2243111Cqr.addUnknownFields(unknownFields());
        return c2243111Cqr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (this.button != null) {
            sb.append(", button=");
            sb.append(this.button);
        }
        sb.replace(0, 2, "ImageCardTitle{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243061Cqm)) {
            return false;
        }
        C2243061Cqm c2243061Cqm = (C2243061Cqm) obj;
        if (unknownFields().equals(c2243061Cqm.unknownFields()) && C1516540pZE.LJ(this.image, c2243061Cqm.image) && C1516540pZE.LJ(this.title, c2243061Cqm.title) && C1516540pZE.LJ(this.subtitle, c2243061Cqm.subtitle) && C1516540pZE.LJ(this.button, c2243061Cqm.button)) {
            return true;
        }
        return false;
    }

    public C2243061Cqm(C2244091CsR c2244091CsR, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2243081Cqo c2243081Cqo) {
        this(c2244091CsR, c2243521CrW, c2243521CrW2, c2243081Cqo, ByteString.EMPTY);
    }

    public C2243061Cqm(C2244091CsR c2244091CsR, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2243081Cqo c2243081Cqo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = c2244091CsR;
        this.title = c2243521CrW;
        this.subtitle = c2243521CrW2;
        this.button = c2243081Cqo;
    }
}
