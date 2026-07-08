package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227291CFj extends Message<C2227291CFj, C2227311CFl> {
    public static final ProtoAdapter<C2227291CFj> ADAPTER = new ProtoAdapter<C2227291CFj>() { // from class: X.1CFk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227291CFj decode(ProtoReader protoReader) {
            C2227311CFl c2227311CFl = new C2227311CFl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227311CFl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227311CFl.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227311CFl.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227311CFl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227291CFj c2227291CFj) {
            C2227291CFj c2227291CFj2 = c2227291CFj;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2227291CFj2.group_channel_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2227291CFj2.joiner) + c2227291CFj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227291CFj redact(C2227291CFj c2227291CFj) {
            C2227311CFl c2227311CFlNewBuilder = c2227291CFj.newBuilder();
            c2227311CFlNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2227311CFlNewBuilder.LJ);
            c2227311CFlNewBuilder.clearUnknownFields();
            return c2227311CFlNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227291CFj c2227291CFj) {
            C2227291CFj c2227291CFj2 = c2227291CFj;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2227291CFj2.group_channel_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2227291CFj2.joiner);
            protoWriter.writeBytes(c2227291CFj2.unknownFields());
        }
    };
    public static final Long DEFAULT_GROUP_CHANNEL_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long group_channel_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo joiner;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.group_channel_id.hashCode()) * 37) + this.joiner.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227311CFl newBuilder() {
        C2227311CFl c2227311CFl = new C2227311CFl();
        c2227311CFl.LIZLLL = this.group_channel_id;
        c2227311CFl.LJ = this.joiner;
        c2227311CFl.addUnknownFields(unknownFields());
        return c2227311CFl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.append(", joiner=");
        sb.append(this.joiner);
        sb.replace(0, 2, "LinkMicImApplyGroupModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227291CFj)) {
            return false;
        }
        C2227291CFj c2227291CFj = (C2227291CFj) obj;
        if (unknownFields().equals(c2227291CFj.unknownFields()) && this.group_channel_id.equals(c2227291CFj.group_channel_id) && this.joiner.equals(c2227291CFj.joiner)) {
            return true;
        }
        return false;
    }

    public C2227291CFj(Long l, C2232021CXo c2232021CXo) {
        this(l, c2232021CXo, ByteString.EMPTY);
    }

    public C2227291CFj(Long l, C2232021CXo c2232021CXo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_channel_id = l;
        this.joiner = c2232021CXo;
    }
}
