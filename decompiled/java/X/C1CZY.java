package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZY extends Message<C1CZY, C2232431CZd> {
    public static final ProtoAdapter<C1CZY> ADAPTER = new ProtoAdapter<C1CZY>() { // from class: X.1CZZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZY decode(ProtoReader protoReader) {
            C2232431CZd c2232431CZd = new C2232431CZd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232431CZd.LIZLLL = C2232401CZa.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2232431CZd.LJ = C2232401CZa.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2232431CZd.LJFF = C2232401CZa.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2232431CZd.LJI = C2232861CaK.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2232431CZd.LJII = C2232861CaK.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c2232431CZd.LJIIIIZZ = C1CXA.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2232431CZd.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232431CZd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232431CZd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CZY c1czy) {
            C1CZY c1czy2 = c1czy;
            ProtoAdapter<C2232401CZa> protoAdapter = C2232401CZa.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1czy2.all_link_state) + protoAdapter.encodedSizeWithTag(2, c1czy2.inner_arch_link_state) + protoAdapter.encodedSizeWithTag(3, c1czy2.cross_arch_link_state);
            ProtoAdapter<C2232861CaK> protoAdapter2 = C2232861CaK.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c1czy2.new_rtc_state) + protoAdapter2.encodedSizeWithTag(5, c1czy2.old_rtc_state) + C1CXA.ADAPTER.encodedSizeWithTag(6, c1czy2.trigger_source) + c1czy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZY redact(C1CZY c1czy) {
            C2232431CZd c2232431CZdNewBuilder = c1czy.newBuilder();
            ProtoAdapter<C2232401CZa> protoAdapter = C2232401CZa.ADAPTER;
            c2232431CZdNewBuilder.LIZLLL = protoAdapter.redact(c2232431CZdNewBuilder.LIZLLL);
            c2232431CZdNewBuilder.LJ = protoAdapter.redact(c2232431CZdNewBuilder.LJ);
            c2232431CZdNewBuilder.LJFF = protoAdapter.redact(c2232431CZdNewBuilder.LJFF);
            ProtoAdapter<C2232861CaK> protoAdapter2 = C2232861CaK.ADAPTER;
            c2232431CZdNewBuilder.LJI = protoAdapter2.redact(c2232431CZdNewBuilder.LJI);
            c2232431CZdNewBuilder.LJII = protoAdapter2.redact(c2232431CZdNewBuilder.LJII);
            c2232431CZdNewBuilder.clearUnknownFields();
            return c2232431CZdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CZY c1czy) {
            C1CZY c1czy2 = c1czy;
            ProtoAdapter<C2232401CZa> protoAdapter = C2232401CZa.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c1czy2.all_link_state);
            protoAdapter.encodeWithTag(protoWriter, 2, c1czy2.inner_arch_link_state);
            protoAdapter.encodeWithTag(protoWriter, 3, c1czy2.cross_arch_link_state);
            ProtoAdapter<C2232861CaK> protoAdapter2 = C2232861CaK.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c1czy2.new_rtc_state);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1czy2.old_rtc_state);
            C1CXA.ADAPTER.encodeWithTag(protoWriter, 6, c1czy2.trigger_source);
            protoWriter.writeBytes(c1czy2.unknownFields());
        }
    };
    public static final C1CXA DEFAULT_TRIGGER_SOURCE = C1CXA.VAR_SDK_LINK_RTC_EVENT_START_JOIN_RTC;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkStateModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232401CZa all_link_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkStateModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2232401CZa cross_arch_link_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkStateModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232401CZa inner_arch_link_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkRtcState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2232861CaK new_rtc_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkRtcState#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C2232861CaK old_rtc_state;

    @WireField(adapter = "link_mic_sdk.proto.SdkLinkRtcEvent#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C1CXA trigger_source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.all_link_state.hashCode()) * 37) + this.inner_arch_link_state.hashCode()) * 37) + this.cross_arch_link_state.hashCode()) * 37) + this.new_rtc_state.hashCode()) * 37) + this.old_rtc_state.hashCode()) * 37) + this.trigger_source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232431CZd newBuilder() {
        C2232431CZd c2232431CZd = new C2232431CZd();
        c2232431CZd.LIZLLL = this.all_link_state;
        c2232431CZd.LJ = this.inner_arch_link_state;
        c2232431CZd.LJFF = this.cross_arch_link_state;
        c2232431CZd.LJI = this.new_rtc_state;
        c2232431CZd.LJII = this.old_rtc_state;
        c2232431CZd.LJIIIIZZ = this.trigger_source;
        c2232431CZd.addUnknownFields(unknownFields());
        return c2232431CZd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", all_link_state=");
        sb.append(this.all_link_state);
        sb.append(", inner_arch_link_state=");
        sb.append(this.inner_arch_link_state);
        sb.append(", cross_arch_link_state=");
        sb.append(this.cross_arch_link_state);
        sb.append(", new_rtc_state=");
        sb.append(this.new_rtc_state);
        sb.append(", old_rtc_state=");
        sb.append(this.old_rtc_state);
        sb.append(", trigger_source=");
        sb.append(this.trigger_source);
        sb.replace(0, 2, "LinkRtcStateChangeContext{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CZY)) {
            return false;
        }
        C1CZY c1czy = (C1CZY) obj;
        if (unknownFields().equals(c1czy.unknownFields()) && this.all_link_state.equals(c1czy.all_link_state) && this.inner_arch_link_state.equals(c1czy.inner_arch_link_state) && this.cross_arch_link_state.equals(c1czy.cross_arch_link_state) && this.new_rtc_state.equals(c1czy.new_rtc_state) && this.old_rtc_state.equals(c1czy.old_rtc_state) && this.trigger_source.equals(c1czy.trigger_source)) {
            return true;
        }
        return false;
    }

    public C1CZY(C2232401CZa c2232401CZa, C2232401CZa c2232401CZa2, C2232401CZa c2232401CZa3, C2232861CaK c2232861CaK, C2232861CaK c2232861CaK2, C1CXA c1cxa) {
        this(c2232401CZa, c2232401CZa2, c2232401CZa3, c2232861CaK, c2232861CaK2, c1cxa, ByteString.EMPTY);
    }

    public C1CZY(C2232401CZa c2232401CZa, C2232401CZa c2232401CZa2, C2232401CZa c2232401CZa3, C2232861CaK c2232861CaK, C2232861CaK c2232861CaK2, C1CXA c1cxa, ByteString byteString) {
        super(ADAPTER, byteString);
        this.all_link_state = c2232401CZa;
        this.inner_arch_link_state = c2232401CZa2;
        this.cross_arch_link_state = c2232401CZa3;
        this.new_rtc_state = c2232861CaK;
        this.old_rtc_state = c2232861CaK2;
        this.trigger_source = c1cxa;
    }
}
