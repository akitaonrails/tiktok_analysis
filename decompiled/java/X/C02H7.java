package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02H7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02H7 extends Message<C02H7, C569002Js> {
    public static final ProtoAdapter<C02H7> ADAPTER = new ProtoAdapter<C02H7>() { // from class: X.02H6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02H7 decode(ProtoReader protoReader) {
            C02H7 c02h7 = new C02H7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02h7.new_user_recommended_reason_entry_list.add(C02H5.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02h7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02H7 c02h7) {
            C02H7 c02h72 = c02h7;
            return C02H5.ADAPTER.asRepeated().encodedSizeWithTag(1, c02h72.new_user_recommended_reason_entry_list) + c02h72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02H7 c02h7) {
            C02H7 c02h72 = c02h7;
            C02H5.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c02h72.new_user_recommended_reason_entry_list);
            protoWriter.writeBytes(c02h72.unknownFields());
        }
    };
    public List<C02H5> new_user_recommended_reason_entry_list;

    public C02H7() {
        super(ADAPTER, ByteString.EMPTY);
        this.new_user_recommended_reason_entry_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C569002Js newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
