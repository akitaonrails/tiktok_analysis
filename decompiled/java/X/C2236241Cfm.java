package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236241Cfm extends Message<C2236241Cfm, C2236261Cfo> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiLiveBizCreateChannelParams#ADAPTER", tag = 4)
    public final C2236271Cfp biz_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String layout_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC2183371Ach link_arch_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long max_position;
    public static final ProtoAdapter<C2236241Cfm> ADAPTER = new ProtoAdapter<C2236241Cfm>() { // from class: X.1Cfn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236241Cfm decode(ProtoReader protoReader) {
            C2236261Cfo c2236261Cfo = new C2236261Cfo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2236261Cfo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        try {
                                            c2236261Cfo.LJII = EnumC2183371Ach.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c2236261Cfo.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                    }
                                } else {
                                    c2236261Cfo.LJI = C2236271Cfp.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2236261Cfo.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2236261Cfo.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2236261Cfo.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236261Cfo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236241Cfm c2236241Cfm) {
            C2236241Cfm c2236241Cfm2 = c2236241Cfm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2236241Cfm2.invoke_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2236241Cfm2.max_position) + protoAdapter.encodedSizeWithTag(3, c2236241Cfm2.layout_id) + C2236271Cfp.ADAPTER.encodedSizeWithTag(4, c2236241Cfm2.biz_params) + EnumC2183371Ach.ADAPTER.encodedSizeWithTag(5, c2236241Cfm2.link_arch_type) + c2236241Cfm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236241Cfm redact(C2236241Cfm c2236241Cfm) {
            C2236261Cfo c2236261CfoNewBuilder = c2236241Cfm.newBuilder();
            C2236271Cfp c2236271Cfp = c2236261CfoNewBuilder.LJI;
            if (c2236271Cfp != null) {
                c2236261CfoNewBuilder.LJI = C2236271Cfp.ADAPTER.redact(c2236271Cfp);
            }
            c2236261CfoNewBuilder.clearUnknownFields();
            return c2236261CfoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236241Cfm c2236241Cfm) {
            C2236241Cfm c2236241Cfm2 = c2236241Cfm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236241Cfm2.invoke_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2236241Cfm2.max_position);
            protoAdapter.encodeWithTag(protoWriter, 3, c2236241Cfm2.layout_id);
            C2236271Cfp.ADAPTER.encodeWithTag(protoWriter, 4, c2236241Cfm2.biz_params);
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 5, c2236241Cfm2.link_arch_type);
            protoWriter.writeBytes(c2236241Cfm2.unknownFields());
        }
    };
    public static final Long DEFAULT_MAX_POSITION = 0L;
    public static final EnumC2183371Ach DEFAULT_LINK_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.max_position.hashCode()) * 37) + this.layout_id.hashCode()) * 37;
        C2236271Cfp c2236271Cfp = this.biz_params;
        int iHashCode2 = ((iHashCode + (c2236271Cfp != null ? c2236271Cfp.hashCode() : 0)) * 37) + this.link_arch_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2236261Cfo newBuilder() {
        C2236261Cfo c2236261Cfo = new C2236261Cfo();
        c2236261Cfo.LIZLLL = this.invoke_id;
        c2236261Cfo.LJ = this.max_position;
        c2236261Cfo.LJFF = this.layout_id;
        c2236261Cfo.LJI = this.biz_params;
        c2236261Cfo.LJII = this.link_arch_type;
        c2236261Cfo.addUnknownFields(unknownFields());
        return c2236261Cfo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", max_position=");
        sb.append(this.max_position);
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        if (this.biz_params != null) {
            sb.append(", biz_params=");
            sb.append(this.biz_params);
        }
        sb.append(", link_arch_type=");
        sb.append(this.link_arch_type);
        sb.replace(0, 2, "LinkMicCreateChannelParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236241Cfm)) {
            return false;
        }
        C2236241Cfm c2236241Cfm = (C2236241Cfm) obj;
        if (unknownFields().equals(c2236241Cfm.unknownFields()) && this.invoke_id.equals(c2236241Cfm.invoke_id) && this.max_position.equals(c2236241Cfm.max_position) && this.layout_id.equals(c2236241Cfm.layout_id) && C1516540pZE.LJ(this.biz_params, c2236241Cfm.biz_params) && this.link_arch_type.equals(c2236241Cfm.link_arch_type)) {
            return true;
        }
        return false;
    }

    public C2236241Cfm(String str, Long l, String str2, C2236271Cfp c2236271Cfp, EnumC2183371Ach enumC2183371Ach) {
        this(str, l, str2, c2236271Cfp, enumC2183371Ach, ByteString.EMPTY);
    }

    public C2236241Cfm(String str, Long l, String str2, C2236271Cfp c2236271Cfp, EnumC2183371Ach enumC2183371Ach, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.max_position = l;
        this.layout_id = str2;
        this.biz_params = c2236271Cfp;
        this.link_arch_type = enumC2183371Ach;
    }
}
