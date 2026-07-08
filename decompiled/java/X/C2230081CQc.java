package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230081CQc extends Message<C2230081CQc, C2230101CQe> {
    public static final ProtoAdapter<C2230081CQc> ADAPTER = new ProtoAdapter<C2230081CQc>() { // from class: X.1CQd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230081CQc decode(ProtoReader protoReader) {
            C2230101CQe c2230101CQe = new C2230101CQe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2230101CQe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2230101CQe.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2230101CQe.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2230101CQe.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2230101CQe.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230101CQe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230081CQc c2230081CQc) {
            C2230081CQc c2230081CQc2 = c2230081CQc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2230081CQc2.comment) + protoAdapter.encodedSizeWithTag(2, c2230081CQc2.tips) + protoAdapter.encodedSizeWithTag(3, c2230081CQc2.conditions) + protoAdapter.encodedSizeWithTag(4, c2230081CQc2.auto_run_mode) + c2230081CQc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230081CQc redact(C2230081CQc c2230081CQc) {
            C2230101CQe c2230101CQeNewBuilder = c2230081CQc.newBuilder();
            c2230101CQeNewBuilder.clearUnknownFields();
            return c2230101CQeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230081CQc c2230081CQc) {
            C2230081CQc c2230081CQc2 = c2230081CQc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230081CQc2.comment);
            protoAdapter.encodeWithTag(protoWriter, 2, c2230081CQc2.tips);
            protoAdapter.encodeWithTag(protoWriter, 3, c2230081CQc2.conditions);
            protoAdapter.encodeWithTag(protoWriter, 4, c2230081CQc2.auto_run_mode);
            protoWriter.writeBytes(c2230081CQc2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String auto_run_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String comment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String conditions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String tips;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.comment;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.tips;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.conditions;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.auto_run_mode;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2230101CQe newBuilder() {
        C2230101CQe c2230101CQe = new C2230101CQe();
        c2230101CQe.LIZLLL = this.comment;
        c2230101CQe.LJ = this.tips;
        c2230101CQe.LJFF = this.conditions;
        c2230101CQe.LJI = this.auto_run_mode;
        c2230101CQe.addUnknownFields(unknownFields());
        return c2230101CQe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        if (this.conditions != null) {
            sb.append(", conditions=");
            sb.append(this.conditions);
        }
        if (this.auto_run_mode != null) {
            sb.append(", auto_run_mode=");
            sb.append(this.auto_run_mode);
        }
        sb.replace(0, 2, "FuncParamsX432d447b09782366{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230081CQc)) {
            return false;
        }
        C2230081CQc c2230081CQc = (C2230081CQc) obj;
        if (unknownFields().equals(c2230081CQc.unknownFields()) && C1516540pZE.LJ(this.comment, c2230081CQc.comment) && C1516540pZE.LJ(this.tips, c2230081CQc.tips) && C1516540pZE.LJ(this.conditions, c2230081CQc.conditions) && C1516540pZE.LJ(this.auto_run_mode, c2230081CQc.auto_run_mode)) {
            return true;
        }
        return false;
    }

    public C2230081CQc(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public C2230081CQc(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment = str;
        this.tips = str2;
        this.conditions = str3;
        this.auto_run_mode = str4;
    }
}
