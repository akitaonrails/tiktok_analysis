package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZV extends Message<C1CZV, C2232441CZe> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkRtcState#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2232831CaH rtc_state;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CXW state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long uid;
    public static final ProtoAdapter<C1CZV> ADAPTER = new ProtoAdapter<C1CZV>() { // from class: X.1CZX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZV decode(ProtoReader protoReader) {
            C2232441CZe c2232441CZe = new C2232441CZe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2232441CZe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2232441CZe.LJI = C2232831CaH.ADAPTER.decode(protoReader);
                                }
                            } else {
                                try {
                                    c2232441CZe.LJFF = C1CXW.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2232441CZe.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c2232441CZe.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2232441CZe.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232441CZe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CZV c1czv) {
            C1CZV c1czv2 = c1czv;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1czv2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1czv2.link_mic_id) + C1CXW.ADAPTER.encodedSizeWithTag(3, c1czv2.state) + C2232831CaH.ADAPTER.encodedSizeWithTag(4, c1czv2.rtc_state) + c1czv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZV redact(C1CZV c1czv) {
            C2232441CZe c2232441CZeNewBuilder = c1czv.newBuilder();
            c2232441CZeNewBuilder.LJI = C2232831CaH.ADAPTER.redact(c2232441CZeNewBuilder.LJI);
            c2232441CZeNewBuilder.clearUnknownFields();
            return c2232441CZeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CZV c1czv) {
            C1CZV c1czv2 = c1czv;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1czv2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1czv2.link_mic_id);
            C1CXW.ADAPTER.encodeWithTag(protoWriter, 3, c1czv2.state);
            C2232831CaH.ADAPTER.encodeWithTag(protoWriter, 4, c1czv2.rtc_state);
            protoWriter.writeBytes(c1czv2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final C1CXW DEFAULT_STATE = C1CXW.VAR_USER_LINK_STATE_IDLE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.uid.hashCode()) * 37;
        String str = this.link_mic_id;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.rtc_state.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2232441CZe newBuilder() {
        C2232441CZe c2232441CZe = new C2232441CZe();
        c2232441CZe.LIZLLL = this.uid;
        c2232441CZe.LJ = this.link_mic_id;
        c2232441CZe.LJFF = this.state;
        c2232441CZe.LJI = this.rtc_state;
        c2232441CZe.addUnknownFields(unknownFields());
        return c2232441CZe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uid=");
        sb.append(this.uid);
        if (this.link_mic_id != null) {
            sb.append(", link_mic_id=");
            sb.append(this.link_mic_id);
        }
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", rtc_state=");
        sb.append(this.rtc_state);
        sb.replace(0, 2, "UserLinkStateModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CZV)) {
            return false;
        }
        C1CZV c1czv = (C1CZV) obj;
        if (unknownFields().equals(c1czv.unknownFields()) && this.uid.equals(c1czv.uid) && C1516540pZE.LJ(this.link_mic_id, c1czv.link_mic_id) && this.state.equals(c1czv.state) && this.rtc_state.equals(c1czv.rtc_state)) {
            return true;
        }
        return false;
    }

    public C1CZV(Long l, String str, C1CXW c1cxw, C2232831CaH c2232831CaH) {
        this(l, str, c1cxw, c2232831CaH, ByteString.EMPTY);
    }

    public C1CZV(Long l, String str, C1CXW c1cxw, C2232831CaH c2232831CaH, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.link_mic_id = str;
        this.state = c1cxw;
        this.rtc_state = c2232831CaH;
    }
}
