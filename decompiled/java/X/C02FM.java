package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FM extends Message<C02FM, C566502It> {
    public static final ProtoAdapter<C02FM> ADAPTER = new ProtoAdapter<C02FM>() { // from class: X.029P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FM decode(ProtoReader protoReader) {
            C02FM c02fm = new C02FM();
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
                                        c02fm.icon_uri = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02fm.theme_color_code = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fm.icon_cdn_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fm.link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fm.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FM c02fm) {
            C02FM c02fm2 = c02fm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fm2.title) + protoAdapter.encodedSizeWithTag(2, c02fm2.link) + protoAdapter.encodedSizeWithTag(3, c02fm2.icon_cdn_url) + protoAdapter.encodedSizeWithTag(4, c02fm2.theme_color_code) + protoAdapter.encodedSizeWithTag(5, c02fm2.icon_uri) + c02fm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FM c02fm) {
            C02FM c02fm2 = c02fm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02fm2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c02fm2.link);
            protoAdapter.encodeWithTag(protoWriter, 3, c02fm2.icon_cdn_url);
            protoAdapter.encodeWithTag(protoWriter, 4, c02fm2.theme_color_code);
            protoAdapter.encodeWithTag(protoWriter, 5, c02fm2.icon_uri);
            protoWriter.writeBytes(c02fm2.unknownFields());
        }
    };
    public String icon_cdn_url;
    public String icon_uri;
    public String link;
    public String theme_color_code;
    public String title;

    public C02FM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C566502It newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
