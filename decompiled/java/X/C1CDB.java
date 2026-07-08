package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDB extends Message<C1CDB, C1CDD> {
    public static final ProtoAdapter<C1CDB> ADAPTER = new ProtoAdapter<C1CDB>() { // from class: X.1CDC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDB decode(ProtoReader protoReader) {
            C1CDD c1cdd = new C1CDD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cdd.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c1cdd.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1cdd.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c1cdd.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c1cdd.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1cdd.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1cdd.LJIIIZ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cdd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CDB c1cdb) {
            C1CDB c1cdb2 = c1cdb;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cdb2.is_enlarged) + protoAdapter.encodedSizeWithTag(2, c1cdb2.is_single_zoom_enabled) + protoAdapter.encodedSizeWithTag(3, c1cdb2.is_double_zoom_enabled) + protoAdapter.encodedSizeWithTag(4, c1cdb2.is_switch_spot_enabled);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c1cdb2.spot_rank) + protoAdapter2.encodedSizeWithTag(6, c1cdb2.content_position_type) + ProtoAdapter.BYTES.encodedSizeWithTag(7, c1cdb2.social_game_user) + c1cdb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDB redact(C1CDB c1cdb) {
            C1CDD c1cddNewBuilder = c1cdb.newBuilder();
            c1cddNewBuilder.clearUnknownFields();
            return c1cddNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CDB c1cdb) {
            C1CDB c1cdb2 = c1cdb;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cdb2.is_enlarged);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cdb2.is_single_zoom_enabled);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cdb2.is_double_zoom_enabled);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cdb2.is_switch_spot_enabled);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 5, c1cdb2.spot_rank);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1cdb2.content_position_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, c1cdb2.social_game_user);
            protoWriter.writeBytes(c1cdb2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONTENT_POSITION_TYPE;
    public static final Boolean DEFAULT_IS_DOUBLE_ZOOM_ENABLED;
    public static final Boolean DEFAULT_IS_ENLARGED;
    public static final Boolean DEFAULT_IS_SINGLE_ZOOM_ENABLED;
    public static final Boolean DEFAULT_IS_SWITCH_SPOT_ENABLED;
    public static final ByteString DEFAULT_SOCIAL_GAME_USER;
    public static final Long DEFAULT_SPOT_RANK;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long content_position_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean is_double_zoom_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean is_enlarged;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_single_zoom_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean is_switch_spot_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 7)
    public final ByteString social_game_user;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long spot_rank;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_ENLARGED = bool;
        DEFAULT_IS_SINGLE_ZOOM_ENABLED = bool;
        DEFAULT_IS_DOUBLE_ZOOM_ENABLED = bool;
        DEFAULT_IS_SWITCH_SPOT_ENABLED = bool;
        DEFAULT_SPOT_RANK = 0L;
        DEFAULT_CONTENT_POSITION_TYPE = 0L;
        DEFAULT_SOCIAL_GAME_USER = ByteString.EMPTY;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.is_enlarged.hashCode()) * 37) + this.is_single_zoom_enabled.hashCode()) * 37) + this.is_double_zoom_enabled.hashCode()) * 37) + this.is_switch_spot_enabled.hashCode()) * 37) + this.spot_rank.hashCode()) * 37) + this.content_position_type.hashCode()) * 37;
        ByteString byteString = this.social_game_user;
        int iHashCode2 = iHashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CDD newBuilder() {
        C1CDD c1cdd = new C1CDD();
        c1cdd.LIZLLL = this.is_enlarged;
        c1cdd.LJ = this.is_single_zoom_enabled;
        c1cdd.LJFF = this.is_double_zoom_enabled;
        c1cdd.LJI = this.is_switch_spot_enabled;
        c1cdd.LJII = this.spot_rank;
        c1cdd.LJIIIIZZ = this.content_position_type;
        c1cdd.LJIIIZ = this.social_game_user;
        c1cdd.addUnknownFields(unknownFields());
        return c1cdd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_enlarged=");
        sb.append(this.is_enlarged);
        sb.append(", is_single_zoom_enabled=");
        sb.append(this.is_single_zoom_enabled);
        sb.append(", is_double_zoom_enabled=");
        sb.append(this.is_double_zoom_enabled);
        sb.append(", is_switch_spot_enabled=");
        sb.append(this.is_switch_spot_enabled);
        sb.append(", spot_rank=");
        sb.append(this.spot_rank);
        sb.append(", content_position_type=");
        sb.append(this.content_position_type);
        if (this.social_game_user != null) {
            sb.append(", social_game_user=");
            sb.append(this.social_game_user);
        }
        sb.replace(0, 2, "LinkMicLayoutMultiGuestSpotExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CDB)) {
            return false;
        }
        C1CDB c1cdb = (C1CDB) obj;
        if (unknownFields().equals(c1cdb.unknownFields()) && this.is_enlarged.equals(c1cdb.is_enlarged) && this.is_single_zoom_enabled.equals(c1cdb.is_single_zoom_enabled) && this.is_double_zoom_enabled.equals(c1cdb.is_double_zoom_enabled) && this.is_switch_spot_enabled.equals(c1cdb.is_switch_spot_enabled) && this.spot_rank.equals(c1cdb.spot_rank) && this.content_position_type.equals(c1cdb.content_position_type) && C1516540pZE.LJ(this.social_game_user, c1cdb.social_game_user)) {
            return true;
        }
        return false;
    }

    public C1CDB(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l, Long l2, ByteString byteString) {
        this(bool, bool2, bool3, bool4, l, l2, byteString, ByteString.EMPTY);
    }

    public C1CDB(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l, Long l2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.is_enlarged = bool;
        this.is_single_zoom_enabled = bool2;
        this.is_double_zoom_enabled = bool3;
        this.is_switch_spot_enabled = bool4;
        this.spot_rank = l;
        this.content_position_type = l2;
        this.social_game_user = byteString;
    }
}
