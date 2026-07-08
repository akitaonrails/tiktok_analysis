package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C635702dv extends Message<C635702dv, C635802dw> {
    public static final ProtoAdapter<C635702dv> ADAPTER = new ProtoAdapter<C635702dv>() { // from class: X.02du
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C635702dv decode(ProtoReader protoReader) {
            C635702dv c635702dv = new C635702dv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c635702dv.link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c635702dv.keyword = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c635702dv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C635702dv c635702dv) {
            C635702dv c635702dv2 = c635702dv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c635702dv2.keyword) + protoAdapter.encodedSizeWithTag(2, c635702dv2.link) + c635702dv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C635702dv c635702dv) {
            C635702dv c635702dv2 = c635702dv;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c635702dv2.keyword);
            protoAdapter.encodeWithTag(protoWriter, 2, c635702dv2.link);
            protoWriter.writeBytes(c635702dv2.unknownFields());
        }
    };
    public String keyword;
    public String link;

    public C635702dv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C635802dw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
