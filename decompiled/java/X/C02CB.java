package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CB extends Message<C02CB, C02IS> {
    public static final ProtoAdapter<C02CB> ADAPTER = new ProtoAdapter<C02CB>() { // from class: X.02CC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CB decode(ProtoReader protoReader) {
            C02CB c02cb = new C02CB();
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
                                        c02cb.caption_anchor = C02V3.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02cb.caption_info = C635702dv.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02cb.match_info.add(C556102Et.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02cb.query_limit = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02cb.total_limit = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CB c02cb) {
            C02CB c02cb2 = c02cb;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02cb2.total_limit) + protoAdapter.encodedSizeWithTag(2, c02cb2.query_limit) + C556102Et.ADAPTER.asRepeated().encodedSizeWithTag(3, c02cb2.match_info) + C635702dv.ADAPTER.encodedSizeWithTag(4, c02cb2.caption_info) + C02V3.ADAPTER.encodedSizeWithTag(5, c02cb2.caption_anchor) + c02cb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CB c02cb) {
            C02CB c02cb2 = c02cb;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cb2.total_limit);
            protoAdapter.encodeWithTag(protoWriter, 2, c02cb2.query_limit);
            C556102Et.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c02cb2.match_info);
            C635702dv.ADAPTER.encodeWithTag(protoWriter, 4, c02cb2.caption_info);
            C02V3.ADAPTER.encodeWithTag(protoWriter, 5, c02cb2.caption_anchor);
            protoWriter.writeBytes(c02cb2.unknownFields());
        }
    };
    public C02V3 caption_anchor;
    public C635702dv caption_info;
    public List<C556102Et> match_info;
    public Integer query_limit;
    public Integer total_limit;

    public C02CB() {
        super(ADAPTER, ByteString.EMPTY);
        this.match_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
