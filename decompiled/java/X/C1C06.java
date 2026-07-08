package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C06, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C06 extends Message<C1C06, C1C07> {
    public static final ProtoAdapter<C1C06> ADAPTER = new ProtoAdapter<C1C06>() { // from class: X.1C05
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C06 decode(ProtoReader protoReader) {
            C1C06 c1c06 = new C1C06();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c1c06.stripped_audio_preview = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1c06.video_content_rejection_reason_starling = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c06.mcc_info.add(C1C03.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1c06.rejections.add(C1518150pbp.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1c06.passed = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c06;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C06 c1c06) {
            C1C06 c1c062 = c1c06;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c1c062.passed) + C1518150pbp.ADAPTER.asRepeated().encodedSizeWithTag(2, c1c062.rejections) + C1C03.ADAPTER.asRepeated().encodedSizeWithTag(3, c1c062.mcc_info);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c1c062.video_content_rejection_reason_starling) + protoAdapter.encodedSizeWithTag(5, c1c062.stripped_audio_preview) + c1c062.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C06 c1c06) {
            C1C06 c1c062 = c1c06;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1c062.passed);
            C1518150pbp.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1c062.rejections);
            C1C03.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c1c062.mcc_info);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c1c062.video_content_rejection_reason_starling);
            protoAdapter.encodeWithTag(protoWriter, 5, c1c062.stripped_audio_preview);
            protoWriter.writeBytes(c1c062.unknownFields());
        }
    };
    public List<C1C03> mcc_info;
    public Boolean passed;
    public List<C1518150pbp> rejections;
    public String stripped_audio_preview;
    public String video_content_rejection_reason_starling;

    public C1C06() {
        super(ADAPTER, ByteString.EMPTY);
        this.rejections = C1516540pZE.LJIIIIZZ();
        this.mcc_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C07 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
