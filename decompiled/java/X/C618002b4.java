package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C618002b4 extends Message<C618002b4, C618102b5> {
    public static final ProtoAdapter<C618002b4> ADAPTER = new ProtoAdapter<C618002b4>() { // from class: X.02b3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C618002b4 decode(ProtoReader protoReader) {
            C618002b4 c618002b4 = new C618002b4();
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
                                    c618002b4.color_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c618002b4.color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c618002b4.label = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c618002b4.boost_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c618002b4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C618002b4 c618002b4) {
            C618002b4 c618002b42 = c618002b4;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c618002b42.boost_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c618002b42.label) + protoAdapter.encodedSizeWithTag(3, c618002b42.color) + protoAdapter.encodedSizeWithTag(4, c618002b42.color_text) + c618002b42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C618002b4 c618002b4) {
            C618002b4 c618002b42 = c618002b4;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c618002b42.boost_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c618002b42.label);
            protoAdapter.encodeWithTag(protoWriter, 3, c618002b42.color);
            protoAdapter.encodeWithTag(protoWriter, 4, c618002b42.color_text);
            protoWriter.writeBytes(c618002b42.unknownFields());
        }
    };
    public Integer boost_type;
    public String color;
    public String color_text;
    public String label;

    public C618002b4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C618102b5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
