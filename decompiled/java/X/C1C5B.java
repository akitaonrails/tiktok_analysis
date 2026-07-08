package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5B extends Message<C1C5B, C1C5C> {
    public static final ProtoAdapter<C1C5B> ADAPTER = new ProtoAdapter<C1C5B>() { // from class: X.1C5A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5B decode(ProtoReader protoReader) {
            C1C5B c1c5b = new C1C5B();
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
                                        c1c5b.process_config = C1C15.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1c5b.meta_info = C1C5H.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1c5b.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c1c5b.uri = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c5b.ladder_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5B c1c5b) {
            C1C5B c1c5b2 = c1c5b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c5b2.ladder_name) + protoAdapter.encodedSizeWithTag(2, c1c5b2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(3, c1c5b2.url_list) + C1C5H.ADAPTER.encodedSizeWithTag(4, c1c5b2.meta_info) + C1C15.ADAPTER.encodedSizeWithTag(5, c1c5b2.process_config) + c1c5b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C5B c1c5b) {
            C1C5B c1c5b2 = c1c5b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c5b2.ladder_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c5b2.uri);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c1c5b2.url_list);
            C1C5H.ADAPTER.encodeWithTag(protoWriter, 4, c1c5b2.meta_info);
            C1C15.ADAPTER.encodeWithTag(protoWriter, 5, c1c5b2.process_config);
            protoWriter.writeBytes(c1c5b2.unknownFields());
        }
    };
    public String ladder_name;
    public C1C5H meta_info;
    public C1C15 process_config;
    public String uri;
    public List<String> url_list;

    public C1C5B() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C5C newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
