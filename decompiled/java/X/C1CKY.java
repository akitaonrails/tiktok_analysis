package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKY extends Message<C1CKY, C2228501CKa> {
    public static final ProtoAdapter<C1CKY> ADAPTER = new ProtoAdapter<C1CKY>() { // from class: X.1CKZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKY decode(ProtoReader protoReader) {
            C2228501CKa c2228501CKa = new C2228501CKa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2228501CKa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c2228501CKa.LJI = EnumC1282030jSz.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2228501CKa.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c2228501CKa.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c2228501CKa.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2228501CKa.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228501CKa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CKY c1cky) {
            C1CKY c1cky2 = c1cky;
            int iEncodedSizeWithTag = C2232021CXo.ADAPTER.encodedSizeWithTag(1, c1cky2.leave_user);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cky2.is_self_video_mute) + protoAdapter.encodedSizeWithTag(3, c1cky2.is_self_audio_mute) + EnumC1282030jSz.ADAPTER.encodedSizeWithTag(4, c1cky2.leave_reason) + c1cky2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKY redact(C1CKY c1cky) {
            C2228501CKa c2228501CKaNewBuilder = c1cky.newBuilder();
            c2228501CKaNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2228501CKaNewBuilder.LIZLLL);
            c2228501CKaNewBuilder.clearUnknownFields();
            return c2228501CKaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CKY c1cky) {
            C1CKY c1cky2 = c1cky;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c1cky2.leave_user);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cky2.is_self_video_mute);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cky2.is_self_audio_mute);
            EnumC1282030jSz.ADAPTER.encodeWithTag(protoWriter, 4, c1cky2.leave_reason);
            protoWriter.writeBytes(c1cky2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_SELF_AUDIO_MUTE;
    public static final Boolean DEFAULT_IS_SELF_VIDEO_MUTE;
    public static final EnumC1282030jSz DEFAULT_LEAVE_REASON;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean is_self_audio_mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_self_video_mute;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLeaveReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC1282030jSz leave_reason;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo leave_user;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_SELF_VIDEO_MUTE = bool;
        DEFAULT_IS_SELF_AUDIO_MUTE = bool;
        DEFAULT_LEAVE_REASON = EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_UNKNOWN;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.leave_user.hashCode()) * 37) + this.is_self_video_mute.hashCode()) * 37) + this.is_self_audio_mute.hashCode()) * 37) + this.leave_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228501CKa newBuilder() {
        C2228501CKa c2228501CKa = new C2228501CKa();
        c2228501CKa.LIZLLL = this.leave_user;
        c2228501CKa.LJ = this.is_self_video_mute;
        c2228501CKa.LJFF = this.is_self_audio_mute;
        c2228501CKa.LJI = this.leave_reason;
        c2228501CKa.addUnknownFields(unknownFields());
        return c2228501CKa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", leave_user=");
        sb.append(this.leave_user);
        sb.append(", is_self_video_mute=");
        sb.append(this.is_self_video_mute);
        sb.append(", is_self_audio_mute=");
        sb.append(this.is_self_audio_mute);
        sb.append(", leave_reason=");
        sb.append(this.leave_reason);
        sb.replace(0, 2, "LinkMicImLeaveModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CKY)) {
            return false;
        }
        C1CKY c1cky = (C1CKY) obj;
        if (unknownFields().equals(c1cky.unknownFields()) && this.leave_user.equals(c1cky.leave_user) && this.is_self_video_mute.equals(c1cky.is_self_video_mute) && this.is_self_audio_mute.equals(c1cky.is_self_audio_mute) && this.leave_reason.equals(c1cky.leave_reason)) {
            return true;
        }
        return false;
    }

    public C1CKY(C2232021CXo c2232021CXo, Boolean bool, Boolean bool2, EnumC1282030jSz enumC1282030jSz) {
        this(c2232021CXo, bool, bool2, enumC1282030jSz, ByteString.EMPTY);
    }

    public C1CKY(C2232021CXo c2232021CXo, Boolean bool, Boolean bool2, EnumC1282030jSz enumC1282030jSz, ByteString byteString) {
        super(ADAPTER, byteString);
        this.leave_user = c2232021CXo;
        this.is_self_video_mute = bool;
        this.is_self_audio_mute = bool2;
        this.leave_reason = enumC1282030jSz;
    }
}
