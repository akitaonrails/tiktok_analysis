package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02U4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02U4 extends Message<C02U4, C02U7> {
    public static final ProtoAdapter<C02U4> ADAPTER = new ProtoAdapter<C02U4>() { // from class: X.02U3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02U4 decode(ProtoReader protoReader) {
            C02U4 c02u4 = new C02U4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02u4.is_list_item = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02u4.text = C02YP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02u4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02U4 c02u4) {
            C02U4 c02u42 = c02u4;
            return C02YP.ADAPTER.encodedSizeWithTag(1, c02u42.text) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c02u42.is_list_item) + c02u42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02U4 c02u4) {
            C02U4 c02u42 = c02u4;
            C02YP.ADAPTER.encodeWithTag(protoWriter, 1, c02u42.text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c02u42.is_list_item);
            protoWriter.writeBytes(c02u42.unknownFields());
        }
    };
    public Boolean is_list_item;
    public C02YP text;

    public C02U4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02U7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
