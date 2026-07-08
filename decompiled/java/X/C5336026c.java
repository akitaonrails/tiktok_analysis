package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.026c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5336026c extends Message<C5336026c, C02JG> {
    public static final ProtoAdapter<C5336026c> ADAPTER = new ProtoAdapter<C5336026c>() { // from class: X.023A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5336026c decode(ProtoReader protoReader) {
            C5336026c c5336026c = new C5336026c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5336026c.tag_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5336026c.tag_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5336026c.tag_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5336026c.start = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5336026c.end = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c5336026c.tag_coord = C626902cV.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5336026c.bbox = C555902Er.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5336026c.dynamic_frame_info_list.add(C552602Dk.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5336026c.unified_tag_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5336026c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5336026c c5336026c) {
            C5336026c c5336026c2 = c5336026c;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5336026c2.tag_uid) + protoAdapter.encodedSizeWithTag(2, c5336026c2.tag_type) + protoAdapter.encodedSizeWithTag(3, c5336026c2.tag_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5336026c2.start) + protoAdapter2.encodedSizeWithTag(5, c5336026c2.end) + C626902cV.ADAPTER.encodedSizeWithTag(6, c5336026c2.tag_coord) + C555902Er.ADAPTER.encodedSizeWithTag(7, c5336026c2.bbox) + C552602Dk.ADAPTER.asRepeated().encodedSizeWithTag(8, c5336026c2.dynamic_frame_info_list) + protoAdapter.encodedSizeWithTag(9, c5336026c2.unified_tag_id) + c5336026c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5336026c c5336026c) {
            C5336026c c5336026c2 = c5336026c;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5336026c2.tag_uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c5336026c2.tag_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c5336026c2.tag_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c5336026c2.start);
            protoAdapter2.encodeWithTag(protoWriter, 5, c5336026c2.end);
            C626902cV.ADAPTER.encodeWithTag(protoWriter, 6, c5336026c2.tag_coord);
            C555902Er.ADAPTER.encodeWithTag(protoWriter, 7, c5336026c2.bbox);
            C552602Dk.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c5336026c2.dynamic_frame_info_list);
            protoAdapter.encodeWithTag(protoWriter, 9, c5336026c2.unified_tag_id);
            protoWriter.writeBytes(c5336026c2.unknownFields());
        }
    };
    public C555902Er bbox;
    public List<C552602Dk> dynamic_frame_info_list;
    public Integer end;
    public Integer start;
    public C626902cV tag_coord;
    public String tag_name;
    public String tag_type;
    public String tag_uid;
    public String unified_tag_id;

    public C5336026c() {
        super(ADAPTER, ByteString.EMPTY);
        this.dynamic_frame_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
