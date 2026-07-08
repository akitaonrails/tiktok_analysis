package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233911Cc1 extends Message<C2233911Cc1, C2233931Cc3> {
    public static final ProtoAdapter<C2233911Cc1> ADAPTER = new ProtoAdapter<C2233911Cc1>() { // from class: X.1Cc2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233911Cc1 decode(ProtoReader protoReader) {
            C2233931Cc3 c2233931Cc3 = new C2233931Cc3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233931Cc3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2233931Cc3.LJ = C2233611CbX.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c2233931Cc3.LIZLLL = EnumC2182321Ab0.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2233931Cc3.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233931Cc3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233911Cc1 c2233911Cc1) {
            C2233911Cc1 c2233911Cc12 = c2233911Cc1;
            return EnumC2182321Ab0.ADAPTER.encodedSizeWithTag(1, c2233911Cc12.source) + C2233611CbX.ADAPTER.encodedSizeWithTag(2, c2233911Cc12.biz_source) + c2233911Cc12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233911Cc1 redact(C2233911Cc1 c2233911Cc1) {
            C2233931Cc3 c2233931Cc3NewBuilder = c2233911Cc1.newBuilder();
            c2233931Cc3NewBuilder.LJ = C2233611CbX.ADAPTER.redact(c2233931Cc3NewBuilder.LJ);
            c2233931Cc3NewBuilder.clearUnknownFields();
            return c2233931Cc3NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233911Cc1 c2233911Cc1) {
            C2233911Cc1 c2233911Cc12 = c2233911Cc1;
            EnumC2182321Ab0.ADAPTER.encodeWithTag(protoWriter, 1, c2233911Cc12.source);
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 2, c2233911Cc12.biz_source);
            protoWriter.writeBytes(c2233911Cc12.unknownFields());
        }
    };
    public static final EnumC2182321Ab0 DEFAULT_SOURCE = EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2233611CbX biz_source;

    @WireField(adapter = "link_mic_sdk.proto.LinkLayoutEndSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2182321Ab0 source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.source.hashCode()) * 37) + this.biz_source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233931Cc3 newBuilder() {
        C2233931Cc3 c2233931Cc3 = new C2233931Cc3();
        c2233931Cc3.LIZLLL = this.source;
        c2233931Cc3.LJ = this.biz_source;
        c2233931Cc3.addUnknownFields(unknownFields());
        return c2233931Cc3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", biz_source=");
        sb.append(this.biz_source);
        sb.replace(0, 2, "FuncParamsX23fb35bca0d6b6ec{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233911Cc1)) {
            return false;
        }
        C2233911Cc1 c2233911Cc1 = (C2233911Cc1) obj;
        if (unknownFields().equals(c2233911Cc1.unknownFields()) && this.source.equals(c2233911Cc1.source) && this.biz_source.equals(c2233911Cc1.biz_source)) {
            return true;
        }
        return false;
    }

    public C2233911Cc1(EnumC2182321Ab0 enumC2182321Ab0, C2233611CbX c2233611CbX) {
        this(enumC2182321Ab0, c2233611CbX, ByteString.EMPTY);
    }

    public C2233911Cc1(EnumC2182321Ab0 enumC2182321Ab0, C2233611CbX c2233611CbX, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source = enumC2182321Ab0;
        this.biz_source = c2233611CbX;
    }
}
