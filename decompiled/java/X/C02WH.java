package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WH extends Message<C02WH, C02WI> {
    public static final ProtoAdapter<C02WH> ADAPTER = new ProtoAdapter<C02WH>() { // from class: X.02WG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WH decode(ProtoReader protoReader) {
            C02WH c02wh = new C02WH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02wh.fallback_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02wh.backup_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02wh.main_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02wh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WH c02wh) {
            C02WH c02wh2 = c02wh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02wh2.main_url) + protoAdapter.encodedSizeWithTag(2, c02wh2.backup_url) + protoAdapter.encodedSizeWithTag(3, c02wh2.fallback_url) + c02wh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02WH c02wh) {
            C02WH c02wh2 = c02wh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02wh2.main_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c02wh2.backup_url);
            protoAdapter.encodeWithTag(protoWriter, 3, c02wh2.fallback_url);
            protoWriter.writeBytes(c02wh2.unknownFields());
        }
    };
    public String backup_url;
    public String fallback_url;
    public String main_url;

    public C02WH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
