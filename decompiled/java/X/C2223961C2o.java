package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223961C2o extends Message<C2223961C2o, C2223971C2p> {
    public static final ProtoAdapter<C2223961C2o> ADAPTER = new ProtoAdapter<C2223961C2o>() { // from class: X.1C2n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223961C2o decode(ProtoReader protoReader) {
            C2223961C2o c2223961C2o = new C2223961C2o();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c2223961C2o.nature_species_info = C2223931C2l.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223961C2o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223961C2o c2223961C2o) {
            C2223961C2o c2223961C2o2 = c2223961C2o;
            return C2223931C2l.ADAPTER.encodedSizeWithTag(1, c2223961C2o2.nature_species_info) + c2223961C2o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223961C2o c2223961C2o) {
            C2223961C2o c2223961C2o2 = c2223961C2o;
            C2223931C2l.ADAPTER.encodeWithTag(protoWriter, 1, c2223961C2o2.nature_species_info);
            protoWriter.writeBytes(c2223961C2o2.unknownFields());
        }
    };
    public C2223931C2l nature_species_info;

    public C2223961C2o() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223971C2p newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
