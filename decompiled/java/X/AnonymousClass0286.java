package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0286, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0286 extends Message<AnonymousClass0286, C02K4> {
    public static final ProtoAdapter<AnonymousClass0286> ADAPTER = new ProtoAdapter<AnonymousClass0286>() { // from class: X.023h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0286 decode(ProtoReader protoReader) {
            AnonymousClass0286 anonymousClass0286 = new AnonymousClass0286();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0286.id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0286.author = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0286.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0286.mixed_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0286.mixed_author = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0286.artist_infos.add(C5344026k.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            anonymousClass0286.uncert_artist_infos.add(C675202kI.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            anonymousClass0286.cover_medium = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0286;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0286 anonymousClass0286) {
            AnonymousClass0286 anonymousClass02862 = anonymousClass0286;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, anonymousClass02862.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, anonymousClass02862.author) + protoAdapter.encodedSizeWithTag(3, anonymousClass02862.title) + protoAdapter.encodedSizeWithTag(4, anonymousClass02862.mixed_title) + protoAdapter.encodedSizeWithTag(5, anonymousClass02862.mixed_author) + C5344026k.ADAPTER.asRepeated().encodedSizeWithTag(6, anonymousClass02862.artist_infos) + C675202kI.ADAPTER.asRepeated().encodedSizeWithTag(7, anonymousClass02862.uncert_artist_infos) + C673002jw.ADAPTER.encodedSizeWithTag(8, anonymousClass02862.cover_medium) + anonymousClass02862.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0286 anonymousClass0286) {
            AnonymousClass0286 anonymousClass02862 = anonymousClass0286;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, anonymousClass02862.id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02862.author);
            protoAdapter.encodeWithTag(protoWriter, 3, anonymousClass02862.title);
            protoAdapter.encodeWithTag(protoWriter, 4, anonymousClass02862.mixed_title);
            protoAdapter.encodeWithTag(protoWriter, 5, anonymousClass02862.mixed_author);
            C5344026k.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, anonymousClass02862.artist_infos);
            C675202kI.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, anonymousClass02862.uncert_artist_infos);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 8, anonymousClass02862.cover_medium);
            protoWriter.writeBytes(anonymousClass02862.unknownFields());
        }
    };
    public List<C5344026k> artist_infos;
    public String author;
    public C673002jw cover_medium;
    public Long id;
    public String mixed_author;
    public String mixed_title;
    public String title;
    public List<C675202kI> uncert_artist_infos;

    public AnonymousClass0286() {
        super(ADAPTER, ByteString.EMPTY);
        this.artist_infos = C1516540pZE.LJIIIIZZ();
        this.uncert_artist_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02K4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
