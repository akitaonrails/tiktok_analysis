package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610010rzz extends Message<C1610010rzz, C1610030s01> {
    public static final ProtoAdapter<C1610010rzz> ADAPTER = new ProtoAdapter<C1610010rzz>() { // from class: X.0rzy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1610010rzz decode(ProtoReader protoReader) {
            C1610010rzz c1610010rzz = new C1610010rzz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1610010rzz.et_info = C1609990rzx.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1610010rzz.biz_info = C1610050s03.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1610010rzz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1610010rzz c1610010rzz) {
            C1610010rzz c1610010rzz2 = c1610010rzz;
            return C1610050s03.ADAPTER.encodedSizeWithTag(1, c1610010rzz2.biz_info) + C1609990rzx.ADAPTER.encodedSizeWithTag(2, c1610010rzz2.et_info) + c1610010rzz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1610010rzz c1610010rzz) {
            C1610010rzz c1610010rzz2 = c1610010rzz;
            C1610050s03.ADAPTER.encodeWithTag(protoWriter, 1, c1610010rzz2.biz_info);
            C1609990rzx.ADAPTER.encodeWithTag(protoWriter, 2, c1610010rzz2.et_info);
            protoWriter.writeBytes(c1610010rzz2.unknownFields());
        }
    };
    public C1610050s03 biz_info;
    public C1609990rzx et_info;

    public C1610010rzz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1610030s01 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
