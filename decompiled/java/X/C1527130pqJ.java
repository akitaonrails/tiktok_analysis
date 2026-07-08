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

/* JADX INFO: renamed from: X.0pqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527130pqJ extends Message<C1527130pqJ, C1527150pqL> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.PacketCtrl#ADAPTER", tag = 5)
    public final EnumC1527260pqW ctrl;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.BsyncCursor#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1527140pqK cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long expire_ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 256)
    public final Map<String, String> extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String logid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String msgid;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.BsyncPayload#ADAPTER", tag = 2)
    public final C1527080pqE payload;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.PacketStatus#ADAPTER", tag = 3)
    public final EnumC1527270pqX status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 255)
    public final Long ts;
    public static final ProtoAdapter<C1527130pqJ> ADAPTER = new ProtoAdapter<C1527130pqJ>() { // from class: X.0pqI
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527130pqJ decode(ProtoReader protoReader) {
            C1527150pqL c1527150pqL = new C1527150pqL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        if (iNextTag != 256) {
                            switch (iNextTag) {
                                case 1:
                                    c1527150pqL.LIZLLL = C1527140pqK.ADAPTER.decode(protoReader);
                                    break;
                                case 2:
                                    c1527150pqL.LJ = C1527080pqE.ADAPTER.decode(protoReader);
                                    break;
                                case 3:
                                    try {
                                        c1527150pqL.LJFF = EnumC1527270pqX.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c1527150pqL.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                    break;
                                case 4:
                                    c1527150pqL.LJI = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 5:
                                    try {
                                        c1527150pqL.LJII = EnumC1527260pqW.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        c1527150pqL.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    }
                                    break;
                                case 6:
                                    c1527150pqL.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 7:
                                    c1527150pqL.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1527150pqL.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c1527150pqL.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c1527150pqL.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1527150pqL.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1527130pqJ c1527130pqJ) {
            C1527130pqJ c1527130pqJ2 = c1527130pqJ;
            int iEncodedSizeWithTag = C1527140pqK.ADAPTER.encodedSizeWithTag(1, c1527130pqJ2.cursor) + C1527080pqE.ADAPTER.encodedSizeWithTag(2, c1527130pqJ2.payload) + EnumC1527270pqX.ADAPTER.encodedSizeWithTag(3, c1527130pqJ2.status);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c1527130pqJ2.expire_ts) + EnumC1527260pqW.ADAPTER.encodedSizeWithTag(5, c1527130pqJ2.ctrl);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, c1527130pqJ2.msgid) + protoAdapter2.encodedSizeWithTag(7, c1527130pqJ2.logid) + protoAdapter.encodedSizeWithTag(255, c1527130pqJ2.ts) + this.LIZ.encodedSizeWithTag(256, c1527130pqJ2.extra) + c1527130pqJ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527130pqJ redact(C1527130pqJ c1527130pqJ) {
            C1527150pqL c1527150pqLNewBuilder = c1527130pqJ.newBuilder();
            c1527150pqLNewBuilder.LIZLLL = C1527140pqK.ADAPTER.redact(c1527150pqLNewBuilder.LIZLLL);
            C1527080pqE c1527080pqE = c1527150pqLNewBuilder.LJ;
            if (c1527080pqE != null) {
                c1527150pqLNewBuilder.LJ = C1527080pqE.ADAPTER.redact(c1527080pqE);
            }
            c1527150pqLNewBuilder.clearUnknownFields();
            return c1527150pqLNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1527130pqJ c1527130pqJ) {
            C1527130pqJ c1527130pqJ2 = c1527130pqJ;
            C1527140pqK.ADAPTER.encodeWithTag(protoWriter, 1, c1527130pqJ2.cursor);
            C1527080pqE.ADAPTER.encodeWithTag(protoWriter, 2, c1527130pqJ2.payload);
            EnumC1527270pqX.ADAPTER.encodeWithTag(protoWriter, 3, c1527130pqJ2.status);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 4, c1527130pqJ2.expire_ts);
            EnumC1527260pqW.ADAPTER.encodeWithTag(protoWriter, 5, c1527130pqJ2.ctrl);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 6, c1527130pqJ2.msgid);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1527130pqJ2.logid);
            protoAdapter.encodeWithTag(protoWriter, 255, c1527130pqJ2.ts);
            this.LIZ.encodeWithTag(protoWriter, 256, c1527130pqJ2.extra);
            protoWriter.writeBytes(c1527130pqJ2.unknownFields());
        }
    };
    public static final EnumC1527270pqX DEFAULT_STATUS = EnumC1527270pqX.Full;
    public static final Long DEFAULT_EXPIRE_TS = 0L;
    public static final EnumC1527260pqW DEFAULT_CTRL = EnumC1527260pqW.Noop;
    public static final Long DEFAULT_TS = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.cursor.hashCode()) * 37;
        C1527080pqE c1527080pqE = this.payload;
        int iHashCode2 = (iHashCode + (c1527080pqE != null ? c1527080pqE.hashCode() : 0)) * 37;
        EnumC1527270pqX enumC1527270pqX = this.status;
        int iHashCode3 = (iHashCode2 + (enumC1527270pqX != null ? enumC1527270pqX.hashCode() : 0)) * 37;
        Long l = this.expire_ts;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        EnumC1527260pqW enumC1527260pqW = this.ctrl;
        int iHashCode5 = (iHashCode4 + (enumC1527260pqW != null ? enumC1527260pqW.hashCode() : 0)) * 37;
        String str = this.msgid;
        int iHashCode6 = (iHashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.logid;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l2 = this.ts;
        int iHashCode8 = ((iHashCode7 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C1527150pqL newBuilder() {
        C1527150pqL c1527150pqL = new C1527150pqL();
        c1527150pqL.LIZLLL = this.cursor;
        c1527150pqL.LJ = this.payload;
        c1527150pqL.LJFF = this.status;
        c1527150pqL.LJI = this.expire_ts;
        c1527150pqL.LJII = this.ctrl;
        c1527150pqL.LJIIIIZZ = this.msgid;
        c1527150pqL.LJIIIZ = this.logid;
        c1527150pqL.LJIIJ = this.ts;
        c1527150pqL.LJIIJJI = C1516540pZE.LIZLLL("extra", this.extra);
        c1527150pqL.addUnknownFields(unknownFields());
        return c1527150pqL;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cursor=");
        sb.append(this.cursor);
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.expire_ts != null) {
            sb.append(", expire_ts=");
            sb.append(this.expire_ts);
        }
        if (this.ctrl != null) {
            sb.append(", ctrl=");
            sb.append(this.ctrl);
        }
        if (this.msgid != null) {
            sb.append(", msgid=");
            sb.append(this.msgid);
        }
        if (this.logid != null) {
            sb.append(", logid=");
            sb.append(this.logid);
        }
        if (this.ts != null) {
            sb.append(", ts=");
            sb.append(this.ts);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "BsyncPacket{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1527130pqJ)) {
            return false;
        }
        C1527130pqJ c1527130pqJ = (C1527130pqJ) obj;
        if (unknownFields().equals(c1527130pqJ.unknownFields()) && this.cursor.equals(c1527130pqJ.cursor) && C1516540pZE.LJ(this.payload, c1527130pqJ.payload) && C1516540pZE.LJ(this.status, c1527130pqJ.status) && C1516540pZE.LJ(this.expire_ts, c1527130pqJ.expire_ts) && C1516540pZE.LJ(this.ctrl, c1527130pqJ.ctrl) && C1516540pZE.LJ(this.msgid, c1527130pqJ.msgid) && C1516540pZE.LJ(this.logid, c1527130pqJ.logid) && C1516540pZE.LJ(this.ts, c1527130pqJ.ts) && this.extra.equals(c1527130pqJ.extra)) {
            return true;
        }
        return false;
    }

    public C1527130pqJ(C1527140pqK c1527140pqK, C1527080pqE c1527080pqE, EnumC1527270pqX enumC1527270pqX, Long l, EnumC1527260pqW enumC1527260pqW, String str, String str2, Long l2, Map<String, String> map) {
        this(c1527140pqK, c1527080pqE, enumC1527270pqX, l, enumC1527260pqW, str, str2, l2, map, ByteString.EMPTY);
    }

    public C1527130pqJ(C1527140pqK c1527140pqK, C1527080pqE c1527080pqE, EnumC1527270pqX enumC1527270pqX, Long l, EnumC1527260pqW enumC1527260pqW, String str, String str2, Long l2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = c1527140pqK;
        this.payload = c1527080pqE;
        this.status = enumC1527270pqX;
        this.expire_ts = l;
        this.ctrl = enumC1527260pqW;
        this.msgid = str;
        this.logid = str2;
        this.ts = l2;
        this.extra = C1516540pZE.LJI("extra", map);
    }
}
