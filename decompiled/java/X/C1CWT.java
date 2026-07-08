package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CWT extends Message<C1CWT, C1CWV> {
    public static final ProtoAdapter<C1CWT> ADAPTER = new ProtoAdapter<C1CWT>() { // from class: X.1CWU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWT decode(ProtoReader protoReader) {
            C1CWV c1cwv = new C1CWV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cwv.LIZLLL = C1CW4.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c1cwv.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1cwv.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c1cwv.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1cwv.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c1cwv.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cwv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cwv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CWT c1cwt) {
            C1CWT c1cwt2 = c1cwt;
            int iEncodedSizeWithTag = C1CW4.ADAPTER.encodedSizeWithTag(1, c1cwt2.identity);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cwt2.audio_mute) + protoAdapter.encodedSizeWithTag(3, c1cwt2.video_mute) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1cwt2.online_user_state) + protoAdapter.encodedSizeWithTag(5, c1cwt2.win_state) + protoAdapter.encodedSizeWithTag(6, c1cwt2.audio_occupied) + c1cwt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CWT redact(C1CWT c1cwt) {
            C1CWV c1cwvNewBuilder = c1cwt.newBuilder();
            c1cwvNewBuilder.LIZLLL = C1CW4.ADAPTER.redact(c1cwvNewBuilder.LIZLLL);
            c1cwvNewBuilder.clearUnknownFields();
            return c1cwvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CWT c1cwt) {
            C1CWT c1cwt2 = c1cwt;
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 1, c1cwt2.identity);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 2, c1cwt2.audio_mute);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cwt2.video_mute);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c1cwt2.online_user_state);
            protoAdapter.encodeWithTag(protoWriter, 5, c1cwt2.win_state);
            protoAdapter.encodeWithTag(protoWriter, 6, c1cwt2.audio_occupied);
            protoWriter.writeBytes(c1cwt2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_AUDIO_MUTE;
    public static final Boolean DEFAULT_AUDIO_OCCUPIED;
    public static final Long DEFAULT_ONLINE_USER_STATE;
    public static final Boolean DEFAULT_VIDEO_MUTE;
    public static final Boolean DEFAULT_WIN_STATE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean audio_mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 6)
    public final Boolean audio_occupied;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CW4 identity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long online_user_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean video_mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean win_state;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_AUDIO_MUTE = bool;
        DEFAULT_VIDEO_MUTE = bool;
        DEFAULT_ONLINE_USER_STATE = 0L;
        DEFAULT_WIN_STATE = bool;
        DEFAULT_AUDIO_OCCUPIED = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.identity.hashCode()) * 37) + this.audio_mute.hashCode()) * 37) + this.video_mute.hashCode()) * 37) + this.online_user_state.hashCode()) * 37) + this.win_state.hashCode()) * 37) + this.audio_occupied.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CWV newBuilder() {
        C1CWV c1cwv = new C1CWV();
        c1cwv.LIZLLL = this.identity;
        c1cwv.LJ = this.audio_mute;
        c1cwv.LJFF = this.video_mute;
        c1cwv.LJI = this.online_user_state;
        c1cwv.LJII = this.win_state;
        c1cwv.LJIIIIZZ = this.audio_occupied;
        c1cwv.addUnknownFields(unknownFields());
        return c1cwv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", identity=");
        sb.append(this.identity);
        sb.append(", audio_mute=");
        sb.append(this.audio_mute);
        sb.append(", video_mute=");
        sb.append(this.video_mute);
        sb.append(", online_user_state=");
        sb.append(this.online_user_state);
        sb.append(", win_state=");
        sb.append(this.win_state);
        sb.append(", audio_occupied=");
        sb.append(this.audio_occupied);
        sb.replace(0, 2, "LinkMicUserStateSei{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CWT)) {
            return false;
        }
        C1CWT c1cwt = (C1CWT) obj;
        if (unknownFields().equals(c1cwt.unknownFields()) && this.identity.equals(c1cwt.identity) && this.audio_mute.equals(c1cwt.audio_mute) && this.video_mute.equals(c1cwt.video_mute) && this.online_user_state.equals(c1cwt.online_user_state) && this.win_state.equals(c1cwt.win_state) && this.audio_occupied.equals(c1cwt.audio_occupied)) {
            return true;
        }
        return false;
    }

    public C1CWT(C1CW4 c1cw4, Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4) {
        this(c1cw4, bool, bool2, l, bool3, bool4, ByteString.EMPTY);
    }

    public C1CWT(C1CW4 c1cw4, Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.identity = c1cw4;
        this.audio_mute = bool;
        this.video_mute = bool2;
        this.online_user_state = l;
        this.win_state = bool3;
        this.audio_occupied = bool4;
    }
}
