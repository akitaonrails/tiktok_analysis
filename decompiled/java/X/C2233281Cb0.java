package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233281Cb0 extends Message<C2233281Cb0, C2233301Cb2> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInteractForwardStreamError#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CXT error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String room_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInteractForwardStreamState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC1288040jcg state;
    public static final ProtoAdapter<C2233281Cb0> ADAPTER = new ProtoAdapter<C2233281Cb0>() { // from class: X.1Cb1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233281Cb0 decode(ProtoReader protoReader) {
            C2233301Cb2 c2233301Cb2 = new C2233301Cb2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2233301Cb2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    c2233301Cb2.LJFF = C1CXT.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2233301Cb2.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            try {
                                c2233301Cb2.LJ = EnumC1288040jcg.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2233301Cb2.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        }
                    } else {
                        c2233301Cb2.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233301Cb2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233281Cb0 c2233281Cb0) {
            C2233281Cb0 c2233281Cb02 = c2233281Cb0;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2233281Cb02.room_id) + EnumC1288040jcg.ADAPTER.encodedSizeWithTag(2, c2233281Cb02.state) + C1CXT.ADAPTER.encodedSizeWithTag(3, c2233281Cb02.error) + c2233281Cb02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233281Cb0 redact(C2233281Cb0 c2233281Cb0) {
            C2233301Cb2 c2233301Cb2NewBuilder = c2233281Cb0.newBuilder();
            c2233301Cb2NewBuilder.clearUnknownFields();
            return c2233301Cb2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233281Cb0 c2233281Cb0) {
            C2233281Cb0 c2233281Cb02 = c2233281Cb0;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2233281Cb02.room_id);
            EnumC1288040jcg.ADAPTER.encodeWithTag(protoWriter, 2, c2233281Cb02.state);
            C1CXT.ADAPTER.encodeWithTag(protoWriter, 3, c2233281Cb02.error);
            protoWriter.writeBytes(c2233281Cb02.unknownFields());
        }
    };
    public static final EnumC1288040jcg DEFAULT_STATE = EnumC1288040jcg.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_STATE_IDLE;
    public static final C1CXT DEFAULT_ERROR = C1CXT.VAR_LINK_MIC_INTERACT_FORWARD_STREAM_ERROR_OK;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.room_id.hashCode()) * 37) + this.state.hashCode()) * 37) + this.error.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233301Cb2 newBuilder() {
        C2233301Cb2 c2233301Cb2 = new C2233301Cb2();
        c2233301Cb2.LIZLLL = this.room_id;
        c2233301Cb2.LJ = this.state;
        c2233301Cb2.LJFF = this.error;
        c2233301Cb2.addUnknownFields(unknownFields());
        return c2233301Cb2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", room_id=");
        sb.append(this.room_id);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", error=");
        sb.append(this.error);
        sb.replace(0, 2, "LinkMicInteractForwardStreamStateInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233281Cb0)) {
            return false;
        }
        C2233281Cb0 c2233281Cb0 = (C2233281Cb0) obj;
        if (unknownFields().equals(c2233281Cb0.unknownFields()) && this.room_id.equals(c2233281Cb0.room_id) && this.state.equals(c2233281Cb0.state) && this.error.equals(c2233281Cb0.error)) {
            return true;
        }
        return false;
    }

    public C2233281Cb0(String str, EnumC1288040jcg enumC1288040jcg, C1CXT c1cxt) {
        this(str, enumC1288040jcg, c1cxt, ByteString.EMPTY);
    }

    public C2233281Cb0(String str, EnumC1288040jcg enumC1288040jcg, C1CXT c1cxt, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_id = str;
        this.state = enumC1288040jcg;
        this.error = c1cxt;
    }
}
