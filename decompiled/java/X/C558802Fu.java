package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C558802Fu extends Message<C558802Fu, C02L3> {
    public static final ProtoAdapter<C558802Fu> ADAPTER = new ProtoAdapter<C558802Fu>() { // from class: X.02Ft
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C558802Fu decode(ProtoReader protoReader) {
            C558802Fu c558802Fu = new C558802Fu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c558802Fu.button_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c558802Fu.end_time = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c558802Fu.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c558802Fu.dsp_entity_infos.add(C558602Fs.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c558802Fu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C558802Fu c558802Fu) {
            C558802Fu c558802Fu2 = c558802Fu;
            return C558602Fs.ADAPTER.asRepeated().encodedSizeWithTag(1, c558802Fu2.dsp_entity_infos) + ProtoAdapter.STRING.encodedSizeWithTag(2, c558802Fu2.schema) + ProtoAdapter.INT64.encodedSizeWithTag(3, c558802Fu2.end_time) + ProtoAdapter.INT32.encodedSizeWithTag(4, c558802Fu2.button_type) + c558802Fu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C558802Fu c558802Fu) {
            C558802Fu c558802Fu2 = c558802Fu;
            C558602Fs.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c558802Fu2.dsp_entity_infos);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c558802Fu2.schema);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c558802Fu2.end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c558802Fu2.button_type);
            protoWriter.writeBytes(c558802Fu2.unknownFields());
        }
    };
    public Integer button_type;
    public List<C558602Fs> dsp_entity_infos;
    public Long end_time;
    public String schema;

    public C558802Fu() {
        super(ADAPTER, ByteString.EMPTY);
        this.dsp_entity_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02L3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
