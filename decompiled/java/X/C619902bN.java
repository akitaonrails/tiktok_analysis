package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C619902bN extends Message<C619902bN, C620002bO> {
    public static final ProtoAdapter<C619902bN> ADAPTER = new ProtoAdapter<C619902bN>() { // from class: X.02bM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C619902bN decode(ProtoReader protoReader) {
            C619902bN c619902bN = new C619902bN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c619902bN.sticker_style = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c619902bN.music_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c619902bN;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C619902bN c619902bN) {
            C619902bN c619902bN2 = c619902bN;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c619902bN2.music_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c619902bN2.sticker_style) + c619902bN2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C619902bN c619902bN) {
            C619902bN c619902bN2 = c619902bN;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c619902bN2.music_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c619902bN2.sticker_style);
            protoWriter.writeBytes(c619902bN2.unknownFields());
        }
    };
    public String music_id;
    public Integer sticker_style;

    public C619902bN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C620002bO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
