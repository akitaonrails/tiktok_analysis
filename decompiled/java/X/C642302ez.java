package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C642302ez extends Message<C642302ez, C642402f0> {
    public static final ProtoAdapter<C642302ez> ADAPTER = new ProtoAdapter<C642302ez>() { // from class: X.02ey
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C642302ez decode(ProtoReader protoReader) {
            C642302ez c642302ez = new C642302ez();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c642302ez.preload_animation_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c642302ez.animation_lottie_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c642302ez;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C642302ez c642302ez) {
            C642302ez c642302ez2 = c642302ez;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c642302ez2.animation_lottie_url) + ProtoAdapter.INT32.encodedSizeWithTag(2, c642302ez2.preload_animation_type) + c642302ez2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C642302ez c642302ez) {
        }
    };
    public String animation_lottie_url;
    public Integer preload_animation_type;

    public C642302ez() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C642402f0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
