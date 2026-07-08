package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236511CgD extends Message<C2236511CgD, C2236531CgF> {
    public static final ProtoAdapter<C2236511CgD> ADAPTER = new ProtoAdapter<C2236511CgD>() { // from class: X.1CgE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236511CgD decode(ProtoReader protoReader) {
            C2236531CgF c2236531CgF = new C2236531CgF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2236531CgF.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2236531CgF.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            try {
                                c2236531CgF.LJFF = EnumC2231981CXk.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236531CgF.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 4:
                            c2236531CgF.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2236531CgF.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2236531CgF.LJIIIIZZ = C2236541CgG.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236531CgF.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236531CgF.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236511CgD c2236511CgD) {
            C2236511CgD c2236511CgD2 = c2236511CgD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2236511CgD2.invoke_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2236511CgD2.applier) + EnumC2231981CXk.ADAPTER.encodedSizeWithTag(3, c2236511CgD2.reply_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, c2236511CgD2.scene_version) + protoAdapter.encodedSizeWithTag(5, c2236511CgD2.layout_id) + C2236541CgG.ADAPTER.encodedSizeWithTag(6, c2236511CgD2.biz_params) + c2236511CgD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236511CgD redact(C2236511CgD c2236511CgD) {
            C2236531CgF c2236531CgFNewBuilder = c2236511CgD.newBuilder();
            c2236531CgFNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2236531CgFNewBuilder.LJ);
            C2236541CgG c2236541CgG = c2236531CgFNewBuilder.LJIIIIZZ;
            if (c2236541CgG != null) {
                c2236531CgFNewBuilder.LJIIIIZZ = C2236541CgG.ADAPTER.redact(c2236541CgG);
            }
            c2236531CgFNewBuilder.clearUnknownFields();
            return c2236531CgFNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236511CgD c2236511CgD) {
            C2236511CgD c2236511CgD2 = c2236511CgD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236511CgD2.invoke_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2236511CgD2.applier);
            EnumC2231981CXk.ADAPTER.encodeWithTag(protoWriter, 3, c2236511CgD2.reply_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c2236511CgD2.scene_version);
            protoAdapter.encodeWithTag(protoWriter, 5, c2236511CgD2.layout_id);
            C2236541CgG.ADAPTER.encodeWithTag(protoWriter, 6, c2236511CgD2.biz_params);
            protoWriter.writeBytes(c2236511CgD2.unknownFields());
        }
    };
    public static final EnumC2231981CXk DEFAULT_REPLY_TYPE = EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_UNKNOWN;
    public static final Long DEFAULT_SCENE_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo applier;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizPermitParams#ADAPTER", tag = 6)
    public final C2236541CgG biz_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String layout_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAgreeStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC2231981CXk reply_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long scene_version;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.applier.hashCode()) * 37) + this.reply_type.hashCode()) * 37) + this.scene_version.hashCode()) * 37) + this.layout_id.hashCode()) * 37;
        C2236541CgG c2236541CgG = this.biz_params;
        int iHashCode2 = iHashCode + (c2236541CgG != null ? c2236541CgG.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2236531CgF newBuilder() {
        C2236531CgF c2236531CgF = new C2236531CgF();
        c2236531CgF.LIZLLL = this.invoke_id;
        c2236531CgF.LJ = this.applier;
        c2236531CgF.LJFF = this.reply_type;
        c2236531CgF.LJI = this.scene_version;
        c2236531CgF.LJII = this.layout_id;
        c2236531CgF.LJIIIIZZ = this.biz_params;
        c2236531CgF.addUnknownFields(unknownFields());
        return c2236531CgF;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", applier=");
        sb.append(this.applier);
        sb.append(", reply_type=");
        sb.append(this.reply_type);
        sb.append(", scene_version=");
        sb.append(this.scene_version);
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        if (this.biz_params != null) {
            sb.append(", biz_params=");
            sb.append(this.biz_params);
        }
        sb.replace(0, 2, "LinkMicPermitParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236511CgD)) {
            return false;
        }
        C2236511CgD c2236511CgD = (C2236511CgD) obj;
        if (unknownFields().equals(c2236511CgD.unknownFields()) && this.invoke_id.equals(c2236511CgD.invoke_id) && this.applier.equals(c2236511CgD.applier) && this.reply_type.equals(c2236511CgD.reply_type) && this.scene_version.equals(c2236511CgD.scene_version) && this.layout_id.equals(c2236511CgD.layout_id) && C1516540pZE.LJ(this.biz_params, c2236511CgD.biz_params)) {
            return true;
        }
        return false;
    }

    public C2236511CgD(String str, C2232021CXo c2232021CXo, EnumC2231981CXk enumC2231981CXk, Long l, String str2, C2236541CgG c2236541CgG) {
        this(str, c2232021CXo, enumC2231981CXk, l, str2, c2236541CgG, ByteString.EMPTY);
    }

    public C2236511CgD(String str, C2232021CXo c2232021CXo, EnumC2231981CXk enumC2231981CXk, Long l, String str2, C2236541CgG c2236541CgG, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.applier = c2232021CXo;
        this.reply_type = enumC2231981CXk;
        this.scene_version = l;
        this.layout_id = str2;
        this.biz_params = c2236541CgG;
    }
}
