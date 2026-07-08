package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C7L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7L extends Message<C1C7L, C1C7M> {
    public static final ProtoAdapter<C1C7L> ADAPTER = new ProtoAdapter<C1C7L>() { // from class: X.1C7K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C7L decode(ProtoReader protoReader) {
            C1C7L c1c7l = new C1C7L();
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
                                        c1c7l.show_sale_prop_id = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1c7l.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c7l.schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c7l.has_info_icon = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1c7l.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c7l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C7L c1c7l) {
            C1C7L c1c7l2 = c1c7l;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c7l2.text) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c1c7l2.has_info_icon) + protoAdapter.encodedSizeWithTag(3, c1c7l2.schema) + protoAdapter.encodedSizeWithTag(4, c1c7l2.da_info) + protoAdapter.encodedSizeWithTag(5, c1c7l2.show_sale_prop_id) + c1c7l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C7L c1c7l) {
        }
    };
    public String da_info;
    public Boolean has_info_icon;
    public String schema;
    public String show_sale_prop_id;
    public String text;

    public C1C7L() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C7M newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
