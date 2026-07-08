package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223931C2l extends Message<C2223931C2l, C2223941C2m> {
    public static final ProtoAdapter<C2223931C2l> ADAPTER = new ProtoAdapter<C2223931C2l>() { // from class: X.1C2k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223931C2l decode(ProtoReader protoReader) {
            C2223931C2l c2223931C2l = new C2223931C2l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2223931C2l.species_schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2223931C2l.species_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223931C2l.species_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223931C2l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223931C2l c2223931C2l) {
            C2223931C2l c2223931C2l2 = c2223931C2l;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2223931C2l2.species_id) + protoAdapter.encodedSizeWithTag(2, c2223931C2l2.species_name) + protoAdapter.encodedSizeWithTag(3, c2223931C2l2.species_schema) + c2223931C2l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223931C2l c2223931C2l) {
            C2223931C2l c2223931C2l2 = c2223931C2l;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223931C2l2.species_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223931C2l2.species_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c2223931C2l2.species_schema);
            protoWriter.writeBytes(c2223931C2l2.unknownFields());
        }
    };
    public String species_id;
    public String species_name;
    public String species_schema;

    public C2223931C2l() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223941C2m newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
