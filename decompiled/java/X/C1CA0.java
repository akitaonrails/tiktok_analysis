package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CA0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CA0 extends Message<C1CA0, C1CA1> {
    public static final ProtoAdapter<C1CA0> ADAPTER = new ProtoAdapter<C1CA0>() { // from class: X.1C9z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA0 decode(ProtoReader protoReader) {
            C1CA1 c1ca1 = new C1CA1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ca1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            c1ca1.LIZLLL = EnumC15548066w.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1ca1.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ca1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CA0 c1ca0) {
            C1CA0 c1ca02 = c1ca0;
            return EnumC15548066w.ADAPTER.encodedSizeWithTag(1, c1ca02.action_type) + c1ca02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CA0 redact(C1CA0 c1ca0) {
            C1CA1 c1ca1NewBuilder = c1ca0.newBuilder();
            c1ca1NewBuilder.clearUnknownFields();
            return c1ca1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CA0 c1ca0) {
            C1CA0 c1ca02 = c1ca0;
            EnumC15548066w.ADAPTER.encodeWithTag(protoWriter, 1, c1ca02.action_type);
            protoWriter.writeBytes(c1ca02.unknownFields());
        }
    };
    public static final EnumC15548066w DEFAULT_ACTION_TYPE = EnumC15548066w.StreakPetActionTypeUnknown;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetActionType#ADAPTER", tag = 1)
    public final EnumC15548066w action_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EnumC15548066w enumC15548066w = this.action_type;
        int iHashCode2 = iHashCode + (enumC15548066w != null ? enumC15548066w.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CA1 newBuilder() {
        C1CA1 c1ca1 = new C1CA1();
        c1ca1.LIZLLL = this.action_type;
        c1ca1.addUnknownFields(unknownFields());
        return c1ca1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        sb.replace(0, 2, "StreakPetActionInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C1CA0(EnumC15548066w enumC15548066w) {
        this(enumC15548066w, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CA0)) {
            return false;
        }
        C1CA0 c1ca0 = (C1CA0) obj;
        if (unknownFields().equals(c1ca0.unknownFields()) && C1516540pZE.LJ(this.action_type, c1ca0.action_type)) {
            return true;
        }
        return false;
    }

    public C1CA0(EnumC15548066w enumC15548066w, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_type = enumC15548066w;
    }
}
