package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243521CrW extends Message<C2243521CrW, C2243511CrV> {
    public static final ProtoAdapter<C2243521CrW> ADAPTER = new ProtoAdapter<C2243521CrW>() { // from class: X.1CrX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243521CrW decode(ProtoReader protoReader) {
            C2243511CrV c2243511CrV = new C2243511CrV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2243511CrV.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2243511CrV.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2243511CrV.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2243511CrV.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243511CrV.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243521CrW c2243521CrW) {
            C2243521CrW c2243521CrW2 = c2243521CrW;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2243521CrW2.text) + protoAdapter.encodedSizeWithTag(2, c2243521CrW2.sender_starling) + protoAdapter.encodedSizeWithTag(3, c2243521CrW2.receiver_starling) + c2243521CrW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243521CrW redact(C2243521CrW c2243521CrW) {
            C2243511CrV c2243511CrVNewBuilder = c2243521CrW.newBuilder();
            c2243511CrVNewBuilder.clearUnknownFields();
            return c2243511CrVNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243521CrW c2243521CrW) {
            C2243521CrW c2243521CrW2 = c2243521CrW;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2243521CrW2.text);
            protoAdapter.encodeWithTag(protoWriter, 2, c2243521CrW2.sender_starling);
            protoAdapter.encodeWithTag(protoWriter, 3, c2243521CrW2.receiver_starling);
            protoWriter.writeBytes(c2243521CrW2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String receiver_starling;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String sender_starling;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sender_starling;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.receiver_starling;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2243511CrV newBuilder() {
        C2243511CrV c2243511CrV = new C2243511CrV();
        c2243511CrV.LIZLLL = this.text;
        c2243511CrV.LJ = this.sender_starling;
        c2243511CrV.LJFF = this.receiver_starling;
        c2243511CrV.addUnknownFields(unknownFields());
        return c2243511CrV;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.sender_starling != null) {
            sb.append(", sender_starling=");
            sb.append(this.sender_starling);
        }
        if (this.receiver_starling != null) {
            sb.append(", receiver_starling=");
            sb.append(this.receiver_starling);
        }
        sb.replace(0, 2, "BaseText{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243521CrW)) {
            return false;
        }
        C2243521CrW c2243521CrW = (C2243521CrW) obj;
        if (unknownFields().equals(c2243521CrW.unknownFields()) && C1516540pZE.LJ(this.text, c2243521CrW.text) && C1516540pZE.LJ(this.sender_starling, c2243521CrW.sender_starling) && C1516540pZE.LJ(this.receiver_starling, c2243521CrW.receiver_starling)) {
            return true;
        }
        return false;
    }

    public C2243521CrW(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public C2243521CrW(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.sender_starling = str2;
        this.receiver_starling = str3;
    }
}
