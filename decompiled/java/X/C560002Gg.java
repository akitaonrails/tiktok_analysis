package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560002Gg extends Message<C560002Gg, C571102Kn> {
    public static final ProtoAdapter<C560002Gg> ADAPTER = new ProtoAdapter<C560002Gg>() { // from class: X.029E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560002Gg decode(ProtoReader protoReader) {
            C560002Gg c560002Gg = new C560002Gg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c560002Gg.enable_landing_page_preload = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c560002Gg.component_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560002Gg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560002Gg c560002Gg) {
            C560002Gg c560002Gg2 = c560002Gg;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c560002Gg2.component_key) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c560002Gg2.enable_landing_page_preload) + c560002Gg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C560002Gg c560002Gg) {
            C560002Gg c560002Gg2 = c560002Gg;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c560002Gg2.component_key);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c560002Gg2.enable_landing_page_preload);
            protoWriter.writeBytes(c560002Gg2.unknownFields());
        }
    };
    public String component_key;
    public Boolean enable_landing_page_preload;

    public C560002Gg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571102Kn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
