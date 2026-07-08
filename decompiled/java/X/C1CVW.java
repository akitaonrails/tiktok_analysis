package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVW extends Message<C1CVW, C1CVY> {
    public static final ProtoAdapter<C1CVW> ADAPTER = new ProtoAdapter<C1CVW>() { // from class: X.1CVX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVW decode(ProtoReader protoReader) {
            C1CVY c1cvy = new C1CVY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cvy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cvy.LIZLLL = C1CZY.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVW c1cvw) {
            C1CVW c1cvw2 = c1cvw;
            return C1CZY.ADAPTER.encodedSizeWithTag(1, c1cvw2.link_rtc_state_change_context) + c1cvw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVW redact(C1CVW c1cvw) {
            C1CVY c1cvyNewBuilder = c1cvw.newBuilder();
            c1cvyNewBuilder.LIZLLL = C1CZY.ADAPTER.redact(c1cvyNewBuilder.LIZLLL);
            c1cvyNewBuilder.clearUnknownFields();
            return c1cvyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVW c1cvw) {
            C1CVW c1cvw2 = c1cvw;
            C1CZY.ADAPTER.encodeWithTag(protoWriter, 1, c1cvw2.link_rtc_state_change_context);
            protoWriter.writeBytes(c1cvw2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkRtcStateChangeContext#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CZY link_rtc_state_change_context;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.link_rtc_state_change_context.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVY newBuilder() {
        C1CVY c1cvy = new C1CVY();
        c1cvy.LIZLLL = this.link_rtc_state_change_context;
        c1cvy.addUnknownFields(unknownFields());
        return c1cvy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_rtc_state_change_context=");
        sb.append(this.link_rtc_state_change_context);
        sb.replace(0, 2, "FuncParamsX723df2065578dc7c{");
        sb.append('}');
        return sb.toString();
    }

    public C1CVW(C1CZY c1czy) {
        this(c1czy, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVW)) {
            return false;
        }
        C1CVW c1cvw = (C1CVW) obj;
        if (unknownFields().equals(c1cvw.unknownFields()) && this.link_rtc_state_change_context.equals(c1cvw.link_rtc_state_change_context)) {
            return true;
        }
        return false;
    }

    public C1CVW(C1CZY c1czy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_rtc_state_change_context = c1czy;
    }
}
