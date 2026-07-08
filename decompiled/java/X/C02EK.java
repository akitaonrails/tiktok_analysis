package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EK extends Message<C02EK, C02J7> {
    public static final ProtoAdapter<C02EK> ADAPTER = new ProtoAdapter<C02EK>() { // from class: X.027i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EK decode(ProtoReader protoReader) {
            C02EK c02ek = new C02EK();
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
                                        c02ek.media_size = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02ek.share_format = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02ek.url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ek.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ek.scenario = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ek;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EK c02ek) {
            C02EK c02ek2 = c02ek;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02ek2.scenario);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02ek2.title) + protoAdapter2.encodedSizeWithTag(3, c02ek2.url) + protoAdapter.encodedSizeWithTag(4, c02ek2.share_format) + protoAdapter.encodedSizeWithTag(5, c02ek2.media_size) + c02ek2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EK c02ek) {
            C02EK c02ek2 = c02ek;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ek2.scenario);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02ek2.title);
            protoAdapter2.encodeWithTag(protoWriter, 3, c02ek2.url);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ek2.share_format);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ek2.media_size);
            protoWriter.writeBytes(c02ek2.unknownFields());
        }
    };
    public Integer media_size;
    public Integer scenario;
    public Integer share_format;
    public String title;
    public String url;

    public C02EK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02J7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
