package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02sP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C725502sP extends Message<C725502sP, C725602sQ> {
    public static final ProtoAdapter<C725502sP> ADAPTER = new ProtoAdapter<C725502sP>() { // from class: X.02sO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C725502sP decode(ProtoReader protoReader) {
            C725502sP c725502sP = new C725502sP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c725502sP.task_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c725502sP.task_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c725502sP;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C725502sP c725502sP) {
            C725502sP c725502sP2 = c725502sP;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c725502sP2.task_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c725502sP2.task_status) + c725502sP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C725502sP c725502sP) {
            C725502sP c725502sP2 = c725502sP;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c725502sP2.task_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c725502sP2.task_status);
            protoWriter.writeBytes(c725502sP2.unknownFields());
        }
    };
    public Long task_id;
    public Integer task_status;

    public C725502sP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C725602sQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
