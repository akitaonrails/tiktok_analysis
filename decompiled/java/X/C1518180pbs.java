package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518180pbs extends Message<C1518180pbs, C1518190pbt> {
    public static final ProtoAdapter<C1518180pbs> ADAPTER = new ProtoAdapter<C1518180pbs>() { // from class: X.0pbr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518180pbs decode(ProtoReader protoReader) {
            C1518180pbs c1518180pbs = new C1518180pbs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1518180pbs.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1518180pbs.id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518180pbs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1518180pbs c1518180pbs) {
            C1518180pbs c1518180pbs2 = c1518180pbs;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1518180pbs2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1518180pbs2.name) + c1518180pbs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1518180pbs c1518180pbs) {
            C1518180pbs c1518180pbs2 = c1518180pbs;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1518180pbs2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1518180pbs2.name);
            protoWriter.writeBytes(c1518180pbs2.unknownFields());
        }
    };
    public Long id;
    public String name;

    public C1518180pbs() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1518190pbt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
