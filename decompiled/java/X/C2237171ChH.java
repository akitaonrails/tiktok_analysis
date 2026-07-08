package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1ChH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237171ChH extends Message<C2237171ChH, C2237191ChJ> {
    public static final ProtoAdapter<C2237171ChH> ADAPTER = new ProtoAdapter<C2237171ChH>() { // from class: X.1ChI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237171ChH decode(ProtoReader protoReader) {
            C2237191ChJ c2237191ChJ = new C2237191ChJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2237191ChJ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2237191ChJ.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2237191ChJ.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2237191ChJ.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237191ChJ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2237171ChH c2237171ChH) {
            C2237171ChH c2237171ChH2 = c2237171ChH;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2237171ChH2.app_id) + protoAdapter.encodedSizeWithTag(2, c2237171ChH2.live_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, c2237171ChH2.channel) + c2237171ChH2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2237171ChH redact(C2237171ChH c2237171ChH) {
            C2237191ChJ c2237191ChJNewBuilder = c2237171ChH.newBuilder();
            c2237191ChJNewBuilder.clearUnknownFields();
            return c2237191ChJNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2237171ChH c2237171ChH) {
            C2237171ChH c2237171ChH2 = c2237171ChH;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2237171ChH2.app_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2237171ChH2.live_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c2237171ChH2.channel);
            protoWriter.writeBytes(c2237171ChH2.unknownFields());
        }
    };
    public static final Long DEFAULT_APP_ID = 0L;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long app_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String channel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long live_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.app_id.hashCode()) * 37) + this.live_id.hashCode()) * 37) + this.channel.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237191ChJ newBuilder() {
        C2237191ChJ c2237191ChJ = new C2237191ChJ();
        c2237191ChJ.LIZLLL = this.app_id;
        c2237191ChJ.LJ = this.live_id;
        c2237191ChJ.LJFF = this.channel;
        c2237191ChJ.addUnknownFields(unknownFields());
        return c2237191ChJ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", live_id=");
        sb.append(this.live_id);
        sb.append(", channel=");
        sb.append(this.channel);
        sb.replace(0, 2, "LinkMicAppInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2237171ChH)) {
            return false;
        }
        C2237171ChH c2237171ChH = (C2237171ChH) obj;
        if (unknownFields().equals(c2237171ChH.unknownFields()) && this.app_id.equals(c2237171ChH.app_id) && this.live_id.equals(c2237171ChH.live_id) && this.channel.equals(c2237171ChH.channel)) {
            return true;
        }
        return false;
    }

    public C2237171ChH(Long l, Long l2, String str) {
        this(l, l2, str, ByteString.EMPTY);
    }

    public C2237171ChH(Long l, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = l;
        this.live_id = l2;
        this.channel = str;
    }
}
