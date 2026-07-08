package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVI extends Message<C1CVI, C1CVJ> {
    public static final ProtoAdapter<C1CVI> ADAPTER = new ProtoAdapter<C1CVI>() { // from class: X.1CVH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVI decode(ProtoReader protoReader) {
            C1CVJ c1cvj = new C1CVJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cvj.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c1cvj.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1cvj.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c1cvj.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c1cvj.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c1cvj.LJIIIIZZ = C1CW2.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cvj.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cvj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVI c1cvi) {
            C1CVI c1cvi2 = c1cvi;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c1cvi2.is_joining_or_joined_rtc) + protoAdapter.encodedSizeWithTag(2, c1cvi2.had_start_interactive) + protoAdapter.encodedSizeWithTag(3, c1cvi2.had_setup_live_core) + protoAdapter.encodedSizeWithTag(4, c1cvi2.will_start_join_channel) + protoAdapter.encodedSizeWithTag(5, c1cvi2.is_local_float_layout) + C1CW2.ADAPTER.encodedSizeWithTag(6, c1cvi2.finish_link_mic_reason) + c1cvi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVI redact(C1CVI c1cvi) {
            C1CVJ c1cvjNewBuilder = c1cvi.newBuilder();
            c1cvjNewBuilder.clearUnknownFields();
            return c1cvjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVI c1cvi) {
            C1CVI c1cvi2 = c1cvi;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cvi2.is_joining_or_joined_rtc);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cvi2.had_start_interactive);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cvi2.had_setup_live_core);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cvi2.will_start_join_channel);
            protoAdapter.encodeWithTag(protoWriter, 5, c1cvi2.is_local_float_layout);
            C1CW2.ADAPTER.encodeWithTag(protoWriter, 6, c1cvi2.finish_link_mic_reason);
            protoWriter.writeBytes(c1cvi2.unknownFields());
        }
    };
    public static final C1CW2 DEFAULT_FINISH_LINK_MIC_REASON;
    public static final Boolean DEFAULT_HAD_SETUP_LIVE_CORE;
    public static final Boolean DEFAULT_HAD_START_INTERACTIVE;
    public static final Boolean DEFAULT_IS_JOINING_OR_JOINED_RTC;
    public static final Boolean DEFAULT_IS_LOCAL_FLOAT_LAYOUT;
    public static final Boolean DEFAULT_WILL_START_JOIN_CHANNEL;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSdkFinishReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C1CW2 finish_link_mic_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean had_setup_live_core;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean had_start_interactive;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean is_joining_or_joined_rtc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean is_local_float_layout;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean will_start_join_channel;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_JOINING_OR_JOINED_RTC = bool;
        DEFAULT_HAD_START_INTERACTIVE = bool;
        DEFAULT_HAD_SETUP_LIVE_CORE = bool;
        DEFAULT_WILL_START_JOIN_CHANNEL = bool;
        DEFAULT_IS_LOCAL_FLOAT_LAYOUT = bool;
        DEFAULT_FINISH_LINK_MIC_REASON = C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_UNKNOWN;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.is_joining_or_joined_rtc.hashCode()) * 37) + this.had_start_interactive.hashCode()) * 37) + this.had_setup_live_core.hashCode()) * 37) + this.will_start_join_channel.hashCode()) * 37) + this.is_local_float_layout.hashCode()) * 37) + this.finish_link_mic_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVJ newBuilder() {
        C1CVJ c1cvj = new C1CVJ();
        c1cvj.LIZLLL = this.is_joining_or_joined_rtc;
        c1cvj.LJ = this.had_start_interactive;
        c1cvj.LJFF = this.had_setup_live_core;
        c1cvj.LJI = this.will_start_join_channel;
        c1cvj.LJII = this.is_local_float_layout;
        c1cvj.LJIIIIZZ = this.finish_link_mic_reason;
        c1cvj.addUnknownFields(unknownFields());
        return c1cvj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_joining_or_joined_rtc=");
        sb.append(this.is_joining_or_joined_rtc);
        sb.append(", had_start_interactive=");
        sb.append(this.had_start_interactive);
        sb.append(", had_setup_live_core=");
        sb.append(this.had_setup_live_core);
        sb.append(", will_start_join_channel=");
        sb.append(this.will_start_join_channel);
        sb.append(", is_local_float_layout=");
        sb.append(this.is_local_float_layout);
        sb.append(", finish_link_mic_reason=");
        sb.append(this.finish_link_mic_reason);
        sb.replace(0, 2, "LinkMicFlags{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVI)) {
            return false;
        }
        C1CVI c1cvi = (C1CVI) obj;
        if (unknownFields().equals(c1cvi.unknownFields()) && this.is_joining_or_joined_rtc.equals(c1cvi.is_joining_or_joined_rtc) && this.had_start_interactive.equals(c1cvi.had_start_interactive) && this.had_setup_live_core.equals(c1cvi.had_setup_live_core) && this.will_start_join_channel.equals(c1cvi.will_start_join_channel) && this.is_local_float_layout.equals(c1cvi.is_local_float_layout) && this.finish_link_mic_reason.equals(c1cvi.finish_link_mic_reason)) {
            return true;
        }
        return false;
    }

    public C1CVI(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, C1CW2 c1cw2) {
        this(bool, bool2, bool3, bool4, bool5, c1cw2, ByteString.EMPTY);
    }

    public C1CVI(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, C1CW2 c1cw2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_joining_or_joined_rtc = bool;
        this.had_start_interactive = bool2;
        this.had_setup_live_core = bool3;
        this.will_start_join_channel = bool4;
        this.is_local_float_layout = bool5;
        this.finish_link_mic_reason = c1cw2;
    }
}
