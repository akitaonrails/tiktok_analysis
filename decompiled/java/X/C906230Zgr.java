package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906230Zgr extends Message<C906230Zgr, C906220Zgq> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer max_retries;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long retry_delay_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean retryable;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.RetryStrategy#ADAPTER", tag = 2)
    public final EnumC906330Zh1 strategy;
    public static final ProtoAdapter<C906230Zgr> ADAPTER = new ProtoAdapter<C906230Zgr>() { // from class: X.0Zgu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906230Zgr decode(ProtoReader protoReader) {
            C906220Zgq c906220Zgq = new C906220Zgq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c906220Zgq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c906220Zgq.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c906220Zgq.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            try {
                                c906220Zgq.LJ = EnumC906330Zh1.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c906220Zgq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c906220Zgq.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906220Zgq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906230Zgr c906230Zgr) {
            C906230Zgr c906230Zgr2 = c906230Zgr;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c906230Zgr2.retryable) + EnumC906330Zh1.ADAPTER.encodedSizeWithTag(2, c906230Zgr2.strategy) + ProtoAdapter.INT64.encodedSizeWithTag(3, c906230Zgr2.retry_delay_ms) + ProtoAdapter.INT32.encodedSizeWithTag(4, c906230Zgr2.max_retries) + c906230Zgr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906230Zgr redact(C906230Zgr c906230Zgr) {
            C906220Zgq c906220ZgqNewBuilder = c906230Zgr.newBuilder();
            c906220ZgqNewBuilder.clearUnknownFields();
            return c906220ZgqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906230Zgr c906230Zgr) {
            C906230Zgr c906230Zgr2 = c906230Zgr;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c906230Zgr2.retryable);
            EnumC906330Zh1.ADAPTER.encodeWithTag(protoWriter, 2, c906230Zgr2.strategy);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c906230Zgr2.retry_delay_ms);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c906230Zgr2.max_retries);
            protoWriter.writeBytes(c906230Zgr2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_RETRYABLE = Boolean.FALSE;
    public static final EnumC906330Zh1 DEFAULT_STRATEGY = EnumC906330Zh1.RETRY_STRATEGY_NONE;
    public static final Long DEFAULT_RETRY_DELAY_MS = 0L;
    public static final Integer DEFAULT_MAX_RETRIES = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.retryable;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        EnumC906330Zh1 enumC906330Zh1 = this.strategy;
        int iHashCode3 = (iHashCode2 + (enumC906330Zh1 != null ? enumC906330Zh1.hashCode() : 0)) * 37;
        Long l = this.retry_delay_ms;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.max_retries;
        int iHashCode5 = iHashCode4 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C906220Zgq newBuilder() {
        C906220Zgq c906220Zgq = new C906220Zgq();
        c906220Zgq.LIZLLL = this.retryable;
        c906220Zgq.LJ = this.strategy;
        c906220Zgq.LJFF = this.retry_delay_ms;
        c906220Zgq.LJI = this.max_retries;
        c906220Zgq.addUnknownFields(unknownFields());
        return c906220Zgq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.retryable != null) {
            sb.append(", retryable=");
            sb.append(this.retryable);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.retry_delay_ms != null) {
            sb.append(", retry_delay_ms=");
            sb.append(this.retry_delay_ms);
        }
        if (this.max_retries != null) {
            sb.append(", max_retries=");
            sb.append(this.max_retries);
        }
        sb.replace(0, 2, "RetryInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906230Zgr)) {
            return false;
        }
        C906230Zgr c906230Zgr = (C906230Zgr) obj;
        if (unknownFields().equals(c906230Zgr.unknownFields()) && C1516540pZE.LJ(this.retryable, c906230Zgr.retryable) && C1516540pZE.LJ(this.strategy, c906230Zgr.strategy) && C1516540pZE.LJ(this.retry_delay_ms, c906230Zgr.retry_delay_ms) && C1516540pZE.LJ(this.max_retries, c906230Zgr.max_retries)) {
            return true;
        }
        return false;
    }

    public C906230Zgr(Boolean bool, EnumC906330Zh1 enumC906330Zh1, Long l, Integer num) {
        this(bool, enumC906330Zh1, l, num, ByteString.EMPTY);
    }

    public C906230Zgr(Boolean bool, EnumC906330Zh1 enumC906330Zh1, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.retryable = bool;
        this.strategy = enumC906330Zh1;
        this.retry_delay_ms = l;
        this.max_retries = num;
    }
}
