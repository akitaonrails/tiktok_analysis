package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233731Cbj extends Message<C2233731Cbj, C2233751Cbl> {
    public static final ProtoAdapter<C2233731Cbj> ADAPTER = new ProtoAdapter<C2233731Cbj>() { // from class: X.1Cbk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233731Cbj decode(ProtoReader protoReader) {
            C2233751Cbl c2233751Cbl = new C2233751Cbl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233751Cbl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c2233751Cbl.LJ = EnumC2182351Ab3.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2233751Cbl.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2233751Cbl.LIZLLL = C2233701Cbg.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233751Cbl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233731Cbj c2233731Cbj) {
            C2233731Cbj c2233731Cbj2 = c2233731Cbj;
            return C2233701Cbg.ADAPTER.encodedSizeWithTag(1, c2233731Cbj2.simple_sei_model) + EnumC2182351Ab3.ADAPTER.encodedSizeWithTag(2, c2233731Cbj2.layout_scene) + c2233731Cbj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233731Cbj redact(C2233731Cbj c2233731Cbj) {
            C2233751Cbl c2233751CblNewBuilder = c2233731Cbj.newBuilder();
            c2233751CblNewBuilder.LIZLLL = C2233701Cbg.ADAPTER.redact(c2233751CblNewBuilder.LIZLLL);
            c2233751CblNewBuilder.clearUnknownFields();
            return c2233751CblNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233731Cbj c2233731Cbj) {
            C2233731Cbj c2233731Cbj2 = c2233731Cbj;
            C2233701Cbg.ADAPTER.encodeWithTag(protoWriter, 1, c2233731Cbj2.simple_sei_model);
            EnumC2182351Ab3.ADAPTER.encodeWithTag(protoWriter, 2, c2233731Cbj2.layout_scene);
            protoWriter.writeBytes(c2233731Cbj2.unknownFields());
        }
    };
    public static final EnumC2182351Ab3 DEFAULT_LAYOUT_SCENE = EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_IN_ROOM;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutScene#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2182351Ab3 layout_scene;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutSimpleSeiLayoutModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233701Cbg simple_sei_model;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.simple_sei_model.hashCode()) * 37) + this.layout_scene.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233751Cbl newBuilder() {
        C2233751Cbl c2233751Cbl = new C2233751Cbl();
        c2233751Cbl.LIZLLL = this.simple_sei_model;
        c2233751Cbl.LJ = this.layout_scene;
        c2233751Cbl.addUnknownFields(unknownFields());
        return c2233751Cbl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", simple_sei_model=");
        sb.append(this.simple_sei_model);
        sb.append(", layout_scene=");
        sb.append(this.layout_scene);
        sb.replace(0, 2, "FuncParamsXc0e105992ce8f5dd{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233731Cbj)) {
            return false;
        }
        C2233731Cbj c2233731Cbj = (C2233731Cbj) obj;
        if (unknownFields().equals(c2233731Cbj.unknownFields()) && this.simple_sei_model.equals(c2233731Cbj.simple_sei_model) && this.layout_scene.equals(c2233731Cbj.layout_scene)) {
            return true;
        }
        return false;
    }

    public C2233731Cbj(C2233701Cbg c2233701Cbg, EnumC2182351Ab3 enumC2182351Ab3) {
        this(c2233701Cbg, enumC2182351Ab3, ByteString.EMPTY);
    }

    public C2233731Cbj(C2233701Cbg c2233701Cbg, EnumC2182351Ab3 enumC2182351Ab3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.simple_sei_model = c2233701Cbg;
        this.layout_scene = enumC2182351Ab3;
    }
}
