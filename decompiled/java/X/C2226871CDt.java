package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226871CDt extends Message<C2226871CDt, C2226891CDv> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean should_update_client_streak;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer status_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String status_msg;

    @WireField(adapter = "StreakValue#ADAPTER", tag = 3)
    public final C2272721DxW streak_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public final Long timestamp_millis;
    public static final ProtoAdapter<C2226871CDt> ADAPTER = new ProtoAdapter<C2226871CDt>() { // from class: X.1CDu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226871CDt decode(ProtoReader protoReader) {
            C2226891CDv c2226891CDv = new C2226891CDv();
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
                                        c2226891CDv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2226891CDv.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c2226891CDv.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c2226891CDv.LJFF = C2272721DxW.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2226891CDv.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2226891CDv.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226891CDv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226871CDt c2226871CDt) {
            C2226871CDt c2226871CDt2 = c2226871CDt;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c2226871CDt2.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2226871CDt2.status_msg) + C2272721DxW.ADAPTER.encodedSizeWithTag(3, c2226871CDt2.streak_value) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c2226871CDt2.should_update_client_streak) + ProtoAdapter.INT64.encodedSizeWithTag(5, c2226871CDt2.timestamp_millis) + c2226871CDt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226871CDt redact(C2226871CDt c2226871CDt) {
            C2226891CDv c2226891CDvNewBuilder = c2226871CDt.newBuilder();
            C2272721DxW c2272721DxW = c2226891CDvNewBuilder.LJFF;
            if (c2272721DxW != null) {
                c2226891CDvNewBuilder.LJFF = C2272721DxW.ADAPTER.redact(c2272721DxW);
            }
            c2226891CDvNewBuilder.clearUnknownFields();
            return c2226891CDvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226871CDt c2226871CDt) {
            C2226871CDt c2226871CDt2 = c2226871CDt;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c2226871CDt2.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2226871CDt2.status_msg);
            C2272721DxW.ADAPTER.encodeWithTag(protoWriter, 3, c2226871CDt2.streak_value);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c2226871CDt2.should_update_client_streak);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c2226871CDt2.timestamp_millis);
            protoWriter.writeBytes(c2226871CDt2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final Boolean DEFAULT_SHOULD_UPDATE_CLIENT_STREAK = Boolean.FALSE;
    public static final Long DEFAULT_TIMESTAMP_MILLIS = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.status_code.hashCode()) * 37;
        String str = this.status_msg;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        C2272721DxW c2272721DxW = this.streak_value;
        int iHashCode3 = (iHashCode2 + (c2272721DxW != null ? c2272721DxW.hashCode() : 0)) * 37;
        Boolean bool = this.should_update_client_streak;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l = this.timestamp_millis;
        int iHashCode5 = iHashCode4 + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2226891CDv newBuilder() {
        C2226891CDv c2226891CDv = new C2226891CDv();
        c2226891CDv.LIZLLL = this.status_code;
        c2226891CDv.LJ = this.status_msg;
        c2226891CDv.LJFF = this.streak_value;
        c2226891CDv.LJI = this.should_update_client_streak;
        c2226891CDv.LJII = this.timestamp_millis;
        c2226891CDv.addUnknownFields(unknownFields());
        return c2226891CDv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", status_code=");
        sb.append(this.status_code);
        if (this.status_msg != null) {
            sb.append(", status_msg=");
            sb.append(this.status_msg);
        }
        if (this.streak_value != null) {
            sb.append(", streak_value=");
            sb.append(this.streak_value);
        }
        if (this.should_update_client_streak != null) {
            sb.append(", should_update_client_streak=");
            sb.append(this.should_update_client_streak);
        }
        if (this.timestamp_millis != null) {
            sb.append(", timestamp_millis=");
            sb.append(this.timestamp_millis);
        }
        sb.replace(0, 2, "tiktok_v1_im_streaks_compare_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226871CDt)) {
            return false;
        }
        C2226871CDt c2226871CDt = (C2226871CDt) obj;
        if (unknownFields().equals(c2226871CDt.unknownFields()) && this.status_code.equals(c2226871CDt.status_code) && C1516540pZE.LJ(this.status_msg, c2226871CDt.status_msg) && C1516540pZE.LJ(this.streak_value, c2226871CDt.streak_value) && C1516540pZE.LJ(this.should_update_client_streak, c2226871CDt.should_update_client_streak) && C1516540pZE.LJ(this.timestamp_millis, c2226871CDt.timestamp_millis)) {
            return true;
        }
        return false;
    }

    public C2226871CDt(Integer num, String str, C2272721DxW c2272721DxW, Boolean bool, Long l) {
        this(num, str, c2272721DxW, bool, l, ByteString.EMPTY);
    }

    public C2226871CDt(Integer num, String str, C2272721DxW c2272721DxW, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.status_msg = str;
        this.streak_value = c2272721DxW;
        this.should_update_client_streak = bool;
        this.timestamp_millis = l;
    }
}
