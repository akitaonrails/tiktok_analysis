package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236941Cgu extends Message<C2236941Cgu, C2236951Cgv> {
    public static final ProtoAdapter<C2236941Cgu> ADAPTER = new ProtoAdapter<C2236941Cgu>() { // from class: X.1Cgt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236941Cgu decode(ProtoReader protoReader) {
            C2236951Cgv c2236951Cgv = new C2236951Cgv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2236951Cgv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2236951Cgv.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2236951Cgv.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2236951Cgv.LJ = C1CXX.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236951Cgv.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2236951Cgv.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236951Cgv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236941Cgu c2236941Cgu) {
            C2236941Cgu c2236941Cgu2 = c2236941Cgu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2236941Cgu2.tag) + C1CXX.ADAPTER.encodedSizeWithTag(2, c2236941Cgu2.level) + protoAdapter.encodedSizeWithTag(3, c2236941Cgu2.message) + protoAdapter.encodedSizeWithTag(4, c2236941Cgu2.extra) + c2236941Cgu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236941Cgu redact(C2236941Cgu c2236941Cgu) {
            C2236951Cgv c2236951CgvNewBuilder = c2236941Cgu.newBuilder();
            c2236951CgvNewBuilder.clearUnknownFields();
            return c2236951CgvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236941Cgu c2236941Cgu) {
            C2236941Cgu c2236941Cgu2 = c2236941Cgu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236941Cgu2.tag);
            C1CXX.ADAPTER.encodeWithTag(protoWriter, 2, c2236941Cgu2.level);
            protoAdapter.encodeWithTag(protoWriter, 3, c2236941Cgu2.message);
            protoAdapter.encodeWithTag(protoWriter, 4, c2236941Cgu2.extra);
            protoWriter.writeBytes(c2236941Cgu2.unknownFields());
        }
    };
    public static final C1CXX DEFAULT_LEVEL = C1CXX.VAR_LIVE_LOG_LEVEL_VERBOSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String extra;

    @WireField(adapter = "link_mic_sdk.proto.LiveLogLevel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CXX level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String tag;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.tag.hashCode()) * 37) + this.level.hashCode()) * 37) + this.message.hashCode()) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236951Cgv newBuilder() {
        C2236951Cgv c2236951Cgv = new C2236951Cgv();
        c2236951Cgv.LIZLLL = this.tag;
        c2236951Cgv.LJ = this.level;
        c2236951Cgv.LJFF = this.message;
        c2236951Cgv.LJI = this.extra;
        c2236951Cgv.addUnknownFields(unknownFields());
        return c2236951Cgv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.replace(0, 2, "FuncParamsX3663fb29a53144e7{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236941Cgu)) {
            return false;
        }
        C2236941Cgu c2236941Cgu = (C2236941Cgu) obj;
        if (unknownFields().equals(c2236941Cgu.unknownFields()) && this.tag.equals(c2236941Cgu.tag) && this.level.equals(c2236941Cgu.level) && this.message.equals(c2236941Cgu.message) && this.extra.equals(c2236941Cgu.extra)) {
            return true;
        }
        return false;
    }

    public C2236941Cgu(String str, C1CXX c1cxx, String str2, String str3) {
        this(str, c1cxx, str2, str3, ByteString.EMPTY);
    }

    public C2236941Cgu(String str, C1CXX c1cxx, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tag = str;
        this.level = c1cxx;
        this.message = str2;
        this.extra = str3;
    }
}
