package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C758002xe extends Message<C758002xe, C757902xd> {
    public static final ProtoAdapter<C758002xe> ADAPTER = new ProtoAdapter<C758002xe>() { // from class: X.02xf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C758002xe decode(ProtoReader protoReader) {
            C758002xe c758002xe = new C758002xe();
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
                                        c758002xe.process_config = C2223551C0z.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c758002xe.meta_info = C1CGC.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c758002xe.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c758002xe.uri = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c758002xe.ladder_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c758002xe;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C758002xe c758002xe) {
            C758002xe c758002xe2 = c758002xe;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c758002xe2.ladder_name) + protoAdapter.encodedSizeWithTag(2, c758002xe2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(3, c758002xe2.url_list) + C1CGC.ADAPTER.encodedSizeWithTag(4, c758002xe2.meta_info) + C2223551C0z.ADAPTER.encodedSizeWithTag(5, c758002xe2.process_config) + c758002xe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C758002xe c758002xe) {
            C758002xe c758002xe2 = c758002xe;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c758002xe2.ladder_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c758002xe2.uri);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c758002xe2.url_list);
            C1CGC.ADAPTER.encodeWithTag(protoWriter, 4, c758002xe2.meta_info);
            C2223551C0z.ADAPTER.encodeWithTag(protoWriter, 5, c758002xe2.process_config);
            protoWriter.writeBytes(c758002xe2.unknownFields());
        }
    };
    public String ladder_name;
    public C1CGC meta_info;
    public C2223551C0z process_config;
    public String uri;
    public List<String> url_list;

    public C758002xe() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C757902xd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
