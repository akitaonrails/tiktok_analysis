package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C546102Ax extends Message<C546102Ax, C568302Jl> {
    public static final ProtoAdapter<C546102Ax> ADAPTER = new ProtoAdapter<C546102Ax>() { // from class: X.025D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C546102Ax decode(ProtoReader protoReader) {
            C546102Ax c546102Ax = new C546102Ax();
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
                                        c546102Ax.subtitle = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c546102Ax.options.add(C02AU.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c546102Ax.title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c546102Ax.type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c546102Ax.id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c546102Ax;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C546102Ax c546102Ax) {
            C546102Ax c546102Ax2 = c546102Ax;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c546102Ax2.id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c546102Ax2.type) + protoAdapter.encodedSizeWithTag(3, c546102Ax2.title) + C02AU.ADAPTER.asRepeated().encodedSizeWithTag(4, c546102Ax2.options) + protoAdapter.encodedSizeWithTag(5, c546102Ax2.subtitle) + c546102Ax2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C546102Ax c546102Ax) {
            C546102Ax c546102Ax2 = c546102Ax;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c546102Ax2.id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c546102Ax2.type);
            protoAdapter.encodeWithTag(protoWriter, 3, c546102Ax2.title);
            C02AU.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c546102Ax2.options);
            protoAdapter.encodeWithTag(protoWriter, 5, c546102Ax2.subtitle);
            protoWriter.writeBytes(c546102Ax2.unknownFields());
        }
    };
    public String id;
    public List<C02AU> options;
    public String subtitle;
    public String title;
    public Integer type;

    public C546102Ax() {
        super(ADAPTER, ByteString.EMPTY);
        this.options = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C568302Jl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
