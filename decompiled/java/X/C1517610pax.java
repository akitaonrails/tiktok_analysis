package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517610pax extends Message<C1517610pax, C1517620pay> {
    public static final ProtoAdapter<C1517610pax> ADAPTER = new ProtoAdapter<C1517610pax>() { // from class: X.0paw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517610pax decode(ProtoReader protoReader) {
            C1517610pax c1517610pax = new C1517610pax();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517610pax.is_preview = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517610pax;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517610pax c1517610pax) {
            C1517610pax c1517610pax2 = c1517610pax;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1517610pax2.is_preview) + c1517610pax2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517610pax c1517610pax) {
            C1517610pax c1517610pax2 = c1517610pax;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1517610pax2.is_preview);
            protoWriter.writeBytes(c1517610pax2.unknownFields());
        }
    };
    public Boolean is_preview;

    public C1517610pax() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517620pay newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
