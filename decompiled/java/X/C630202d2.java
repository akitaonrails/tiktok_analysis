package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C630202d2 extends Message<C630202d2, C630302d3> {
    public static final ProtoAdapter<C630202d2> ADAPTER = new ProtoAdapter<C630202d2>() { // from class: X.02d1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C630202d2 decode(ProtoReader protoReader) {
            C630202d2 c630202d2 = new C630202d2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c630202d2.right_tag_style = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c630202d2.max_right_tags_num = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c630202d2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C630202d2 c630202d2) {
            C630202d2 c630202d22 = c630202d2;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c630202d22.max_right_tags_num) + ProtoAdapter.INT32.encodedSizeWithTag(2, c630202d22.right_tag_style) + c630202d22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C630202d2 c630202d2) {
        }
    };
    public Long max_right_tags_num;
    public Integer right_tag_style;

    public C630202d2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C630302d3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
