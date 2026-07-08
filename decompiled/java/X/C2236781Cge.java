package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236781Cge extends Message<C2236781Cge, C2236801Cgg> {
    public static final Boolean DEFAULT_DISABLE_LAYOUT_ON_CREATE;
    public static final EnumC1282170jTD DEFAULT_SETTING_ALLOW_REQUEST_FROM_FOLLOWER_ONLY;
    public static final EnumC1282170jTD DEFAULT_SETTING_ALLOW_REQUEST_FROM_USER;
    public static final EnumC1282170jTD DEFAULT_SETTING_FIX_MIC_NUM;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 6)
    public final Boolean disable_layout_on_create;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String frame_setting;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizUserSettingShowAction#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC1282170jTD setting_allow_request_from_follower_only;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizUserSettingShowAction#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC1282170jTD setting_allow_request_from_user;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizUserSettingShowAction#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC1282170jTD setting_fix_mic_num;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizUserSettingLayout#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2232101CXw setting_layout;
    public static final ProtoAdapter<C2236781Cge> ADAPTER = new ProtoAdapter<C2236781Cge>() { // from class: X.1Cgf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236781Cge decode(ProtoReader protoReader) {
            C2236801Cgg c2236801Cgg = new C2236801Cgg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2236801Cgg.LIZLLL = EnumC2232101CXw.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236801Cgg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            try {
                                c2236801Cgg.LJ = EnumC1282170jTD.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2236801Cgg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 3:
                            try {
                                c2236801Cgg.LJFF = EnumC1282170jTD.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2236801Cgg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 4:
                            try {
                                c2236801Cgg.LJI = EnumC1282170jTD.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                c2236801Cgg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            break;
                        case 5:
                            c2236801Cgg.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2236801Cgg.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236801Cgg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236801Cgg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236781Cge c2236781Cge) {
            C2236781Cge c2236781Cge2 = c2236781Cge;
            int iEncodedSizeWithTag = EnumC2232101CXw.ADAPTER.encodedSizeWithTag(1, c2236781Cge2.setting_layout);
            ProtoAdapter<EnumC1282170jTD> protoAdapter = EnumC1282170jTD.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2236781Cge2.setting_fix_mic_num) + protoAdapter.encodedSizeWithTag(3, c2236781Cge2.setting_allow_request_from_user) + protoAdapter.encodedSizeWithTag(4, c2236781Cge2.setting_allow_request_from_follower_only) + ProtoAdapter.STRING.encodedSizeWithTag(5, c2236781Cge2.frame_setting) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c2236781Cge2.disable_layout_on_create) + c2236781Cge2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236781Cge redact(C2236781Cge c2236781Cge) {
            C2236801Cgg c2236801CggNewBuilder = c2236781Cge.newBuilder();
            c2236801CggNewBuilder.clearUnknownFields();
            return c2236801CggNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236781Cge c2236781Cge) {
            C2236781Cge c2236781Cge2 = c2236781Cge;
            EnumC2232101CXw.ADAPTER.encodeWithTag(protoWriter, 1, c2236781Cge2.setting_layout);
            ProtoAdapter<EnumC1282170jTD> protoAdapter = EnumC1282170jTD.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c2236781Cge2.setting_fix_mic_num);
            protoAdapter.encodeWithTag(protoWriter, 3, c2236781Cge2.setting_allow_request_from_user);
            protoAdapter.encodeWithTag(protoWriter, 4, c2236781Cge2.setting_allow_request_from_follower_only);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c2236781Cge2.frame_setting);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c2236781Cge2.disable_layout_on_create);
            protoWriter.writeBytes(c2236781Cge2.unknownFields());
        }
    };
    public static final EnumC2232101CXw DEFAULT_SETTING_LAYOUT = EnumC2232101CXw.VAR_LINK_MIC_BIZ_USER_SETTING_LAYOUT_GRID;

    static {
        EnumC1282170jTD enumC1282170jTD = EnumC1282170jTD.VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_CHECKED;
        DEFAULT_SETTING_FIX_MIC_NUM = enumC1282170jTD;
        DEFAULT_SETTING_ALLOW_REQUEST_FROM_USER = enumC1282170jTD;
        DEFAULT_SETTING_ALLOW_REQUEST_FROM_FOLLOWER_ONLY = enumC1282170jTD;
        DEFAULT_DISABLE_LAYOUT_ON_CREATE = Boolean.FALSE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.setting_layout.hashCode()) * 37) + this.setting_fix_mic_num.hashCode()) * 37) + this.setting_allow_request_from_user.hashCode()) * 37) + this.setting_allow_request_from_follower_only.hashCode()) * 37) + this.frame_setting.hashCode()) * 37) + this.disable_layout_on_create.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236801Cgg newBuilder() {
        C2236801Cgg c2236801Cgg = new C2236801Cgg();
        c2236801Cgg.LIZLLL = this.setting_layout;
        c2236801Cgg.LJ = this.setting_fix_mic_num;
        c2236801Cgg.LJFF = this.setting_allow_request_from_user;
        c2236801Cgg.LJI = this.setting_allow_request_from_follower_only;
        c2236801Cgg.LJII = this.frame_setting;
        c2236801Cgg.LJIIIIZZ = this.disable_layout_on_create;
        c2236801Cgg.addUnknownFields(unknownFields());
        return c2236801Cgg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", setting_layout=");
        sb.append(this.setting_layout);
        sb.append(", setting_fix_mic_num=");
        sb.append(this.setting_fix_mic_num);
        sb.append(", setting_allow_request_from_user=");
        sb.append(this.setting_allow_request_from_user);
        sb.append(", setting_allow_request_from_follower_only=");
        sb.append(this.setting_allow_request_from_follower_only);
        sb.append(", frame_setting=");
        sb.append(this.frame_setting);
        sb.append(", disable_layout_on_create=");
        sb.append(this.disable_layout_on_create);
        sb.replace(0, 2, "LinkMicBizCreateChannelUserSetting{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236781Cge)) {
            return false;
        }
        C2236781Cge c2236781Cge = (C2236781Cge) obj;
        if (unknownFields().equals(c2236781Cge.unknownFields()) && this.setting_layout.equals(c2236781Cge.setting_layout) && this.setting_fix_mic_num.equals(c2236781Cge.setting_fix_mic_num) && this.setting_allow_request_from_user.equals(c2236781Cge.setting_allow_request_from_user) && this.setting_allow_request_from_follower_only.equals(c2236781Cge.setting_allow_request_from_follower_only) && this.frame_setting.equals(c2236781Cge.frame_setting) && this.disable_layout_on_create.equals(c2236781Cge.disable_layout_on_create)) {
            return true;
        }
        return false;
    }

    public C2236781Cge(EnumC2232101CXw enumC2232101CXw, EnumC1282170jTD enumC1282170jTD, EnumC1282170jTD enumC1282170jTD2, EnumC1282170jTD enumC1282170jTD3, String str, Boolean bool) {
        this(enumC2232101CXw, enumC1282170jTD, enumC1282170jTD2, enumC1282170jTD3, str, bool, ByteString.EMPTY);
    }

    public C2236781Cge(EnumC2232101CXw enumC2232101CXw, EnumC1282170jTD enumC1282170jTD, EnumC1282170jTD enumC1282170jTD2, EnumC1282170jTD enumC1282170jTD3, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting_layout = enumC2232101CXw;
        this.setting_fix_mic_num = enumC1282170jTD;
        this.setting_allow_request_from_user = enumC1282170jTD2;
        this.setting_allow_request_from_follower_only = enumC1282170jTD3;
        this.frame_setting = str;
        this.disable_layout_on_create = bool;
    }
}
