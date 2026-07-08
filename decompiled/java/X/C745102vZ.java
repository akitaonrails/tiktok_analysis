package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02vZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C745102vZ extends Message<C745102vZ, C745202va> {
    public static final ProtoAdapter<C745102vZ> ADAPTER = new ProtoAdapter<C745102vZ>() { // from class: X.02vY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C745102vZ decode(ProtoReader protoReader) {
            C745102vZ c745102vZ = new C745102vZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c745102vZ.display_tts_delivery = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c745102vZ.display_edt = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c745102vZ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C745102vZ c745102vZ) {
            C745102vZ c745102vZ2 = c745102vZ;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c745102vZ2.display_edt) + protoAdapter.encodedSizeWithTag(2, c745102vZ2.display_tts_delivery) + c745102vZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C745102vZ c745102vZ) {
        }
    };
    public Boolean display_edt;
    public Boolean display_tts_delivery;

    public C745102vZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C745202va newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
