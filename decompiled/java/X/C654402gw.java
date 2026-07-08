package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C654402gw extends Message<C654402gw, C654502gx> {
    public static final ProtoAdapter<C654402gw> ADAPTER = new ProtoAdapter<C654402gw>() { // from class: X.02gv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C654402gw decode(ProtoReader protoReader) {
            C654402gw c654402gw = new C654402gw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c654402gw.apple_music_token = C654102gt.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c654402gw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C654402gw c654402gw) {
            C654402gw c654402gw2 = c654402gw;
            return C654102gt.ADAPTER.encodedSizeWithTag(1, c654402gw2.apple_music_token) + c654402gw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C654402gw c654402gw) {
            C654402gw c654402gw2 = c654402gw;
            C654102gt.ADAPTER.encodeWithTag(protoWriter, 1, c654402gw2.apple_music_token);
            protoWriter.writeBytes(c654402gw2.unknownFields());
        }
    };
    public C654102gt apple_music_token;

    public C654402gw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C654502gx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
