package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229571COd extends Message<C2229571COd, C2229581COe> {
    public static final ProtoAdapter<C2229571COd> ADAPTER = new ProtoAdapter<C2229571COd>() { // from class: X.1COc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229571COd decode(ProtoReader protoReader) {
            C2229571COd c2229571COd = new C2229571COd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 100) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c2229571COd.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c2229571COd.schema = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2229571COd.button_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2229571COd.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2229571COd.title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2229571COd.logo = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229571COd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229571COd c2229571COd) {
            C2229571COd c2229571COd2 = c2229571COd;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c2229571COd2.logo);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2229571COd2.title) + protoAdapter.encodedSizeWithTag(3, c2229571COd2.sub_title) + protoAdapter.encodedSizeWithTag(4, c2229571COd2.button_text) + protoAdapter.encodedSizeWithTag(5, c2229571COd2.schema) + protoAdapter.encodedSizeWithTag(100, c2229571COd2.da_info) + c2229571COd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2229571COd c2229571COd) {
        }
    };
    public String button_text;
    public String da_info;
    public C029C logo;
    public String schema;
    public String sub_title;
    public String title;

    public C2229571COd() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2229581COe newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
