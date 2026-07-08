package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248961D0s extends Message<C2248961D0s, C2248971D0t> {
    public static final ProtoAdapter<C2248961D0s> ADAPTER = new ProtoAdapter<C2248961D0s>() { // from class: X.1D0r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248961D0s decode(ProtoReader protoReader) {
            C2248971D0t c2248971D0t = new C2248971D0t();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2248971D0t.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2248971D0t.LIZLLL = C2257681DYg.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2248971D0t.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2248961D0s c2248961D0s) {
            C2248961D0s c2248961D0s2 = c2248961D0s;
            return C2257681DYg.ADAPTER.encodedSizeWithTag(1, c2248961D0s2.bot_info) + c2248961D0s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248961D0s redact(C2248961D0s c2248961D0s) {
            C2248971D0t c2248971D0tNewBuilder = c2248961D0s.newBuilder();
            C2257681DYg c2257681DYg = c2248971D0tNewBuilder.LIZLLL;
            if (c2257681DYg != null) {
                c2248971D0tNewBuilder.LIZLLL = C2257681DYg.ADAPTER.redact(c2257681DYg);
            }
            c2248971D0tNewBuilder.clearUnknownFields();
            return c2248971D0tNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2248961D0s c2248961D0s) {
            C2248961D0s c2248961D0s2 = c2248961D0s;
            C2257681DYg.ADAPTER.encodeWithTag(protoWriter, 1, c2248961D0s2.bot_info);
            protoWriter.writeBytes(c2248961D0s2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "im_bot.BotInfo#ADAPTER", tag = 1)
    public final C2257681DYg bot_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2257681DYg c2257681DYg = this.bot_info;
        int iHashCode2 = iHashCode + (c2257681DYg != null ? c2257681DYg.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2248971D0t newBuilder() {
        C2248971D0t c2248971D0t = new C2248971D0t();
        c2248971D0t.LIZLLL = this.bot_info;
        c2248971D0t.addUnknownFields(unknownFields());
        return c2248971D0t;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bot_info != null) {
            sb.append(", bot_info=");
            sb.append(this.bot_info);
        }
        sb.replace(0, 2, "AIBotValue{");
        sb.append('}');
        return sb.toString();
    }

    public C2248961D0s(C2257681DYg c2257681DYg) {
        this(c2257681DYg, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2248961D0s)) {
            return false;
        }
        C2248961D0s c2248961D0s = (C2248961D0s) obj;
        if (unknownFields().equals(c2248961D0s.unknownFields()) && C1516540pZE.LJ(this.bot_info, c2248961D0s.bot_info)) {
            return true;
        }
        return false;
    }

    public C2248961D0s(C2257681DYg c2257681DYg, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bot_info = c2257681DYg;
    }
}
