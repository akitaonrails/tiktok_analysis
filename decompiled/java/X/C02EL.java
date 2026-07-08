package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EL extends Message<C02EL, C02JL> {
    public static final ProtoAdapter<C02EL> ADAPTER = new ProtoAdapter<C02EL>() { // from class: X.027j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EL decode(ProtoReader protoReader) {
            C02EL c02el = new C02EL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02el.original_index = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02el.original_sec_author_id = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02el.original_item_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02el.original_author_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02el.original_author_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02el;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EL c02el) {
            C02EL c02el2 = c02el;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02el2.original_author_id) + protoAdapter.encodedSizeWithTag(2, c02el2.original_author_name) + protoAdapter.encodedSizeWithTag(3, c02el2.original_item_id) + protoAdapter.encodedSizeWithTag(4, c02el2.original_sec_author_id) + ProtoAdapter.INT32.encodedSizeWithTag(5, c02el2.original_index) + c02el2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EL c02el) {
            C02EL c02el2 = c02el;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02el2.original_author_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02el2.original_author_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c02el2.original_item_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c02el2.original_sec_author_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c02el2.original_index);
            protoWriter.writeBytes(c02el2.unknownFields());
        }
    };
    public String original_author_id;
    public String original_author_name;
    public Integer original_index;
    public String original_item_id;
    public String original_sec_author_id;

    public C02EL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
