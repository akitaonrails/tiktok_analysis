package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C629302ct extends Message<C629302ct, C629402cu> {
    public static final ProtoAdapter<C629302ct> ADAPTER = new ProtoAdapter<C629302ct>() { // from class: X.02cs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C629302ct decode(ProtoReader protoReader) {
            C629302ct c629302ct = new C629302ct();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c629302ct.pin_point_icon = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c629302ct.zoom_level = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c629302ct;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C629302ct c629302ct) {
            C629302ct c629302ct2 = c629302ct;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c629302ct2.zoom_level) + C029C.ADAPTER.encodedSizeWithTag(2, c629302ct2.pin_point_icon) + c629302ct2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C629302ct c629302ct) {
        }
    };
    public C029C pin_point_icon;
    public Integer zoom_level;

    public C629302ct() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C629402cu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
