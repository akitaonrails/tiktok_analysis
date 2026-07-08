package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAP, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAP extends Message<C1DAP, C1DAQ> {
    public static final ProtoAdapter<C1DAP> ADAPTER = new ProtoAdapter<C1DAP>() { // from class: X.1DAO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAP decode(ProtoReader protoReader) {
            C1DAQ c1daq = new C1DAQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1daq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1daq.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1daq.LJ = C1DAG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1daq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1daq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAP c1dap) {
            C1DAP c1dap2 = c1dap;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1dap2.text) + C1DAG.ADAPTER.encodedSizeWithTag(2, c1dap2.formatted_text) + protoAdapter.encodedSizeWithTag(3, c1dap2.bubble_type) + c1dap2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DAP c1dap) {
        }
    };
    public String bubble_type;
    public C1DAG formatted_text;
    public String text;

    @Override // com.squareup.wire.Message
    public C1DAQ newBuilder() {
        return null;
    }

    public C1DAP(String str, C1DAG c1dag, String str2) {
        this(str, c1dag, str2, ByteString.EMPTY);
    }

    public C1DAP(String str, C1DAG c1dag, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.formatted_text = c1dag;
        this.bubble_type = str2;
    }
}
