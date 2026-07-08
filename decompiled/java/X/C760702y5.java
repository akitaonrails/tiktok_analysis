package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C760702y5 extends Message<C760702y5, C760802y6> {
    public static final ProtoAdapter<C760702y5> ADAPTER = new ProtoAdapter<C760702y5>() { // from class: X.02y4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C760702y5 decode(ProtoReader protoReader) {
            C760702y5 c760702y5 = new C760702y5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c760702y5.need_survey_info = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c760702y5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C760702y5 c760702y5) {
            C760702y5 c760702y52 = c760702y5;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c760702y52.need_survey_info) + c760702y52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C760702y5 c760702y5) {
            C760702y5 c760702y52 = c760702y5;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c760702y52.need_survey_info);
            protoWriter.writeBytes(c760702y52.unknownFields());
        }
    };
    public Boolean need_survey_info;

    @Override // com.squareup.wire.Message
    public C760802y6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C760702y5(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public C760702y5(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_survey_info = bool;
    }
}
