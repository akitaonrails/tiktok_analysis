package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227651CGt extends Message<C2227651CGt, C2227671CGv> {
    public static final ProtoAdapter<C2227651CGt> ADAPTER = new ProtoAdapter<C2227651CGt>() { // from class: X.1CGu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227651CGt decode(ProtoReader protoReader) {
            C2227671CGv c2227671CGv = new C2227671CGv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227671CGv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227671CGv.LJ = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c2227671CGv.LIZLLL.add(ProtoAdapter.FLOAT.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227671CGv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227651CGt c2227651CGt) {
            C2227651CGt c2227651CGt2 = c2227651CGt;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c2227651CGt2.volume_levels) + protoAdapter.encodedSizeWithTag(2, c2227651CGt2.sample_rate) + c2227651CGt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227651CGt redact(C2227651CGt c2227651CGt) {
            C2227671CGv c2227671CGvNewBuilder = c2227651CGt.newBuilder();
            c2227671CGvNewBuilder.clearUnknownFields();
            return c2227671CGvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227651CGt c2227651CGt) {
            C2227651CGt c2227651CGt2 = c2227651CGt;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c2227651CGt2.volume_levels);
            protoAdapter.encodeWithTag(protoWriter, 2, c2227651CGt2.sample_rate);
            protoWriter.writeBytes(c2227651CGt2.unknownFields());
        }
    };
    public static final Float DEFAULT_SAMPLE_RATE = Float.valueOf(0.0f);
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float sample_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.REPEATED, tag = 1)
    public final List<Float> volume_levels;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.volume_levels.hashCode()) * 37;
        Float f = this.sample_rate;
        int iHashCode2 = iHashCode + (f != null ? f.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2227671CGv newBuilder() {
        C2227671CGv c2227671CGv = new C2227671CGv();
        c2227671CGv.LIZLLL = C1516540pZE.LIZJ("volume_levels", this.volume_levels);
        c2227671CGv.LJ = this.sample_rate;
        c2227671CGv.addUnknownFields(unknownFields());
        return c2227671CGv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.volume_levels.isEmpty()) {
            sb.append(", volume_levels=");
            sb.append(this.volume_levels);
        }
        if (this.sample_rate != null) {
            sb.append(", sample_rate=");
            sb.append(this.sample_rate);
        }
        sb.replace(0, 2, "AudioCardWaveformInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227651CGt)) {
            return false;
        }
        C2227651CGt c2227651CGt = (C2227651CGt) obj;
        if (unknownFields().equals(c2227651CGt.unknownFields()) && this.volume_levels.equals(c2227651CGt.volume_levels) && C1516540pZE.LJ(this.sample_rate, c2227651CGt.sample_rate)) {
            return true;
        }
        return false;
    }

    public C2227651CGt(List<Float> list, Float f) {
        this(list, f, ByteString.EMPTY);
    }

    public C2227651CGt(List<Float> list, Float f, ByteString byteString) {
        super(ADAPTER, byteString);
        this.volume_levels = C1516540pZE.LJFF("volume_levels", list);
        this.sample_rate = f;
    }
}
