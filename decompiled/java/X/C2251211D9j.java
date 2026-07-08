package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251211D9j extends Message<C2251211D9j, C2251221D9k> {
    public static final ProtoAdapter<C2251211D9j> ADAPTER = new ProtoAdapter<C2251211D9j>() { // from class: X.1D9i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251211D9j decode(ProtoReader protoReader) {
            C2251211D9j c2251211D9j = new C2251211D9j();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2251211D9j.full_desc = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2251211D9j.logo = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2251211D9j.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251211D9j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251211D9j c2251211D9j) {
            C2251211D9j c2251211D9j2 = c2251211D9j;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251211D9j2.desc) + C673002jw.ADAPTER.encodedSizeWithTag(2, c2251211D9j2.logo) + protoAdapter.encodedSizeWithTag(3, c2251211D9j2.full_desc) + c2251211D9j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251211D9j c2251211D9j) {
            C2251211D9j c2251211D9j2 = c2251211D9j;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251211D9j2.desc);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c2251211D9j2.logo);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251211D9j2.full_desc);
            protoWriter.writeBytes(c2251211D9j2.unknownFields());
        }
    };
    public String desc;
    public String full_desc;
    public C673002jw logo;

    public C2251211D9j() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251221D9k newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
