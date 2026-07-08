package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02e4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C636602e4 extends Message<C636602e4, C636702e5> {
    public static final ProtoAdapter<C636602e4> ADAPTER = new ProtoAdapter<C636602e4>() { // from class: X.02e3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C636602e4 decode(ProtoReader protoReader) {
            C636602e4 c636602e4 = new C636602e4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c636602e4.business_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c636602e4.component_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c636602e4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C636602e4 c636602e4) {
            C636602e4 c636602e42 = c636602e4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c636602e42.component_key) + protoAdapter.encodedSizeWithTag(2, c636602e42.business_id) + c636602e42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C636602e4 c636602e4) {
            C636602e4 c636602e42 = c636602e4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c636602e42.component_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c636602e42.business_id);
            protoWriter.writeBytes(c636602e42.unknownFields());
        }
    };
    public String business_id;
    public String component_key;

    public C636602e4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C636702e5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
