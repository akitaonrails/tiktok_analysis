package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02RG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02RG extends Message<C02RG, C02RH> {
    public static final ProtoAdapter<C02RG> ADAPTER = new ProtoAdapter<C02RG>() { // from class: X.02RF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02RG decode(ProtoReader protoReader) {
            C02RG c02rg = new C02RG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02rg.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02rg.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02rg.author = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02rg.album = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02rg.cover_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02rg.play_urls.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02rg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02RG c02rg) {
            C02RG c02rg2 = c02rg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02rg2.id) + protoAdapter.encodedSizeWithTag(2, c02rg2.title) + protoAdapter.encodedSizeWithTag(3, c02rg2.author) + protoAdapter.encodedSizeWithTag(4, c02rg2.album) + protoAdapter.encodedSizeWithTag(5, c02rg2.cover_url) + protoAdapter.asRepeated().encodedSizeWithTag(6, c02rg2.play_urls) + c02rg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02RG c02rg) {
            C02RG c02rg2 = c02rg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02rg2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02rg2.title);
            protoAdapter.encodeWithTag(protoWriter, 3, c02rg2.author);
            protoAdapter.encodeWithTag(protoWriter, 4, c02rg2.album);
            protoAdapter.encodeWithTag(protoWriter, 5, c02rg2.cover_url);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 6, c02rg2.play_urls);
            protoWriter.writeBytes(c02rg2.unknownFields());
        }
    };
    public String album;
    public String author;
    public String cover_url;
    public String id;
    public List<String> play_urls;
    public String title;

    public C02RG() {
        super(ADAPTER, ByteString.EMPTY);
        this.play_urls = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02RH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
