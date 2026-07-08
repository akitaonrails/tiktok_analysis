package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225731C9j extends Message<C2225731C9j, C2225741C9k> {
    public static final ProtoAdapter<C2225731C9j> ADAPTER = new ProtoAdapter<C2225731C9j>() { // from class: X.1C9i
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225731C9j decode(ProtoReader protoReader) {
            C2225741C9k c2225741C9k = new C2225741C9k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2225741C9k.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2225741C9k.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        try {
                            c2225741C9k.LIZLLL = EnumC2225751C9l.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2225741C9k.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225741C9k.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225731C9j c2225731C9j) {
            C2225731C9j c2225731C9j2 = c2225731C9j;
            return EnumC2225751C9l.ADAPTER.encodedSizeWithTag(1, c2225731C9j2.scene) + this.LIZ.encodedSizeWithTag(2, c2225731C9j2.params) + c2225731C9j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225731C9j redact(C2225731C9j c2225731C9j) {
            C2225741C9k c2225741C9kNewBuilder = c2225731C9j.newBuilder();
            c2225741C9kNewBuilder.clearUnknownFields();
            return c2225741C9kNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225731C9j c2225731C9j) {
            C2225731C9j c2225731C9j2 = c2225731C9j;
            EnumC2225751C9l.ADAPTER.encodeWithTag(protoWriter, 1, c2225731C9j2.scene);
            this.LIZ.encodeWithTag(protoWriter, 2, c2225731C9j2.params);
            protoWriter.writeBytes(c2225731C9j2.unknownFields());
        }
    };
    public static final EnumC2225751C9l DEFAULT_SCENE = EnumC2225751C9l.VAR_LINK_MIC_TASK_SCENE_JOIN_RTC_CHANNEL;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final Map<String, String> params;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicTaskScene#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2225751C9l scene;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.scene.hashCode()) * 37) + this.params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2225741C9k newBuilder() {
        C2225741C9k c2225741C9k = new C2225741C9k();
        c2225741C9k.LIZLLL = this.scene;
        c2225741C9k.LJ = C1516540pZE.LIZLLL("params", this.params);
        c2225741C9k.addUnknownFields(unknownFields());
        return c2225741C9k;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        if (!this.params.isEmpty()) {
            sb.append(", params=");
            sb.append(this.params);
        }
        sb.replace(0, 2, "LinkMicTask{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225731C9j)) {
            return false;
        }
        C2225731C9j c2225731C9j = (C2225731C9j) obj;
        if (unknownFields().equals(c2225731C9j.unknownFields()) && this.scene.equals(c2225731C9j.scene) && this.params.equals(c2225731C9j.params)) {
            return true;
        }
        return false;
    }

    public C2225731C9j(EnumC2225751C9l enumC2225751C9l, Map<String, String> map) {
        this(enumC2225751C9l, map, ByteString.EMPTY);
    }

    public C2225731C9j(EnumC2225751C9l enumC2225751C9l, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = enumC2225751C9l;
        this.params = C1516540pZE.LJI("params", map);
    }
}
