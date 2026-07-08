package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02sV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C726102sV extends Message<C726102sV, C726202sW> {
    public static final ProtoAdapter<C726102sV> ADAPTER = new ProtoAdapter<C726102sV>() { // from class: X.02sU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C726102sV decode(ProtoReader protoReader) {
            C726102sV c726102sV = new C726102sV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c726102sV.show_info_bar_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c726102sV.show_opt_out_button = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c726102sV;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C726102sV c726102sV) {
            C726102sV c726102sV2 = c726102sV;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c726102sV2.show_opt_out_button) + ProtoAdapter.INT32.encodedSizeWithTag(2, c726102sV2.show_info_bar_type) + c726102sV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C726102sV c726102sV) {
            C726102sV c726102sV2 = c726102sV;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c726102sV2.show_opt_out_button);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c726102sV2.show_info_bar_type);
            protoWriter.writeBytes(c726102sV2.unknownFields());
        }
    };
    public Integer show_info_bar_type;
    public Boolean show_opt_out_button;

    public C726102sV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C726202sW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
