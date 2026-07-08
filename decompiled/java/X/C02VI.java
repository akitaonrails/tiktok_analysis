package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VI extends Message<C02VI, C02VJ> {
    public static final ProtoAdapter<C02VI> ADAPTER = new ProtoAdapter<C02VI>() { // from class: X.02VH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VI decode(ProtoReader protoReader) {
            C02VI c02vi = new C02VI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vi.click_hot_area_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02vi.schema_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02vi.schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VI c02vi) {
            C02VI c02vi2 = c02vi;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02vi2.schema);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02vi2.schema_type) + protoAdapter.encodedSizeWithTag(3, c02vi2.click_hot_area_type) + c02vi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02VI c02vi) {
            C02VI c02vi2 = c02vi;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02vi2.schema);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c02vi2.schema_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c02vi2.click_hot_area_type);
            protoWriter.writeBytes(c02vi2.unknownFields());
        }
    };
    public Integer click_hot_area_type;
    public String schema;
    public Integer schema_type;

    public C02VI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
