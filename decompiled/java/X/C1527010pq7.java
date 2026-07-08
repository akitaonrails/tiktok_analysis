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

/* JADX INFO: renamed from: X.0pq7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527010pq7 extends Message<C1527010pq7, C1527100pqG> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.Ctrl#ADAPTER", tag = 5)
    public final EnumC1526160pok ctrl;

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String f212did;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", keyAdapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 255)
    public final Map<Integer, ByteString> infos;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.Platform#ADAPTER", tag = 8)
    public final EnumC1527220pqS platform;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.Reason#ADAPTER", tag = 7)
    public final EnumC1526180pom reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String sdk_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long ts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String uid;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.Version#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC1527210pqR version;
    public static final ProtoAdapter<C1527010pq7> ADAPTER = new ProtoAdapter<C1527010pq7>() { // from class: X.0pq9
        public final ProtoAdapter<Map<Integer, ByteString>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.BYTES);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527010pq7 decode(ProtoReader protoReader) {
            C1527100pqG c1527100pqG = new C1527100pqG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    c1527100pqG.LIZLLL = EnumC1527210pqR.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c1527100pqG.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                break;
                            case 2:
                                c1527100pqG.LJ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c1527100pqG.LJFF = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c1527100pqG.LJI = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                try {
                                    c1527100pqG.LJII = EnumC1526160pok.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    c1527100pqG.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                                break;
                            case 6:
                                c1527100pqG.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                try {
                                    c1527100pqG.LJIIIZ = EnumC1526180pom.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    c1527100pqG.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                break;
                            case 8:
                                try {
                                    c1527100pqG.LJIIJ = EnumC1527220pqS.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                    c1527100pqG.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                break;
                            default:
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1527100pqG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        c1527100pqG.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1527100pqG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1527010pq7 c1527010pq7) {
            C1527010pq7 c1527010pq72 = c1527010pq7;
            int iEncodedSizeWithTag = EnumC1527210pqR.ADAPTER.encodedSizeWithTag(1, c1527010pq72.version);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1527010pq72.uid) + protoAdapter.encodedSizeWithTag(3, c1527010pq72.f212did) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1527010pq72.ts) + EnumC1526160pok.ADAPTER.encodedSizeWithTag(5, c1527010pq72.ctrl) + protoAdapter.encodedSizeWithTag(6, c1527010pq72.sdk_version) + EnumC1526180pom.ADAPTER.encodedSizeWithTag(7, c1527010pq72.reason) + EnumC1527220pqS.ADAPTER.encodedSizeWithTag(8, c1527010pq72.platform) + this.LIZ.encodedSizeWithTag(255, c1527010pq72.infos) + c1527010pq72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527010pq7 redact(C1527010pq7 c1527010pq7) {
            C1527100pqG c1527100pqGNewBuilder = c1527010pq7.newBuilder();
            c1527100pqGNewBuilder.clearUnknownFields();
            return c1527100pqGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1527010pq7 c1527010pq7) {
            C1527010pq7 c1527010pq72 = c1527010pq7;
            EnumC1527210pqR.ADAPTER.encodeWithTag(protoWriter, 1, c1527010pq72.version);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1527010pq72.uid);
            protoAdapter.encodeWithTag(protoWriter, 3, c1527010pq72.f212did);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c1527010pq72.ts);
            EnumC1526160pok.ADAPTER.encodeWithTag(protoWriter, 5, c1527010pq72.ctrl);
            protoAdapter.encodeWithTag(protoWriter, 6, c1527010pq72.sdk_version);
            EnumC1526180pom.ADAPTER.encodeWithTag(protoWriter, 7, c1527010pq72.reason);
            EnumC1527220pqS.ADAPTER.encodeWithTag(protoWriter, 8, c1527010pq72.platform);
            this.LIZ.encodeWithTag(protoWriter, 255, c1527010pq72.infos);
            protoWriter.writeBytes(c1527010pq72.unknownFields());
        }
    };
    public static final EnumC1527210pqR DEFAULT_VERSION = EnumC1527210pqR.Unknown;
    public static final Long DEFAULT_TS = 0L;
    public static final EnumC1526160pok DEFAULT_CTRL = EnumC1526160pok.Default;
    public static final EnumC1526180pom DEFAULT_REASON = EnumC1526180pom.Def;
    public static final EnumC1527220pqS DEFAULT_PLATFORM = EnumC1527220pqS.unknown;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.version.hashCode()) * 37;
        String str = this.uid;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f212did;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.ts;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        EnumC1526160pok enumC1526160pok = this.ctrl;
        int iHashCode5 = (iHashCode4 + (enumC1526160pok != null ? enumC1526160pok.hashCode() : 0)) * 37;
        String str3 = this.sdk_version;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EnumC1526180pom enumC1526180pom = this.reason;
        int iHashCode7 = (iHashCode6 + (enumC1526180pom != null ? enumC1526180pom.hashCode() : 0)) * 37;
        EnumC1527220pqS enumC1527220pqS = this.platform;
        int iHashCode8 = ((iHashCode7 + (enumC1527220pqS != null ? enumC1527220pqS.hashCode() : 0)) * 37) + this.infos.hashCode();
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C1527100pqG newBuilder() {
        C1527100pqG c1527100pqG = new C1527100pqG();
        c1527100pqG.LIZLLL = this.version;
        c1527100pqG.LJ = this.uid;
        c1527100pqG.LJFF = this.f212did;
        c1527100pqG.LJI = this.ts;
        c1527100pqG.LJII = this.ctrl;
        c1527100pqG.LJIIIIZZ = this.sdk_version;
        c1527100pqG.LJIIIZ = this.reason;
        c1527100pqG.LJIIJ = this.platform;
        c1527100pqG.LJIIJJI = C1516540pZE.LIZLLL("infos", this.infos);
        c1527100pqG.addUnknownFields(unknownFields());
        return c1527100pqG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", version=");
        sb.append(this.version);
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (this.f212did != null) {
            sb.append(", did=");
            sb.append(this.f212did);
        }
        if (this.ts != null) {
            sb.append(", ts=");
            sb.append(this.ts);
        }
        if (this.ctrl != null) {
            sb.append(", ctrl=");
            sb.append(this.ctrl);
        }
        if (this.sdk_version != null) {
            sb.append(", sdk_version=");
            sb.append(this.sdk_version);
        }
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        if (this.platform != null) {
            sb.append(", platform=");
            sb.append(this.platform);
        }
        if (!this.infos.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        sb.replace(0, 2, "BsyncHeader{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1527010pq7)) {
            return false;
        }
        C1527010pq7 c1527010pq7 = (C1527010pq7) obj;
        if (unknownFields().equals(c1527010pq7.unknownFields()) && this.version.equals(c1527010pq7.version) && C1516540pZE.LJ(this.uid, c1527010pq7.uid) && C1516540pZE.LJ(this.f212did, c1527010pq7.f212did) && C1516540pZE.LJ(this.ts, c1527010pq7.ts) && C1516540pZE.LJ(this.ctrl, c1527010pq7.ctrl) && C1516540pZE.LJ(this.sdk_version, c1527010pq7.sdk_version) && C1516540pZE.LJ(this.reason, c1527010pq7.reason) && C1516540pZE.LJ(this.platform, c1527010pq7.platform) && this.infos.equals(c1527010pq7.infos)) {
            return true;
        }
        return false;
    }

    public C1527010pq7(EnumC1527210pqR enumC1527210pqR, String str, String str2, Long l, EnumC1526160pok enumC1526160pok, String str3, EnumC1526180pom enumC1526180pom, EnumC1527220pqS enumC1527220pqS, Map<Integer, ByteString> map) {
        this(enumC1527210pqR, str, str2, l, enumC1526160pok, str3, enumC1526180pom, enumC1527220pqS, map, ByteString.EMPTY);
    }

    public C1527010pq7(EnumC1527210pqR enumC1527210pqR, String str, String str2, Long l, EnumC1526160pok enumC1526160pok, String str3, EnumC1526180pom enumC1526180pom, EnumC1527220pqS enumC1527220pqS, Map<Integer, ByteString> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = enumC1527210pqR;
        this.uid = str;
        this.f212did = str2;
        this.ts = l;
        this.ctrl = enumC1526160pok;
        this.sdk_version = str3;
        this.reason = enumC1526180pom;
        this.platform = enumC1527220pqS;
        this.infos = C1516540pZE.LJI("infos", map);
    }
}
