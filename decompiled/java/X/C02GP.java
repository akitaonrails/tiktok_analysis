package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GP extends Message<C02GP, C02OD> {
    public static final ProtoAdapter<C02GP> ADAPTER = new ProtoAdapter<C02GP>() { // from class: X.02BU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GP decode(ProtoReader protoReader) {
            C02GP c02gp = new C02GP();
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
                                    c02gp.popup_icon_dark_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02gp.popup_icon_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02gp.popup_content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02gp.popup_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GP c02gp) {
            C02GP c02gp2 = c02gp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02gp2.popup_title) + protoAdapter.encodedSizeWithTag(2, c02gp2.popup_content) + protoAdapter.encodedSizeWithTag(3, c02gp2.popup_icon_url) + protoAdapter.encodedSizeWithTag(4, c02gp2.popup_icon_dark_url) + c02gp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GP c02gp) {
        }
    };
    public String popup_content;
    public String popup_icon_dark_url;
    public String popup_icon_url;
    public String popup_title;

    public C02GP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
