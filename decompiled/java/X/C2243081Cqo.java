package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243081Cqo extends Message<C2243081Cqo, C2243121Cqs> {
    public static final ProtoAdapter<C2243081Cqo> ADAPTER = new ProtoAdapter<C2243081Cqo>() { // from class: X.1Cqp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243081Cqo decode(ProtoReader protoReader) {
            C2243121Cqs c2243121Cqs = new C2243121Cqs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 4) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2243121Cqs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2243121Cqs.LJFF = C2244321Cso.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243121Cqs.LJ = C2230671CSj.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243121Cqs.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243121Cqs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243081Cqo c2243081Cqo) {
            C2243081Cqo c2243081Cqo2 = c2243081Cqo;
            return C2243521CrW.ADAPTER.encodedSizeWithTag(1, c2243081Cqo2.text) + C2230671CSj.ADAPTER.encodedSizeWithTag(2, c2243081Cqo2.style) + C2244321Cso.ADAPTER.encodedSizeWithTag(4, c2243081Cqo2.link_info) + c2243081Cqo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243081Cqo redact(C2243081Cqo c2243081Cqo) {
            C2243121Cqs c2243121CqsNewBuilder = c2243081Cqo.newBuilder();
            C2243521CrW c2243521CrW = c2243121CqsNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2243121CqsNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2230671CSj c2230671CSj = c2243121CqsNewBuilder.LJ;
            if (c2230671CSj != null) {
                c2243121CqsNewBuilder.LJ = C2230671CSj.ADAPTER.redact(c2230671CSj);
            }
            C2244321Cso c2244321Cso = c2243121CqsNewBuilder.LJFF;
            if (c2244321Cso != null) {
                c2243121CqsNewBuilder.LJFF = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            c2243121CqsNewBuilder.clearUnknownFields();
            return c2243121CqsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243081Cqo c2243081Cqo) {
            C2243081Cqo c2243081Cqo2 = c2243081Cqo;
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 1, c2243081Cqo2.text);
            C2230671CSj.ADAPTER.encodeWithTag(protoWriter, 2, c2243081Cqo2.style);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 4, c2243081Cqo2.link_info);
            protoWriter.writeBytes(c2243081Cqo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 4)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ButtonStyle#ADAPTER", tag = 2)
    public final C2230671CSj style;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.text;
        int iHashCode2 = (iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2230671CSj c2230671CSj = this.style;
        int iHashCode3 = (iHashCode2 + (c2230671CSj != null ? c2230671CSj.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode4 = iHashCode3 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2243121Cqs newBuilder() {
        C2243121Cqs c2243121Cqs = new C2243121Cqs();
        c2243121Cqs.LIZLLL = this.text;
        c2243121Cqs.LJ = this.style;
        c2243121Cqs.LJFF = this.link_info;
        c2243121Cqs.addUnknownFields(unknownFields());
        return c2243121Cqs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.style != null) {
            sb.append(", style=");
            sb.append(this.style);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        sb.replace(0, 2, "Button{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243081Cqo)) {
            return false;
        }
        C2243081Cqo c2243081Cqo = (C2243081Cqo) obj;
        if (unknownFields().equals(c2243081Cqo.unknownFields()) && C1516540pZE.LJ(this.text, c2243081Cqo.text) && C1516540pZE.LJ(this.style, c2243081Cqo.style) && C1516540pZE.LJ(this.link_info, c2243081Cqo.link_info)) {
            return true;
        }
        return false;
    }

    public C2243081Cqo(C2243521CrW c2243521CrW, C2230671CSj c2230671CSj, C2244321Cso c2244321Cso) {
        this(c2243521CrW, c2230671CSj, c2244321Cso, ByteString.EMPTY);
    }

    public C2243081Cqo(C2243521CrW c2243521CrW, C2230671CSj c2230671CSj, C2244321Cso c2244321Cso, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = c2243521CrW;
        this.style = c2230671CSj;
        this.link_info = c2244321Cso;
    }
}
