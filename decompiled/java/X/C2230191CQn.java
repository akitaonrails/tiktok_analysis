package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230191CQn extends Message<C2230191CQn, C2230211CQp> {
    public static final ProtoAdapter<C2230191CQn> ADAPTER = new ProtoAdapter<C2230191CQn>() { // from class: X.1CQo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230191CQn decode(ProtoReader protoReader) {
            C2230211CQp c2230211CQp = new C2230211CQp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2230211CQp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    try {
                                        c2230211CQp.LJI = EnumC2230231CQr.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2230211CQp.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c2230211CQp.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2230211CQp.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2230211CQp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230211CQp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2230191CQn c2230191CQn) {
            C2230191CQn c2230191CQn2 = c2230191CQn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2230191CQn2.key) + protoAdapter.encodedSizeWithTag(2, c2230191CQn2.name) + protoAdapter.encodedSizeWithTag(3, c2230191CQn2.link) + EnumC2230231CQr.ADAPTER.encodedSizeWithTag(4, c2230191CQn2.action) + c2230191CQn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2230191CQn redact(C2230191CQn c2230191CQn) {
            C2230211CQp c2230211CQpNewBuilder = c2230191CQn.newBuilder();
            c2230211CQpNewBuilder.clearUnknownFields();
            return c2230211CQpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2230191CQn c2230191CQn) {
            C2230191CQn c2230191CQn2 = c2230191CQn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2230191CQn2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2230191CQn2.name);
            protoAdapter.encodeWithTag(protoWriter, 3, c2230191CQn2.link);
            EnumC2230231CQr.ADAPTER.encodeWithTag(protoWriter, 4, c2230191CQn2.action);
            protoWriter.writeBytes(c2230191CQn2.unknownFields());
        }
    };
    public static final EnumC2230231CQr DEFAULT_ACTION = EnumC2230231CQr.Schema;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InlineMessageClickAction#ADAPTER", tag = 4)
    public final EnumC2230231CQr action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.link;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EnumC2230231CQr enumC2230231CQr = this.action;
        int iHashCode5 = iHashCode4 + (enumC2230231CQr != null ? enumC2230231CQr.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2230211CQp newBuilder() {
        C2230211CQp c2230211CQp = new C2230211CQp();
        c2230211CQp.LIZLLL = this.key;
        c2230211CQp.LJ = this.name;
        c2230211CQp.LJFF = this.link;
        c2230211CQp.LJI = this.action;
        c2230211CQp.addUnknownFields(unknownFields());
        return c2230211CQp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        sb.replace(0, 2, "InlineMessageKey{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2230191CQn)) {
            return false;
        }
        C2230191CQn c2230191CQn = (C2230191CQn) obj;
        if (unknownFields().equals(c2230191CQn.unknownFields()) && C1516540pZE.LJ(this.key, c2230191CQn.key) && C1516540pZE.LJ(this.name, c2230191CQn.name) && C1516540pZE.LJ(this.link, c2230191CQn.link) && C1516540pZE.LJ(this.action, c2230191CQn.action)) {
            return true;
        }
        return false;
    }

    public C2230191CQn(String str, String str2, String str3, EnumC2230231CQr enumC2230231CQr) {
        this(str, str2, str3, enumC2230231CQr, ByteString.EMPTY);
    }

    public C2230191CQn(String str, String str2, String str3, EnumC2230231CQr enumC2230231CQr, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.name = str2;
        this.link = str3;
        this.action = enumC2230231CQr;
    }
}
