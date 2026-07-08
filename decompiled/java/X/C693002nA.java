package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C693002nA extends Message<C693002nA, C692902n9> {
    public static final ProtoAdapter<C693002nA> ADAPTER = new ProtoAdapter<C693002nA>() { // from class: X.02nB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C693002nA decode(ProtoReader protoReader) {
            C693002nA c693002nA = new C693002nA();
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
                                        c693002nA.icon_url_dark = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c693002nA.icon_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c693002nA.co_brand = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c693002nA.card_bin = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c693002nA.display_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c693002nA;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C693002nA c693002nA) {
            C693002nA c693002nA2 = c693002nA;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c693002nA2.display_name) + protoAdapter.encodedSizeWithTag(2, c693002nA2.card_bin) + protoAdapter.encodedSizeWithTag(3, c693002nA2.co_brand) + protoAdapter.encodedSizeWithTag(4, c693002nA2.icon_url) + protoAdapter.encodedSizeWithTag(5, c693002nA2.icon_url_dark) + c693002nA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C693002nA c693002nA) {
        }
    };
    public String card_bin;
    public String co_brand;
    public String display_name;
    public String icon_url;
    public String icon_url_dark;

    public C693002nA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C692902n9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
