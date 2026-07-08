package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C757702xb extends Message<C757702xb, C691902mz> {
    public static final ProtoAdapter<C757702xb> ADAPTER = new ProtoAdapter<C757702xb>() { // from class: X.02xc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C757702xb decode(ProtoReader protoReader) {
            C757702xb c757702xb = new C757702xb();
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
                                        c757702xb.pack_source_info = C760002xy.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c757702xb.expire_time = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c757702xb.ladder_infos.add(C758002xe.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c757702xb.original_meta_info = C1CGC.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c757702xb.original_uri = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c757702xb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C757702xb c757702xb) {
            C757702xb c757702xb2 = c757702xb;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c757702xb2.original_uri) + C1CGC.ADAPTER.encodedSizeWithTag(2, c757702xb2.original_meta_info) + C758002xe.ADAPTER.asRepeated().encodedSizeWithTag(3, c757702xb2.ladder_infos) + ProtoAdapter.INT64.encodedSizeWithTag(4, c757702xb2.expire_time) + C760002xy.ADAPTER.encodedSizeWithTag(5, c757702xb2.pack_source_info) + c757702xb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C757702xb c757702xb) {
            C757702xb c757702xb2 = c757702xb;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c757702xb2.original_uri);
            C1CGC.ADAPTER.encodeWithTag(protoWriter, 2, c757702xb2.original_meta_info);
            C758002xe.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c757702xb2.ladder_infos);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c757702xb2.expire_time);
            C760002xy.ADAPTER.encodeWithTag(protoWriter, 5, c757702xb2.pack_source_info);
            protoWriter.writeBytes(c757702xb2.unknownFields());
        }
    };
    public Long expire_time;
    public List<C758002xe> ladder_infos;
    public C1CGC original_meta_info;
    public String original_uri;
    public C760002xy pack_source_info;

    public C757702xb() {
        super(ADAPTER, ByteString.EMPTY);
        this.ladder_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C691902mz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
