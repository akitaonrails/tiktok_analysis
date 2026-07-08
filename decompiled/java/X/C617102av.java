package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C617102av extends Message<C617102av, C617202aw> {
    public static final ProtoAdapter<C617102av> ADAPTER = new ProtoAdapter<C617102av>() { // from class: X.02au
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C617102av decode(ProtoReader protoReader) {
            C617102av c617102av = new C617102av();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c617102av.group_release_date = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c617102av.is_new_release_song = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c617102av;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C617102av c617102av) {
            C617102av c617102av2 = c617102av;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c617102av2.is_new_release_song) + ProtoAdapter.INT64.encodedSizeWithTag(2, c617102av2.group_release_date) + c617102av2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C617102av c617102av) {
            C617102av c617102av2 = c617102av;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c617102av2.is_new_release_song);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c617102av2.group_release_date);
            protoWriter.writeBytes(c617102av2.unknownFields());
        }
    };
    public Long group_release_date;
    public Boolean is_new_release_song;

    public C617102av() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C617202aw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
