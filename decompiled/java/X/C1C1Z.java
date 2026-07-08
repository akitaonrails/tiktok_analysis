package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1Z extends Message<C1C1Z, C2223561C1a> {
    public static final ProtoAdapter<C1C1Z> ADAPTER = new ProtoAdapter<C1C1Z>() { // from class: X.1C1Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1Z decode(ProtoReader protoReader) {
            C1C1Z c1c1z = new C1C1Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c1z.name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c1z.action = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c1z.timestamp = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1Z c1c1z) {
            C1C1Z c1c1z2 = c1c1z;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c1c1z2.timestamp);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1c1z2.action) + protoAdapter.encodedSizeWithTag(3, c1c1z2.name) + c1c1z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C1Z c1c1z) {
            C1C1Z c1c1z2 = c1c1z;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1c1z2.timestamp);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1c1z2.action);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c1z2.name);
            protoWriter.writeBytes(c1c1z2.unknownFields());
        }
    };
    public String action;
    public String name;
    public Long timestamp;

    public C1C1Z() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223561C1a newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
