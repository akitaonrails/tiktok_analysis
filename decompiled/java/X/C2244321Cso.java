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

/* JADX INFO: renamed from: X.1Cso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244321Cso extends Message<C2244321Cso, C2244311Csn> {
    public static final ProtoAdapter<C2244321Cso> ADAPTER = new ProtoAdapter<C2244321Cso>() { // from class: X.1Csp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244321Cso decode(ProtoReader protoReader) {
            C2244311Csn c2244311Csn = new C2244311Csn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2244311Csn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2244311Csn.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2244311Csn.LJ = EnumC2244361Css.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2244311Csn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2244311Csn.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244311Csn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244321Cso c2244321Cso) {
            C2244321Cso c2244321Cso2 = c2244321Cso;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c2244321Cso2.url_list) + EnumC2244361Css.ADAPTER.encodedSizeWithTag(2, c2244321Cso2.action_type) + protoAdapter.encodedSizeWithTag(3, c2244321Cso2.name) + c2244321Cso2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244321Cso redact(C2244321Cso c2244321Cso) {
            C2244311Csn c2244311CsnNewBuilder = c2244321Cso.newBuilder();
            c2244311CsnNewBuilder.clearUnknownFields();
            return c2244311CsnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244321Cso c2244321Cso) {
            C2244321Cso c2244321Cso2 = c2244321Cso;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c2244321Cso2.url_list);
            EnumC2244361Css.ADAPTER.encodeWithTag(protoWriter, 2, c2244321Cso2.action_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c2244321Cso2.name);
            protoWriter.writeBytes(c2244321Cso2.unknownFields());
        }
    };
    public static final EnumC2244361Css DEFAULT_ACTION_TYPE = EnumC2244361Css.DeepLink;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkType#ADAPTER", tag = 2)
    public final EnumC2244361Css action_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> url_list;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.url_list.hashCode()) * 37;
        EnumC2244361Css enumC2244361Css = this.action_type;
        int iHashCode2 = (iHashCode + (enumC2244361Css != null ? enumC2244361Css.hashCode() : 0)) * 37;
        String str = this.name;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2244311Csn newBuilder() {
        C2244311Csn c2244311Csn = new C2244311Csn();
        c2244311Csn.LIZLLL = C1516540pZE.LIZJ("url_list", this.url_list);
        c2244311Csn.LJ = this.action_type;
        c2244311Csn.LJFF = this.name;
        c2244311Csn.addUnknownFields(unknownFields());
        return c2244311Csn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        sb.replace(0, 2, "LinkInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244321Cso)) {
            return false;
        }
        C2244321Cso c2244321Cso = (C2244321Cso) obj;
        if (unknownFields().equals(c2244321Cso.unknownFields()) && this.url_list.equals(c2244321Cso.url_list) && C1516540pZE.LJ(this.action_type, c2244321Cso.action_type) && C1516540pZE.LJ(this.name, c2244321Cso.name)) {
            return true;
        }
        return false;
    }

    public C2244321Cso(List<String> list, EnumC2244361Css enumC2244361Css, String str) {
        this(list, enumC2244361Css, str, ByteString.EMPTY);
    }

    public C2244321Cso(List<String> list, EnumC2244361Css enumC2244361Css, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url_list = C1516540pZE.LJFF("url_list", list);
        this.action_type = enumC2244361Css;
        this.name = str;
    }
}
