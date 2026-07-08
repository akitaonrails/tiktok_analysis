package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPH extends Message<C1CPH, C1CPI> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long cost_ms;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutDriveStep#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2189041Alq step;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String switch_id;
    public static final ProtoAdapter<C1CPH> ADAPTER = new ProtoAdapter<C1CPH>() { // from class: X.1CPG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPH decode(ProtoReader protoReader) {
            C1CPI c1cpi = new C1CPI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cpi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cpi.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            try {
                                c1cpi.LJ = EnumC2189041Alq.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cpi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1cpi.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cpi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CPH c1cph) {
            C1CPH c1cph2 = c1cph;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cph2.switch_id) + EnumC2189041Alq.ADAPTER.encodedSizeWithTag(2, c1cph2.step) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1cph2.cost_ms) + c1cph2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPH redact(C1CPH c1cph) {
            C1CPI c1cpiNewBuilder = c1cph.newBuilder();
            c1cpiNewBuilder.clearUnknownFields();
            return c1cpiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CPH c1cph) {
            C1CPH c1cph2 = c1cph;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cph2.switch_id);
            EnumC2189041Alq.ADAPTER.encodeWithTag(protoWriter, 2, c1cph2.step);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1cph2.cost_ms);
            protoWriter.writeBytes(c1cph2.unknownFields());
        }
    };
    public static final EnumC2189041Alq DEFAULT_STEP = EnumC2189041Alq.VAR_LINK_MIC_LAYOUT_DRIVE_STEP_MEDIA_TRANS;
    public static final Long DEFAULT_COST_MS = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.switch_id.hashCode()) * 37) + this.step.hashCode()) * 37) + this.cost_ms.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CPI newBuilder() {
        C1CPI c1cpi = new C1CPI();
        c1cpi.LIZLLL = this.switch_id;
        c1cpi.LJ = this.step;
        c1cpi.LJFF = this.cost_ms;
        c1cpi.addUnknownFields(unknownFields());
        return c1cpi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", switch_id=");
        sb.append(this.switch_id);
        sb.append(", step=");
        sb.append(this.step);
        sb.append(", cost_ms=");
        sb.append(this.cost_ms);
        sb.replace(0, 2, "FuncParamsX7234e365984ef052{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CPH)) {
            return false;
        }
        C1CPH c1cph = (C1CPH) obj;
        if (unknownFields().equals(c1cph.unknownFields()) && this.switch_id.equals(c1cph.switch_id) && this.step.equals(c1cph.step) && this.cost_ms.equals(c1cph.cost_ms)) {
            return true;
        }
        return false;
    }

    public C1CPH(String str, EnumC2189041Alq enumC2189041Alq, Long l) {
        this(str, enumC2189041Alq, l, ByteString.EMPTY);
    }

    public C1CPH(String str, EnumC2189041Alq enumC2189041Alq, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_id = str;
        this.step = enumC2189041Alq;
        this.cost_ms = l;
    }
}
