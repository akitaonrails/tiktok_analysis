package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242321Cpa extends Message<C2242321Cpa, C2242341Cpc> {
    public static final ProtoAdapter<C2242321Cpa> ADAPTER = new ProtoAdapter<C2242321Cpa>() { // from class: X.1Cpb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242321Cpa decode(ProtoReader protoReader) {
            C2242341Cpc c2242341Cpc = new C2242341Cpc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2242341Cpc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2242341Cpc.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242341Cpc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242321Cpa c2242321Cpa) {
            C2242321Cpa c2242321Cpa2 = c2242321Cpa;
            return C2243521CrW.ADAPTER.encodedSizeWithTag(1, c2242321Cpa2.text) + c2242321Cpa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242321Cpa redact(C2242321Cpa c2242321Cpa) {
            C2242341Cpc c2242341CpcNewBuilder = c2242321Cpa.newBuilder();
            C2243521CrW c2243521CrW = c2242341CpcNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2242341CpcNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            c2242341CpcNewBuilder.clearUnknownFields();
            return c2242341CpcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242321Cpa c2242321Cpa) {
            C2242321Cpa c2242321Cpa2 = c2242321Cpa;
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 1, c2242321Cpa2.text);
            protoWriter.writeBytes(c2242321Cpa2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.text;
        int iHashCode2 = iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2242341Cpc newBuilder() {
        C2242341Cpc c2242341Cpc = new C2242341Cpc();
        c2242341Cpc.LIZLLL = this.text;
        c2242341Cpc.addUnknownFields(unknownFields());
        return c2242341Cpc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        sb.replace(0, 2, "BaseHeader{");
        sb.append('}');
        return sb.toString();
    }

    public C2242321Cpa(C2243521CrW c2243521CrW) {
        this(c2243521CrW, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242321Cpa)) {
            return false;
        }
        C2242321Cpa c2242321Cpa = (C2242321Cpa) obj;
        if (unknownFields().equals(c2242321Cpa.unknownFields()) && C1516540pZE.LJ(this.text, c2242321Cpa.text)) {
            return true;
        }
        return false;
    }

    public C2242321Cpa(C2243521CrW c2243521CrW, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = c2243521CrW;
    }
}
