package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C578602Nk extends Message<C578602Nk, C578702Nl> {
    public static final ProtoAdapter<C578602Nk> ADAPTER = new ProtoAdapter<C578602Nk>() { // from class: X.02Nj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C578602Nk decode(ProtoReader protoReader) {
            C578602Nk c578602Nk = new C578602Nk();
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
                                        c578602Nk.schema = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c578602Nk.key = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c578602Nk.type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c578602Nk.chunks.add(C554902Eh.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c578602Nk.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c578602Nk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C578602Nk c578602Nk) {
            C578602Nk c578602Nk2 = c578602Nk;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c578602Nk2.title) + C554902Eh.ADAPTER.asRepeated().encodedSizeWithTag(2, c578602Nk2.chunks) + ProtoAdapter.INT32.encodedSizeWithTag(3, c578602Nk2.type) + protoAdapter.encodedSizeWithTag(4, c578602Nk2.key) + protoAdapter.encodedSizeWithTag(5, c578602Nk2.schema) + c578602Nk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C578602Nk c578602Nk) {
        }
    };
    public List<C554902Eh> chunks;
    public String key;
    public String schema;
    public String title;
    public Integer type;

    public C578602Nk() {
        super(ADAPTER, ByteString.EMPTY);
        this.chunks = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C578702Nl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
