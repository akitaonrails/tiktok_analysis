package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906450ZhD extends Message<C906450ZhD, C906500ZhI> {
    public static final ProtoAdapter<C906450ZhD> ADAPTER = new ProtoAdapter<C906450ZhD>() { // from class: X.0ZhF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906450ZhD decode(ProtoReader protoReader) {
            C906500ZhI c906500ZhI = new C906500ZhI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c906500ZhI.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c906500ZhI.LIZLLL.add(C906460ZhE.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906500ZhI.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906450ZhD c906450ZhD) {
            C906450ZhD c906450ZhD2 = c906450ZhD;
            return C906460ZhE.ADAPTER.asRepeated().encodedSizeWithTag(1, c906450ZhD2.kv) + c906450ZhD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906450ZhD redact(C906450ZhD c906450ZhD) {
            C906500ZhI c906500ZhINewBuilder = c906450ZhD.newBuilder();
            C1516540pZE.LJIIIZ(c906500ZhINewBuilder.LIZLLL, C906460ZhE.ADAPTER);
            c906500ZhINewBuilder.clearUnknownFields();
            return c906500ZhINewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906450ZhD c906450ZhD) {
            C906450ZhD c906450ZhD2 = c906450ZhD;
            C906460ZhE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c906450ZhD2.kv);
            protoWriter.writeBytes(c906450ZhD2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.MetadataEntry#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C906460ZhE> kv;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.kv.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C906500ZhI newBuilder() {
        C906500ZhI c906500ZhI = new C906500ZhI();
        c906500ZhI.LIZLLL = C1516540pZE.LIZJ("kv", this.kv);
        c906500ZhI.addUnknownFields(unknownFields());
        return c906500ZhI;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.kv.isEmpty()) {
            sb.append(", kv=");
            sb.append(this.kv);
        }
        sb.replace(0, 2, "Metadata{");
        sb.append('}');
        return sb.toString();
    }

    public C906450ZhD(List<C906460ZhE> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906450ZhD)) {
            return false;
        }
        C906450ZhD c906450ZhD = (C906450ZhD) obj;
        if (unknownFields().equals(c906450ZhD.unknownFields()) && this.kv.equals(c906450ZhD.kv)) {
            return true;
        }
        return false;
    }

    public C906450ZhD(List<C906460ZhE> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.kv = C1516540pZE.LJFF("kv", list);
    }
}
