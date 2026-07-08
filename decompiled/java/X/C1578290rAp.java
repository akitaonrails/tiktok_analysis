package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578290rAp extends Message<C1578290rAp, C1578330rAt> {
    public static final ProtoAdapter<C1578290rAp> ADAPTER = new ProtoAdapter<C1578290rAp>() { // from class: X.0rAi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578290rAp decode(ProtoReader protoReader) {
            C1578290rAp c1578290rAp = new C1578290rAp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1578290rAp.schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1578290rAp.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1578290rAp.icon = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578290rAp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578290rAp c1578290rAp) {
            C1578290rAp c1578290rAp2 = c1578290rAp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1578290rAp2.icon) + protoAdapter.encodedSizeWithTag(2, c1578290rAp2.name) + protoAdapter.encodedSizeWithTag(3, c1578290rAp2.schema) + c1578290rAp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578290rAp c1578290rAp) {
            C1578290rAp c1578290rAp2 = c1578290rAp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1578290rAp2.icon);
            protoAdapter.encodeWithTag(protoWriter, 2, c1578290rAp2.name);
            protoAdapter.encodeWithTag(protoWriter, 3, c1578290rAp2.schema);
            protoWriter.writeBytes(c1578290rAp2.unknownFields());
        }
    };
    public String icon;
    public String name;
    public String schema;

    public C1578290rAp() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1578330rAt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
