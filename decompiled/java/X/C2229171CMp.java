package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229171CMp extends Message<C2229171CMp, C2229191CMr> {
    public static final ProtoAdapter<C2229171CMp> ADAPTER = new ProtoAdapter<C2229171CMp>() { // from class: X.1CMq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229171CMp decode(ProtoReader protoReader) {
            C2229191CMr c2229191CMr = new C2229191CMr();
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
                                        c2229191CMr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2229191CMr.LJII = C1CJK.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2229191CMr.LJI = C2229201CMs.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2229191CMr.LJFF = C1CN5.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2229191CMr.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2229191CMr.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229191CMr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229171CMp c2229171CMp) {
            C2229171CMp c2229171CMp2 = c2229171CMp;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2229171CMp2.should_sync_independent_config) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2229171CMp2.server_mix_task_id) + C1CN5.ADAPTER.encodedSizeWithTag(3, c2229171CMp2.mix_video_stream_config) + C2229201CMs.ADAPTER.encodedSizeWithTag(4, c2229171CMp2.mix_audio_stream_config) + C1CJK.ADAPTER.encodedSizeWithTag(5, c2229171CMp2.resolution_info) + c2229171CMp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229171CMp redact(C2229171CMp c2229171CMp) {
            C2229191CMr c2229191CMrNewBuilder = c2229171CMp.newBuilder();
            c2229191CMrNewBuilder.LJFF = C1CN5.ADAPTER.redact(c2229191CMrNewBuilder.LJFF);
            c2229191CMrNewBuilder.LJI = C2229201CMs.ADAPTER.redact(c2229191CMrNewBuilder.LJI);
            C1CJK c1cjk = c2229191CMrNewBuilder.LJII;
            if (c1cjk != null) {
                c2229191CMrNewBuilder.LJII = C1CJK.ADAPTER.redact(c1cjk);
            }
            c2229191CMrNewBuilder.clearUnknownFields();
            return c2229191CMrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229171CMp c2229171CMp) {
            C2229171CMp c2229171CMp2 = c2229171CMp;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2229171CMp2.should_sync_independent_config);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2229171CMp2.server_mix_task_id);
            C1CN5.ADAPTER.encodeWithTag(protoWriter, 3, c2229171CMp2.mix_video_stream_config);
            C2229201CMs.ADAPTER.encodeWithTag(protoWriter, 4, c2229171CMp2.mix_audio_stream_config);
            C1CJK.ADAPTER.encodeWithTag(protoWriter, 5, c2229171CMp2.resolution_info);
            protoWriter.writeBytes(c2229171CMp2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_SHOULD_SYNC_INDEPENDENT_CONFIG = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcAudioMixStreamInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2229201CMs mix_audio_stream_config;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcVideoMixStreamInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CN5 mix_video_stream_config;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcMixStreamResolutionInfo#ADAPTER", tag = 5)
    public final C1CJK resolution_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String server_mix_task_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean should_sync_independent_config;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.should_sync_independent_config.hashCode()) * 37) + this.server_mix_task_id.hashCode()) * 37) + this.mix_video_stream_config.hashCode()) * 37) + this.mix_audio_stream_config.hashCode()) * 37;
        C1CJK c1cjk = this.resolution_info;
        int iHashCode2 = iHashCode + (c1cjk != null ? c1cjk.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2229191CMr newBuilder() {
        C2229191CMr c2229191CMr = new C2229191CMr();
        c2229191CMr.LIZLLL = this.should_sync_independent_config;
        c2229191CMr.LJ = this.server_mix_task_id;
        c2229191CMr.LJFF = this.mix_video_stream_config;
        c2229191CMr.LJI = this.mix_audio_stream_config;
        c2229191CMr.LJII = this.resolution_info;
        c2229191CMr.addUnknownFields(unknownFields());
        return c2229191CMr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", should_sync_independent_config=");
        sb.append(this.should_sync_independent_config);
        sb.append(", server_mix_task_id=");
        sb.append(this.server_mix_task_id);
        sb.append(", mix_video_stream_config=");
        sb.append(this.mix_video_stream_config);
        sb.append(", mix_audio_stream_config=");
        sb.append(this.mix_audio_stream_config);
        if (this.resolution_info != null) {
            sb.append(", resolution_info=");
            sb.append(this.resolution_info);
        }
        sb.replace(0, 2, "LinkMicRtcMixStreamConfig{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229171CMp)) {
            return false;
        }
        C2229171CMp c2229171CMp = (C2229171CMp) obj;
        if (unknownFields().equals(c2229171CMp.unknownFields()) && this.should_sync_independent_config.equals(c2229171CMp.should_sync_independent_config) && this.server_mix_task_id.equals(c2229171CMp.server_mix_task_id) && this.mix_video_stream_config.equals(c2229171CMp.mix_video_stream_config) && this.mix_audio_stream_config.equals(c2229171CMp.mix_audio_stream_config) && C1516540pZE.LJ(this.resolution_info, c2229171CMp.resolution_info)) {
            return true;
        }
        return false;
    }

    public C2229171CMp(Boolean bool, String str, C1CN5 c1cn5, C2229201CMs c2229201CMs, C1CJK c1cjk) {
        this(bool, str, c1cn5, c2229201CMs, c1cjk, ByteString.EMPTY);
    }

    public C2229171CMp(Boolean bool, String str, C1CN5 c1cn5, C2229201CMs c2229201CMs, C1CJK c1cjk, ByteString byteString) {
        super(ADAPTER, byteString);
        this.should_sync_independent_config = bool;
        this.server_mix_task_id = str;
        this.mix_video_stream_config = c1cn5;
        this.mix_audio_stream_config = c2229201CMs;
        this.resolution_info = c1cjk;
    }
}
