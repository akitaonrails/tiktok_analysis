package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZGR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGR extends Message<C0ZGR, C0ZGN> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 5)
    public final C2243521CrW content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long original_create_time;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AttachmentType#ADAPTER", tag = 1)
    public final EnumC2244491Ct5 type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long uid;
    public static final ProtoAdapter<C0ZGR> ADAPTER = new ProtoAdapter<C0ZGR>() { // from class: X.0ZGQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C0ZGR decode(ProtoReader protoReader) {
            C0ZGN c0zgn = new C0ZGN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c0zgn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0zgn.LJII = C2243521CrW.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c0zgn.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c0zgn.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0zgn.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c0zgn.LIZLLL = EnumC2244491Ct5.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c0zgn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0zgn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C0ZGR c0zgr) {
            C0ZGR c0zgr2 = c0zgr;
            int iEncodedSizeWithTag = EnumC2244491Ct5.ADAPTER.encodedSizeWithTag(1, c0zgr2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c0zgr2.id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c0zgr2.uid) + protoAdapter.encodedSizeWithTag(4, c0zgr2.original_create_time) + C2243521CrW.ADAPTER.encodedSizeWithTag(5, c0zgr2.content) + c0zgr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C0ZGR redact(C0ZGR c0zgr) {
            C0ZGN c0zgnNewBuilder = c0zgr.newBuilder();
            C2243521CrW c2243521CrW = c0zgnNewBuilder.LJII;
            if (c2243521CrW != null) {
                c0zgnNewBuilder.LJII = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            c0zgnNewBuilder.clearUnknownFields();
            return c0zgnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C0ZGR c0zgr) {
            C0ZGR c0zgr2 = c0zgr;
            EnumC2244491Ct5.ADAPTER.encodeWithTag(protoWriter, 1, c0zgr2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c0zgr2.id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c0zgr2.uid);
            protoAdapter.encodeWithTag(protoWriter, 4, c0zgr2.original_create_time);
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 5, c0zgr2.content);
            protoWriter.writeBytes(c0zgr2.unknownFields());
        }
    };
    public static final EnumC2244491Ct5 DEFAULT_TYPE = EnumC2244491Ct5.ATTACHMENT_TYPE_DEFAULT;
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_ORIGINAL_CREATE_TIME = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EnumC2244491Ct5 enumC2244491Ct5 = this.type;
        int iHashCode2 = (iHashCode + (enumC2244491Ct5 != null ? enumC2244491Ct5.hashCode() : 0)) * 37;
        String str = this.id;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.uid;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.original_create_time;
        int iHashCode5 = (iHashCode4 + (l2 != null ? l2.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.content;
        int iHashCode6 = iHashCode5 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C0ZGN newBuilder() {
        C0ZGN c0zgn = new C0ZGN();
        c0zgn.LIZLLL = this.type;
        c0zgn.LJ = this.id;
        c0zgn.LJFF = this.uid;
        c0zgn.LJI = this.original_create_time;
        c0zgn.LJII = this.content;
        c0zgn.addUnknownFields(unknownFields());
        return c0zgn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.original_create_time != null) {
            sb.append(", original_create_time=");
            sb.append(this.original_create_time);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        sb.replace(0, 2, "FeatureAttachment{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0ZGR)) {
            return false;
        }
        C0ZGR c0zgr = (C0ZGR) obj;
        if (unknownFields().equals(c0zgr.unknownFields()) && C1516540pZE.LJ(this.type, c0zgr.type) && C1516540pZE.LJ(this.id, c0zgr.id) && C1516540pZE.LJ(this.uid, c0zgr.uid) && C1516540pZE.LJ(this.original_create_time, c0zgr.original_create_time) && C1516540pZE.LJ(this.content, c0zgr.content)) {
            return true;
        }
        return false;
    }

    public C0ZGR(EnumC2244491Ct5 enumC2244491Ct5, String str, Long l, Long l2, C2243521CrW c2243521CrW) {
        this(enumC2244491Ct5, str, l, l2, c2243521CrW, ByteString.EMPTY);
    }

    public C0ZGR(EnumC2244491Ct5 enumC2244491Ct5, String str, Long l, Long l2, C2243521CrW c2243521CrW, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = enumC2244491Ct5;
        this.id = str;
        this.uid = l;
        this.original_create_time = l2;
        this.content = c2243521CrW;
    }
}
