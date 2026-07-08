package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236391Cg1 extends Message<C2236391Cg1, C2236411Cg3> {
    public static final ProtoAdapter<C2236391Cg1> ADAPTER = new ProtoAdapter<C2236391Cg1>() { // from class: X.1Cg2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236391Cg1 decode(ProtoReader protoReader) {
            C2236411Cg3 c2236411Cg3 = new C2236411Cg3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236411Cg3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236411Cg3.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2236411Cg3.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236411Cg3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236391Cg1 c2236391Cg1) {
            C2236391Cg1 c2236391Cg12 = c2236391Cg1;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2236391Cg12.invoke_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2236391Cg12.kick_out_all_reason) + c2236391Cg12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236391Cg1 redact(C2236391Cg1 c2236391Cg1) {
            C2236411Cg3 c2236411Cg3NewBuilder = c2236391Cg1.newBuilder();
            c2236411Cg3NewBuilder.clearUnknownFields();
            return c2236411Cg3NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236391Cg1 c2236391Cg1) {
            C2236391Cg1 c2236391Cg12 = c2236391Cg1;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2236391Cg12.invoke_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2236391Cg12.kick_out_all_reason);
            protoWriter.writeBytes(c2236391Cg12.unknownFields());
        }
    };
    public static final Long DEFAULT_KICK_OUT_ALL_REASON = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long kick_out_all_reason;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.kick_out_all_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236411Cg3 newBuilder() {
        C2236411Cg3 c2236411Cg3 = new C2236411Cg3();
        c2236411Cg3.LIZLLL = this.invoke_id;
        c2236411Cg3.LJ = this.kick_out_all_reason;
        c2236411Cg3.addUnknownFields(unknownFields());
        return c2236411Cg3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", kick_out_all_reason=");
        sb.append(this.kick_out_all_reason);
        sb.replace(0, 2, "LinkMicKickoutAllGuestsParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236391Cg1)) {
            return false;
        }
        C2236391Cg1 c2236391Cg1 = (C2236391Cg1) obj;
        if (unknownFields().equals(c2236391Cg1.unknownFields()) && this.invoke_id.equals(c2236391Cg1.invoke_id) && this.kick_out_all_reason.equals(c2236391Cg1.kick_out_all_reason)) {
            return true;
        }
        return false;
    }

    public C2236391Cg1(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C2236391Cg1(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.kick_out_all_reason = l;
    }
}
