package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFR extends Message<C1CFR, C1CFT> {
    public static final ProtoAdapter<C1CFR> ADAPTER = new ProtoAdapter<C1CFR>() { // from class: X.1CFS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFR decode(ProtoReader protoReader) {
            C1CFT c1cft = new C1CFT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cft.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cft.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cft.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFR c1cfr) {
            C1CFR c1cfr2 = c1cfr;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cfr2.group_channel_id) + c1cfr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFR redact(C1CFR c1cfr) {
            C1CFT c1cftNewBuilder = c1cfr.newBuilder();
            c1cftNewBuilder.clearUnknownFields();
            return c1cftNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFR c1cfr) {
            C1CFR c1cfr2 = c1cfr;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cfr2.group_channel_id);
            protoWriter.writeBytes(c1cfr2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String group_channel_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.group_channel_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFT newBuilder() {
        C1CFT c1cft = new C1CFT();
        c1cft.LIZLLL = this.group_channel_id;
        c1cft.addUnknownFields(unknownFields());
        return c1cft;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        sb.replace(0, 2, "FuncParamsX0598a1507434d527{");
        sb.append('}');
        return sb.toString();
    }

    public C1CFR(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFR)) {
            return false;
        }
        C1CFR c1cfr = (C1CFR) obj;
        if (unknownFields().equals(c1cfr.unknownFields()) && this.group_channel_id.equals(c1cfr.group_channel_id)) {
            return true;
        }
        return false;
    }

    public C1CFR(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_channel_id = str;
    }
}
