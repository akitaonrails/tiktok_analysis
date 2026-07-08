package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906290Zgx extends Message<C906290Zgx, C906190Zgn> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.StreamBlockAction#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC906310Zgz action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String block_id;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.StreamBlockContent#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C906380Zh6 content;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.Metadata#ADAPTER", tag = 6)
    public final C906450ZhD metadata;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.StreamReplyType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC906630ZhV reply_type;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.StreamBlockType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC906560ZhO type;
    public static final ProtoAdapter<C906290Zgx> ADAPTER = new ProtoAdapter<C906290Zgx>() { // from class: X.0Zgy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906290Zgx decode(ProtoReader protoReader) {
            C906190Zgn c906190Zgn = new C906190Zgn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c906190Zgn.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                c906190Zgn.LJ = EnumC906630ZhV.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c906190Zgn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 3:
                            try {
                                c906190Zgn.LJFF = EnumC906560ZhO.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c906190Zgn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 4:
                            c906190Zgn.LJI = C906380Zh6.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            try {
                                c906190Zgn.LJII = EnumC906310Zgz.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c906190Zgn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 6:
                            c906190Zgn.LJIIIIZZ = C906450ZhD.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c906190Zgn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906190Zgn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906290Zgx c906290Zgx) {
            C906290Zgx c906290Zgx2 = c906290Zgx;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c906290Zgx2.block_id) + EnumC906630ZhV.ADAPTER.encodedSizeWithTag(2, c906290Zgx2.reply_type) + EnumC906560ZhO.ADAPTER.encodedSizeWithTag(3, c906290Zgx2.type) + C906380Zh6.ADAPTER.encodedSizeWithTag(4, c906290Zgx2.content) + EnumC906310Zgz.ADAPTER.encodedSizeWithTag(5, c906290Zgx2.action) + C906450ZhD.ADAPTER.encodedSizeWithTag(6, c906290Zgx2.metadata) + c906290Zgx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906290Zgx redact(C906290Zgx c906290Zgx) {
            C906190Zgn c906190ZgnNewBuilder = c906290Zgx.newBuilder();
            c906190ZgnNewBuilder.LJI = C906380Zh6.ADAPTER.redact(c906190ZgnNewBuilder.LJI);
            C906450ZhD c906450ZhD = c906190ZgnNewBuilder.LJIIIIZZ;
            if (c906450ZhD != null) {
                c906190ZgnNewBuilder.LJIIIIZZ = C906450ZhD.ADAPTER.redact(c906450ZhD);
            }
            c906190ZgnNewBuilder.clearUnknownFields();
            return c906190ZgnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906290Zgx c906290Zgx) {
            C906290Zgx c906290Zgx2 = c906290Zgx;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c906290Zgx2.block_id);
            EnumC906630ZhV.ADAPTER.encodeWithTag(protoWriter, 2, c906290Zgx2.reply_type);
            EnumC906560ZhO.ADAPTER.encodeWithTag(protoWriter, 3, c906290Zgx2.type);
            C906380Zh6.ADAPTER.encodeWithTag(protoWriter, 4, c906290Zgx2.content);
            EnumC906310Zgz.ADAPTER.encodeWithTag(protoWriter, 5, c906290Zgx2.action);
            C906450ZhD.ADAPTER.encodeWithTag(protoWriter, 6, c906290Zgx2.metadata);
            protoWriter.writeBytes(c906290Zgx2.unknownFields());
        }
    };
    public static final EnumC906630ZhV DEFAULT_REPLY_TYPE = EnumC906630ZhV.STREAM_REPLY_TYPE_UNKNOWN;
    public static final EnumC906560ZhO DEFAULT_TYPE = EnumC906560ZhO.STREAM_BLOCK_TYPE_UNKNOWN;
    public static final EnumC906310Zgz DEFAULT_ACTION = EnumC906310Zgz.STREAM_BLOCK_ACTION_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.block_id.hashCode()) * 37) + this.reply_type.hashCode()) * 37) + this.type.hashCode()) * 37) + this.content.hashCode()) * 37) + this.action.hashCode()) * 37;
        C906450ZhD c906450ZhD = this.metadata;
        int iHashCode2 = iHashCode + (c906450ZhD != null ? c906450ZhD.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C906190Zgn newBuilder() {
        C906190Zgn c906190Zgn = new C906190Zgn();
        c906190Zgn.LIZLLL = this.block_id;
        c906190Zgn.LJ = this.reply_type;
        c906190Zgn.LJFF = this.type;
        c906190Zgn.LJI = this.content;
        c906190Zgn.LJII = this.action;
        c906190Zgn.LJIIIIZZ = this.metadata;
        c906190Zgn.addUnknownFields(unknownFields());
        return c906190Zgn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", block_id=");
        sb.append(this.block_id);
        sb.append(", reply_type=");
        sb.append(this.reply_type);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", action=");
        sb.append(this.action);
        if (this.metadata != null) {
            sb.append(", metadata=");
            sb.append(this.metadata);
        }
        sb.replace(0, 2, "StreamBlock{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C906290Zgx)) {
            return false;
        }
        C906290Zgx c906290Zgx = (C906290Zgx) obj;
        if (unknownFields().equals(c906290Zgx.unknownFields()) && this.block_id.equals(c906290Zgx.block_id) && this.reply_type.equals(c906290Zgx.reply_type) && this.type.equals(c906290Zgx.type) && this.content.equals(c906290Zgx.content) && this.action.equals(c906290Zgx.action) && C1516540pZE.LJ(this.metadata, c906290Zgx.metadata)) {
            return true;
        }
        return false;
    }

    public C906290Zgx(String str, EnumC906630ZhV enumC906630ZhV, EnumC906560ZhO enumC906560ZhO, C906380Zh6 c906380Zh6, EnumC906310Zgz enumC906310Zgz, C906450ZhD c906450ZhD) {
        this(str, enumC906630ZhV, enumC906560ZhO, c906380Zh6, enumC906310Zgz, c906450ZhD, ByteString.EMPTY);
    }

    public C906290Zgx(String str, EnumC906630ZhV enumC906630ZhV, EnumC906560ZhO enumC906560ZhO, C906380Zh6 c906380Zh6, EnumC906310Zgz enumC906310Zgz, C906450ZhD c906450ZhD, ByteString byteString) {
        super(ADAPTER, byteString);
        this.block_id = str;
        this.reply_type = enumC906630ZhV;
        this.type = enumC906560ZhO;
        this.content = c906380Zh6;
        this.action = enumC906310Zgz;
        this.metadata = c906450ZhD;
    }
}
