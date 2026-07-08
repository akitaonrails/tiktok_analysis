package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0264, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0264 extends Message<AnonymousClass0264, C02KG> {
    public static final ProtoAdapter<AnonymousClass0264> ADAPTER = new ProtoAdapter<AnonymousClass0264>() { // from class: X.023B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0264 decode(ProtoReader protoReader) {
            AnonymousClass0264 anonymousClass0264 = new AnonymousClass0264();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0264.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0264.author = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0264.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0264.h5_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0264.cover_medium = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0264.performers.add(C559302Fz.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            anonymousClass0264.chorus_info = C627502cb.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0264.full_duration = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0264.label_ids.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0264;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0264 anonymousClass0264) {
            AnonymousClass0264 anonymousClass02642 = anonymousClass0264;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02642.id) + protoAdapter.encodedSizeWithTag(2, anonymousClass02642.author) + protoAdapter.encodedSizeWithTag(3, anonymousClass02642.title) + protoAdapter.encodedSizeWithTag(4, anonymousClass02642.h5_url) + C673002jw.ADAPTER.encodedSizeWithTag(5, anonymousClass02642.cover_medium) + C559302Fz.ADAPTER.asRepeated().encodedSizeWithTag(6, anonymousClass02642.performers) + C627502cb.ADAPTER.encodedSizeWithTag(7, anonymousClass02642.chorus_info);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, anonymousClass02642.full_duration) + protoAdapter2.asRepeated().encodedSizeWithTag(9, anonymousClass02642.label_ids) + anonymousClass02642.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0264 anonymousClass0264) {
            AnonymousClass0264 anonymousClass02642 = anonymousClass0264;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02642.id);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02642.author);
            protoAdapter.encodeWithTag(protoWriter, 3, anonymousClass02642.title);
            protoAdapter.encodeWithTag(protoWriter, 4, anonymousClass02642.h5_url);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, anonymousClass02642.cover_medium);
            C559302Fz.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, anonymousClass02642.performers);
            C627502cb.ADAPTER.encodeWithTag(protoWriter, 7, anonymousClass02642.chorus_info);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 8, anonymousClass02642.full_duration);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 9, anonymousClass02642.label_ids);
            protoWriter.writeBytes(anonymousClass02642.unknownFields());
        }
    };
    public String author;
    public C627502cb chorus_info;
    public C673002jw cover_medium;
    public Integer full_duration;
    public String h5_url;
    public String id;
    public List<Integer> label_ids;
    public List<C559302Fz> performers;
    public String title;

    public AnonymousClass0264() {
        super(ADAPTER, ByteString.EMPTY);
        this.performers = C1516540pZE.LJIIIIZZ();
        this.label_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
