package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DV extends Message<C02DV, C02NA> {
    public static final ProtoAdapter<C02DV> ADAPTER = new ProtoAdapter<C02DV>() { // from class: X.027u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DV decode(ProtoReader protoReader) {
            C02DV c02dv = new C02DV();
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
                                        c02dv.icon = C029C.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02dv.link = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02dv.text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02dv.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02dv.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DV c02dv) {
            C02DV c02dv2 = c02dv;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02dv2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02dv2.name) + protoAdapter.encodedSizeWithTag(3, c02dv2.text) + protoAdapter.encodedSizeWithTag(4, c02dv2.link) + C029C.ADAPTER.encodedSizeWithTag(5, c02dv2.icon) + c02dv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DV c02dv) {
        }
    };
    public C029C icon;
    public String link;
    public String name;
    public String text;
    public Integer type;

    public C02DV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
