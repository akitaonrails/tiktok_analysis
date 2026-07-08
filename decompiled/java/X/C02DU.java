package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DU extends Message<C02DU, C574902Lz> {
    public static final ProtoAdapter<C02DU> ADAPTER = new ProtoAdapter<C02DU>() { // from class: X.026L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DU decode(ProtoReader protoReader) {
            C02DU c02du = new C02DU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 6) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02du.should_show = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c02du.url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02du.description = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02du.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02du.id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02du;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DU c02du) {
            C02DU c02du2 = c02du;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c02du2.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02du2.name) + protoAdapter.encodedSizeWithTag(3, c02du2.description) + protoAdapter.encodedSizeWithTag(4, c02du2.url) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c02du2.should_show) + c02du2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DU c02du) {
            C02DU c02du2 = c02du;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02du2.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02du2.name);
            protoAdapter.encodeWithTag(protoWriter, 3, c02du2.description);
            protoAdapter.encodeWithTag(protoWriter, 4, c02du2.url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c02du2.should_show);
            protoWriter.writeBytes(c02du2.unknownFields());
        }
    };
    public String description;
    public Long id;
    public String name;
    public Boolean should_show;
    public String url;

    public C02DU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574902Lz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
