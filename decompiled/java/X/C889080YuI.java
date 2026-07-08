package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889080YuI extends Message<C889080YuI, C889060YuG> {
    public static final ProtoAdapter<C889080YuI> ADAPTER = new ProtoAdapter<C889080YuI>() { // from class: X.0YuH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C889080YuI decode(ProtoReader protoReader) {
            C889060YuG c889060YuG = new C889060YuG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c889060YuG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c889060YuG.LJ.add(C2244601CtG.ADAPTER.decode(protoReader));
                        }
                    } else {
                        try {
                            c889060YuG.LIZLLL = EnumC1705606m6.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c889060YuG.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c889060YuG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C889080YuI c889080YuI) {
            C889080YuI c889080YuI2 = c889080YuI;
            return EnumC1705606m6.ADAPTER.encodedSizeWithTag(1, c889080YuI2.type) + C2244601CtG.ADAPTER.asRepeated().encodedSizeWithTag(2, c889080YuI2.options) + c889080YuI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C889080YuI redact(C889080YuI c889080YuI) {
            C889060YuG c889060YuGNewBuilder = c889080YuI.newBuilder();
            C1516540pZE.LJIIIZ(c889060YuGNewBuilder.LJ, C2244601CtG.ADAPTER);
            c889060YuGNewBuilder.clearUnknownFields();
            return c889060YuGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C889080YuI c889080YuI) {
            C889080YuI c889080YuI2 = c889080YuI;
            EnumC1705606m6.ADAPTER.encodeWithTag(protoWriter, 1, c889080YuI2.type);
            C2244601CtG.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c889080YuI2.options);
            protoWriter.writeBytes(c889080YuI2.unknownFields());
        }
    };
    public static final EnumC1705606m6 DEFAULT_TYPE = EnumC1705606m6.INTERACTION_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.Option#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2244601CtG> options;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.BotInteractionType#ADAPTER", tag = 1)
    public final EnumC1705606m6 type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EnumC1705606m6 enumC1705606m6 = this.type;
        int iHashCode2 = ((iHashCode + (enumC1705606m6 != null ? enumC1705606m6.hashCode() : 0)) * 37) + this.options.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C889060YuG newBuilder() {
        C889060YuG c889060YuG = new C889060YuG();
        c889060YuG.LIZLLL = this.type;
        c889060YuG.LJ = C1516540pZE.LIZJ("options", this.options);
        c889060YuG.addUnknownFields(unknownFields());
        return c889060YuG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (!this.options.isEmpty()) {
            sb.append(", options=");
            sb.append(this.options);
        }
        sb.replace(0, 2, "BotInteraction{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C889080YuI)) {
            return false;
        }
        C889080YuI c889080YuI = (C889080YuI) obj;
        if (unknownFields().equals(c889080YuI.unknownFields()) && C1516540pZE.LJ(this.type, c889080YuI.type) && this.options.equals(c889080YuI.options)) {
            return true;
        }
        return false;
    }

    public C889080YuI(EnumC1705606m6 enumC1705606m6, List<C2244601CtG> list) {
        this(enumC1705606m6, list, ByteString.EMPTY);
    }

    public C889080YuI(EnumC1705606m6 enumC1705606m6, List<C2244601CtG> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = enumC1705606m6;
        this.options = C1516540pZE.LJFF("options", list);
    }
}
