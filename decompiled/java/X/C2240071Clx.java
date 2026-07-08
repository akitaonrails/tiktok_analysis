package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Clx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240071Clx extends Message<C2240071Clx, C2240081Cly> {
    public static final ProtoAdapter<C2240071Clx> ADAPTER = new ProtoAdapter<C2240071Clx>() { // from class: X.1Clw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240071Clx decode(ProtoReader protoReader) {
            C2240081Cly c2240081Cly = new C2240081Cly();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2240081Cly.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2240081Cly.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240081Cly.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240071Clx c2240071Clx) {
            C2240071Clx c2240071Clx2 = c2240071Clx;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2240071Clx2.highlight_story_collection_id) + c2240071Clx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240071Clx redact(C2240071Clx c2240071Clx) {
            C2240081Cly c2240081ClyNewBuilder = c2240071Clx.newBuilder();
            c2240081ClyNewBuilder.clearUnknownFields();
            return c2240081ClyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240071Clx c2240071Clx) {
            C2240071Clx c2240071Clx2 = c2240071Clx;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2240071Clx2.highlight_story_collection_id);
            protoWriter.writeBytes(c2240071Clx2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String highlight_story_collection_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.highlight_story_collection_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2240081Cly newBuilder() {
        C2240081Cly c2240081Cly = new C2240081Cly();
        c2240081Cly.LIZLLL = this.highlight_story_collection_id;
        c2240081Cly.addUnknownFields(unknownFields());
        return c2240081Cly;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.highlight_story_collection_id != null) {
            sb.append(", highlight_story_collection_id=");
            sb.append(this.highlight_story_collection_id);
        }
        sb.replace(0, 2, "HighlightStoryInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C2240071Clx(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240071Clx)) {
            return false;
        }
        C2240071Clx c2240071Clx = (C2240071Clx) obj;
        if (unknownFields().equals(c2240071Clx.unknownFields()) && C1516540pZE.LJ(this.highlight_story_collection_id, c2240071Clx.highlight_story_collection_id)) {
            return true;
        }
        return false;
    }

    public C2240071Clx(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.highlight_story_collection_id = str;
    }
}
