package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFL extends Message<C1CFL, C1CFN> {
    public static final ProtoAdapter<C1CFL> ADAPTER = new ProtoAdapter<C1CFL>() { // from class: X.1CFM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFL decode(ProtoReader protoReader) {
            C1CFN c1cfn = new C1CFN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cfn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cfn.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1cfn.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cfn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFL c1cfl) {
            C1CFL c1cfl2 = c1cfl;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cfl2.channel_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c1cfl2.is_pre_join) + c1cfl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFL redact(C1CFL c1cfl) {
            C1CFN c1cfnNewBuilder = c1cfl.newBuilder();
            c1cfnNewBuilder.clearUnknownFields();
            return c1cfnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFL c1cfl) {
            C1CFL c1cfl2 = c1cfl;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cfl2.channel_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c1cfl2.is_pre_join);
            protoWriter.writeBytes(c1cfl2.unknownFields());
        }
    };
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Boolean DEFAULT_IS_PRE_JOIN = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_pre_join;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.channel_id.hashCode()) * 37) + this.is_pre_join.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFN newBuilder() {
        C1CFN c1cfn = new C1CFN();
        c1cfn.LIZLLL = this.channel_id;
        c1cfn.LJ = this.is_pre_join;
        c1cfn.addUnknownFields(unknownFields());
        return c1cfn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.append(", is_pre_join=");
        sb.append(this.is_pre_join);
        sb.replace(0, 2, "FuncParamsX72aa2957b0c6c7b4{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFL)) {
            return false;
        }
        C1CFL c1cfl = (C1CFL) obj;
        if (unknownFields().equals(c1cfl.unknownFields()) && this.channel_id.equals(c1cfl.channel_id) && this.is_pre_join.equals(c1cfl.is_pre_join)) {
            return true;
        }
        return false;
    }

    public C1CFL(Long l, Boolean bool) {
        this(l, bool, ByteString.EMPTY);
    }

    public C1CFL(Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_id = l;
        this.is_pre_join = bool;
    }
}
