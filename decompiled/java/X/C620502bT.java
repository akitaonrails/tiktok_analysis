package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C620502bT extends Message<C620502bT, C620602bU> {
    public static final ProtoAdapter<C620502bT> ADAPTER = new ProtoAdapter<C620502bT>() { // from class: X.02bS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C620502bT decode(ProtoReader protoReader) {
            C620502bT c620502bT = new C620502bT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c620502bT.original_item_gap = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c620502bT.item_param_for_pitaya = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c620502bT;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C620502bT c620502bT) {
            C620502bT c620502bT2 = c620502bT;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c620502bT2.item_param_for_pitaya) + ProtoAdapter.INT64.encodedSizeWithTag(2, c620502bT2.original_item_gap) + c620502bT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C620502bT c620502bT) {
            C620502bT c620502bT2 = c620502bT;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c620502bT2.item_param_for_pitaya);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c620502bT2.original_item_gap);
            protoWriter.writeBytes(c620502bT2.unknownFields());
        }
    };
    public String item_param_for_pitaya;
    public Long original_item_gap;

    public C620502bT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C620602bU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
