package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJ8 extends Message<C1CJ8, C1CJA> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String uid_str;
    public static final ProtoAdapter<C1CJ8> ADAPTER = new ProtoAdapter<C1CJ8>() { // from class: X.1CJ9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJ8 decode(ProtoReader protoReader) {
            C1CJA c1cja = new C1CJA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cja.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cja.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cja.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cja.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cja.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJ8 c1cj8) {
            C1CJ8 c1cj82 = c1cj8;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1cj82.uid) + protoAdapter.encodedSizeWithTag(2, c1cj82.timestamp) + ProtoAdapter.STRING.encodedSizeWithTag(3, c1cj82.uid_str) + c1cj82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJ8 redact(C1CJ8 c1cj8) {
            C1CJA c1cjaNewBuilder = c1cj8.newBuilder();
            c1cjaNewBuilder.clearUnknownFields();
            return c1cjaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJ8 c1cj8) {
            C1CJ8 c1cj82 = c1cj8;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cj82.uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cj82.timestamp);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c1cj82.uid_str);
            protoWriter.writeBytes(c1cj82.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_TIMESTAMP = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.uid.hashCode()) * 37) + this.timestamp.hashCode()) * 37;
        String str = this.uid_str;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CJA newBuilder() {
        C1CJA c1cja = new C1CJA();
        c1cja.LIZLLL = this.uid;
        c1cja.LJ = this.timestamp;
        c1cja.LJFF = this.uid_str;
        c1cja.addUnknownFields(unknownFields());
        return c1cja;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        if (this.uid_str != null) {
            sb.append(", uid_str=");
            sb.append(this.uid_str);
        }
        sb.replace(0, 2, "StreakUser{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJ8)) {
            return false;
        }
        C1CJ8 c1cj8 = (C1CJ8) obj;
        if (unknownFields().equals(c1cj8.unknownFields()) && this.uid.equals(c1cj8.uid) && this.timestamp.equals(c1cj8.timestamp) && C1516540pZE.LJ(this.uid_str, c1cj8.uid_str)) {
            return true;
        }
        return false;
    }

    public C1CJ8(Long l, Long l2, String str) {
        this(l, l2, str, ByteString.EMPTY);
    }

    public C1CJ8(Long l, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.timestamp = l2;
        this.uid_str = str;
    }
}
