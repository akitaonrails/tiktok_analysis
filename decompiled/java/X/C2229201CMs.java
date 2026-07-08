package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229201CMs extends Message<C2229201CMs, C2229221CMu> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInteractAudioCodecType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2229231CMv codec;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String stream_audio_aac_profile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long stream_audio_bitrate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long stream_audio_channels;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long stream_audio_sample_rate;
    public static final ProtoAdapter<C2229201CMs> ADAPTER = new ProtoAdapter<C2229201CMs>() { // from class: X.1CMt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229201CMs decode(ProtoReader protoReader) {
            C2229221CMu c2229221CMu = new C2229221CMu();
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
                                        c2229221CMu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2229221CMu.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2229221CMu.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2229221CMu.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2229221CMu.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        try {
                            c2229221CMu.LIZLLL = EnumC2229231CMv.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2229221CMu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229221CMu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229201CMs c2229201CMs) {
            C2229201CMs c2229201CMs2 = c2229201CMs;
            int iEncodedSizeWithTag = EnumC2229231CMv.ADAPTER.encodedSizeWithTag(1, c2229201CMs2.codec);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2229201CMs2.stream_audio_channels) + protoAdapter.encodedSizeWithTag(3, c2229201CMs2.stream_audio_sample_rate) + protoAdapter.encodedSizeWithTag(4, c2229201CMs2.stream_audio_bitrate) + ProtoAdapter.STRING.encodedSizeWithTag(5, c2229201CMs2.stream_audio_aac_profile) + c2229201CMs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229201CMs redact(C2229201CMs c2229201CMs) {
            C2229221CMu c2229221CMuNewBuilder = c2229201CMs.newBuilder();
            c2229221CMuNewBuilder.clearUnknownFields();
            return c2229221CMuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229201CMs c2229201CMs) {
            C2229201CMs c2229201CMs2 = c2229201CMs;
            EnumC2229231CMv.ADAPTER.encodeWithTag(protoWriter, 1, c2229201CMs2.codec);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2229201CMs2.stream_audio_channels);
            protoAdapter.encodeWithTag(protoWriter, 3, c2229201CMs2.stream_audio_sample_rate);
            protoAdapter.encodeWithTag(protoWriter, 4, c2229201CMs2.stream_audio_bitrate);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c2229201CMs2.stream_audio_aac_profile);
            protoWriter.writeBytes(c2229201CMs2.unknownFields());
        }
    };
    public static final EnumC2229231CMv DEFAULT_CODEC = EnumC2229231CMv.VAR_LINK_MIC_INTERACT_AUDIO_CODEC_TYPE_HE;
    public static final Long DEFAULT_STREAM_AUDIO_CHANNELS = 0L;
    public static final Long DEFAULT_STREAM_AUDIO_SAMPLE_RATE = 0L;
    public static final Long DEFAULT_STREAM_AUDIO_BITRATE = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.codec.hashCode()) * 37) + this.stream_audio_channels.hashCode()) * 37) + this.stream_audio_sample_rate.hashCode()) * 37) + this.stream_audio_bitrate.hashCode()) * 37) + this.stream_audio_aac_profile.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229221CMu newBuilder() {
        C2229221CMu c2229221CMu = new C2229221CMu();
        c2229221CMu.LIZLLL = this.codec;
        c2229221CMu.LJ = this.stream_audio_channels;
        c2229221CMu.LJFF = this.stream_audio_sample_rate;
        c2229221CMu.LJI = this.stream_audio_bitrate;
        c2229221CMu.LJII = this.stream_audio_aac_profile;
        c2229221CMu.addUnknownFields(unknownFields());
        return c2229221CMu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", codec=");
        sb.append(this.codec);
        sb.append(", stream_audio_channels=");
        sb.append(this.stream_audio_channels);
        sb.append(", stream_audio_sample_rate=");
        sb.append(this.stream_audio_sample_rate);
        sb.append(", stream_audio_bitrate=");
        sb.append(this.stream_audio_bitrate);
        sb.append(", stream_audio_aac_profile=");
        sb.append(this.stream_audio_aac_profile);
        sb.replace(0, 2, "LinkMicRtcAudioMixStreamInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229201CMs)) {
            return false;
        }
        C2229201CMs c2229201CMs = (C2229201CMs) obj;
        if (unknownFields().equals(c2229201CMs.unknownFields()) && this.codec.equals(c2229201CMs.codec) && this.stream_audio_channels.equals(c2229201CMs.stream_audio_channels) && this.stream_audio_sample_rate.equals(c2229201CMs.stream_audio_sample_rate) && this.stream_audio_bitrate.equals(c2229201CMs.stream_audio_bitrate) && this.stream_audio_aac_profile.equals(c2229201CMs.stream_audio_aac_profile)) {
            return true;
        }
        return false;
    }

    public C2229201CMs(EnumC2229231CMv enumC2229231CMv, Long l, Long l2, Long l3, String str) {
        this(enumC2229231CMv, l, l2, l3, str, ByteString.EMPTY);
    }

    public C2229201CMs(EnumC2229231CMv enumC2229231CMv, Long l, Long l2, Long l3, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.codec = enumC2229231CMv;
        this.stream_audio_channels = l;
        this.stream_audio_sample_rate = l2;
        this.stream_audio_bitrate = l3;
        this.stream_audio_aac_profile = str;
    }
}
