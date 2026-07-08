package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C739602ug extends Message<C739602ug, C739702uh> {
    public static final ProtoAdapter<C739602ug> ADAPTER = new ProtoAdapter<C739602ug>() { // from class: X.02uf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C739602ug decode(ProtoReader protoReader) {
            C739602ug c739602ug = new C739602ug();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c739602ug.map_item_extra = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c739602ug.map_anchor_extra_list = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c739602ug;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C739602ug c739602ug) {
            C739602ug c739602ug2 = c739602ug;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c739602ug2.map_anchor_extra_list) + protoAdapter.encodedSizeWithTag(2, c739602ug2.map_item_extra) + c739602ug2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C739602ug c739602ug) {
            C739602ug c739602ug2 = c739602ug;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c739602ug2.map_anchor_extra_list);
            protoAdapter.encodeWithTag(protoWriter, 2, c739602ug2.map_item_extra);
            protoWriter.writeBytes(c739602ug2.unknownFields());
        }
    };
    public String map_anchor_extra_list;
    public String map_item_extra;

    public C739602ug() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C739702uh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
