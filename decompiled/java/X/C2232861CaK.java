package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232861CaK extends Message<C2232861CaK, C2232881CaM> {
    public static final ProtoAdapter<C2232861CaK> ADAPTER = new ProtoAdapter<C2232861CaK>() { // from class: X.1CaL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232861CaK decode(ProtoReader protoReader) {
            C2232881CaM c2232881CaM = new C2232881CaM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232881CaM.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c2232881CaM.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2232881CaM.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c2232881CaM.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c2232881CaM.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2232881CaM.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c2232881CaM.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c2232881CaM.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2232881CaM.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232881CaM.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232881CaM.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232861CaK c2232861CaK) {
            C2232861CaK c2232861CaK2 = c2232861CaK;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c2232861CaK2.joining_rtc) + protoAdapter.encodedSizeWithTag(2, c2232861CaK2.joined_rtc) + protoAdapter.encodedSizeWithTag(3, c2232861CaK2.push_stream) + protoAdapter.encodedSizeWithTag(4, c2232861CaK2.forward_stream) + protoAdapter.encodedSizeWithTag(5, c2232861CaK2.mix_stream) + protoAdapter.encodedSizeWithTag(6, c2232861CaK2.rtc_error) + protoAdapter.encodedSizeWithTag(7, c2232861CaK2.rtc_lost) + protoAdapter.encodedSizeWithTag(8, c2232861CaK2.forward_stream_error) + ProtoAdapter.STRING.encodedSizeWithTag(9, c2232861CaK2.desc) + c2232861CaK2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232861CaK redact(C2232861CaK c2232861CaK) {
            C2232881CaM c2232881CaMNewBuilder = c2232861CaK.newBuilder();
            c2232881CaMNewBuilder.clearUnknownFields();
            return c2232881CaMNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232861CaK c2232861CaK) {
            C2232861CaK c2232861CaK2 = c2232861CaK;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232861CaK2.joining_rtc);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232861CaK2.joined_rtc);
            protoAdapter.encodeWithTag(protoWriter, 3, c2232861CaK2.push_stream);
            protoAdapter.encodeWithTag(protoWriter, 4, c2232861CaK2.forward_stream);
            protoAdapter.encodeWithTag(protoWriter, 5, c2232861CaK2.mix_stream);
            protoAdapter.encodeWithTag(protoWriter, 6, c2232861CaK2.rtc_error);
            protoAdapter.encodeWithTag(protoWriter, 7, c2232861CaK2.rtc_lost);
            protoAdapter.encodeWithTag(protoWriter, 8, c2232861CaK2.forward_stream_error);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, c2232861CaK2.desc);
            protoWriter.writeBytes(c2232861CaK2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_FORWARD_STREAM;
    public static final Boolean DEFAULT_FORWARD_STREAM_ERROR;
    public static final Boolean DEFAULT_JOINED_RTC;
    public static final Boolean DEFAULT_JOINING_RTC;
    public static final Boolean DEFAULT_MIX_STREAM;
    public static final Boolean DEFAULT_PUSH_STREAM;
    public static final Boolean DEFAULT_RTC_ERROR;
    public static final Boolean DEFAULT_RTC_LOST;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final String desc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean forward_stream;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 8)
    public final Boolean forward_stream_error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean joined_rtc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean joining_rtc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public final Boolean mix_stream;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean push_stream;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 6)
    public final Boolean rtc_error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 7)
    public final Boolean rtc_lost;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_JOINING_RTC = bool;
        DEFAULT_JOINED_RTC = bool;
        DEFAULT_PUSH_STREAM = bool;
        DEFAULT_FORWARD_STREAM = bool;
        DEFAULT_MIX_STREAM = bool;
        DEFAULT_RTC_ERROR = bool;
        DEFAULT_RTC_LOST = bool;
        DEFAULT_FORWARD_STREAM_ERROR = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.joining_rtc.hashCode()) * 37) + this.joined_rtc.hashCode()) * 37) + this.push_stream.hashCode()) * 37) + this.forward_stream.hashCode()) * 37) + this.mix_stream.hashCode()) * 37) + this.rtc_error.hashCode()) * 37) + this.rtc_lost.hashCode()) * 37) + this.forward_stream_error.hashCode()) * 37) + this.desc.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232881CaM newBuilder() {
        C2232881CaM c2232881CaM = new C2232881CaM();
        c2232881CaM.LIZLLL = this.joining_rtc;
        c2232881CaM.LJ = this.joined_rtc;
        c2232881CaM.LJFF = this.push_stream;
        c2232881CaM.LJI = this.forward_stream;
        c2232881CaM.LJII = this.mix_stream;
        c2232881CaM.LJIIIIZZ = this.rtc_error;
        c2232881CaM.LJIIIZ = this.rtc_lost;
        c2232881CaM.LJIIJ = this.forward_stream_error;
        c2232881CaM.LJIIJJI = this.desc;
        c2232881CaM.addUnknownFields(unknownFields());
        return c2232881CaM;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", joining_rtc=");
        sb.append(this.joining_rtc);
        sb.append(", joined_rtc=");
        sb.append(this.joined_rtc);
        sb.append(", push_stream=");
        sb.append(this.push_stream);
        sb.append(", forward_stream=");
        sb.append(this.forward_stream);
        sb.append(", mix_stream=");
        sb.append(this.mix_stream);
        sb.append(", rtc_error=");
        sb.append(this.rtc_error);
        sb.append(", rtc_lost=");
        sb.append(this.rtc_lost);
        sb.append(", forward_stream_error=");
        sb.append(this.forward_stream_error);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.replace(0, 2, "LinkRtcState{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232861CaK)) {
            return false;
        }
        C2232861CaK c2232861CaK = (C2232861CaK) obj;
        if (unknownFields().equals(c2232861CaK.unknownFields()) && this.joining_rtc.equals(c2232861CaK.joining_rtc) && this.joined_rtc.equals(c2232861CaK.joined_rtc) && this.push_stream.equals(c2232861CaK.push_stream) && this.forward_stream.equals(c2232861CaK.forward_stream) && this.mix_stream.equals(c2232861CaK.mix_stream) && this.rtc_error.equals(c2232861CaK.rtc_error) && this.rtc_lost.equals(c2232861CaK.rtc_lost) && this.forward_stream_error.equals(c2232861CaK.forward_stream_error) && this.desc.equals(c2232861CaK.desc)) {
            return true;
        }
        return false;
    }

    public C2232861CaK(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str) {
        this(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, str, ByteString.EMPTY);
    }

    public C2232861CaK(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.joining_rtc = bool;
        this.joined_rtc = bool2;
        this.push_stream = bool3;
        this.forward_stream = bool4;
        this.mix_stream = bool5;
        this.rtc_error = bool6;
        this.rtc_lost = bool7;
        this.forward_stream_error = bool8;
        this.desc = str;
    }
}
