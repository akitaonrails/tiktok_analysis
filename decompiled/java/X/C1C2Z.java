package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2Z extends Message<C1C2Z, C2223821C2a> {
    public static final ProtoAdapter<C1C2Z> ADAPTER = new ProtoAdapter<C1C2Z>() { // from class: X.1C2Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2Z decode(ProtoReader protoReader) {
            C1C2Z c1c2z = new C1C2Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1c2z.term_link = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c2z.short_address = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c2z.full_address = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c2z.create_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2Z c1c2z) {
            C1C2Z c1c2z2 = c1c2z;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c1c2z2.create_time);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1c2z2.full_address) + protoAdapter.encodedSizeWithTag(3, c1c2z2.short_address) + protoAdapter.encodedSizeWithTag(4, c1c2z2.term_link) + c1c2z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C2Z c1c2z) {
            C1C2Z c1c2z2 = c1c2z;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c2z2.create_time);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1c2z2.full_address);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c2z2.short_address);
            protoAdapter.encodeWithTag(protoWriter, 4, c1c2z2.term_link);
            protoWriter.writeBytes(c1c2z2.unknownFields());
        }
    };
    public Long create_time;
    public String full_address;
    public String short_address;
    public String term_link;

    public C1C2Z() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223821C2a newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
