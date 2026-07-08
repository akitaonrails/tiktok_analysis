package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226691CDb extends Message<C2226691CDb, C2226711CDd> {
    public static final ProtoAdapter<C2226691CDb> ADAPTER = new ProtoAdapter<C2226691CDb>() { // from class: X.1CDc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226691CDb decode(ProtoReader protoReader) {
            C2226711CDd c2226711CDd = new C2226711CDd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226711CDd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226711CDd.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226711CDd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226691CDb c2226691CDb) {
            C2226691CDb c2226691CDb2 = c2226691CDb;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2226691CDb2.is_video_mute) + c2226691CDb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226691CDb redact(C2226691CDb c2226691CDb) {
            C2226711CDd c2226711CDdNewBuilder = c2226691CDb.newBuilder();
            c2226711CDdNewBuilder.clearUnknownFields();
            return c2226711CDdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226691CDb c2226691CDb) {
            C2226691CDb c2226691CDb2 = c2226691CDb;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2226691CDb2.is_video_mute);
            protoWriter.writeBytes(c2226691CDb2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_VIDEO_MUTE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean is_video_mute;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.is_video_mute.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226711CDd newBuilder() {
        C2226711CDd c2226711CDd = new C2226711CDd();
        c2226711CDd.LIZLLL = this.is_video_mute;
        c2226711CDd.addUnknownFields(unknownFields());
        return c2226711CDd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_video_mute=");
        sb.append(this.is_video_mute);
        sb.replace(0, 2, "FuncParamsX6fcae93230eec7f6{");
        sb.append('}');
        return sb.toString();
    }

    public C2226691CDb(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226691CDb)) {
            return false;
        }
        C2226691CDb c2226691CDb = (C2226691CDb) obj;
        if (unknownFields().equals(c2226691CDb.unknownFields()) && this.is_video_mute.equals(c2226691CDb.is_video_mute)) {
            return true;
        }
        return false;
    }

    public C2226691CDb(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_video_mute = bool;
    }
}
