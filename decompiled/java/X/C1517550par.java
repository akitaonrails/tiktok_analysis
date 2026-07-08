package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0par, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517550par extends Message<C1517550par, C1517560pas> {
    public static final ProtoAdapter<C1517550par> ADAPTER = new ProtoAdapter<C1517550par>() { // from class: X.0paq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517550par decode(ProtoReader protoReader) {
            C1517550par c1517550par = new C1517550par();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1517550par.is_unlocked = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1517550par.blurred_image_info = C1517520pao.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1517550par.clear_image_info = C1517520pao.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517550par;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517550par c1517550par) {
            C1517550par c1517550par2 = c1517550par;
            ProtoAdapter<C1517520pao> protoAdapter = C1517520pao.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c1517550par2.clear_image_info) + protoAdapter.encodedSizeWithTag(2, c1517550par2.blurred_image_info) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c1517550par2.is_unlocked) + c1517550par2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517550par c1517550par) {
            C1517550par c1517550par2 = c1517550par;
            ProtoAdapter<C1517520pao> protoAdapter = C1517520pao.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c1517550par2.clear_image_info);
            protoAdapter.encodeWithTag(protoWriter, 2, c1517550par2.blurred_image_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c1517550par2.is_unlocked);
            protoWriter.writeBytes(c1517550par2.unknownFields());
        }
    };
    public C1517520pao blurred_image_info;
    public C1517520pao clear_image_info;
    public Boolean is_unlocked;

    public C1517550par() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517560pas newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
