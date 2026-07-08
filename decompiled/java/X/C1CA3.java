package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CA3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CA3 extends Message<C1CA3, C1CA4> {
    public static final ProtoAdapter<C1CA3> ADAPTER = new ProtoAdapter<C1CA3>() { // from class: X.1CA2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA3 decode(ProtoReader protoReader) {
            C1CA4 c1ca4 = new C1CA4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1ca4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1ca4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1ca4.LIZLLL.add(C1CA0.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ca4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CA3 c1ca3) {
            C1CA3 c1ca32 = c1ca3;
            return C1CA0.ADAPTER.asRepeated().encodedSizeWithTag(1, c1ca32.action_infos) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1ca32.data_version) + c1ca32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA3 redact(C1CA3 c1ca3) {
            C1CA4 c1ca4NewBuilder = c1ca3.newBuilder();
            C1516540pZE.LJIIIZ(c1ca4NewBuilder.LIZLLL, C1CA0.ADAPTER);
            c1ca4NewBuilder.clearUnknownFields();
            return c1ca4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CA3 c1ca3) {
            C1CA3 c1ca32 = c1ca3;
            C1CA0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1ca32.action_infos);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1ca32.data_version);
            protoWriter.writeBytes(c1ca32.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetActionInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1CA0> action_infos;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String data_version;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.action_infos.hashCode()) * 37;
        String str = this.data_version;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CA4 newBuilder() {
        C1CA4 c1ca4 = new C1CA4();
        c1ca4.LIZLLL = C1516540pZE.LIZJ("action_infos", this.action_infos);
        c1ca4.LJ = this.data_version;
        c1ca4.addUnknownFields(unknownFields());
        return c1ca4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.action_infos.isEmpty()) {
            sb.append(", action_infos=");
            sb.append(this.action_infos);
        }
        if (this.data_version != null) {
            sb.append(", data_version=");
            sb.append(this.data_version);
        }
        sb.replace(0, 2, "StreakPetActiveRefreshValue{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CA3)) {
            return false;
        }
        C1CA3 c1ca3 = (C1CA3) obj;
        if (unknownFields().equals(c1ca3.unknownFields()) && this.action_infos.equals(c1ca3.action_infos) && C1516540pZE.LJ(this.data_version, c1ca3.data_version)) {
            return true;
        }
        return false;
    }

    public C1CA3(List<C1CA0> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public C1CA3(List<C1CA0> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_infos = C1516540pZE.LJFF("action_infos", list);
        this.data_version = str;
    }
}
