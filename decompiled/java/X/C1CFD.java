package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFD extends Message<C1CFD, C1CFE> {
    public static final ProtoAdapter<C1CFD> ADAPTER = new ProtoAdapter<C1CFD>() { // from class: X.1CFC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFD decode(ProtoReader protoReader) {
            C1CFE c1cfe = new C1CFE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cfe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1cfe.LJ = EnumC2188991All.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cfe.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1cfe.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cfe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFD c1cfd) {
            C1CFD c1cfd2 = c1cfd;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cfd2.content) + EnumC2188991All.ADAPTER.encodedSizeWithTag(2, c1cfd2.dsl_source) + c1cfd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFD redact(C1CFD c1cfd) {
            C1CFE c1cfeNewBuilder = c1cfd.newBuilder();
            c1cfeNewBuilder.clearUnknownFields();
            return c1cfeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFD c1cfd) {
            C1CFD c1cfd2 = c1cfd;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cfd2.content);
            EnumC2188991All.ADAPTER.encodeWithTag(protoWriter, 2, c1cfd2.dsl_source);
            protoWriter.writeBytes(c1cfd2.unknownFields());
        }
    };
    public static final EnumC2188991All DEFAULT_DSL_SOURCE = EnumC2188991All.VAR_LINK_MIC_DSL_SOURCE_ORIGIN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String content;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicDslSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2188991All dsl_source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.content.hashCode()) * 37) + this.dsl_source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFE newBuilder() {
        C1CFE c1cfe = new C1CFE();
        c1cfe.LIZLLL = this.content;
        c1cfe.LJ = this.dsl_source;
        c1cfe.addUnknownFields(unknownFields());
        return c1cfe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", dsl_source=");
        sb.append(this.dsl_source);
        sb.replace(0, 2, "FuncParamsXf6ba9cb5d06dd9f3{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFD)) {
            return false;
        }
        C1CFD c1cfd = (C1CFD) obj;
        if (unknownFields().equals(c1cfd.unknownFields()) && this.content.equals(c1cfd.content) && this.dsl_source.equals(c1cfd.dsl_source)) {
            return true;
        }
        return false;
    }

    public C1CFD(String str, EnumC2188991All enumC2188991All) {
        this(str, enumC2188991All, ByteString.EMPTY);
    }

    public C1CFD(String str, EnumC2188991All enumC2188991All, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content = str;
        this.dsl_source = enumC2188991All;
    }
}
