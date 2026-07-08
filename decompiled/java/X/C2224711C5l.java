package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224711C5l extends Message<C2224711C5l, C2224721C5m> {
    public static final ProtoAdapter<C2224711C5l> ADAPTER = new ProtoAdapter<C2224711C5l>() { // from class: X.1C5k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224711C5l decode(ProtoReader protoReader) {
            C2224711C5l c2224711C5l = new C2224711C5l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c2224711C5l.background_radius = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c2224711C5l.background_dark = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2224711C5l.background_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2224711C5l.background_img = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224711C5l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224711C5l c2224711C5l) {
            C2224711C5l c2224711C5l2 = c2224711C5l;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c2224711C5l2.background_img);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2224711C5l2.background_color) + protoAdapter.encodedSizeWithTag(3, c2224711C5l2.background_dark) + ProtoAdapter.INT32.encodedSizeWithTag(4, c2224711C5l2.background_radius) + c2224711C5l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224711C5l c2224711C5l) {
        }
    };
    public String background_color;
    public String background_dark;
    public C029C background_img;
    public Integer background_radius;

    public C2224711C5l() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224721C5m newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
