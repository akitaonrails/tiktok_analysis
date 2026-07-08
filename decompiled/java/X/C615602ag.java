package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C615602ag extends Message<C615602ag, C615702ah> {
    public static final ProtoAdapter<C615602ag> ADAPTER = new ProtoAdapter<C615602ag>() { // from class: X.02af
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C615602ag decode(ProtoReader protoReader) {
            C615602ag c615602ag = new C615602ag();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c615602ag.filter_story_ids.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c615602ag.user_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c615602ag;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C615602ag c615602ag) {
            C615602ag c615602ag2 = c615602ag;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c615602ag2.user_id) + protoAdapter.asRepeated().encodedSizeWithTag(2, c615602ag2.filter_story_ids) + c615602ag2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C615602ag c615602ag) {
            C615602ag c615602ag2 = c615602ag;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c615602ag2.user_id);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c615602ag2.filter_story_ids);
            protoWriter.writeBytes(c615602ag2.unknownFields());
        }
    };
    public List<Long> filter_story_ids;
    public Long user_id;

    public C615602ag() {
        super(ADAPTER, ByteString.EMPTY);
        this.filter_story_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C615702ah newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
