package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAM extends Message<C1DAM, C1DAN> {
    public static final ProtoAdapter<C1DAM> ADAPTER = new ProtoAdapter<C1DAM>() { // from class: X.1DAL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAM decode(ProtoReader protoReader) {
            C1DAM c1dam = new C1DAM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 6) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c1dam.da_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1dam.hide_button_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1dam.style_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1dam.button = C2263631Dir.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1dam.text = C1DAG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dam;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAM c1dam) {
            C1DAM c1dam2 = c1dam;
            int iEncodedSizeWithTag = C1DAG.ADAPTER.encodedSizeWithTag(1, c1dam2.text) + C2263631Dir.ADAPTER.encodedSizeWithTag(2, c1dam2.button) + ProtoAdapter.INT32.encodedSizeWithTag(3, c1dam2.style_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c1dam2.hide_button_text) + protoAdapter.encodedSizeWithTag(6, c1dam2.da_info) + c1dam2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DAM c1dam) {
        }
    };
    public C2263631Dir button;
    public String da_info;
    public String hide_button_text;
    public Integer style_type;
    public C1DAG text;

    public C1DAM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1DAN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
