package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HY extends Message<C02HY, C02L5> {
    public static final ProtoAdapter<C02HY> ADAPTER = new ProtoAdapter<C02HY>() { // from class: X.02HZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HY decode(ProtoReader protoReader) {
            C02HY c02hy = new C02HY();
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
                                    c02hy.store_link = C637502eD.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02hy.download_link = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02hy.deep_link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02hy.app_link = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HY c02hy) {
            C02HY c02hy2 = c02hy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02hy2.app_link) + protoAdapter.encodedSizeWithTag(2, c02hy2.deep_link) + protoAdapter.encodedSizeWithTag(3, c02hy2.download_link) + C637502eD.ADAPTER.encodedSizeWithTag(4, c02hy2.store_link) + c02hy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02HY c02hy) {
            C02HY c02hy2 = c02hy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02hy2.app_link);
            protoAdapter.encodeWithTag(protoWriter, 2, c02hy2.deep_link);
            protoAdapter.encodeWithTag(protoWriter, 3, c02hy2.download_link);
            C637502eD.ADAPTER.encodeWithTag(protoWriter, 4, c02hy2.store_link);
            protoWriter.writeBytes(c02hy2.unknownFields());
        }
    };
    public String app_link;
    public String deep_link;
    public String download_link;
    public C637502eD store_link;

    public C02HY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02L5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
