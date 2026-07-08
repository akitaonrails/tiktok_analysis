package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBL extends Message<C1CBL, C1CBN> {
    public static final ProtoAdapter<C1CBL> ADAPTER = new ProtoAdapter<C1CBL>() { // from class: X.1CBM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBL decode(ProtoReader protoReader) {
            C1CBN c1cbn = new C1CBN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cbn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cbn.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cbn.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBL c1cbl) {
            C1CBL c1cbl2 = c1cbl;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cbl2.link_mic_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1cbl2.rtc_view_id) + c1cbl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBL redact(C1CBL c1cbl) {
            C1CBN c1cbnNewBuilder = c1cbl.newBuilder();
            c1cbnNewBuilder.clearUnknownFields();
            return c1cbnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBL c1cbl) {
            C1CBL c1cbl2 = c1cbl;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cbl2.link_mic_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1cbl2.rtc_view_id);
            protoWriter.writeBytes(c1cbl2.unknownFields());
        }
    };
    public static final Long DEFAULT_RTC_VIEW_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long rtc_view_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.rtc_view_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CBN newBuilder() {
        C1CBN c1cbn = new C1CBN();
        c1cbn.LIZLLL = this.link_mic_id;
        c1cbn.LJ = this.rtc_view_id;
        c1cbn.addUnknownFields(unknownFields());
        return c1cbn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", rtc_view_id=");
        sb.append(this.rtc_view_id);
        sb.replace(0, 2, "FuncParamsX94599134f63fc360{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CBL)) {
            return false;
        }
        C1CBL c1cbl = (C1CBL) obj;
        if (unknownFields().equals(c1cbl.unknownFields()) && this.link_mic_id.equals(c1cbl.link_mic_id) && this.rtc_view_id.equals(c1cbl.rtc_view_id)) {
            return true;
        }
        return false;
    }

    public C1CBL(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C1CBL(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.rtc_view_id = l;
    }
}
