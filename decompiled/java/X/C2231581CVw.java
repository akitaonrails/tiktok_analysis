package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231581CVw extends Message<C2231581CVw, C2231601CVy> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long channel_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSdkFinishReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C1CW2 finish_link_mic_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 5)
    public final List<Long> link_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkerMode#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C1CW0 linker_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long rtc_room_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String self_link_mic_id;
    public static final ProtoAdapter<C2231581CVw> ADAPTER = new ProtoAdapter<C2231581CVw>() { // from class: X.1CVx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231581CVw decode(ProtoReader protoReader) {
            C2231601CVy c2231601CVy = new C2231601CVy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2231601CVy.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2231601CVy.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2231601CVy.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2231601CVy.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2231601CVy.LJII.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            try {
                                c2231601CVy.LJIIIIZZ = C1CW2.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2231601CVy.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 7:
                            try {
                                c2231601CVy.LJIIIZ = C1CW0.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2231601CVy.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2231601CVy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231601CVy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231581CVw c2231581CVw) {
            C2231581CVw c2231581CVw2 = c2231581CVw;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2231581CVw2.channel_id) + protoAdapter.encodedSizeWithTag(2, c2231581CVw2.group_channel_id) + protoAdapter.encodedSizeWithTag(3, c2231581CVw2.rtc_room_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, c2231581CVw2.self_link_mic_id) + protoAdapter.asPacked().encodedSizeWithTag(5, c2231581CVw2.link_state) + C1CW2.ADAPTER.encodedSizeWithTag(6, c2231581CVw2.finish_link_mic_reason) + C1CW0.ADAPTER.encodedSizeWithTag(7, c2231581CVw2.linker_mode) + c2231581CVw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231581CVw redact(C2231581CVw c2231581CVw) {
            C2231601CVy c2231601CVyNewBuilder = c2231581CVw.newBuilder();
            c2231601CVyNewBuilder.clearUnknownFields();
            return c2231601CVyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231581CVw c2231581CVw) {
            C2231581CVw c2231581CVw2 = c2231581CVw;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2231581CVw2.channel_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2231581CVw2.group_channel_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c2231581CVw2.rtc_room_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c2231581CVw2.self_link_mic_id);
            protoAdapter.asPacked().encodeWithTag(protoWriter, 5, c2231581CVw2.link_state);
            C1CW2.ADAPTER.encodeWithTag(protoWriter, 6, c2231581CVw2.finish_link_mic_reason);
            C1CW0.ADAPTER.encodeWithTag(protoWriter, 7, c2231581CVw2.linker_mode);
            protoWriter.writeBytes(c2231581CVw2.unknownFields());
        }
    };
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final Long DEFAULT_RTC_ROOM_ID = 0L;
    public static final C1CW2 DEFAULT_FINISH_LINK_MIC_REASON = C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_UNKNOWN;
    public static final C1CW0 DEFAULT_LINKER_MODE = C1CW0.VAR_LINKER_MODE_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.channel_id.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.rtc_room_id.hashCode()) * 37) + this.self_link_mic_id.hashCode()) * 37) + this.link_state.hashCode()) * 37) + this.finish_link_mic_reason.hashCode()) * 37) + this.linker_mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231601CVy newBuilder() {
        C2231601CVy c2231601CVy = new C2231601CVy();
        c2231601CVy.LIZLLL = this.channel_id;
        c2231601CVy.LJ = this.group_channel_id;
        c2231601CVy.LJFF = this.rtc_room_id;
        c2231601CVy.LJI = this.self_link_mic_id;
        c2231601CVy.LJII = C1516540pZE.LIZJ("link_state", this.link_state);
        c2231601CVy.LJIIIIZZ = this.finish_link_mic_reason;
        c2231601CVy.LJIIIZ = this.linker_mode;
        c2231601CVy.addUnknownFields(unknownFields());
        return c2231601CVy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", rtc_room_id=");
        sb.append(this.rtc_room_id);
        sb.append(", self_link_mic_id=");
        sb.append(this.self_link_mic_id);
        if (!this.link_state.isEmpty()) {
            sb.append(", link_state=");
            sb.append(this.link_state);
        }
        sb.append(", finish_link_mic_reason=");
        sb.append(this.finish_link_mic_reason);
        sb.append(", linker_mode=");
        sb.append(this.linker_mode);
        sb.replace(0, 2, "LinkMicCoreProperties{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231581CVw)) {
            return false;
        }
        C2231581CVw c2231581CVw = (C2231581CVw) obj;
        if (unknownFields().equals(c2231581CVw.unknownFields()) && this.channel_id.equals(c2231581CVw.channel_id) && this.group_channel_id.equals(c2231581CVw.group_channel_id) && this.rtc_room_id.equals(c2231581CVw.rtc_room_id) && this.self_link_mic_id.equals(c2231581CVw.self_link_mic_id) && this.link_state.equals(c2231581CVw.link_state) && this.finish_link_mic_reason.equals(c2231581CVw.finish_link_mic_reason) && this.linker_mode.equals(c2231581CVw.linker_mode)) {
            return true;
        }
        return false;
    }

    public C2231581CVw(Long l, Long l2, Long l3, String str, List<Long> list, C1CW2 c1cw2, C1CW0 c1cw0) {
        this(l, l2, l3, str, list, c1cw2, c1cw0, ByteString.EMPTY);
    }

    public C2231581CVw(Long l, Long l2, Long l3, String str, List<Long> list, C1CW2 c1cw2, C1CW0 c1cw0, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_id = l;
        this.group_channel_id = l2;
        this.rtc_room_id = l3;
        this.self_link_mic_id = str;
        this.link_state = C1516540pZE.LJFF("link_state", list);
        this.finish_link_mic_reason = c1cw2;
        this.linker_mode = c1cw0;
    }
}
