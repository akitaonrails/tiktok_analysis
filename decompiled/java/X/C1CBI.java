package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBI extends Message<C1CBI, C1CBK> {
    public static final ProtoAdapter<C1CBI> ADAPTER = new ProtoAdapter<C1CBI>() { // from class: X.1CBJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBI decode(ProtoReader protoReader) {
            C1CBK c1cbk = new C1CBK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cbk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cbk.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cbk.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBI c1cbi) {
            C1CBI c1cbi2 = c1cbi;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cbi2.link_mic_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1cbi2.rtc_view) + c1cbi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBI redact(C1CBI c1cbi) {
            C1CBK c1cbkNewBuilder = c1cbi.newBuilder();
            c1cbkNewBuilder.clearUnknownFields();
            return c1cbkNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBI c1cbi) {
            C1CBI c1cbi2 = c1cbi;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cbi2.link_mic_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1cbi2.rtc_view);
            protoWriter.writeBytes(c1cbi2.unknownFields());
        }
    };
    public static final Long DEFAULT_RTC_VIEW = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long rtc_view;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.rtc_view.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CBK newBuilder() {
        C1CBK c1cbk = new C1CBK();
        c1cbk.LIZLLL = this.link_mic_id;
        c1cbk.LJ = this.rtc_view;
        c1cbk.addUnknownFields(unknownFields());
        return c1cbk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", rtc_view=");
        sb.append(this.rtc_view);
        sb.replace(0, 2, "FuncParamsXc9440e0acba98e0a{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CBI)) {
            return false;
        }
        C1CBI c1cbi = (C1CBI) obj;
        if (unknownFields().equals(c1cbi.unknownFields()) && this.link_mic_id.equals(c1cbi.link_mic_id) && this.rtc_view.equals(c1cbi.rtc_view)) {
            return true;
        }
        return false;
    }

    public C1CBI(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C1CBI(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.rtc_view = l;
    }
}
