package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551702Db extends Message<C551702Db, C02NJ> {
    public static final ProtoAdapter<C551702Db> ADAPTER = new ProtoAdapter<C551702Db>() { // from class: X.029W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551702Db decode(ProtoReader protoReader) {
            C551702Db c551702Db = new C551702Db();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c551702Db.label_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c551702Db.background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c551702Db.font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c551702Db.font_size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c551702Db.dark_background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c551702Db.dark_font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551702Db;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551702Db c551702Db) {
            C551702Db c551702Db2 = c551702Db;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c551702Db2.label_name) + protoAdapter.encodedSizeWithTag(2, c551702Db2.background_color) + protoAdapter.encodedSizeWithTag(3, c551702Db2.font_color) + ProtoAdapter.INT32.encodedSizeWithTag(4, c551702Db2.font_size) + protoAdapter.encodedSizeWithTag(5, c551702Db2.dark_background_color) + protoAdapter.encodedSizeWithTag(6, c551702Db2.dark_font_color) + c551702Db2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551702Db c551702Db) {
        }
    };
    public String background_color;
    public String dark_background_color;
    public String dark_font_color;
    public String font_color;
    public Integer font_size;
    public String label_name;

    public C551702Db() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
