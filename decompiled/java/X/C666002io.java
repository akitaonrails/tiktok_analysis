package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C666002io extends Message<C666002io, C666102ip> {
    public static final ProtoAdapter<C666002io> ADAPTER = new ProtoAdapter<C666002io>() { // from class: X.02in
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C666002io decode(ProtoReader protoReader) {
            C666002io c666002io = new C666002io();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c666002io.is_sov_urlless_enabled = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c666002io;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C666002io c666002io) {
            C666002io c666002io2 = c666002io;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c666002io2.is_sov_urlless_enabled) + c666002io2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C666002io c666002io) {
            C666002io c666002io2 = c666002io;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c666002io2.is_sov_urlless_enabled);
            protoWriter.writeBytes(c666002io2.unknownFields());
        }
    };
    public Boolean is_sov_urlless_enabled;

    public C666002io() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C666102ip newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
