package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CW4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CW4 extends Message<C1CW4, C1CW5> {
    public static final ProtoAdapter<C1CW4> ADAPTER = new ProtoAdapter<C1CW4>() { // from class: X.1CW3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CW4 decode(ProtoReader protoReader) {
            C1CW5 c1cw5 = new C1CW5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cw5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cw5.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cw5.LIZLLL = EnumC1283240jUw.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cw5.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cw5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CW4 c1cw4) {
            C1CW4 c1cw42 = c1cw4;
            return EnumC1283240jUw.ADAPTER.encodedSizeWithTag(1, c1cw42.pos_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cw42.value) + c1cw42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CW4 redact(C1CW4 c1cw4) {
            C1CW5 c1cw5NewBuilder = c1cw4.newBuilder();
            c1cw5NewBuilder.clearUnknownFields();
            return c1cw5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CW4 c1cw4) {
            C1CW4 c1cw42 = c1cw4;
            EnumC1283240jUw.ADAPTER.encodeWithTag(protoWriter, 1, c1cw42.pos_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1cw42.value);
            protoWriter.writeBytes(c1cw42.unknownFields());
        }
    };
    public static final EnumC1283240jUw DEFAULT_POS_TYPE = EnumC1283240jUw.VAR_LINK_MIC_POS_IDENTITY_TYPE_EMPTY_SLOT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentityType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC1283240jUw pos_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.pos_type.hashCode()) * 37) + this.value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CW5 newBuilder() {
        C1CW5 c1cw5 = new C1CW5();
        c1cw5.LIZLLL = this.pos_type;
        c1cw5.LJ = this.value;
        c1cw5.addUnknownFields(unknownFields());
        return c1cw5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", pos_type=");
        sb.append(this.pos_type);
        sb.append(", value=");
        sb.append(this.value);
        sb.replace(0, 2, "LinkMicPosIdentity{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CW4)) {
            return false;
        }
        C1CW4 c1cw4 = (C1CW4) obj;
        if (unknownFields().equals(c1cw4.unknownFields()) && this.pos_type.equals(c1cw4.pos_type) && this.value.equals(c1cw4.value)) {
            return true;
        }
        return false;
    }

    public C1CW4(EnumC1283240jUw enumC1283240jUw, String str) {
        this(enumC1283240jUw, str, ByteString.EMPTY);
    }

    public C1CW4(EnumC1283240jUw enumC1283240jUw, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.pos_type = enumC1283240jUw;
        this.value = str;
    }
}
