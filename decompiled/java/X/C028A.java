package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.028A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C028A extends Message<C028A, C02OC> {
    public static final ProtoAdapter<C028A> ADAPTER = new ProtoAdapter<C028A>() { // from class: X.025N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C028A decode(ProtoReader protoReader) {
            C028A c028a = new C028A();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c028a.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c028a.duration = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 3:
                            c028a.post_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c028a.media_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c028a.video_infos.add(C02BL.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c028a.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c028a.video_info_opt = C2251421DAe.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c028a.extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c028a;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C028A c028a) {
            C028A c028a2 = c028a;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c028a2.id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, c028a2.duration) + protoAdapter.encodedSizeWithTag(3, c028a2.post_url) + protoAdapter.encodedSizeWithTag(4, c028a2.media_type) + C02BL.ADAPTER.asRepeated().encodedSizeWithTag(5, c028a2.video_infos) + protoAdapter.encodedSizeWithTag(6, c028a2.da_info) + C2251421DAe.ADAPTER.encodedSizeWithTag(7, c028a2.video_info_opt) + protoAdapter.encodedSizeWithTag(8, c028a2.extra_info) + c028a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C028A c028a) {
        }
    };
    public String da_info;
    public Double duration;
    public String extra_info;
    public String id;
    public String media_type;
    public String post_url;
    public C2251421DAe video_info_opt;
    public List<C02BL> video_infos;

    public C028A() {
        super(ADAPTER, ByteString.EMPTY);
        this.video_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02OC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
