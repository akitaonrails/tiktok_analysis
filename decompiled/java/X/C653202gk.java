package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C653202gk extends Message<C653202gk, C653302gl> {
    public static final ProtoAdapter<C653202gk> ADAPTER = new ProtoAdapter<C653202gk>() { // from class: X.02gj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C653202gk decode(ProtoReader protoReader) {
            C653202gk c653202gk = new C653202gk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c653202gk.text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c653202gk.button_style = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c653202gk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C653202gk c653202gk) {
            C653202gk c653202gk2 = c653202gk;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c653202gk2.button_style) + ProtoAdapter.STRING.encodedSizeWithTag(2, c653202gk2.text) + c653202gk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C653202gk c653202gk) {
        }
    };
    public Integer button_style;
    public String text;

    public C653202gk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C653302gl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
