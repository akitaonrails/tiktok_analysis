package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228361CJm extends Message<C2228361CJm, C2228381CJo> {
    public static final ProtoAdapter<C2228361CJm> ADAPTER = new ProtoAdapter<C2228361CJm>() { // from class: X.1CJn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228361CJm decode(ProtoReader protoReader) {
            C2228381CJo c2228381CJo = new C2228381CJo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2228381CJo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2228381CJo.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2228381CJo.LJ = EnumC2230391CRh.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2228381CJo.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2228381CJo.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228381CJo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228361CJm c2228361CJm) {
            C2228361CJm c2228361CJm2 = c2228361CJm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2228361CJm2.key) + EnumC2230391CRh.ADAPTER.encodedSizeWithTag(2, c2228361CJm2.k_type) + protoAdapter.encodedSizeWithTag(3, c2228361CJm2.default_value) + c2228361CJm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228361CJm redact(C2228361CJm c2228361CJm) {
            C2228381CJo c2228381CJoNewBuilder = c2228361CJm.newBuilder();
            c2228381CJoNewBuilder.clearUnknownFields();
            return c2228381CJoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228361CJm c2228361CJm) {
            C2228361CJm c2228361CJm2 = c2228361CJm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228361CJm2.key);
            EnumC2230391CRh.ADAPTER.encodeWithTag(protoWriter, 2, c2228361CJm2.k_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c2228361CJm2.default_value);
            protoWriter.writeBytes(c2228361CJm2.unknownFields());
        }
    };
    public static final EnumC2230391CRh DEFAULT_K_TYPE = EnumC2230391CRh.VAR_LINK_MIC_SETTING_TYPE_BOOL;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String default_value;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSettingType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2230391CRh k_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String key;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.k_type.hashCode()) * 37) + this.default_value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228381CJo newBuilder() {
        C2228381CJo c2228381CJo = new C2228381CJo();
        c2228381CJo.LIZLLL = this.key;
        c2228381CJo.LJ = this.k_type;
        c2228381CJo.LJFF = this.default_value;
        c2228381CJo.addUnknownFields(unknownFields());
        return c2228381CJo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", k_type=");
        sb.append(this.k_type);
        sb.append(", default_value=");
        sb.append(this.default_value);
        sb.replace(0, 2, "LinkMicSetting{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228361CJm)) {
            return false;
        }
        C2228361CJm c2228361CJm = (C2228361CJm) obj;
        if (unknownFields().equals(c2228361CJm.unknownFields()) && this.key.equals(c2228361CJm.key) && this.k_type.equals(c2228361CJm.k_type) && this.default_value.equals(c2228361CJm.default_value)) {
            return true;
        }
        return false;
    }

    public C2228361CJm(String str, EnumC2230391CRh enumC2230391CRh, String str2) {
        this(str, enumC2230391CRh, str2, ByteString.EMPTY);
    }

    public C2228361CJm(String str, EnumC2230391CRh enumC2230391CRh, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.k_type = enumC2230391CRh;
        this.default_value = str2;
    }
}
