package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240741Cn2 extends Message<C2240741Cn2, C2240761Cn4> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreamBlockAction#ADAPTER", tag = 5)
    public final EnumC906750Zhh action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String block_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreamBlockContent#ADAPTER", tag = 4)
    public final C2240171Cm7 content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Metadata#ADAPTER", tag = 6)
    public final C1C3L metadata;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreamReplyType#ADAPTER", tag = 2)
    public final EnumC906790Zhl reply_type;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreamBlockType#ADAPTER", tag = 3)
    public final EnumC2240771Cn5 type;
    public static final ProtoAdapter<C2240741Cn2> ADAPTER = new ProtoAdapter<C2240741Cn2>() { // from class: X.1Cn3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240741Cn2 decode(ProtoReader protoReader) {
            C2240761Cn4 c2240761Cn4 = new C2240761Cn4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2240761Cn4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                c2240761Cn4.LJ = EnumC906790Zhl.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2240761Cn4.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 3:
                            try {
                                c2240761Cn4.LJFF = EnumC2240771Cn5.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2240761Cn4.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 4:
                            c2240761Cn4.LJI = C2240171Cm7.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            try {
                                c2240761Cn4.LJII = EnumC906750Zhh.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2240761Cn4.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 6:
                            c2240761Cn4.LJIIIIZZ = C1C3L.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2240761Cn4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240761Cn4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240741Cn2 c2240741Cn2) {
            C2240741Cn2 c2240741Cn22 = c2240741Cn2;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2240741Cn22.block_id) + EnumC906790Zhl.ADAPTER.encodedSizeWithTag(2, c2240741Cn22.reply_type) + EnumC2240771Cn5.ADAPTER.encodedSizeWithTag(3, c2240741Cn22.type) + C2240171Cm7.ADAPTER.encodedSizeWithTag(4, c2240741Cn22.content) + EnumC906750Zhh.ADAPTER.encodedSizeWithTag(5, c2240741Cn22.action) + C1C3L.ADAPTER.encodedSizeWithTag(6, c2240741Cn22.metadata) + c2240741Cn22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240741Cn2 redact(C2240741Cn2 c2240741Cn2) {
            C2240761Cn4 c2240761Cn4NewBuilder = c2240741Cn2.newBuilder();
            C2240171Cm7 c2240171Cm7 = c2240761Cn4NewBuilder.LJI;
            if (c2240171Cm7 != null) {
                c2240761Cn4NewBuilder.LJI = C2240171Cm7.ADAPTER.redact(c2240171Cm7);
            }
            C1C3L c1c3l = c2240761Cn4NewBuilder.LJIIIIZZ;
            if (c1c3l != null) {
                c2240761Cn4NewBuilder.LJIIIIZZ = C1C3L.ADAPTER.redact(c1c3l);
            }
            c2240761Cn4NewBuilder.clearUnknownFields();
            return c2240761Cn4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240741Cn2 c2240741Cn2) {
            C2240741Cn2 c2240741Cn22 = c2240741Cn2;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2240741Cn22.block_id);
            EnumC906790Zhl.ADAPTER.encodeWithTag(protoWriter, 2, c2240741Cn22.reply_type);
            EnumC2240771Cn5.ADAPTER.encodeWithTag(protoWriter, 3, c2240741Cn22.type);
            C2240171Cm7.ADAPTER.encodeWithTag(protoWriter, 4, c2240741Cn22.content);
            EnumC906750Zhh.ADAPTER.encodeWithTag(protoWriter, 5, c2240741Cn22.action);
            C1C3L.ADAPTER.encodeWithTag(protoWriter, 6, c2240741Cn22.metadata);
            protoWriter.writeBytes(c2240741Cn22.unknownFields());
        }
    };
    public static final EnumC906790Zhl DEFAULT_REPLY_TYPE = EnumC906790Zhl.STREAM_REPLY_TYPE_UNKNOWN;
    public static final EnumC2240771Cn5 DEFAULT_TYPE = EnumC2240771Cn5.STREAM_BLOCK_TYPE_UNKNOWN;
    public static final EnumC906750Zhh DEFAULT_ACTION = EnumC906750Zhh.STREAM_BLOCK_ACTION_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.block_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        EnumC906790Zhl enumC906790Zhl = this.reply_type;
        int iHashCode3 = (iHashCode2 + (enumC906790Zhl != null ? enumC906790Zhl.hashCode() : 0)) * 37;
        EnumC2240771Cn5 enumC2240771Cn5 = this.type;
        int iHashCode4 = (iHashCode3 + (enumC2240771Cn5 != null ? enumC2240771Cn5.hashCode() : 0)) * 37;
        C2240171Cm7 c2240171Cm7 = this.content;
        int iHashCode5 = (iHashCode4 + (c2240171Cm7 != null ? c2240171Cm7.hashCode() : 0)) * 37;
        EnumC906750Zhh enumC906750Zhh = this.action;
        int iHashCode6 = (iHashCode5 + (enumC906750Zhh != null ? enumC906750Zhh.hashCode() : 0)) * 37;
        C1C3L c1c3l = this.metadata;
        int iHashCode7 = iHashCode6 + (c1c3l != null ? c1c3l.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2240761Cn4 newBuilder() {
        C2240761Cn4 c2240761Cn4 = new C2240761Cn4();
        c2240761Cn4.LIZLLL = this.block_id;
        c2240761Cn4.LJ = this.reply_type;
        c2240761Cn4.LJFF = this.type;
        c2240761Cn4.LJI = this.content;
        c2240761Cn4.LJII = this.action;
        c2240761Cn4.LJIIIIZZ = this.metadata;
        c2240761Cn4.addUnknownFields(unknownFields());
        return c2240761Cn4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.block_id != null) {
            sb.append(", block_id=");
            sb.append(this.block_id);
        }
        if (this.reply_type != null) {
            sb.append(", reply_type=");
            sb.append(this.reply_type);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.metadata != null) {
            sb.append(", metadata=");
            sb.append(this.metadata);
        }
        sb.replace(0, 2, "StreamBlock{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240741Cn2)) {
            return false;
        }
        C2240741Cn2 c2240741Cn2 = (C2240741Cn2) obj;
        if (unknownFields().equals(c2240741Cn2.unknownFields()) && C1516540pZE.LJ(this.block_id, c2240741Cn2.block_id) && C1516540pZE.LJ(this.reply_type, c2240741Cn2.reply_type) && C1516540pZE.LJ(this.type, c2240741Cn2.type) && C1516540pZE.LJ(this.content, c2240741Cn2.content) && C1516540pZE.LJ(this.action, c2240741Cn2.action) && C1516540pZE.LJ(this.metadata, c2240741Cn2.metadata)) {
            return true;
        }
        return false;
    }

    public C2240741Cn2(String str, EnumC906790Zhl enumC906790Zhl, EnumC2240771Cn5 enumC2240771Cn5, C2240171Cm7 c2240171Cm7, EnumC906750Zhh enumC906750Zhh, C1C3L c1c3l) {
        this(str, enumC906790Zhl, enumC2240771Cn5, c2240171Cm7, enumC906750Zhh, c1c3l, ByteString.EMPTY);
    }

    public C2240741Cn2(String str, EnumC906790Zhl enumC906790Zhl, EnumC2240771Cn5 enumC2240771Cn5, C2240171Cm7 c2240171Cm7, EnumC906750Zhh enumC906750Zhh, C1C3L c1c3l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.block_id = str;
        this.reply_type = enumC906790Zhl;
        this.type = enumC2240771Cn5;
        this.content = c2240171Cm7;
        this.action = enumC906750Zhh;
        this.metadata = c1c3l;
    }
}
