package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C626002cM extends Message<C626002cM, C626102cN> {
    public static final ProtoAdapter<C626002cM> ADAPTER = new ProtoAdapter<C626002cM>() { // from class: X.02cL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C626002cM decode(ProtoReader protoReader) {
            C626002cM c626002cM = new C626002cM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c626002cM.show_survey = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c626002cM.in_experiment = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c626002cM;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C626002cM c626002cM) {
            C626002cM c626002cM2 = c626002cM;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c626002cM2.in_experiment) + protoAdapter.encodedSizeWithTag(2, c626002cM2.show_survey) + c626002cM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C626002cM c626002cM) {
            C626002cM c626002cM2 = c626002cM;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c626002cM2.in_experiment);
            protoAdapter.encodeWithTag(protoWriter, 2, c626002cM2.show_survey);
            protoWriter.writeBytes(c626002cM2.unknownFields());
        }
    };
    public Boolean in_experiment;
    public Boolean show_survey;

    public C626002cM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C626102cN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
