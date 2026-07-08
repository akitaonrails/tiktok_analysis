package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231271CUr extends Message<C2231271CUr, C2231291CUt> {
    public static final ProtoAdapter<C2231271CUr> ADAPTER = new ProtoAdapter<C2231271CUr>() { // from class: X.1CUs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231271CUr decode(ProtoReader protoReader) {
            C2231291CUt c2231291CUt = new C2231291CUt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2231291CUt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2231291CUt.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2231291CUt.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2231291CUt.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231291CUt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231271CUr c2231271CUr) {
            C2231271CUr c2231271CUr2 = c2231271CUr;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c2231271CUr2.is_audio_muted) + protoAdapter.encodedSizeWithTag(2, c2231271CUr2.audio_muted_by_channel) + ProtoAdapter.STRING.encodedSizeWithTag(3, c2231271CUr2.link_mic_id) + c2231271CUr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231271CUr redact(C2231271CUr c2231271CUr) {
            C2231291CUt c2231291CUtNewBuilder = c2231271CUr.newBuilder();
            c2231291CUtNewBuilder.clearUnknownFields();
            return c2231291CUtNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231271CUr c2231271CUr) {
            C2231271CUr c2231271CUr2 = c2231271CUr;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c2231271CUr2.is_audio_muted);
            protoAdapter.encodeWithTag(protoWriter, 2, c2231271CUr2.audio_muted_by_channel);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c2231271CUr2.link_mic_id);
            protoWriter.writeBytes(c2231271CUr2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_AUDIO_MUTED_BY_CHANNEL;
    public static final Boolean DEFAULT_IS_AUDIO_MUTED;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean audio_muted_by_channel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean is_audio_muted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String link_mic_id;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_AUDIO_MUTED = bool;
        DEFAULT_AUDIO_MUTED_BY_CHANNEL = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.is_audio_muted.hashCode()) * 37) + this.audio_muted_by_channel.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231291CUt newBuilder() {
        C2231291CUt c2231291CUt = new C2231291CUt();
        c2231291CUt.LIZLLL = this.is_audio_muted;
        c2231291CUt.LJ = this.audio_muted_by_channel;
        c2231291CUt.LJFF = this.link_mic_id;
        c2231291CUt.addUnknownFields(unknownFields());
        return c2231291CUt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_audio_muted=");
        sb.append(this.is_audio_muted);
        sb.append(", audio_muted_by_channel=");
        sb.append(this.audio_muted_by_channel);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsXf3d25f3b85172b27{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231271CUr)) {
            return false;
        }
        C2231271CUr c2231271CUr = (C2231271CUr) obj;
        if (unknownFields().equals(c2231271CUr.unknownFields()) && this.is_audio_muted.equals(c2231271CUr.is_audio_muted) && this.audio_muted_by_channel.equals(c2231271CUr.audio_muted_by_channel) && this.link_mic_id.equals(c2231271CUr.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C2231271CUr(Boolean bool, Boolean bool2, String str) {
        this(bool, bool2, str, ByteString.EMPTY);
    }

    public C2231271CUr(Boolean bool, Boolean bool2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_audio_muted = bool;
        this.audio_muted_by_channel = bool2;
        this.link_mic_id = str;
    }
}
