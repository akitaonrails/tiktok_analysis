package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237321ChW extends Message<C2237321ChW, C2237341ChY> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long current_layout_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long current_max_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long current_panel_layout_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long enlarge_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long origin_layout_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long origin_max_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 7)
    public final ByteString social_game;
    public static final ProtoAdapter<C2237321ChW> ADAPTER = new ProtoAdapter<C2237321ChW>() { // from class: X.1ChX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237321ChW decode(ProtoReader protoReader) {
            C2237341ChY c2237341ChY = new C2237341ChY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237341ChY.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2237341ChY.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2237341ChY.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2237341ChY.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2237341ChY.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2237341ChY.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2237341ChY.LJIIIZ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237341ChY.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237341ChY.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237321ChW c2237321ChW) {
            C2237321ChW c2237321ChW2 = c2237321ChW;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2237321ChW2.origin_layout_style) + protoAdapter.encodedSizeWithTag(2, c2237321ChW2.current_layout_style) + protoAdapter.encodedSizeWithTag(3, c2237321ChW2.origin_max_position) + protoAdapter.encodedSizeWithTag(4, c2237321ChW2.current_max_position) + protoAdapter.encodedSizeWithTag(5, c2237321ChW2.enlarge_status) + protoAdapter.encodedSizeWithTag(6, c2237321ChW2.current_panel_layout_type) + ProtoAdapter.BYTES.encodedSizeWithTag(7, c2237321ChW2.social_game) + c2237321ChW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237321ChW redact(C2237321ChW c2237321ChW) {
            C2237341ChY c2237341ChYNewBuilder = c2237321ChW.newBuilder();
            c2237341ChYNewBuilder.clearUnknownFields();
            return c2237341ChYNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237321ChW c2237321ChW) {
            C2237321ChW c2237321ChW2 = c2237321ChW;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2237321ChW2.origin_layout_style);
            protoAdapter.encodeWithTag(protoWriter, 2, c2237321ChW2.current_layout_style);
            protoAdapter.encodeWithTag(protoWriter, 3, c2237321ChW2.origin_max_position);
            protoAdapter.encodeWithTag(protoWriter, 4, c2237321ChW2.current_max_position);
            protoAdapter.encodeWithTag(protoWriter, 5, c2237321ChW2.enlarge_status);
            protoAdapter.encodeWithTag(protoWriter, 6, c2237321ChW2.current_panel_layout_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, c2237321ChW2.social_game);
            protoWriter.writeBytes(c2237321ChW2.unknownFields());
        }
    };
    public static final Long DEFAULT_ORIGIN_LAYOUT_STYLE = 0L;
    public static final Long DEFAULT_CURRENT_LAYOUT_STYLE = 0L;
    public static final Long DEFAULT_ORIGIN_MAX_POSITION = 0L;
    public static final Long DEFAULT_CURRENT_MAX_POSITION = 0L;
    public static final Long DEFAULT_ENLARGE_STATUS = 0L;
    public static final Long DEFAULT_CURRENT_PANEL_LAYOUT_TYPE = 0L;
    public static final ByteString DEFAULT_SOCIAL_GAME = ByteString.EMPTY;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.origin_layout_style.hashCode()) * 37) + this.current_layout_style.hashCode()) * 37) + this.origin_max_position.hashCode()) * 37) + this.current_max_position.hashCode()) * 37) + this.enlarge_status.hashCode()) * 37) + this.current_panel_layout_type.hashCode()) * 37;
        ByteString byteString = this.social_game;
        int iHashCode2 = iHashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237341ChY newBuilder() {
        C2237341ChY c2237341ChY = new C2237341ChY();
        c2237341ChY.LIZLLL = this.origin_layout_style;
        c2237341ChY.LJ = this.current_layout_style;
        c2237341ChY.LJFF = this.origin_max_position;
        c2237341ChY.LJI = this.current_max_position;
        c2237341ChY.LJII = this.enlarge_status;
        c2237341ChY.LJIIIIZZ = this.current_panel_layout_type;
        c2237341ChY.LJIIIZ = this.social_game;
        c2237341ChY.addUnknownFields(unknownFields());
        return c2237341ChY;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", origin_layout_style=");
        sb.append(this.origin_layout_style);
        sb.append(", current_layout_style=");
        sb.append(this.current_layout_style);
        sb.append(", origin_max_position=");
        sb.append(this.origin_max_position);
        sb.append(", current_max_position=");
        sb.append(this.current_max_position);
        sb.append(", enlarge_status=");
        sb.append(this.enlarge_status);
        sb.append(", current_panel_layout_type=");
        sb.append(this.current_panel_layout_type);
        if (this.social_game != null) {
            sb.append(", social_game=");
            sb.append(this.social_game);
        }
        sb.replace(0, 2, "LinkMicLayoutMultiGuestLayoutExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237321ChW)) {
            return false;
        }
        C2237321ChW c2237321ChW = (C2237321ChW) obj;
        if (unknownFields().equals(c2237321ChW.unknownFields()) && this.origin_layout_style.equals(c2237321ChW.origin_layout_style) && this.current_layout_style.equals(c2237321ChW.current_layout_style) && this.origin_max_position.equals(c2237321ChW.origin_max_position) && this.current_max_position.equals(c2237321ChW.current_max_position) && this.enlarge_status.equals(c2237321ChW.enlarge_status) && this.current_panel_layout_type.equals(c2237321ChW.current_panel_layout_type) && C1516540pZE.LJ(this.social_game, c2237321ChW.social_game)) {
            return true;
        }
        return false;
    }

    public C2237321ChW(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, ByteString byteString) {
        this(l, l2, l3, l4, l5, l6, byteString, ByteString.EMPTY);
    }

    public C2237321ChW(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.origin_layout_style = l;
        this.current_layout_style = l2;
        this.origin_max_position = l3;
        this.current_max_position = l4;
        this.enlarge_status = l5;
        this.current_panel_layout_type = l6;
        this.social_game = byteString;
    }
}
