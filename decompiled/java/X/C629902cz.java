package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C629902cz extends Message<C629902cz, C630002d0> {
    public static final ProtoAdapter<C629902cz> ADAPTER = new ProtoAdapter<C629902cz>() { // from class: X.02cy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C629902cz decode(ProtoReader protoReader) {
            C629902cz c629902cz = new C629902cz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c629902cz.address_switch_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c629902cz.text = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c629902cz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C629902cz c629902cz) {
            C629902cz c629902cz2 = c629902cz;
            return C5431029t.ADAPTER.encodedSizeWithTag(1, c629902cz2.text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c629902cz2.address_switch_type) + c629902cz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C629902cz c629902cz) {
        }
    };
    public Integer address_switch_type;
    public C5431029t text;

    public C629902cz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C630002d0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
