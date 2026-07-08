package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C620202bQ extends Message<C620202bQ, C620302bR> {
    public static final ProtoAdapter<C620202bQ> ADAPTER = new ProtoAdapter<C620202bQ>() { // from class: X.02bP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C620202bQ decode(ProtoReader protoReader) {
            C620202bQ c620202bQ = new C620202bQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c620202bQ.can_not_cached = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c620202bQ.event_track = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c620202bQ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C620202bQ c620202bQ) {
            C620202bQ c620202bQ2 = c620202bQ;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c620202bQ2.event_track) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c620202bQ2.can_not_cached) + c620202bQ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C620202bQ c620202bQ) {
            C620202bQ c620202bQ2 = c620202bQ;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c620202bQ2.event_track);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c620202bQ2.can_not_cached);
            protoWriter.writeBytes(c620202bQ2.unknownFields());
        }
    };
    public Boolean can_not_cached;
    public String event_track;

    public C620202bQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C620302bR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
