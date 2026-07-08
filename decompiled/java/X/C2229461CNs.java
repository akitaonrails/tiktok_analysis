package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229461CNs extends Message<C2229461CNs, C2229481CNu> {
    public static final ProtoAdapter<C2229461CNs> ADAPTER = new ProtoAdapter<C2229461CNs>() { // from class: X.1CNt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229461CNs decode(ProtoReader protoReader) {
            C2229481CNu c2229481CNu = new C2229481CNu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2229481CNu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2229481CNu.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2229481CNu.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2229481CNu.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229481CNu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229461CNs c2229461CNs) {
            C2229461CNs c2229461CNs2 = c2229461CNs;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c2229461CNs2.operator_user) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2229461CNs2.group_channel_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, c2229461CNs2.leave_source) + c2229461CNs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229461CNs redact(C2229461CNs c2229461CNs) {
            C2229481CNu c2229481CNuNewBuilder = c2229461CNs.newBuilder();
            c2229481CNuNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2229481CNuNewBuilder.LIZLLL);
            c2229481CNuNewBuilder.clearUnknownFields();
            return c2229481CNuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229461CNs c2229461CNs) {
            C2229461CNs c2229461CNs2 = c2229461CNs;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c2229461CNs2.operator_user);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2229461CNs2.group_channel_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c2229461CNs2.leave_source);
            protoWriter.writeBytes(c2229461CNs2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String leave_source;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo operator_user;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.operator_user.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37) + this.leave_source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229481CNu newBuilder() {
        C2229481CNu c2229481CNu = new C2229481CNu();
        c2229481CNu.LIZLLL = this.operator_user;
        c2229481CNu.LJ = this.group_channel_id;
        c2229481CNu.LJFF = this.leave_source;
        c2229481CNu.addUnknownFields(unknownFields());
        return c2229481CNu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", operator_user=");
        sb.append(this.operator_user);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", leave_source=");
        sb.append(this.leave_source);
        sb.replace(0, 2, "LinkMicImSelfShouldLeaveGroupModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229461CNs)) {
            return false;
        }
        C2229461CNs c2229461CNs = (C2229461CNs) obj;
        if (unknownFields().equals(c2229461CNs.unknownFields()) && this.operator_user.equals(c2229461CNs.operator_user) && this.group_channel_id.equals(c2229461CNs.group_channel_id) && this.leave_source.equals(c2229461CNs.leave_source)) {
            return true;
        }
        return false;
    }

    public C2229461CNs(C2232021CXo c2232021CXo, Long l, String str) {
        this(c2232021CXo, l, str, ByteString.EMPTY);
    }

    public C2229461CNs(C2232021CXo c2232021CXo, Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operator_user = c2232021CXo;
        this.group_channel_id = l;
        this.leave_source = str;
    }
}
