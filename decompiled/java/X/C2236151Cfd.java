package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236151Cfd extends Message<C2236151Cfd, C2236171Cff> {
    public static final Boolean DEFAULT_IS_PERSISTENCE_VIDEO_MUTE_EXIST;
    public static final Boolean DEFAULT_PERSISTENCE_VIDEO_MUTE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean is_persistence_video_mute_exist;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean persistence_video_mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long retry_count;
    public static final ProtoAdapter<C2236151Cfd> ADAPTER = new ProtoAdapter<C2236151Cfd>() { // from class: X.1Cfe
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236151Cfd decode(ProtoReader protoReader) {
            C2236171Cff c2236171Cff = new C2236171Cff();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2236171Cff.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2236171Cff.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c2236171Cff.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c2236171Cff.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2236171Cff.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236171Cff.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236151Cfd c2236151Cfd) {
            C2236151Cfd c2236151Cfd2 = c2236151Cfd;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c2236151Cfd2.invoke_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2236151Cfd2.retry_count);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2236151Cfd2.is_persistence_video_mute_exist) + protoAdapter.encodedSizeWithTag(4, c2236151Cfd2.persistence_video_mute) + c2236151Cfd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236151Cfd redact(C2236151Cfd c2236151Cfd) {
            C2236171Cff c2236171CffNewBuilder = c2236151Cfd.newBuilder();
            c2236171CffNewBuilder.clearUnknownFields();
            return c2236171CffNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236151Cfd c2236151Cfd) {
            C2236151Cfd c2236151Cfd2 = c2236151Cfd;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2236151Cfd2.invoke_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2236151Cfd2.retry_count);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 3, c2236151Cfd2.is_persistence_video_mute_exist);
            protoAdapter.encodeWithTag(protoWriter, 4, c2236151Cfd2.persistence_video_mute);
            protoWriter.writeBytes(c2236151Cfd2.unknownFields());
        }
    };
    public static final Long DEFAULT_RETRY_COUNT = 0L;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_PERSISTENCE_VIDEO_MUTE_EXIST = bool;
        DEFAULT_PERSISTENCE_VIDEO_MUTE = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.retry_count.hashCode()) * 37) + this.is_persistence_video_mute_exist.hashCode()) * 37) + this.persistence_video_mute.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236171Cff newBuilder() {
        C2236171Cff c2236171Cff = new C2236171Cff();
        c2236171Cff.LIZLLL = this.invoke_id;
        c2236171Cff.LJ = this.retry_count;
        c2236171Cff.LJFF = this.is_persistence_video_mute_exist;
        c2236171Cff.LJI = this.persistence_video_mute;
        c2236171Cff.addUnknownFields(unknownFields());
        return c2236171Cff;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", retry_count=");
        sb.append(this.retry_count);
        sb.append(", is_persistence_video_mute_exist=");
        sb.append(this.is_persistence_video_mute_exist);
        sb.append(", persistence_video_mute=");
        sb.append(this.persistence_video_mute);
        sb.replace(0, 2, "LinkMicResumeParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236151Cfd)) {
            return false;
        }
        C2236151Cfd c2236151Cfd = (C2236151Cfd) obj;
        if (unknownFields().equals(c2236151Cfd.unknownFields()) && this.invoke_id.equals(c2236151Cfd.invoke_id) && this.retry_count.equals(c2236151Cfd.retry_count) && this.is_persistence_video_mute_exist.equals(c2236151Cfd.is_persistence_video_mute_exist) && this.persistence_video_mute.equals(c2236151Cfd.persistence_video_mute)) {
            return true;
        }
        return false;
    }

    public C2236151Cfd(String str, Long l, Boolean bool, Boolean bool2) {
        this(str, l, bool, bool2, ByteString.EMPTY);
    }

    public C2236151Cfd(String str, Long l, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.retry_count = l;
        this.is_persistence_video_mute_exist = bool;
        this.persistence_video_mute = bool2;
    }
}
