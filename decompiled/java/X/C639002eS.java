package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C639002eS extends Message<C639002eS, C639102eT> {
    public static final ProtoAdapter<C639002eS> ADAPTER = new ProtoAdapter<C639002eS>() { // from class: X.02eR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C639002eS decode(ProtoReader protoReader) {
            C639002eS c639002eS = new C639002eS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c639002eS.dark_photos.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c639002eS.photos.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c639002eS;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C639002eS c639002eS) {
            C639002eS c639002eS2 = c639002eS;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c639002eS2.photos) + protoAdapter.asRepeated().encodedSizeWithTag(2, c639002eS2.dark_photos) + c639002eS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C639002eS c639002eS) {
        }
    };
    public List<String> dark_photos;
    public List<String> photos;

    public C639002eS() {
        super(ADAPTER, ByteString.EMPTY);
        this.photos = C1516540pZE.LJIIIIZZ();
        this.dark_photos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C639102eT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
