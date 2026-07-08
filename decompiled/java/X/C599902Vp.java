package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C599902Vp extends Message<C599902Vp, C600102Vr> {
    public static final ProtoAdapter<C599902Vp> ADAPTER = new ProtoAdapter<C599902Vp>() { // from class: X.02Vq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C599902Vp decode(ProtoReader protoReader) {
            C599902Vp c599902Vp = new C599902Vp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c599902Vp.border_color = C651102gP.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c599902Vp.image = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c599902Vp.default_gradient = C600302Vt.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c599902Vp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C599902Vp c599902Vp) {
            C599902Vp c599902Vp2 = c599902Vp;
            return C600302Vt.ADAPTER.encodedSizeWithTag(1, c599902Vp2.default_gradient) + C029C.ADAPTER.encodedSizeWithTag(2, c599902Vp2.image) + C651102gP.ADAPTER.encodedSizeWithTag(3, c599902Vp2.border_color) + c599902Vp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C599902Vp c599902Vp) {
        }
    };
    public C651102gP border_color;
    public C600302Vt default_gradient;
    public C029C image;

    public C599902Vp() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C600102Vr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
