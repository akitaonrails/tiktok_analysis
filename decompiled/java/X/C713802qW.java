package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C713802qW extends Message<C713802qW, C713902qX> {
    public static final ProtoAdapter<C713802qW> ADAPTER = new ProtoAdapter<C713802qW>() { // from class: X.02qV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C713802qW decode(ProtoReader protoReader) {
            C713802qW c713802qW = new C713802qW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c713802qW.topic_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c713802qW;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C713802qW c713802qW) {
            C713802qW c713802qW2 = c713802qW;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c713802qW2.topic_type) + c713802qW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C713802qW c713802qW) {
            C713802qW c713802qW2 = c713802qW;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c713802qW2.topic_type);
            protoWriter.writeBytes(c713802qW2.unknownFields());
        }
    };
    public Integer topic_type;

    public C713802qW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C713902qX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
