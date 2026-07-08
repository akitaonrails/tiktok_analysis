package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527060pqC extends Message<C1527060pqC, C1527190pqP> {
    public static final ProtoAdapter<C1527060pqC> ADAPTER = new ProtoAdapter<C1527060pqC>() { // from class: X.0pqF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527060pqC decode(ProtoReader protoReader) {
            C1527190pqP c1527190pqP = new C1527190pqP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1527190pqP.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1527190pqP.LJ.add(C1527020pq8.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1527190pqP.LIZLLL = C1527010pq7.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1527190pqP.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1527060pqC c1527060pqC) {
            C1527060pqC c1527060pqC2 = c1527060pqC;
            return C1527010pq7.ADAPTER.encodedSizeWithTag(1, c1527060pqC2.header) + C1527020pq8.ADAPTER.asRepeated().encodedSizeWithTag(2, c1527060pqC2.topics) + c1527060pqC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1527060pqC redact(C1527060pqC c1527060pqC) {
            C1527190pqP c1527190pqPNewBuilder = c1527060pqC.newBuilder();
            c1527190pqPNewBuilder.LIZLLL = C1527010pq7.ADAPTER.redact(c1527190pqPNewBuilder.LIZLLL);
            C1516540pZE.LJIIIZ(c1527190pqPNewBuilder.LJ, C1527020pq8.ADAPTER);
            c1527190pqPNewBuilder.clearUnknownFields();
            return c1527190pqPNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1527060pqC c1527060pqC) {
            C1527060pqC c1527060pqC2 = c1527060pqC;
            C1527010pq7.ADAPTER.encodeWithTag(protoWriter, 1, c1527060pqC2.header);
            C1527020pq8.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1527060pqC2.topics);
            protoWriter.writeBytes(c1527060pqC2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.BsyncHeader#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1527010pq7 header;

    @WireField(adapter = "com.bytedance.sync.v4.protocal.BsyncTopic#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C1527020pq8> topics;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.header.hashCode()) * 37) + this.topics.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1527190pqP newBuilder() {
        C1527190pqP c1527190pqP = new C1527190pqP();
        c1527190pqP.LIZLLL = this.header;
        c1527190pqP.LJ = C1516540pZE.LIZJ("topics", this.topics);
        c1527190pqP.addUnknownFields(unknownFields());
        return c1527190pqP;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", header=");
        sb.append(this.header);
        if (!this.topics.isEmpty()) {
            sb.append(", topics=");
            sb.append(this.topics);
        }
        sb.replace(0, 2, "BsyncProtocol{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1527060pqC)) {
            return false;
        }
        C1527060pqC c1527060pqC = (C1527060pqC) obj;
        if (unknownFields().equals(c1527060pqC.unknownFields()) && this.header.equals(c1527060pqC.header) && this.topics.equals(c1527060pqC.topics)) {
            return true;
        }
        return false;
    }

    public C1527060pqC(C1527010pq7 c1527010pq7, List<C1527020pq8> list) {
        this(c1527010pq7, list, ByteString.EMPTY);
    }

    public C1527060pqC(C1527010pq7 c1527010pq7, List<C1527020pq8> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = c1527010pq7;
        this.topics = C1516540pZE.LJFF("topics", list);
    }
}
