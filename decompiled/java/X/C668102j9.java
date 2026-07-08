package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02j9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C668102j9 extends Message<C668102j9, C668202jA> {
    public static final ProtoAdapter<C668102j9> ADAPTER = new ProtoAdapter<C668102j9>() { // from class: X.02j8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C668102j9 decode(ProtoReader protoReader) {
            C668102j9 c668102j9 = new C668102j9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c668102j9.show_optimized_button_icon = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c668102j9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C668102j9 c668102j9) {
            C668102j9 c668102j92 = c668102j9;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c668102j92.show_optimized_button_icon) + c668102j92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C668102j9 c668102j9) {
            C668102j9 c668102j92 = c668102j9;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c668102j92.show_optimized_button_icon);
            protoWriter.writeBytes(c668102j92.unknownFields());
        }
    };
    public Boolean show_optimized_button_icon;

    public C668102j9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C668202jA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
