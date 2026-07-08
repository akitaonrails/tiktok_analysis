package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CCn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226551CCn extends Message<C2226551CCn, C2226571CCp> {
    public static final ProtoAdapter<C2226551CCn> ADAPTER = new ProtoAdapter<C2226551CCn>() { // from class: X.1CCo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226551CCn decode(ProtoReader protoReader) {
            C2226571CCp c2226571CCp = new C2226571CCp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2226571CCp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2226571CCp.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2226571CCp.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226571CCp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226551CCn c2226551CCn) {
            C2226551CCn c2226551CCn2 = c2226551CCn;
            return ProtoAdapter.INT64.asPacked().encodedSizeWithTag(1, c2226551CCn2.containers) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2226551CCn2.source) + c2226551CCn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226551CCn redact(C2226551CCn c2226551CCn) {
            C2226571CCp c2226571CCpNewBuilder = c2226551CCn.newBuilder();
            c2226571CCpNewBuilder.clearUnknownFields();
            return c2226571CCpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226551CCn c2226551CCn) {
            C2226551CCn c2226551CCn2 = c2226551CCn;
            ProtoAdapter.INT64.asPacked().encodeWithTag(protoWriter, 1, c2226551CCn2.containers);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2226551CCn2.source);
            protoWriter.writeBytes(c2226551CCn2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 1)
    public final List<Long> containers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.containers.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226571CCp newBuilder() {
        C2226571CCp c2226571CCp = new C2226571CCp();
        c2226571CCp.LIZLLL = C1516540pZE.LIZJ("containers", this.containers);
        c2226571CCp.LJ = this.source;
        c2226571CCp.addUnknownFields(unknownFields());
        return c2226571CCp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.containers.isEmpty()) {
            sb.append(", containers=");
            sb.append(this.containers);
        }
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "FuncParamsX19de8a28168c9a5d{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226551CCn)) {
            return false;
        }
        C2226551CCn c2226551CCn = (C2226551CCn) obj;
        if (unknownFields().equals(c2226551CCn.unknownFields()) && this.containers.equals(c2226551CCn.containers) && this.source.equals(c2226551CCn.source)) {
            return true;
        }
        return false;
    }

    public C2226551CCn(List<Long> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public C2226551CCn(List<Long> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.containers = C1516540pZE.LJFF("containers", list);
        this.source = str;
    }
}
