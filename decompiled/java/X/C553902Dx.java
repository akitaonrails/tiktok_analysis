package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553902Dx extends Message<C553902Dx, C02I7> {
    public static final ProtoAdapter<C553902Dx> ADAPTER = new ProtoAdapter<C553902Dx>() { // from class: X.02Dw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553902Dx decode(ProtoReader protoReader) {
            C553902Dx c553902Dx = new C553902Dx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c553902Dx.interactive_rec_detail_tag_type = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c553902Dx.triggers.add(ProtoAdapter.INT32.decode(protoReader));
                        }
                    } else {
                        c553902Dx.prompt_options.add(C553702Dv.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553902Dx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553902Dx c553902Dx) {
            C553902Dx c553902Dx2 = c553902Dx;
            return C553702Dv.ADAPTER.asRepeated().encodedSizeWithTag(1, c553902Dx2.prompt_options) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, c553902Dx2.triggers) + ProtoAdapter.INT64.encodedSizeWithTag(3, c553902Dx2.interactive_rec_detail_tag_type) + c553902Dx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C553902Dx c553902Dx) {
            C553902Dx c553902Dx2 = c553902Dx;
            C553702Dv.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c553902Dx2.prompt_options);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, c553902Dx2.triggers);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c553902Dx2.interactive_rec_detail_tag_type);
            protoWriter.writeBytes(c553902Dx2.unknownFields());
        }
    };
    public Long interactive_rec_detail_tag_type;
    public List<C553702Dv> prompt_options;
    public List<Integer> triggers;

    public C553902Dx() {
        super(ADAPTER, ByteString.EMPTY);
        this.prompt_options = C1516540pZE.LJIIIIZZ();
        this.triggers = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02I7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
