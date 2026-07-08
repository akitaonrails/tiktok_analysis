package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVF extends Message<C1CVF, C1CVG> {
    public static final ProtoAdapter<C1CVF> ADAPTER = new ProtoAdapter<C1CVF>() { // from class: X.1CVE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVF decode(ProtoReader protoReader) {
            C1CVG c1cvg = new C1CVG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cvg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cvg.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cvg.LIZLLL = C1CWW.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cvg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVF c1cvf) {
            C1CVF c1cvf2 = c1cvf;
            return C1CWW.ADAPTER.encodedSizeWithTag(1, c1cvf2.online_user_state) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cvf2.link_mic_id) + c1cvf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVF redact(C1CVF c1cvf) {
            C1CVG c1cvgNewBuilder = c1cvf.newBuilder();
            c1cvgNewBuilder.clearUnknownFields();
            return c1cvgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVF c1cvf) {
            C1CVF c1cvf2 = c1cvf;
            C1CWW.ADAPTER.encodeWithTag(protoWriter, 1, c1cvf2.online_user_state);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1cvf2.link_mic_id);
            protoWriter.writeBytes(c1cvf2.unknownFields());
        }
    };
    public static final C1CWW DEFAULT_ONLINE_USER_STATE = C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicOnlineUserState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CWW online_user_state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.online_user_state.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVG newBuilder() {
        C1CVG c1cvg = new C1CVG();
        c1cvg.LIZLLL = this.online_user_state;
        c1cvg.LJ = this.link_mic_id;
        c1cvg.addUnknownFields(unknownFields());
        return c1cvg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", online_user_state=");
        sb.append(this.online_user_state);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX75ef81d26a392dd4{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVF)) {
            return false;
        }
        C1CVF c1cvf = (C1CVF) obj;
        if (unknownFields().equals(c1cvf.unknownFields()) && this.online_user_state.equals(c1cvf.online_user_state) && this.link_mic_id.equals(c1cvf.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C1CVF(C1CWW c1cww, String str) {
        this(c1cww, str, ByteString.EMPTY);
    }

    public C1CVF(C1CWW c1cww, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.online_user_state = c1cww;
        this.link_mic_id = str;
    }
}
