package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242801CqM extends Message<C2242801CqM, C2242821CqO> {
    public static final ProtoAdapter<C2242801CqM> ADAPTER = new ProtoAdapter<C2242801CqM>() { // from class: X.1CqN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242801CqM decode(ProtoReader protoReader) {
            C2242821CqO c2242821CqO = new C2242821CqO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2242821CqO.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2242821CqO.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2242821CqO.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242821CqO.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242801CqM c2242801CqM) {
            C2242801CqM c2242801CqM2 = c2242801CqM;
            return C2243521CrW.ADAPTER.encodedSizeWithTag(1, c2242801CqM2.text) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2242801CqM2.footer_scene) + c2242801CqM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242801CqM redact(C2242801CqM c2242801CqM) {
            C2242821CqO c2242821CqONewBuilder = c2242801CqM.newBuilder();
            C2243521CrW c2243521CrW = c2242821CqONewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2242821CqONewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            c2242821CqONewBuilder.clearUnknownFields();
            return c2242821CqONewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242801CqM c2242801CqM) {
            C2242801CqM c2242801CqM2 = c2242801CqM;
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 1, c2242801CqM2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2242801CqM2.footer_scene);
            protoWriter.writeBytes(c2242801CqM2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String footer_scene;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.text;
        int iHashCode2 = (iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        String str = this.footer_scene;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2242821CqO newBuilder() {
        C2242821CqO c2242821CqO = new C2242821CqO();
        c2242821CqO.LIZLLL = this.text;
        c2242821CqO.LJ = this.footer_scene;
        c2242821CqO.addUnknownFields(unknownFields());
        return c2242821CqO;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.footer_scene != null) {
            sb.append(", footer_scene=");
            sb.append(this.footer_scene);
        }
        sb.replace(0, 2, "BaseFooter{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242801CqM)) {
            return false;
        }
        C2242801CqM c2242801CqM = (C2242801CqM) obj;
        if (unknownFields().equals(c2242801CqM.unknownFields()) && C1516540pZE.LJ(this.text, c2242801CqM.text) && C1516540pZE.LJ(this.footer_scene, c2242801CqM.footer_scene)) {
            return true;
        }
        return false;
    }

    public C2242801CqM(C2243521CrW c2243521CrW, String str) {
        this(c2243521CrW, str, ByteString.EMPTY);
    }

    public C2242801CqM(C2243521CrW c2243521CrW, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = c2243521CrW;
        this.footer_scene = str;
    }
}
