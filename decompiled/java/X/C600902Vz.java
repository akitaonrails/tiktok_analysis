package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C600902Vz extends Message<C600902Vz, C02W0> {
    public static final ProtoAdapter<C600902Vz> ADAPTER = new ProtoAdapter<C600902Vz>() { // from class: X.02Vy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C600902Vz decode(ProtoReader protoReader) {
            C600902Vz c600902Vz = new C600902Vz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c600902Vz.incentive_operation_type = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c600902Vz.operation_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c600902Vz.operation_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c600902Vz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C600902Vz c600902Vz) {
            C600902Vz c600902Vz2 = c600902Vz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c600902Vz2.operation_id) + protoAdapter.encodedSizeWithTag(2, c600902Vz2.operation_name) + protoAdapter.encodedSizeWithTag(3, c600902Vz2.incentive_operation_type) + c600902Vz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C600902Vz c600902Vz) {
            C600902Vz c600902Vz2 = c600902Vz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c600902Vz2.operation_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c600902Vz2.operation_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c600902Vz2.incentive_operation_type);
            protoWriter.writeBytes(c600902Vz2.unknownFields());
        }
    };
    public String incentive_operation_type;
    public String operation_id;
    public String operation_name;

    public C600902Vz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02W0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
