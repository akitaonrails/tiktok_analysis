package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cmq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240621Cmq extends Message<C2240621Cmq, C2240641Cms> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer width;
    public static final ProtoAdapter<C2240621Cmq> ADAPTER = new ProtoAdapter<C2240621Cmq>() { // from class: X.1Cmr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240621Cmq decode(ProtoReader protoReader) {
            C2240641Cms c2240641Cms = new C2240641Cms();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2240641Cms.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2240641Cms.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2240641Cms.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2240641Cms.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2240641Cms.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240641Cms.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240621Cmq c2240621Cmq) {
            C2240621Cmq c2240621Cmq2 = c2240621Cmq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2240621Cmq2.url);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2240621Cmq2.width) + protoAdapter2.encodedSizeWithTag(3, c2240621Cmq2.height) + protoAdapter.encodedSizeWithTag(4, c2240621Cmq2.type) + c2240621Cmq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240621Cmq redact(C2240621Cmq c2240621Cmq) {
            C2240641Cms c2240641CmsNewBuilder = c2240621Cmq.newBuilder();
            c2240641CmsNewBuilder.clearUnknownFields();
            return c2240641CmsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240621Cmq c2240621Cmq) {
            C2240621Cmq c2240621Cmq2 = c2240621Cmq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2240621Cmq2.url);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2240621Cmq2.width);
            protoAdapter2.encodeWithTag(protoWriter, 3, c2240621Cmq2.height);
            protoAdapter.encodeWithTag(protoWriter, 4, c2240621Cmq2.type);
            protoWriter.writeBytes(c2240621Cmq2.unknownFields());
        }
    };
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str2 = this.type;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2240641Cms newBuilder() {
        C2240641Cms c2240641Cms = new C2240641Cms();
        c2240641Cms.LIZLLL = this.url;
        c2240641Cms.LJ = this.width;
        c2240641Cms.LJFF = this.height;
        c2240641Cms.LJI = this.type;
        c2240641Cms.addUnknownFields(unknownFields());
        return c2240641Cms;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        sb.replace(0, 2, "StickerImage{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240621Cmq)) {
            return false;
        }
        C2240621Cmq c2240621Cmq = (C2240621Cmq) obj;
        if (unknownFields().equals(c2240621Cmq.unknownFields()) && C1516540pZE.LJ(this.url, c2240621Cmq.url) && C1516540pZE.LJ(this.width, c2240621Cmq.width) && C1516540pZE.LJ(this.height, c2240621Cmq.height) && C1516540pZE.LJ(this.type, c2240621Cmq.type)) {
            return true;
        }
        return false;
    }

    public C2240621Cmq(String str, Integer num, Integer num2, String str2) {
        this(str, num, num2, str2, ByteString.EMPTY);
    }

    public C2240621Cmq(String str, Integer num, Integer num2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.width = num;
        this.height = num2;
        this.type = str2;
    }
}
