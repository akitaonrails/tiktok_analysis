package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C664802ic extends Message<C664802ic, C664902id> {
    public static final ProtoAdapter<C664802ic> ADAPTER = new ProtoAdapter<C664802ic>() { // from class: X.02ib
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C664802ic decode(ProtoReader protoReader) {
            C664802ic c664802ic = new C664802ic();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c664802ic.tako_bubble_enable = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c664802ic;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C664802ic c664802ic) {
            C664802ic c664802ic2 = c664802ic;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c664802ic2.tako_bubble_enable) + c664802ic2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C664802ic c664802ic) {
            C664802ic c664802ic2 = c664802ic;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c664802ic2.tako_bubble_enable);
            protoWriter.writeBytes(c664802ic2.unknownFields());
        }
    };
    public Boolean tako_bubble_enable;

    public C664802ic() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C664902id newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
