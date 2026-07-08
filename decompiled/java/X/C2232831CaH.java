package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232831CaH extends Message<C2232831CaH, C2232851CaJ> {
    public static final ProtoAdapter<C2232831CaH> ADAPTER = new ProtoAdapter<C2232831CaH>() { // from class: X.1CaI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232831CaH decode(ProtoReader protoReader) {
            C2232851CaJ c2232851CaJ = new C2232851CaJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232851CaJ.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c2232851CaJ.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2232851CaJ.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c2232851CaJ.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c2232851CaJ.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2232851CaJ.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232851CaJ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232851CaJ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232831CaH c2232831CaH) {
            C2232831CaH c2232831CaH2 = c2232831CaH;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c2232831CaH2.remote_joined) + protoAdapter.encodedSizeWithTag(2, c2232831CaH2.remote_audio_data) + protoAdapter.encodedSizeWithTag(3, c2232831CaH2.remote_video_data) + protoAdapter.encodedSizeWithTag(4, c2232831CaH2.first_frame_render) + protoAdapter.encodedSizeWithTag(5, c2232831CaH2.remote_leaved) + ProtoAdapter.STRING.encodedSizeWithTag(6, c2232831CaH2.desc) + c2232831CaH2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232831CaH redact(C2232831CaH c2232831CaH) {
            C2232851CaJ c2232851CaJNewBuilder = c2232831CaH.newBuilder();
            c2232851CaJNewBuilder.clearUnknownFields();
            return c2232851CaJNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232831CaH c2232831CaH) {
            C2232831CaH c2232831CaH2 = c2232831CaH;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232831CaH2.remote_joined);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232831CaH2.remote_audio_data);
            protoAdapter.encodeWithTag(protoWriter, 3, c2232831CaH2.remote_video_data);
            protoAdapter.encodeWithTag(protoWriter, 4, c2232831CaH2.first_frame_render);
            protoAdapter.encodeWithTag(protoWriter, 5, c2232831CaH2.remote_leaved);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, c2232831CaH2.desc);
            protoWriter.writeBytes(c2232831CaH2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_FIRST_FRAME_RENDER;
    public static final Boolean DEFAULT_REMOTE_AUDIO_DATA;
    public static final Boolean DEFAULT_REMOTE_JOINED;
    public static final Boolean DEFAULT_REMOTE_LEAVED;
    public static final Boolean DEFAULT_REMOTE_VIDEO_DATA;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 6)
    public final String desc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean first_frame_render;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean remote_audio_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean remote_joined;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean remote_leaved;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean remote_video_data;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_REMOTE_JOINED = bool;
        DEFAULT_REMOTE_AUDIO_DATA = bool;
        DEFAULT_REMOTE_VIDEO_DATA = bool;
        DEFAULT_FIRST_FRAME_RENDER = bool;
        DEFAULT_REMOTE_LEAVED = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.remote_joined.hashCode()) * 37) + this.remote_audio_data.hashCode()) * 37) + this.remote_video_data.hashCode()) * 37) + this.first_frame_render.hashCode()) * 37) + this.remote_leaved.hashCode()) * 37) + this.desc.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232851CaJ newBuilder() {
        C2232851CaJ c2232851CaJ = new C2232851CaJ();
        c2232851CaJ.LIZLLL = this.remote_joined;
        c2232851CaJ.LJ = this.remote_audio_data;
        c2232851CaJ.LJFF = this.remote_video_data;
        c2232851CaJ.LJI = this.first_frame_render;
        c2232851CaJ.LJII = this.remote_leaved;
        c2232851CaJ.LJIIIIZZ = this.desc;
        c2232851CaJ.addUnknownFields(unknownFields());
        return c2232851CaJ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", remote_joined=");
        sb.append(this.remote_joined);
        sb.append(", remote_audio_data=");
        sb.append(this.remote_audio_data);
        sb.append(", remote_video_data=");
        sb.append(this.remote_video_data);
        sb.append(", first_frame_render=");
        sb.append(this.first_frame_render);
        sb.append(", remote_leaved=");
        sb.append(this.remote_leaved);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.replace(0, 2, "UserLinkRtcState{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232831CaH)) {
            return false;
        }
        C2232831CaH c2232831CaH = (C2232831CaH) obj;
        if (unknownFields().equals(c2232831CaH.unknownFields()) && this.remote_joined.equals(c2232831CaH.remote_joined) && this.remote_audio_data.equals(c2232831CaH.remote_audio_data) && this.remote_video_data.equals(c2232831CaH.remote_video_data) && this.first_frame_render.equals(c2232831CaH.first_frame_render) && this.remote_leaved.equals(c2232831CaH.remote_leaved) && this.desc.equals(c2232831CaH.desc)) {
            return true;
        }
        return false;
    }

    public C2232831CaH(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str) {
        this(bool, bool2, bool3, bool4, bool5, str, ByteString.EMPTY);
    }

    public C2232831CaH(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.remote_joined = bool;
        this.remote_audio_data = bool2;
        this.remote_video_data = bool3;
        this.first_frame_render = bool4;
        this.remote_leaved = bool5;
        this.desc = str;
    }
}
