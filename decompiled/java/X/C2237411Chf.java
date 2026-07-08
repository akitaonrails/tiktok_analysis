package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Chf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237411Chf extends Message<C2237411Chf, C2237431Chh> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String client_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long create_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean disable_in_app_notification;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 1)
    public final ByteString streak_message_content;
    public static final ProtoAdapter<C2237411Chf> ADAPTER = new ProtoAdapter<C2237411Chf>() { // from class: X.1Chg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237411Chf decode(ProtoReader protoReader) {
            C2237431Chh c2237431Chh = new C2237431Chh();
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
                                        c2237431Chh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2237431Chh.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2237431Chh.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c2237431Chh.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2237431Chh.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2237431Chh.LIZLLL = ProtoAdapter.BYTES.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237431Chh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237411Chf c2237411Chf) {
            C2237411Chf c2237411Chf2 = c2237411Chf;
            int iEncodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, c2237411Chf2.streak_message_content);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2237411Chf2.scene) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2237411Chf2.create_time) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c2237411Chf2.disable_in_app_notification) + protoAdapter.encodedSizeWithTag(5, c2237411Chf2.client_message_id) + c2237411Chf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237411Chf redact(C2237411Chf c2237411Chf) {
            C2237431Chh c2237431ChhNewBuilder = c2237411Chf.newBuilder();
            c2237431ChhNewBuilder.clearUnknownFields();
            return c2237431ChhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237411Chf c2237411Chf) {
            C2237411Chf c2237411Chf2 = c2237411Chf;
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, c2237411Chf2.streak_message_content);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c2237411Chf2.scene);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2237411Chf2.create_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c2237411Chf2.disable_in_app_notification);
            protoAdapter.encodeWithTag(protoWriter, 5, c2237411Chf2.client_message_id);
            protoWriter.writeBytes(c2237411Chf2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_STREAK_MESSAGE_CONTENT = ByteString.EMPTY;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Boolean DEFAULT_DISABLE_IN_APP_NOTIFICATION = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.streak_message_content;
        int iHashCode2 = (iHashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.scene;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.create_time;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        Boolean bool = this.disable_in_app_notification;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str2 = this.client_message_id;
        int iHashCode6 = iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2237431Chh newBuilder() {
        C2237431Chh c2237431Chh = new C2237431Chh();
        c2237431Chh.LIZLLL = this.streak_message_content;
        c2237431Chh.LJ = this.scene;
        c2237431Chh.LJFF = this.create_time;
        c2237431Chh.LJI = this.disable_in_app_notification;
        c2237431Chh.LJII = this.client_message_id;
        c2237431Chh.addUnknownFields(unknownFields());
        return c2237431Chh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.streak_message_content != null) {
            sb.append(", streak_message_content=");
            sb.append(this.streak_message_content);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.disable_in_app_notification != null) {
            sb.append(", disable_in_app_notification=");
            sb.append(this.disable_in_app_notification);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        sb.replace(0, 2, "StreakStatusValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237411Chf)) {
            return false;
        }
        C2237411Chf c2237411Chf = (C2237411Chf) obj;
        if (unknownFields().equals(c2237411Chf.unknownFields()) && C1516540pZE.LJ(this.streak_message_content, c2237411Chf.streak_message_content) && C1516540pZE.LJ(this.scene, c2237411Chf.scene) && C1516540pZE.LJ(this.create_time, c2237411Chf.create_time) && C1516540pZE.LJ(this.disable_in_app_notification, c2237411Chf.disable_in_app_notification) && C1516540pZE.LJ(this.client_message_id, c2237411Chf.client_message_id)) {
            return true;
        }
        return false;
    }

    public C2237411Chf(ByteString byteString, String str, Long l, Boolean bool, String str2) {
        this(byteString, str, l, bool, str2, ByteString.EMPTY);
    }

    public C2237411Chf(ByteString byteString, String str, Long l, Boolean bool, String str2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.streak_message_content = byteString;
        this.scene = str;
        this.create_time = l;
        this.disable_in_app_notification = bool;
        this.client_message_id = str2;
    }
}
