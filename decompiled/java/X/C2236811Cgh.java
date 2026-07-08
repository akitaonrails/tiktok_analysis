package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cgh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236811Cgh extends Message<C2236811Cgh, C2236831Cgj> {
    public static final ProtoAdapter<C2236811Cgh> ADAPTER = new ProtoAdapter<C2236811Cgh>() { // from class: X.1Cgi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236811Cgh decode(ProtoReader protoReader) {
            C2236831Cgj c2236831Cgj = new C2236831Cgj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2236831Cgj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2236831Cgj.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c2236831Cgj.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2236831Cgj.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236831Cgj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236811Cgh c2236811Cgh) {
            C2236811Cgh c2236811Cgh2 = c2236811Cgh;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c2236811Cgh2.force_join_channel) + protoAdapter.encodedSizeWithTag(2, c2236811Cgh2.pre_push_data_after_join_rtc) + protoAdapter.encodedSizeWithTag(3, c2236811Cgh2.should_force_pre_push_data) + c2236811Cgh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236811Cgh redact(C2236811Cgh c2236811Cgh) {
            C2236831Cgj c2236831CgjNewBuilder = c2236811Cgh.newBuilder();
            c2236831CgjNewBuilder.clearUnknownFields();
            return c2236831CgjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236811Cgh c2236811Cgh) {
            C2236811Cgh c2236811Cgh2 = c2236811Cgh;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236811Cgh2.force_join_channel);
            protoAdapter.encodeWithTag(protoWriter, 2, c2236811Cgh2.pre_push_data_after_join_rtc);
            protoAdapter.encodeWithTag(protoWriter, 3, c2236811Cgh2.should_force_pre_push_data);
            protoWriter.writeBytes(c2236811Cgh2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_FORCE_JOIN_CHANNEL;
    public static final Boolean DEFAULT_PRE_PUSH_DATA_AFTER_JOIN_RTC;
    public static final Boolean DEFAULT_SHOULD_FORCE_PRE_PUSH_DATA;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean force_join_channel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean pre_push_data_after_join_rtc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean should_force_pre_push_data;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_FORCE_JOIN_CHANNEL = bool;
        DEFAULT_PRE_PUSH_DATA_AFTER_JOIN_RTC = bool;
        DEFAULT_SHOULD_FORCE_PRE_PUSH_DATA = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.force_join_channel.hashCode()) * 37) + this.pre_push_data_after_join_rtc.hashCode()) * 37) + this.should_force_pre_push_data.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236831Cgj newBuilder() {
        C2236831Cgj c2236831Cgj = new C2236831Cgj();
        c2236831Cgj.LIZLLL = this.force_join_channel;
        c2236831Cgj.LJ = this.pre_push_data_after_join_rtc;
        c2236831Cgj.LJFF = this.should_force_pre_push_data;
        c2236831Cgj.addUnknownFields(unknownFields());
        return c2236831Cgj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", force_join_channel=");
        sb.append(this.force_join_channel);
        sb.append(", pre_push_data_after_join_rtc=");
        sb.append(this.pre_push_data_after_join_rtc);
        sb.append(", should_force_pre_push_data=");
        sb.append(this.should_force_pre_push_data);
        sb.replace(0, 2, "FuncParamsXddfacfb23a6bdc5d{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236811Cgh)) {
            return false;
        }
        C2236811Cgh c2236811Cgh = (C2236811Cgh) obj;
        if (unknownFields().equals(c2236811Cgh.unknownFields()) && this.force_join_channel.equals(c2236811Cgh.force_join_channel) && this.pre_push_data_after_join_rtc.equals(c2236811Cgh.pre_push_data_after_join_rtc) && this.should_force_pre_push_data.equals(c2236811Cgh.should_force_pre_push_data)) {
            return true;
        }
        return false;
    }

    public C2236811Cgh(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public C2236811Cgh(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.force_join_channel = bool;
        this.pre_push_data_after_join_rtc = bool2;
        this.should_force_pre_push_data = bool3;
    }
}
