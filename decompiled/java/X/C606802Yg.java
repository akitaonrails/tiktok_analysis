package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C606802Yg extends Message<C606802Yg, C606902Yh> {
    public static final ProtoAdapter<C606802Yg> ADAPTER = new ProtoAdapter<C606802Yg>() { // from class: X.02Yf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C606802Yg decode(ProtoReader protoReader) {
            C606802Yg c606802Yg = new C606802Yg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c606802Yg.button_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c606802Yg.body_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c606802Yg.header_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c606802Yg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C606802Yg c606802Yg) {
            C606802Yg c606802Yg2 = c606802Yg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c606802Yg2.header_text) + protoAdapter.encodedSizeWithTag(2, c606802Yg2.body_text) + protoAdapter.encodedSizeWithTag(3, c606802Yg2.button_text) + c606802Yg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C606802Yg c606802Yg) {
        }
    };
    public String body_text;
    public String button_text;
    public String header_text;

    public C606802Yg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C606902Yh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
