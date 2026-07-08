package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CW extends Message<C02CW, C566402Is> {
    public static final ProtoAdapter<C02CW> ADAPTER = new ProtoAdapter<C02CW>() { // from class: X.027Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CW decode(ProtoReader protoReader) {
            C02CW c02cw = new C02CW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02cw.story_videos.add(AnonymousClass0213.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02cw.aweme_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CW c02cw) {
            C02CW c02cw2 = c02cw;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02cw2.aweme_type) + AnonymousClass0213.ADAPTER.asRepeated().encodedSizeWithTag(2, c02cw2.story_videos) + c02cw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CW c02cw) {
            C02CW c02cw2 = c02cw;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02cw2.aweme_type);
            AnonymousClass0213.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02cw2.story_videos);
            protoWriter.writeBytes(c02cw2.unknownFields());
        }
    };
    public Integer aweme_type;
    public List<AnonymousClass0213> story_videos;

    public C02CW() {
        super(ADAPTER, ByteString.EMPTY);
        this.story_videos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C566402Is newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
