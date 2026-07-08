package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Z7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02Z7 extends Message<C02Z7, C02ZB> {
    public static final ProtoAdapter<C02Z7> ADAPTER = new ProtoAdapter<C02Z7>() { // from class: X.02Z8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02Z7 decode(ProtoReader protoReader) {
            C02Z7 c02z7 = new C02Z7();
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
                                        c02z7.use_server_link = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c02z7.alignment = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02z7.link = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02z7.icon = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02z7.size = C644102fH.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02z7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02Z7 c02z7) {
            C02Z7 c02z72 = c02z7;
            return C644102fH.ADAPTER.encodedSizeWithTag(1, c02z72.size) + C029C.ADAPTER.encodedSizeWithTag(2, c02z72.icon) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02z72.link) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02z72.alignment) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c02z72.use_server_link) + c02z72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02Z7 c02z7) {
        }
    };
    public Integer alignment;
    public C029C icon;
    public String link;
    public C644102fH size;
    public Boolean use_server_link;

    public C02Z7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ZB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
