package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C725202sM extends Message<C725202sM, C725302sN> {
    public static final ProtoAdapter<C725202sM> ADAPTER = new ProtoAdapter<C725202sM>() { // from class: X.02sL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C725202sM decode(ProtoReader protoReader) {
            C725202sM c725202sM = new C725202sM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c725202sM.horizontal = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c725202sM.vertical.add(ProtoAdapter.FLOAT.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c725202sM;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C725202sM c725202sM) {
            C725202sM c725202sM2 = c725202sM;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c725202sM2.vertical) + protoAdapter.encodedSizeWithTag(2, c725202sM2.horizontal) + c725202sM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C725202sM c725202sM) {
            C725202sM c725202sM2 = c725202sM;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c725202sM2.vertical);
            protoAdapter.encodeWithTag(protoWriter, 2, c725202sM2.horizontal);
            protoWriter.writeBytes(c725202sM2.unknownFields());
        }
    };
    public Float horizontal;
    public List<Float> vertical;

    public C725202sM() {
        super(ADAPTER, ByteString.EMPTY);
        this.vertical = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C725302sN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
