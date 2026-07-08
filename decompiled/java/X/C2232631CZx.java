package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232631CZx extends Message<C2232631CZx, C2232671Ca1> {
    public static final ProtoAdapter<C2232631CZx> ADAPTER = new ProtoAdapter<C2232631CZx>() { // from class: X.1CZy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232631CZx decode(ProtoReader protoReader) {
            C2232671Ca1 c2232671Ca1 = new C2232671Ca1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232671Ca1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2232671Ca1.LJ = C1CZJ.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2232671Ca1.LIZLLL = C1CZJ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232671Ca1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232631CZx c2232631CZx) {
            C2232631CZx c2232631CZx2 = c2232631CZx;
            ProtoAdapter<C1CZJ> protoAdapter = C1CZJ.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2232631CZx2.old_window_info) + protoAdapter.encodedSizeWithTag(2, c2232631CZx2.new_window_info) + c2232631CZx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232631CZx redact(C2232631CZx c2232631CZx) {
            C2232671Ca1 c2232671Ca1NewBuilder = c2232631CZx.newBuilder();
            ProtoAdapter<C1CZJ> protoAdapter = C1CZJ.ADAPTER;
            c2232671Ca1NewBuilder.LIZLLL = protoAdapter.redact(c2232671Ca1NewBuilder.LIZLLL);
            c2232671Ca1NewBuilder.LJ = protoAdapter.redact(c2232671Ca1NewBuilder.LJ);
            c2232671Ca1NewBuilder.clearUnknownFields();
            return c2232671Ca1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232631CZx c2232631CZx) {
            C2232631CZx c2232631CZx2 = c2232631CZx;
            ProtoAdapter<C1CZJ> protoAdapter = C1CZJ.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232631CZx2.old_window_info);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232631CZx2.new_window_info);
            protoWriter.writeBytes(c2232631CZx2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderWindowInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CZJ new_window_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderWindowInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CZJ old_window_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.old_window_info.hashCode()) * 37) + this.new_window_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232671Ca1 newBuilder() {
        C2232671Ca1 c2232671Ca1 = new C2232671Ca1();
        c2232671Ca1.LIZLLL = this.old_window_info;
        c2232671Ca1.LJ = this.new_window_info;
        c2232671Ca1.addUnknownFields(unknownFields());
        return c2232671Ca1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", old_window_info=");
        sb.append(this.old_window_info);
        sb.append(", new_window_info=");
        sb.append(this.new_window_info);
        sb.replace(0, 2, "LinkMicLayoutUpdatedWindowInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232631CZx)) {
            return false;
        }
        C2232631CZx c2232631CZx = (C2232631CZx) obj;
        if (unknownFields().equals(c2232631CZx.unknownFields()) && this.old_window_info.equals(c2232631CZx.old_window_info) && this.new_window_info.equals(c2232631CZx.new_window_info)) {
            return true;
        }
        return false;
    }

    public C2232631CZx(C1CZJ c1czj, C1CZJ c1czj2) {
        this(c1czj, c1czj2, ByteString.EMPTY);
    }

    public C2232631CZx(C1CZJ c1czj, C1CZJ c1czj2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.old_window_info = c1czj;
        this.new_window_info = c1czj2;
    }
}
