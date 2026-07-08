package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02la, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C683202la extends Message<C683202la, C683302lb> {
    public static final ProtoAdapter<C683202la> ADAPTER = new ProtoAdapter<C683202la>() { // from class: X.02lZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C683202la decode(ProtoReader protoReader) {
            C683202la c683202la = new C683202la();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c683202la.additional_logistics_descriptions.add(C5431029t.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c683202la;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C683202la c683202la) {
            C683202la c683202la2 = c683202la;
            return C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(1, c683202la2.additional_logistics_descriptions) + c683202la2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C683202la c683202la) {
        }
    };
    public List<C5431029t> additional_logistics_descriptions;

    public C683202la() {
        super(ADAPTER, ByteString.EMPTY);
        this.additional_logistics_descriptions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C683302lb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
