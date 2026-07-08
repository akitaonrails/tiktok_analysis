package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232981CaW extends Message<C2232981CaW, C2233001CaY> {
    public static final ProtoAdapter<C2232981CaW> ADAPTER = new ProtoAdapter<C2232981CaW>() { // from class: X.1CaX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232981CaW decode(ProtoReader protoReader) {
            C2233001CaY c2233001CaY = new C2233001CaY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2233001CaY.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2233001CaY.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2233001CaY.LJFF = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2233001CaY.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c2233001CaY.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2233001CaY.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2233001CaY.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233001CaY.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233001CaY.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232981CaW c2232981CaW) {
            C2232981CaW c2232981CaW2 = c2232981CaW;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2232981CaW2.applier) + protoAdapter.encodedSizeWithTag(2, c2232981CaW2.permiter) + protoAdapter.encodedSizeWithTag(3, c2232981CaW2.operator_p);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c2232981CaW2.is_agree) + ProtoAdapter.INT64.encodedSizeWithTag(5, c2232981CaW2.scene_version) + ProtoAdapter.STRING.encodedSizeWithTag(6, c2232981CaW2.layout_id) + protoAdapter2.encodedSizeWithTag(7, c2232981CaW2.is_moderator_handle) + c2232981CaW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232981CaW redact(C2232981CaW c2232981CaW) {
            C2233001CaY c2233001CaYNewBuilder = c2232981CaW.newBuilder();
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            c2233001CaYNewBuilder.LIZLLL = protoAdapter.redact(c2233001CaYNewBuilder.LIZLLL);
            c2233001CaYNewBuilder.LJ = protoAdapter.redact(c2233001CaYNewBuilder.LJ);
            c2233001CaYNewBuilder.LJFF = protoAdapter.redact(c2233001CaYNewBuilder.LJFF);
            c2233001CaYNewBuilder.clearUnknownFields();
            return c2233001CaYNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232981CaW c2232981CaW) {
            C2232981CaW c2232981CaW2 = c2232981CaW;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232981CaW2.applier);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232981CaW2.permiter);
            protoAdapter.encodeWithTag(protoWriter, 3, c2232981CaW2.operator_p);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2232981CaW2.is_agree);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c2232981CaW2.scene_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, c2232981CaW2.layout_id);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2232981CaW2.is_moderator_handle);
            protoWriter.writeBytes(c2232981CaW2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_AGREE;
    public static final Boolean DEFAULT_IS_MODERATOR_HANDLE;
    public static final Long DEFAULT_SCENE_VERSION;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo applier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean is_agree;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 7)
    public final Boolean is_moderator_handle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 6)
    public final String layout_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2232021CXo operator_p;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo permiter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long scene_version;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_AGREE = bool;
        DEFAULT_SCENE_VERSION = 0L;
        DEFAULT_IS_MODERATOR_HANDLE = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.applier.hashCode()) * 37) + this.permiter.hashCode()) * 37) + this.operator_p.hashCode()) * 37) + this.is_agree.hashCode()) * 37) + this.scene_version.hashCode()) * 37) + this.layout_id.hashCode()) * 37) + this.is_moderator_handle.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233001CaY newBuilder() {
        C2233001CaY c2233001CaY = new C2233001CaY();
        c2233001CaY.LIZLLL = this.applier;
        c2233001CaY.LJ = this.permiter;
        c2233001CaY.LJFF = this.operator_p;
        c2233001CaY.LJI = this.is_agree;
        c2233001CaY.LJII = this.scene_version;
        c2233001CaY.LJIIIIZZ = this.layout_id;
        c2233001CaY.LJIIIZ = this.is_moderator_handle;
        c2233001CaY.addUnknownFields(unknownFields());
        return c2233001CaY;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", applier=");
        sb.append(this.applier);
        sb.append(", permiter=");
        sb.append(this.permiter);
        sb.append(", operator_p=");
        sb.append(this.operator_p);
        sb.append(", is_agree=");
        sb.append(this.is_agree);
        sb.append(", scene_version=");
        sb.append(this.scene_version);
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        sb.append(", is_moderator_handle=");
        sb.append(this.is_moderator_handle);
        sb.replace(0, 2, "LinkMicImPermitModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232981CaW)) {
            return false;
        }
        C2232981CaW c2232981CaW = (C2232981CaW) obj;
        if (unknownFields().equals(c2232981CaW.unknownFields()) && this.applier.equals(c2232981CaW.applier) && this.permiter.equals(c2232981CaW.permiter) && this.operator_p.equals(c2232981CaW.operator_p) && this.is_agree.equals(c2232981CaW.is_agree) && this.scene_version.equals(c2232981CaW.scene_version) && this.layout_id.equals(c2232981CaW.layout_id) && this.is_moderator_handle.equals(c2232981CaW.is_moderator_handle)) {
            return true;
        }
        return false;
    }

    public C2232981CaW(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, C2232021CXo c2232021CXo3, Boolean bool, Long l, String str, Boolean bool2) {
        this(c2232021CXo, c2232021CXo2, c2232021CXo3, bool, l, str, bool2, ByteString.EMPTY);
    }

    public C2232981CaW(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, C2232021CXo c2232021CXo3, Boolean bool, Long l, String str, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.applier = c2232021CXo;
        this.permiter = c2232021CXo2;
        this.operator_p = c2232021CXo3;
        this.is_agree = bool;
        this.scene_version = l;
        this.layout_id = str;
        this.is_moderator_handle = bool2;
    }
}
