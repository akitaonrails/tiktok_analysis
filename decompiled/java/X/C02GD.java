package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GD extends Message<C02GD, C02MW> {
    public static final ProtoAdapter<C02GD> ADAPTER = new ProtoAdapter<C02GD>() { // from class: X.02BS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GD decode(ProtoReader protoReader) {
            C02GD c02gd = new C02GD();
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
                                    c02gd.redirect_uri = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02gd.button_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02gd.icon_uri_dark = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02gd.icon_uri = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GD c02gd) {
            C02GD c02gd2 = c02gd;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02gd2.icon_uri) + protoAdapter.encodedSizeWithTag(2, c02gd2.icon_uri_dark) + protoAdapter.encodedSizeWithTag(3, c02gd2.button_text) + protoAdapter.encodedSizeWithTag(4, c02gd2.redirect_uri) + c02gd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GD c02gd) {
        }
    };
    public String button_text;
    public String icon_uri;
    public String icon_uri_dark;
    public String redirect_uri;

    public C02GD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
