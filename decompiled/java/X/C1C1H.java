package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1H extends Message<C1C1H, C1C1I> {
    public static final ProtoAdapter<C1C1H> ADAPTER = new ProtoAdapter<C1C1H>() { // from class: X.1C1G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1H decode(ProtoReader protoReader) {
            C1C1H c1c1h = new C1C1H();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c1h.is_survey_disliked = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1c1h.is_survey_liked = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1c1h.is_survey_shown = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1h;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1H c1c1h) {
            C1C1H c1c1h2 = c1c1h;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c1c1h2.is_survey_shown) + protoAdapter.encodedSizeWithTag(2, c1c1h2.is_survey_liked) + protoAdapter.encodedSizeWithTag(3, c1c1h2.is_survey_disliked) + c1c1h2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C1H c1c1h) {
            C1C1H c1c1h2 = c1c1h;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c1h2.is_survey_shown);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c1h2.is_survey_liked);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c1h2.is_survey_disliked);
            protoWriter.writeBytes(c1c1h2.unknownFields());
        }
    };
    public Boolean is_survey_disliked;
    public Boolean is_survey_liked;
    public Boolean is_survey_shown;

    @Override // com.squareup.wire.Message
    public C1C1I newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1C1H(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public C1C1H(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_survey_shown = bool;
        this.is_survey_liked = bool2;
        this.is_survey_disliked = bool3;
    }
}
