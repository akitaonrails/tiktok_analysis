package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C649002g4 extends Message<C649002g4, C649102g5> {
    public static final ProtoAdapter<C649002g4> ADAPTER = new ProtoAdapter<C649002g4>() { // from class: X.02g3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C649002g4 decode(ProtoReader protoReader) {
            C649002g4 c649002g4 = new C649002g4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c649002g4.user_virtual_info_str = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c649002g4.user_virtual_info_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c649002g4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C649002g4 c649002g4) {
            C649002g4 c649002g42 = c649002g4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c649002g42.user_virtual_info_id) + protoAdapter.encodedSizeWithTag(2, c649002g42.user_virtual_info_str) + c649002g42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C649002g4 c649002g4) {
        }
    };
    public String user_virtual_info_id;
    public String user_virtual_info_str;

    public C649002g4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C649102g5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
