package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223341C0e extends Message<C2223341C0e, C2223351C0f> {
    public static final ProtoAdapter<C2223341C0e> ADAPTER = new ProtoAdapter<C2223341C0e>() { // from class: X.1C0d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223341C0e decode(ProtoReader protoReader) {
            C2223341C0e c2223341C0e = new C2223341C0e();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223341C0e.icon_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2223341C0e.tag_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223341C0e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223341C0e c2223341C0e) {
            C2223341C0e c2223341C0e2 = c2223341C0e;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2223341C0e2.tag_text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c2223341C0e2.icon_type) + c2223341C0e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223341C0e c2223341C0e) {
        }
    };
    public Integer icon_type;
    public String tag_text;

    public C2223341C0e() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223351C0f newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
