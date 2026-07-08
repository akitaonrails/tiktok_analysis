package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C603202Ww extends Message<C603202Ww, C603302Wx> {
    public static final ProtoAdapter<C603202Ww> ADAPTER = new ProtoAdapter<C603202Ww>() { // from class: X.02Wv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C603202Ww decode(ProtoReader protoReader) {
            C603202Ww c603202Ww = new C603202Ww();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c603202Ww.module_da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c603202Ww.property_values.add(C603002Wu.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c603202Ww.property_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c603202Ww;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C603202Ww c603202Ww) {
            C603202Ww c603202Ww2 = c603202Ww;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c603202Ww2.property_name) + C603002Wu.ADAPTER.asRepeated().encodedSizeWithTag(2, c603202Ww2.property_values) + protoAdapter.encodedSizeWithTag(3, c603202Ww2.module_da_info) + c603202Ww2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C603202Ww c603202Ww) {
        }
    };
    public String module_da_info;
    public String property_name;
    public List<C603002Wu> property_values;

    public C603202Ww() {
        super(ADAPTER, ByteString.EMPTY);
        this.property_values = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C603302Wx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
