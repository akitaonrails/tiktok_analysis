package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZU extends Message<C1CZU, C2232421CZc> {
    public static final ProtoAdapter<C1CZU> ADAPTER = new ProtoAdapter<C1CZU>() { // from class: X.1CZW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZU decode(ProtoReader protoReader) {
            C2232421CZc c2232421CZc = new C2232421CZc();
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
                                        c2232421CZc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        try {
                                            c2232421CZc.LJII = C1CXV.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c2232421CZc.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                    }
                                } else {
                                    c2232421CZc.LJI = C2232831CaH.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2232421CZc.LJFF = C2232831CaH.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2232421CZc.LJ = C1CZV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2232421CZc.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232421CZc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CZU c1czu) {
            C1CZU c1czu2 = c1czu;
            int iEncodedSizeWithTag = C2232021CXo.ADAPTER.encodedSizeWithTag(1, c1czu2.user) + C1CZV.ADAPTER.encodedSizeWithTag(2, c1czu2.user_link_state);
            ProtoAdapter<C2232831CaH> protoAdapter = C2232831CaH.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1czu2.new_rtc_state) + protoAdapter.encodedSizeWithTag(4, c1czu2.old_rtc_state) + C1CXV.ADAPTER.encodedSizeWithTag(5, c1czu2.trigger_source) + c1czu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZU redact(C1CZU c1czu) {
            C2232421CZc c2232421CZcNewBuilder = c1czu.newBuilder();
            C2232021CXo c2232021CXo = c2232421CZcNewBuilder.LIZLLL;
            if (c2232021CXo != null) {
                c2232421CZcNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2232021CXo);
            }
            c2232421CZcNewBuilder.LJ = C1CZV.ADAPTER.redact(c2232421CZcNewBuilder.LJ);
            ProtoAdapter<C2232831CaH> protoAdapter = C2232831CaH.ADAPTER;
            c2232421CZcNewBuilder.LJFF = protoAdapter.redact(c2232421CZcNewBuilder.LJFF);
            c2232421CZcNewBuilder.LJI = protoAdapter.redact(c2232421CZcNewBuilder.LJI);
            c2232421CZcNewBuilder.clearUnknownFields();
            return c2232421CZcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CZU c1czu) {
            C1CZU c1czu2 = c1czu;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c1czu2.user);
            C1CZV.ADAPTER.encodeWithTag(protoWriter, 2, c1czu2.user_link_state);
            ProtoAdapter<C2232831CaH> protoAdapter = C2232831CaH.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c1czu2.new_rtc_state);
            protoAdapter.encodeWithTag(protoWriter, 4, c1czu2.old_rtc_state);
            C1CXV.ADAPTER.encodeWithTag(protoWriter, 5, c1czu2.trigger_source);
            protoWriter.writeBytes(c1czu2.unknownFields());
        }
    };
    public static final C1CXV DEFAULT_TRIGGER_SOURCE = C1CXV.VAR_USER_LINK_RTC_EVENT_ON_REMOTE_USER_JOINED;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkRtcState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2232831CaH new_rtc_state;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkRtcState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2232831CaH old_rtc_state;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkRtcEvent#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C1CXV trigger_source;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", tag = 1)
    public final C2232021CXo user;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkStateModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CZV user_link_state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2232021CXo c2232021CXo = this.user;
        int iHashCode2 = ((((((((iHashCode + (c2232021CXo != null ? c2232021CXo.hashCode() : 0)) * 37) + this.user_link_state.hashCode()) * 37) + this.new_rtc_state.hashCode()) * 37) + this.old_rtc_state.hashCode()) * 37) + this.trigger_source.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2232421CZc newBuilder() {
        C2232421CZc c2232421CZc = new C2232421CZc();
        c2232421CZc.LIZLLL = this.user;
        c2232421CZc.LJ = this.user_link_state;
        c2232421CZc.LJFF = this.new_rtc_state;
        c2232421CZc.LJI = this.old_rtc_state;
        c2232421CZc.LJII = this.trigger_source;
        c2232421CZc.addUnknownFields(unknownFields());
        return c2232421CZc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        sb.append(", user_link_state=");
        sb.append(this.user_link_state);
        sb.append(", new_rtc_state=");
        sb.append(this.new_rtc_state);
        sb.append(", old_rtc_state=");
        sb.append(this.old_rtc_state);
        sb.append(", trigger_source=");
        sb.append(this.trigger_source);
        sb.replace(0, 2, "UserLinkRtcStateChangeContext{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CZU)) {
            return false;
        }
        C1CZU c1czu = (C1CZU) obj;
        if (unknownFields().equals(c1czu.unknownFields()) && C1516540pZE.LJ(this.user, c1czu.user) && this.user_link_state.equals(c1czu.user_link_state) && this.new_rtc_state.equals(c1czu.new_rtc_state) && this.old_rtc_state.equals(c1czu.old_rtc_state) && this.trigger_source.equals(c1czu.trigger_source)) {
            return true;
        }
        return false;
    }

    public C1CZU(C2232021CXo c2232021CXo, C1CZV c1czv, C2232831CaH c2232831CaH, C2232831CaH c2232831CaH2, C1CXV c1cxv) {
        this(c2232021CXo, c1czv, c2232831CaH, c2232831CaH2, c1cxv, ByteString.EMPTY);
    }

    public C1CZU(C2232021CXo c2232021CXo, C1CZV c1czv, C2232831CaH c2232831CaH, C2232831CaH c2232831CaH2, C1CXV c1cxv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = c2232021CXo;
        this.user_link_state = c1czv;
        this.new_rtc_state = c2232831CaH;
        this.old_rtc_state = c2232831CaH2;
        this.trigger_source = c1cxv;
    }
}
