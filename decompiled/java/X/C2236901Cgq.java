package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236901Cgq extends Message<C2236901Cgq, C2236921Cgs> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLiveRoomMode#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC972770bQB live_room_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long net_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long owner_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long room_id;
    public static final ProtoAdapter<C2236901Cgq> ADAPTER = new ProtoAdapter<C2236901Cgq>() { // from class: X.1Cgr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236901Cgq decode(ProtoReader protoReader) {
            C2236921Cgs c2236921Cgs = new C2236921Cgs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2236921Cgs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2236921Cgs.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                try {
                                    c2236921Cgs.LJFF = EnumC972770bQB.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2236921Cgs.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c2236921Cgs.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2236921Cgs.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236921Cgs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236901Cgq c2236901Cgq) {
            C2236901Cgq c2236901Cgq2 = c2236901Cgq;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2236901Cgq2.room_id) + protoAdapter.encodedSizeWithTag(2, c2236901Cgq2.owner_uid) + EnumC972770bQB.ADAPTER.encodedSizeWithTag(3, c2236901Cgq2.live_room_mode) + protoAdapter.encodedSizeWithTag(4, c2236901Cgq2.net_mode) + c2236901Cgq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236901Cgq redact(C2236901Cgq c2236901Cgq) {
            C2236921Cgs c2236921CgsNewBuilder = c2236901Cgq.newBuilder();
            c2236921CgsNewBuilder.clearUnknownFields();
            return c2236921CgsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236901Cgq c2236901Cgq) {
            C2236901Cgq c2236901Cgq2 = c2236901Cgq;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236901Cgq2.room_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2236901Cgq2.owner_uid);
            EnumC972770bQB.ADAPTER.encodeWithTag(protoWriter, 3, c2236901Cgq2.live_room_mode);
            protoAdapter.encodeWithTag(protoWriter, 4, c2236901Cgq2.net_mode);
            protoWriter.writeBytes(c2236901Cgq2.unknownFields());
        }
    };
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Long DEFAULT_OWNER_UID = 0L;
    public static final EnumC972770bQB DEFAULT_LIVE_ROOM_MODE = EnumC972770bQB.VAR_LINK_MIC_LIVE_ROOM_MODE_NORMAL;
    public static final Long DEFAULT_NET_MODE = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.room_id.hashCode()) * 37) + this.owner_uid.hashCode()) * 37) + this.live_room_mode.hashCode()) * 37) + this.net_mode.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236921Cgs newBuilder() {
        C2236921Cgs c2236921Cgs = new C2236921Cgs();
        c2236921Cgs.LIZLLL = this.room_id;
        c2236921Cgs.LJ = this.owner_uid;
        c2236921Cgs.LJFF = this.live_room_mode;
        c2236921Cgs.LJI = this.net_mode;
        c2236921Cgs.addUnknownFields(unknownFields());
        return c2236921Cgs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", room_id=");
        sb.append(this.room_id);
        sb.append(", owner_uid=");
        sb.append(this.owner_uid);
        sb.append(", live_room_mode=");
        sb.append(this.live_room_mode);
        sb.append(", net_mode=");
        sb.append(this.net_mode);
        sb.replace(0, 2, "LinkMicLiveRoom{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236901Cgq)) {
            return false;
        }
        C2236901Cgq c2236901Cgq = (C2236901Cgq) obj;
        if (unknownFields().equals(c2236901Cgq.unknownFields()) && this.room_id.equals(c2236901Cgq.room_id) && this.owner_uid.equals(c2236901Cgq.owner_uid) && this.live_room_mode.equals(c2236901Cgq.live_room_mode) && this.net_mode.equals(c2236901Cgq.net_mode)) {
            return true;
        }
        return false;
    }

    public C2236901Cgq(Long l, Long l2, EnumC972770bQB enumC972770bQB, Long l3) {
        this(l, l2, enumC972770bQB, l3, ByteString.EMPTY);
    }

    public C2236901Cgq(Long l, Long l2, EnumC972770bQB enumC972770bQB, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_id = l;
        this.owner_uid = l2;
        this.live_room_mode = enumC972770bQB;
        this.net_mode = l3;
    }
}
