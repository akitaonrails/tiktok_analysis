package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518060pbg extends Message<C1518060pbg, C1518070pbh> {
    public static final ProtoAdapter<C1518060pbg> ADAPTER = new ProtoAdapter<C1518060pbg>() { // from class: X.0pbf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518060pbg decode(ProtoReader protoReader) {
            C1518060pbg c1518060pbg = new C1518060pbg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1518060pbg.data_provider = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518060pbg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1518060pbg c1518060pbg) {
            C1518060pbg c1518060pbg2 = c1518060pbg;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1518060pbg2.data_provider) + c1518060pbg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1518060pbg c1518060pbg) {
            C1518060pbg c1518060pbg2 = c1518060pbg;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1518060pbg2.data_provider);
            protoWriter.writeBytes(c1518060pbg2.unknownFields());
        }
    };
    public String data_provider;

    public C1518060pbg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1518070pbh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
