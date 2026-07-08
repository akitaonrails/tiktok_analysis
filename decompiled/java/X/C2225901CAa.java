package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225901CAa extends Message<C2225901CAa, C2225911CAb> {
    public static final ProtoAdapter<C2225901CAa> ADAPTER = new ProtoAdapter<C2225901CAa>() { // from class: X.1CAZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225901CAa decode(ProtoReader protoReader) {
            C2225901CAa c2225901CAa = new C2225901CAa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c2225901CAa.redirection_schema = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2225901CAa.genus_name = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2225901CAa.genus_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2225901CAa.species_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2225901CAa.species_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225901CAa;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225901CAa c2225901CAa) {
            C2225901CAa c2225901CAa2 = c2225901CAa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2225901CAa2.species_id) + protoAdapter.encodedSizeWithTag(2, c2225901CAa2.species_name) + protoAdapter.encodedSizeWithTag(3, c2225901CAa2.genus_id) + protoAdapter.encodedSizeWithTag(4, c2225901CAa2.genus_name) + protoAdapter.encodedSizeWithTag(5, c2225901CAa2.redirection_schema) + c2225901CAa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225901CAa c2225901CAa) {
            C2225901CAa c2225901CAa2 = c2225901CAa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2225901CAa2.species_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2225901CAa2.species_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c2225901CAa2.genus_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c2225901CAa2.genus_name);
            protoAdapter.encodeWithTag(protoWriter, 5, c2225901CAa2.redirection_schema);
            protoWriter.writeBytes(c2225901CAa2.unknownFields());
        }
    };
    public String genus_id;
    public String genus_name;
    public String redirection_schema;
    public String species_id;
    public String species_name;

    public C2225901CAa() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2225911CAb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
