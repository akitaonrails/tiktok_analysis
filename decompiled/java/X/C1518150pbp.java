package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518150pbp extends Message<C1518150pbp, C1518160pbq> {
    public static final ProtoAdapter<C1518150pbp> ADAPTER = new ProtoAdapter<C1518150pbp>() { // from class: X.0pbo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518150pbp decode(ProtoReader protoReader) {
            C1518150pbp c1518150pbp = new C1518150pbp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1518150pbp.description = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1518150pbp.field = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518150pbp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1518150pbp c1518150pbp) {
            C1518150pbp c1518150pbp2 = c1518150pbp;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1518150pbp2.field) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1518150pbp2.description) + c1518150pbp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1518150pbp c1518150pbp) {
            C1518150pbp c1518150pbp2 = c1518150pbp;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1518150pbp2.field);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1518150pbp2.description);
            protoWriter.writeBytes(c1518150pbp2.unknownFields());
        }
    };
    public String description;
    public Integer field;

    public C1518150pbp() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1518160pbq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
