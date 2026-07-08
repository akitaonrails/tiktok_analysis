package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C670202jU extends Message<C670202jU, C670302jV> {
    public static final ProtoAdapter<C670202jU> ADAPTER = new ProtoAdapter<C670202jU>() { // from class: X.02jT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C670202jU decode(ProtoReader protoReader) {
            C670202jU c670202jU = new C670202jU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c670202jU.is_music_card = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c670202jU;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C670202jU c670202jU) {
            C670202jU c670202jU2 = c670202jU;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c670202jU2.is_music_card) + c670202jU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C670202jU c670202jU) {
            C670202jU c670202jU2 = c670202jU;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c670202jU2.is_music_card);
            protoWriter.writeBytes(c670202jU2.unknownFields());
        }
    };
    public Boolean is_music_card;

    public C670202jU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C670302jV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
