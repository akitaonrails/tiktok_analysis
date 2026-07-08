package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5E, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5E extends Message<C1C5E, C1C5F> {
    public static final ProtoAdapter<C1C5E> ADAPTER = new ProtoAdapter<C1C5E>() { // from class: X.1C5D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5E decode(ProtoReader protoReader) {
            C1C5E c1c5e = new C1C5E();
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
                                        c1c5e.pack_source_info = C2223991C2r.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1c5e.expire_time = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1c5e.ladder_infos.add(C1C5B.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1c5e.original_meta_info = C1C5H.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c5e.original_uri = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5E c1c5e) {
            C1C5E c1c5e2 = c1c5e;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c5e2.original_uri) + C1C5H.ADAPTER.encodedSizeWithTag(2, c1c5e2.original_meta_info) + C1C5B.ADAPTER.asRepeated().encodedSizeWithTag(3, c1c5e2.ladder_infos) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1c5e2.expire_time) + C2223991C2r.ADAPTER.encodedSizeWithTag(5, c1c5e2.pack_source_info) + c1c5e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C5E c1c5e) {
            C1C5E c1c5e2 = c1c5e;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1c5e2.original_uri);
            C1C5H.ADAPTER.encodeWithTag(protoWriter, 2, c1c5e2.original_meta_info);
            C1C5B.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c1c5e2.ladder_infos);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c1c5e2.expire_time);
            C2223991C2r.ADAPTER.encodeWithTag(protoWriter, 5, c1c5e2.pack_source_info);
            protoWriter.writeBytes(c1c5e2.unknownFields());
        }
    };
    public Long expire_time;
    public List<C1C5B> ladder_infos;
    public C1C5H original_meta_info;
    public String original_uri;
    public C2223991C2r pack_source_info;

    public C1C5E() {
        super(ADAPTER, ByteString.EMPTY);
        this.ladder_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C5F newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
