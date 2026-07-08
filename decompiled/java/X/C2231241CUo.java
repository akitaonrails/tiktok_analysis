package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231241CUo extends Message<C2231241CUo, C2231261CUq> {
    public static final ProtoAdapter<C2231241CUo> ADAPTER = new ProtoAdapter<C2231241CUo>() { // from class: X.1CUp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231241CUo decode(ProtoReader protoReader) {
            C2231261CUq c2231261CUq = new C2231261CUq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2231261CUq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2231261CUq.LJFF = C2231461CVk.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c2231261CUq.LJ = C1CV7.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2231261CUq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2231261CUq.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231261CUq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231241CUo c2231241CUo) {
            C2231241CUo c2231241CUo2 = c2231241CUo;
            return ProtoAdapter.INT64.asPacked().encodedSizeWithTag(1, c2231241CUo2.list_change_type) + C1CV7.ADAPTER.encodedSizeWithTag(2, c2231241CUo2.source) + C2231461CVk.ADAPTER.encodedSizeWithTag(3, c2231241CUo2.extra_info) + c2231241CUo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231241CUo redact(C2231241CUo c2231241CUo) {
            C2231261CUq c2231261CUqNewBuilder = c2231241CUo.newBuilder();
            C2231461CVk c2231461CVk = c2231261CUqNewBuilder.LJFF;
            if (c2231461CVk != null) {
                c2231261CUqNewBuilder.LJFF = C2231461CVk.ADAPTER.redact(c2231461CVk);
            }
            c2231261CUqNewBuilder.clearUnknownFields();
            return c2231261CUqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231241CUo c2231241CUo) {
            C2231241CUo c2231241CUo2 = c2231241CUo;
            ProtoAdapter.INT64.asPacked().encodeWithTag(protoWriter, 1, c2231241CUo2.list_change_type);
            C1CV7.ADAPTER.encodeWithTag(protoWriter, 2, c2231241CUo2.source);
            C2231461CVk.ADAPTER.encodeWithTag(protoWriter, 3, c2231241CUo2.extra_info);
            protoWriter.writeBytes(c2231241CUo2.unknownFields());
        }
    };
    public static final C1CV7 DEFAULT_SOURCE = C1CV7.VAR_LINK_MIC_LIST_CHANGE_SOURCE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicListChangeExtraInfo#ADAPTER", tag = 3)
    public final C2231461CVk extra_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 1)
    public final List<Long> list_change_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicListChangeSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CV7 source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.list_change_type.hashCode()) * 37) + this.source.hashCode()) * 37;
        C2231461CVk c2231461CVk = this.extra_info;
        int iHashCode2 = iHashCode + (c2231461CVk != null ? c2231461CVk.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2231261CUq newBuilder() {
        C2231261CUq c2231261CUq = new C2231261CUq();
        c2231261CUq.LIZLLL = C1516540pZE.LIZJ("list_change_type", this.list_change_type);
        c2231261CUq.LJ = this.source;
        c2231261CUq.LJFF = this.extra_info;
        c2231261CUq.addUnknownFields(unknownFields());
        return c2231261CUq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.list_change_type.isEmpty()) {
            sb.append(", list_change_type=");
            sb.append(this.list_change_type);
        }
        sb.append(", source=");
        sb.append(this.source);
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        sb.replace(0, 2, "FuncParamsXfb4391f10d09f414{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231241CUo)) {
            return false;
        }
        C2231241CUo c2231241CUo = (C2231241CUo) obj;
        if (unknownFields().equals(c2231241CUo.unknownFields()) && this.list_change_type.equals(c2231241CUo.list_change_type) && this.source.equals(c2231241CUo.source) && C1516540pZE.LJ(this.extra_info, c2231241CUo.extra_info)) {
            return true;
        }
        return false;
    }

    public C2231241CUo(List<Long> list, C1CV7 c1cv7, C2231461CVk c2231461CVk) {
        this(list, c1cv7, c2231461CVk, ByteString.EMPTY);
    }

    public C2231241CUo(List<Long> list, C1CV7 c1cv7, C2231461CVk c2231461CVk, ByteString byteString) {
        super(ADAPTER, byteString);
        this.list_change_type = C1516540pZE.LJFF("list_change_type", list);
        this.source = c1cv7;
        this.extra_info = c2231461CVk;
    }
}
