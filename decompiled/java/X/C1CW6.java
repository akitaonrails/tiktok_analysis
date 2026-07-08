package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CW6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CW6 extends Message<C1CW6, C1CW8> {
    public static final ProtoAdapter<C1CW6> ADAPTER = new ProtoAdapter<C1CW6>() { // from class: X.1CW7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CW6 decode(ProtoReader protoReader) {
            C1CW8 c1cw8 = new C1CW8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cw8.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1cw8.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1cw8.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1cw8.LJI.add(C1CW4.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c1cw8.LJII.add(C1CZI.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c1cw8.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1cw8.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1cw8.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cw8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cw8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CW6 c1cw6) {
            C1CW6 c1cw62 = c1cw6;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cw62.channel_id) + protoAdapter.encodedSizeWithTag(2, c1cw62.state_version);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1cw62.layout_id) + C1CW4.ADAPTER.asRepeated().encodedSizeWithTag(4, c1cw62.ui_pos) + C1CZI.ADAPTER.asRepeated().encodedSizeWithTag(5, c1cw62.user_states) + protoAdapter2.encodedSizeWithTag(6, c1cw62.share_bg_sticker_id) + protoAdapter2.encodedSizeWithTag(7, c1cw62.background_url) + protoAdapter2.encodedSizeWithTag(8, c1cw62.wallpaper_url) + c1cw62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CW6 redact(C1CW6 c1cw6) {
            C1CW8 c1cw8NewBuilder = c1cw6.newBuilder();
            C1516540pZE.LJIIIZ(c1cw8NewBuilder.LJI, C1CW4.ADAPTER);
            C1516540pZE.LJIIIZ(c1cw8NewBuilder.LJII, C1CZI.ADAPTER);
            c1cw8NewBuilder.clearUnknownFields();
            return c1cw8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CW6 c1cw6) {
            C1CW6 c1cw62 = c1cw6;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cw62.channel_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cw62.state_version);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1cw62.layout_id);
            C1CW4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c1cw62.ui_pos);
            C1CZI.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c1cw62.user_states);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1cw62.share_bg_sticker_id);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1cw62.background_url);
            protoAdapter2.encodeWithTag(protoWriter, 8, c1cw62.wallpaper_url);
            protoWriter.writeBytes(c1cw62.unknownFields());
        }
    };
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Long DEFAULT_STATE_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String background_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String share_bg_sticker_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long state_version;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CW4> ui_pos;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicUserState#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C1CZI> user_states;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String wallpaper_url;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.channel_id.hashCode()) * 37) + this.state_version.hashCode()) * 37) + this.layout_id.hashCode()) * 37) + this.ui_pos.hashCode()) * 37) + this.user_states.hashCode()) * 37;
        String str = this.share_bg_sticker_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.background_url;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.wallpaper_url;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1CW8 newBuilder() {
        C1CW8 c1cw8 = new C1CW8();
        c1cw8.LIZLLL = this.channel_id;
        c1cw8.LJ = this.state_version;
        c1cw8.LJFF = this.layout_id;
        c1cw8.LJI = C1516540pZE.LIZJ("ui_pos", this.ui_pos);
        c1cw8.LJII = C1516540pZE.LIZJ("user_states", this.user_states);
        c1cw8.LJIIIIZZ = this.share_bg_sticker_id;
        c1cw8.LJIIIZ = this.background_url;
        c1cw8.LJIIJ = this.wallpaper_url;
        c1cw8.addUnknownFields(unknownFields());
        return c1cw8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.append(", state_version=");
        sb.append(this.state_version);
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        if (!this.ui_pos.isEmpty()) {
            sb.append(", ui_pos=");
            sb.append(this.ui_pos);
        }
        if (!this.user_states.isEmpty()) {
            sb.append(", user_states=");
            sb.append(this.user_states);
        }
        if (this.share_bg_sticker_id != null) {
            sb.append(", share_bg_sticker_id=");
            sb.append(this.share_bg_sticker_id);
        }
        if (this.background_url != null) {
            sb.append(", background_url=");
            sb.append(this.background_url);
        }
        if (this.wallpaper_url != null) {
            sb.append(", wallpaper_url=");
            sb.append(this.wallpaper_url);
        }
        sb.replace(0, 2, "LinkMicStateModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CW6)) {
            return false;
        }
        C1CW6 c1cw6 = (C1CW6) obj;
        if (unknownFields().equals(c1cw6.unknownFields()) && this.channel_id.equals(c1cw6.channel_id) && this.state_version.equals(c1cw6.state_version) && this.layout_id.equals(c1cw6.layout_id) && this.ui_pos.equals(c1cw6.ui_pos) && this.user_states.equals(c1cw6.user_states) && C1516540pZE.LJ(this.share_bg_sticker_id, c1cw6.share_bg_sticker_id) && C1516540pZE.LJ(this.background_url, c1cw6.background_url) && C1516540pZE.LJ(this.wallpaper_url, c1cw6.wallpaper_url)) {
            return true;
        }
        return false;
    }

    public C1CW6(Long l, Long l2, String str, List<C1CW4> list, List<C1CZI> list2, String str2, String str3, String str4) {
        this(l, l2, str, list, list2, str2, str3, str4, ByteString.EMPTY);
    }

    public C1CW6(Long l, Long l2, String str, List<C1CW4> list, List<C1CZI> list2, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_id = l;
        this.state_version = l2;
        this.layout_id = str;
        this.ui_pos = C1516540pZE.LJFF("ui_pos", list);
        this.user_states = C1516540pZE.LJFF("user_states", list2);
        this.share_bg_sticker_id = str2;
        this.background_url = str3;
        this.wallpaper_url = str4;
    }
}
