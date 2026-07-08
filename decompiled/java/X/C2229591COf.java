package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229591COf extends Message<C2229591COf, C2229611COh> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 2)
    public final Double duration;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicTimerType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CXB timer_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long uid;
    public static final ProtoAdapter<C2229591COf> ADAPTER = new ProtoAdapter<C2229591COf>() { // from class: X.1COg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229591COf decode(ProtoReader protoReader) {
            C2229611COh c2229611COh = new C2229611COh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2229611COh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2229611COh.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2229611COh.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2229611COh.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        try {
                            c2229611COh.LIZLLL = C1CXB.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2229611COh.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229611COh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229591COf c2229591COf) {
            C2229591COf c2229591COf2 = c2229591COf;
            int iEncodedSizeWithTag = C1CXB.ADAPTER.encodedSizeWithTag(1, c2229591COf2.timer_type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, c2229591COf2.duration);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2229591COf2.uid) + protoAdapter.encodedSizeWithTag(4, c2229591COf2.callback) + c2229591COf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229591COf redact(C2229591COf c2229591COf) {
            C2229611COh c2229611COhNewBuilder = c2229591COf.newBuilder();
            c2229611COhNewBuilder.clearUnknownFields();
            return c2229611COhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229591COf c2229591COf) {
            C2229591COf c2229591COf2 = c2229591COf;
            C1CXB.ADAPTER.encodeWithTag(protoWriter, 1, c2229591COf2.timer_type);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, c2229591COf2.duration);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c2229591COf2.uid);
            protoAdapter.encodeWithTag(protoWriter, 4, c2229591COf2.callback);
            protoWriter.writeBytes(c2229591COf2.unknownFields());
        }
    };
    public static final C1CXB DEFAULT_TIMER_TYPE = C1CXB.VAR_LINK_MIC_TIMER_TYPE_APPLY;
    public static final Double DEFAULT_DURATION = Double.valueOf(0.0d);
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_CALLBACK = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.timer_type.hashCode()) * 37) + this.duration.hashCode()) * 37) + this.uid.hashCode()) * 37) + this.callback.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229611COh newBuilder() {
        C2229611COh c2229611COh = new C2229611COh();
        c2229611COh.LIZLLL = this.timer_type;
        c2229611COh.LJ = this.duration;
        c2229611COh.LJFF = this.uid;
        c2229611COh.LJI = this.callback;
        c2229611COh.addUnknownFields(unknownFields());
        return c2229611COh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", timer_type=");
        sb.append(this.timer_type);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXff5f1f3f7332e5a8{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229591COf)) {
            return false;
        }
        C2229591COf c2229591COf = (C2229591COf) obj;
        if (unknownFields().equals(c2229591COf.unknownFields()) && this.timer_type.equals(c2229591COf.timer_type) && this.duration.equals(c2229591COf.duration) && this.uid.equals(c2229591COf.uid) && this.callback.equals(c2229591COf.callback)) {
            return true;
        }
        return false;
    }

    public C2229591COf(C1CXB c1cxb, Double d, Long l, Long l2) {
        this(c1cxb, d, l, l2, ByteString.EMPTY);
    }

    public C2229591COf(C1CXB c1cxb, Double d, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timer_type = c1cxb;
        this.duration = d;
        this.uid = l;
        this.callback = l2;
    }
}
