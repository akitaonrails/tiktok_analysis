package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02r0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C716802r0 extends Message<C716802r0, C716902r1> {
    public static final ProtoAdapter<C716802r0> ADAPTER = new ProtoAdapter<C716802r0>() { // from class: X.02qz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C716802r0 decode(ProtoReader protoReader) {
            C716802r0 c716802r0 = new C716802r0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c716802r0.vc_filter_attr = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c716802r0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C716802r0 c716802r0) {
            C716802r0 c716802r02 = c716802r0;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c716802r02.vc_filter_attr) + c716802r02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C716802r0 c716802r0) {
            C716802r0 c716802r02 = c716802r0;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c716802r02.vc_filter_attr);
            protoWriter.writeBytes(c716802r02.unknownFields());
        }
    };
    public String vc_filter_attr;

    public C716802r0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C716902r1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
