package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZO extends Message<C1CZO, C1CZQ> {
    public static final ProtoAdapter<C1CZO> ADAPTER = new ProtoAdapter<C1CZO>() { // from class: X.1CZP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZO decode(ProtoReader protoReader) {
            C1CZQ c1czq = new C1CZQ();
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
                                        c1czq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        try {
                                            c1czq.LJII = EnumC2231731CWl.ADAPTER.decode(protoReader);
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            c1czq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        }
                                    }
                                } else {
                                    try {
                                        c1czq.LJI = C1CXW.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        c1czq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    }
                                }
                            } else {
                                try {
                                    c1czq.LJFF = C1CXW.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    c1czq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                            }
                        } else {
                            c1czq.LJ = C1CZV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1czq.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1czq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CZO c1czo) {
            C1CZO c1czo2 = c1czo;
            int iEncodedSizeWithTag = C2232021CXo.ADAPTER.encodedSizeWithTag(1, c1czo2.user) + C1CZV.ADAPTER.encodedSizeWithTag(2, c1czo2.user_link_state);
            ProtoAdapter<C1CXW> protoAdapter = C1CXW.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1czo2.new_state) + protoAdapter.encodedSizeWithTag(4, c1czo2.old_state) + EnumC2231731CWl.ADAPTER.encodedSizeWithTag(5, c1czo2.trigger_event) + c1czo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZO redact(C1CZO c1czo) {
            C1CZQ c1czqNewBuilder = c1czo.newBuilder();
            C2232021CXo c2232021CXo = c1czqNewBuilder.LIZLLL;
            if (c2232021CXo != null) {
                c1czqNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c2232021CXo);
            }
            c1czqNewBuilder.LJ = C1CZV.ADAPTER.redact(c1czqNewBuilder.LJ);
            c1czqNewBuilder.clearUnknownFields();
            return c1czqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CZO c1czo) {
            C1CZO c1czo2 = c1czo;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c1czo2.user);
            C1CZV.ADAPTER.encodeWithTag(protoWriter, 2, c1czo2.user_link_state);
            ProtoAdapter<C1CXW> protoAdapter = C1CXW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c1czo2.new_state);
            protoAdapter.encodeWithTag(protoWriter, 4, c1czo2.old_state);
            EnumC2231731CWl.ADAPTER.encodeWithTag(protoWriter, 5, c1czo2.trigger_event);
            protoWriter.writeBytes(c1czo2.unknownFields());
        }
    };
    public static final C1CXW DEFAULT_NEW_STATE;
    public static final C1CXW DEFAULT_OLD_STATE;
    public static final EnumC2231731CWl DEFAULT_TRIGGER_EVENT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CXW new_state;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C1CXW old_state;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkStateEvent#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC2231731CWl trigger_event;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", tag = 1)
    public final C2232021CXo user;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkStateModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CZV user_link_state;

    static {
        C1CXW c1cxw = C1CXW.VAR_USER_LINK_STATE_IDLE;
        DEFAULT_NEW_STATE = c1cxw;
        DEFAULT_OLD_STATE = c1cxw;
        DEFAULT_TRIGGER_EVENT = EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_NONE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2232021CXo c2232021CXo = this.user;
        int iHashCode2 = ((((((((iHashCode + (c2232021CXo != null ? c2232021CXo.hashCode() : 0)) * 37) + this.user_link_state.hashCode()) * 37) + this.new_state.hashCode()) * 37) + this.old_state.hashCode()) * 37) + this.trigger_event.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CZQ newBuilder() {
        C1CZQ c1czq = new C1CZQ();
        c1czq.LIZLLL = this.user;
        c1czq.LJ = this.user_link_state;
        c1czq.LJFF = this.new_state;
        c1czq.LJI = this.old_state;
        c1czq.LJII = this.trigger_event;
        c1czq.addUnknownFields(unknownFields());
        return c1czq;
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
        sb.append(", new_state=");
        sb.append(this.new_state);
        sb.append(", old_state=");
        sb.append(this.old_state);
        sb.append(", trigger_event=");
        sb.append(this.trigger_event);
        sb.replace(0, 2, "UserLinkStateChangeContext{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CZO)) {
            return false;
        }
        C1CZO c1czo = (C1CZO) obj;
        if (unknownFields().equals(c1czo.unknownFields()) && C1516540pZE.LJ(this.user, c1czo.user) && this.user_link_state.equals(c1czo.user_link_state) && this.new_state.equals(c1czo.new_state) && this.old_state.equals(c1czo.old_state) && this.trigger_event.equals(c1czo.trigger_event)) {
            return true;
        }
        return false;
    }

    public C1CZO(C2232021CXo c2232021CXo, C1CZV c1czv, C1CXW c1cxw, C1CXW c1cxw2, EnumC2231731CWl enumC2231731CWl) {
        this(c2232021CXo, c1czv, c1cxw, c1cxw2, enumC2231731CWl, ByteString.EMPTY);
    }

    public C1CZO(C2232021CXo c2232021CXo, C1CZV c1czv, C1CXW c1cxw, C1CXW c1cxw2, EnumC2231731CWl enumC2231731CWl, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = c2232021CXo;
        this.user_link_state = c1czv;
        this.new_state = c1cxw;
        this.old_state = c1cxw2;
        this.trigger_event = enumC2231731CWl;
    }
}
