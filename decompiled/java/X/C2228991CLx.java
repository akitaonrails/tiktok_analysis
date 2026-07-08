package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228991CLx extends Message<C2228991CLx, C2229001CLy> {
    public static final ProtoAdapter<C2228991CLx> ADAPTER = new ProtoAdapter<C2228991CLx>() { // from class: X.1CLw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228991CLx decode(ProtoReader protoReader) {
            C2229001CLy c2229001CLy = new C2229001CLy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2229001CLy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    c2229001CLy.LJFF = EnumC1282300jTQ.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2229001CLy.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c2229001CLy.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2229001CLy.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229001CLy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228991CLx c2228991CLx) {
            C2228991CLx c2228991CLx2 = c2228991CLx;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2228991CLx2.origin_stream_id) + protoAdapter.encodedSizeWithTag(2, c2228991CLx2.replace_stream_id) + EnumC1282300jTQ.ADAPTER.encodedSizeWithTag(3, c2228991CLx2.replace_stream_type) + c2228991CLx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228991CLx redact(C2228991CLx c2228991CLx) {
            C2229001CLy c2229001CLyNewBuilder = c2228991CLx.newBuilder();
            c2229001CLyNewBuilder.clearUnknownFields();
            return c2229001CLyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228991CLx c2228991CLx) {
            C2228991CLx c2228991CLx2 = c2228991CLx;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228991CLx2.origin_stream_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2228991CLx2.replace_stream_id);
            EnumC1282300jTQ.ADAPTER.encodeWithTag(protoWriter, 3, c2228991CLx2.replace_stream_type);
            protoWriter.writeBytes(c2228991CLx2.unknownFields());
        }
    };
    public static final EnumC1282300jTQ DEFAULT_REPLACE_STREAM_TYPE = EnumC1282300jTQ.VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ALL;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String origin_stream_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String replace_stream_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAuxStreamSubscribeType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC1282300jTQ replace_stream_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.origin_stream_id.hashCode()) * 37) + this.replace_stream_id.hashCode()) * 37) + this.replace_stream_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229001CLy newBuilder() {
        C2229001CLy c2229001CLy = new C2229001CLy();
        c2229001CLy.LIZLLL = this.origin_stream_id;
        c2229001CLy.LJ = this.replace_stream_id;
        c2229001CLy.LJFF = this.replace_stream_type;
        c2229001CLy.addUnknownFields(unknownFields());
        return c2229001CLy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", origin_stream_id=");
        sb.append(this.origin_stream_id);
        sb.append(", replace_stream_id=");
        sb.append(this.replace_stream_id);
        sb.append(", replace_stream_type=");
        sb.append(this.replace_stream_type);
        sb.replace(0, 2, "FuncParamsX52d0fcd5c3e24bfa{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228991CLx)) {
            return false;
        }
        C2228991CLx c2228991CLx = (C2228991CLx) obj;
        if (unknownFields().equals(c2228991CLx.unknownFields()) && this.origin_stream_id.equals(c2228991CLx.origin_stream_id) && this.replace_stream_id.equals(c2228991CLx.replace_stream_id) && this.replace_stream_type.equals(c2228991CLx.replace_stream_type)) {
            return true;
        }
        return false;
    }

    public C2228991CLx(String str, String str2, EnumC1282300jTQ enumC1282300jTQ) {
        this(str, str2, enumC1282300jTQ, ByteString.EMPTY);
    }

    public C2228991CLx(String str, String str2, EnumC1282300jTQ enumC1282300jTQ, ByteString byteString) {
        super(ADAPTER, byteString);
        this.origin_stream_id = str;
        this.replace_stream_id = str2;
        this.replace_stream_type = enumC1282300jTQ;
    }
}
