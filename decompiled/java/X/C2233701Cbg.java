package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233701Cbg extends Message<C2233701Cbg, C2233721Cbi> {
    public static final ProtoAdapter<C2233701Cbg> ADAPTER = new ProtoAdapter<C2233701Cbg>() { // from class: X.1Cbh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233701Cbg decode(ProtoReader protoReader) {
            C2233721Cbi c2233721Cbi = new C2233721Cbi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2233721Cbi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2233721Cbi.LJI = C2230371CRf.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2233721Cbi.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c2233721Cbi.LJ = C2233761Cbm.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2233721Cbi.LIZLLL = C2233461CbI.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233721Cbi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233701Cbg c2233701Cbg) {
            C2233701Cbg c2233701Cbg2 = c2233701Cbg;
            return C2233461CbI.ADAPTER.encodedSizeWithTag(1, c2233701Cbg2.container_info) + C2233761Cbm.ADAPTER.encodedSizeWithTag(2, c2233701Cbg2.resolution) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c2233701Cbg2.device_screen_scale) + C2230371CRf.ADAPTER.encodedSizeWithTag(4, c2233701Cbg2.container_rect_config) + c2233701Cbg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233701Cbg redact(C2233701Cbg c2233701Cbg) {
            C2233721Cbi c2233721CbiNewBuilder = c2233701Cbg.newBuilder();
            c2233721CbiNewBuilder.LIZLLL = C2233461CbI.ADAPTER.redact(c2233721CbiNewBuilder.LIZLLL);
            c2233721CbiNewBuilder.LJ = C2233761Cbm.ADAPTER.redact(c2233721CbiNewBuilder.LJ);
            c2233721CbiNewBuilder.LJI = C2230371CRf.ADAPTER.redact(c2233721CbiNewBuilder.LJI);
            c2233721CbiNewBuilder.clearUnknownFields();
            return c2233721CbiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233701Cbg c2233701Cbg) {
            C2233701Cbg c2233701Cbg2 = c2233701Cbg;
            C2233461CbI.ADAPTER.encodeWithTag(protoWriter, 1, c2233701Cbg2.container_info);
            C2233761Cbm.ADAPTER.encodeWithTag(protoWriter, 2, c2233701Cbg2.resolution);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, c2233701Cbg2.device_screen_scale);
            C2230371CRf.ADAPTER.encodeWithTag(protoWriter, 4, c2233701Cbg2.container_rect_config);
            protoWriter.writeBytes(c2233701Cbg2.unknownFields());
        }
    };
    public static final Double DEFAULT_DEVICE_SCREEN_SCALE = Double.valueOf(0.0d);
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutSeiContainerInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233461CbI container_info;

    @WireField(adapter = "link_mic_sdk.proto.LayoutTypeContainerRectConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2230371CRf container_rect_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double device_screen_scale;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutStreamPlayerResolution#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2233761Cbm resolution;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.container_info.hashCode()) * 37) + this.resolution.hashCode()) * 37) + this.device_screen_scale.hashCode()) * 37) + this.container_rect_config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233721Cbi newBuilder() {
        C2233721Cbi c2233721Cbi = new C2233721Cbi();
        c2233721Cbi.LIZLLL = this.container_info;
        c2233721Cbi.LJ = this.resolution;
        c2233721Cbi.LJFF = this.device_screen_scale;
        c2233721Cbi.LJI = this.container_rect_config;
        c2233721Cbi.addUnknownFields(unknownFields());
        return c2233721Cbi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", container_info=");
        sb.append(this.container_info);
        sb.append(", resolution=");
        sb.append(this.resolution);
        sb.append(", device_screen_scale=");
        sb.append(this.device_screen_scale);
        sb.append(", container_rect_config=");
        sb.append(this.container_rect_config);
        sb.replace(0, 2, "LinkMicLayoutSimpleSeiLayoutModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233701Cbg)) {
            return false;
        }
        C2233701Cbg c2233701Cbg = (C2233701Cbg) obj;
        if (unknownFields().equals(c2233701Cbg.unknownFields()) && this.container_info.equals(c2233701Cbg.container_info) && this.resolution.equals(c2233701Cbg.resolution) && this.device_screen_scale.equals(c2233701Cbg.device_screen_scale) && this.container_rect_config.equals(c2233701Cbg.container_rect_config)) {
            return true;
        }
        return false;
    }

    public C2233701Cbg(C2233461CbI c2233461CbI, C2233761Cbm c2233761Cbm, Double d, C2230371CRf c2230371CRf) {
        this(c2233461CbI, c2233761Cbm, d, c2230371CRf, ByteString.EMPTY);
    }

    public C2233701Cbg(C2233461CbI c2233461CbI, C2233761Cbm c2233761Cbm, Double d, C2230371CRf c2230371CRf, ByteString byteString) {
        super(ADAPTER, byteString);
        this.container_info = c2233461CbI;
        this.resolution = c2233761Cbm;
        this.device_screen_scale = d;
        this.container_rect_config = c2230371CRf;
    }
}
