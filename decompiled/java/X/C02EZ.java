package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EZ extends Message<C02EZ, C02LZ> {
    public static final ProtoAdapter<C02EZ> ADAPTER = new ProtoAdapter<C02EZ>() { // from class: X.027s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EZ decode(ProtoReader protoReader) {
            C02EZ c02ez = new C02EZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02ez.version = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02ez.right = ProtoAdapter.FLOAT.decode(protoReader);
                                }
                            } else {
                                c02ez.left = ProtoAdapter.FLOAT.decode(protoReader);
                            }
                        } else {
                            c02ez.bottom = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c02ez.top = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ez;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EZ c02ez) {
            C02EZ c02ez2 = c02ez;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.encodedSizeWithTag(1, c02ez2.top) + protoAdapter.encodedSizeWithTag(2, c02ez2.bottom) + protoAdapter.encodedSizeWithTag(3, c02ez2.left) + protoAdapter.encodedSizeWithTag(4, c02ez2.right) + ProtoAdapter.STRING.encodedSizeWithTag(5, c02ez2.version) + c02ez2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EZ c02ez) {
            C02EZ c02ez2 = c02ez;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ez2.top);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ez2.bottom);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ez2.left);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ez2.right);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c02ez2.version);
            protoWriter.writeBytes(c02ez2.unknownFields());
        }
    };
    public Float bottom;
    public Float left;
    public Float right;
    public Float top;
    public String version;

    public C02EZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
