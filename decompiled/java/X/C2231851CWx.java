package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231851CWx extends Message<C2231851CWx, C1CX6> {
    public static final ProtoAdapter<C2231851CWx> ADAPTER = new ProtoAdapter<C2231851CWx>() { // from class: X.1CWy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231851CWx decode(ProtoReader protoReader) {
            C1CX6 c1cx6 = new C1CX6();
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
                                        c1cx6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1cx6.LJII = C1CZO.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    try {
                                        c1cx6.LJI = EnumC2231841CWw.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1cx6.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                try {
                                    c1cx6.LJFF = C1CXS.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1cx6.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            }
                        } else {
                            try {
                                c1cx6.LJ = C1CXS.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c1cx6.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        }
                    } else {
                        c1cx6.LIZLLL = C2232401CZa.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cx6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231851CWx c2231851CWx) {
            C2231851CWx c2231851CWx2 = c2231851CWx;
            int iEncodedSizeWithTag = C2232401CZa.ADAPTER.encodedSizeWithTag(1, c2231851CWx2.link_state);
            ProtoAdapter<C1CXS> protoAdapter = C1CXS.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2231851CWx2.new_state) + protoAdapter.encodedSizeWithTag(3, c2231851CWx2.old_state) + EnumC2231841CWw.ADAPTER.encodedSizeWithTag(4, c2231851CWx2.trigger_event) + C1CZO.ADAPTER.encodedSizeWithTag(5, c2231851CWx2.trigger_user_link_state_context) + c2231851CWx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231851CWx redact(C2231851CWx c2231851CWx) {
            C1CX6 c1cx6NewBuilder = c2231851CWx.newBuilder();
            c1cx6NewBuilder.LIZLLL = C2232401CZa.ADAPTER.redact(c1cx6NewBuilder.LIZLLL);
            C1CZO c1czo = c1cx6NewBuilder.LJII;
            if (c1czo != null) {
                c1cx6NewBuilder.LJII = C1CZO.ADAPTER.redact(c1czo);
            }
            c1cx6NewBuilder.clearUnknownFields();
            return c1cx6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231851CWx c2231851CWx) {
            C2231851CWx c2231851CWx2 = c2231851CWx;
            C2232401CZa.ADAPTER.encodeWithTag(protoWriter, 1, c2231851CWx2.link_state);
            ProtoAdapter<C1CXS> protoAdapter = C1CXS.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c2231851CWx2.new_state);
            protoAdapter.encodeWithTag(protoWriter, 3, c2231851CWx2.old_state);
            EnumC2231841CWw.ADAPTER.encodeWithTag(protoWriter, 4, c2231851CWx2.trigger_event);
            C1CZO.ADAPTER.encodeWithTag(protoWriter, 5, c2231851CWx2.trigger_user_link_state_context);
            protoWriter.writeBytes(c2231851CWx2.unknownFields());
        }
    };
    public static final C1CXS DEFAULT_NEW_STATE;
    public static final C1CXS DEFAULT_OLD_STATE;
    public static final EnumC2231841CWw DEFAULT_TRIGGER_EVENT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkStateModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232401CZa link_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CXS new_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CXS old_state;

    @WireField(adapter = "link_mic_sdk.proto.SdkLinkEvent#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC2231841CWw trigger_event;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkStateChangeContext#ADAPTER", tag = 5)
    public final C1CZO trigger_user_link_state_context;

    static {
        C1CXS c1cxs = C1CXS.VAR_LINK_STATE_CLOSE;
        DEFAULT_NEW_STATE = c1cxs;
        DEFAULT_OLD_STATE = c1cxs;
        DEFAULT_TRIGGER_EVENT = EnumC2231841CWw.VAR_SDK_LINK_EVENT_REQUEST_CREATE_CHANNEL_SUCCESS;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.link_state.hashCode()) * 37) + this.new_state.hashCode()) * 37) + this.old_state.hashCode()) * 37) + this.trigger_event.hashCode()) * 37;
        C1CZO c1czo = this.trigger_user_link_state_context;
        int iHashCode2 = iHashCode + (c1czo != null ? c1czo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CX6 newBuilder() {
        C1CX6 c1cx6 = new C1CX6();
        c1cx6.LIZLLL = this.link_state;
        c1cx6.LJ = this.new_state;
        c1cx6.LJFF = this.old_state;
        c1cx6.LJI = this.trigger_event;
        c1cx6.LJII = this.trigger_user_link_state_context;
        c1cx6.addUnknownFields(unknownFields());
        return c1cx6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_state=");
        sb.append(this.link_state);
        sb.append(", new_state=");
        sb.append(this.new_state);
        sb.append(", old_state=");
        sb.append(this.old_state);
        sb.append(", trigger_event=");
        sb.append(this.trigger_event);
        if (this.trigger_user_link_state_context != null) {
            sb.append(", trigger_user_link_state_context=");
            sb.append(this.trigger_user_link_state_context);
        }
        sb.replace(0, 2, "LinkStateChangeContext{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231851CWx)) {
            return false;
        }
        C2231851CWx c2231851CWx = (C2231851CWx) obj;
        if (unknownFields().equals(c2231851CWx.unknownFields()) && this.link_state.equals(c2231851CWx.link_state) && this.new_state.equals(c2231851CWx.new_state) && this.old_state.equals(c2231851CWx.old_state) && this.trigger_event.equals(c2231851CWx.trigger_event) && C1516540pZE.LJ(this.trigger_user_link_state_context, c2231851CWx.trigger_user_link_state_context)) {
            return true;
        }
        return false;
    }

    public C2231851CWx(C2232401CZa c2232401CZa, C1CXS c1cxs, C1CXS c1cxs2, EnumC2231841CWw enumC2231841CWw, C1CZO c1czo) {
        this(c2232401CZa, c1cxs, c1cxs2, enumC2231841CWw, c1czo, ByteString.EMPTY);
    }

    public C2231851CWx(C2232401CZa c2232401CZa, C1CXS c1cxs, C1CXS c1cxs2, EnumC2231841CWw enumC2231841CWw, C1CZO c1czo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_state = c2232401CZa;
        this.new_state = c1cxs;
        this.old_state = c1cxs2;
        this.trigger_event = enumC2231841CWw;
        this.trigger_user_link_state_context = c1czo;
    }
}
