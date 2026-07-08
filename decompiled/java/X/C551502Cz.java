package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551502Cz extends Message<C551502Cz, C585202Py> {
    public static final ProtoAdapter<C551502Cz> ADAPTER = new ProtoAdapter<C551502Cz>() { // from class: X.027D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551502Cz decode(ProtoReader protoReader) {
            C551502Cz c551502Cz = new C551502Cz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 200) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c551502Cz.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c551502Cz.link = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c551502Cz.background_color = C618602bA.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c551502Cz.text_color = C618602bA.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c551502Cz.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c551502Cz.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551502Cz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551502Cz c551502Cz) {
            C551502Cz c551502Cz2 = c551502Cz;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c551502Cz2.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c551502Cz2.text);
            ProtoAdapter<C618602bA> protoAdapter2 = C618602bA.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c551502Cz2.text_color) + protoAdapter2.encodedSizeWithTag(4, c551502Cz2.background_color) + protoAdapter.encodedSizeWithTag(5, c551502Cz2.link) + protoAdapter.encodedSizeWithTag(200, c551502Cz2.da_info) + c551502Cz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551502Cz c551502Cz) {
        }
    };
    public C618602bA background_color;
    public String da_info;
    public C029C icon;
    public String link;
    public String text;
    public C618602bA text_color;

    public C551502Cz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C585202Py newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
