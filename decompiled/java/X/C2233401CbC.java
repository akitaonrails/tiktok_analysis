package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233401CbC extends Message<C2233401CbC, C2233421CbE> {
    public static final ProtoAdapter<C2233401CbC> ADAPTER = new ProtoAdapter<C2233401CbC>() { // from class: X.1CbD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233401CbC decode(ProtoReader protoReader) {
            C2233421CbE c2233421CbE = new C2233421CbE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2233421CbE.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2233421CbE.LJI = C2233611CbX.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2233421CbE.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2233421CbE.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2233421CbE.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233421CbE.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233401CbC c2233401CbC) {
            C2233401CbC c2233401CbC2 = c2233401CbC;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2233401CbC2.switch_id) + protoAdapter.encodedSizeWithTag(2, c2233401CbC2.source_str) + protoAdapter.encodedSizeWithTag(3, c2233401CbC2.source_id) + C2233611CbX.ADAPTER.encodedSizeWithTag(4, c2233401CbC2.biz_source) + c2233401CbC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233401CbC redact(C2233401CbC c2233401CbC) {
            C2233421CbE c2233421CbENewBuilder = c2233401CbC.newBuilder();
            C2233611CbX c2233611CbX = c2233421CbENewBuilder.LJI;
            if (c2233611CbX != null) {
                c2233421CbENewBuilder.LJI = C2233611CbX.ADAPTER.redact(c2233611CbX);
            }
            c2233421CbENewBuilder.clearUnknownFields();
            return c2233421CbENewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233401CbC c2233401CbC) {
            C2233401CbC c2233401CbC2 = c2233401CbC;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233401CbC2.switch_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233401CbC2.source_str);
            protoAdapter.encodeWithTag(protoWriter, 3, c2233401CbC2.source_id);
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 4, c2233401CbC2.biz_source);
            protoWriter.writeBytes(c2233401CbC2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", tag = 4)
    public final C2233611CbX biz_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String source_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String source_str;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String switch_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.switch_id.hashCode()) * 37) + this.source_str.hashCode()) * 37) + this.source_id.hashCode()) * 37;
        C2233611CbX c2233611CbX = this.biz_source;
        int iHashCode2 = iHashCode + (c2233611CbX != null ? c2233611CbX.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2233421CbE newBuilder() {
        C2233421CbE c2233421CbE = new C2233421CbE();
        c2233421CbE.LIZLLL = this.switch_id;
        c2233421CbE.LJ = this.source_str;
        c2233421CbE.LJFF = this.source_id;
        c2233421CbE.LJI = this.biz_source;
        c2233421CbE.addUnknownFields(unknownFields());
        return c2233421CbE;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", switch_id=");
        sb.append(this.switch_id);
        sb.append(", source_str=");
        sb.append(this.source_str);
        sb.append(", source_id=");
        sb.append(this.source_id);
        if (this.biz_source != null) {
            sb.append(", biz_source=");
            sb.append(this.biz_source);
        }
        sb.replace(0, 2, "PipelineSource{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233401CbC)) {
            return false;
        }
        C2233401CbC c2233401CbC = (C2233401CbC) obj;
        if (unknownFields().equals(c2233401CbC.unknownFields()) && this.switch_id.equals(c2233401CbC.switch_id) && this.source_str.equals(c2233401CbC.source_str) && this.source_id.equals(c2233401CbC.source_id) && C1516540pZE.LJ(this.biz_source, c2233401CbC.biz_source)) {
            return true;
        }
        return false;
    }

    public C2233401CbC(String str, String str2, String str3, C2233611CbX c2233611CbX) {
        this(str, str2, str3, c2233611CbX, ByteString.EMPTY);
    }

    public C2233401CbC(String str, String str2, String str3, C2233611CbX c2233611CbX, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_id = str;
        this.source_str = str2;
        this.source_id = str3;
        this.biz_source = c2233611CbX;
    }
}
