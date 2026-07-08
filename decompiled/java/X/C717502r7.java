package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C717502r7 extends Message<C717502r7, C717602r8> {
    public static final ProtoAdapter<C717502r7> ADAPTER = new ProtoAdapter<C717502r7>() { // from class: X.02r6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C717502r7 decode(ProtoReader protoReader) {
            C717502r7 c717502r7 = new C717502r7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c717502r7.promotion_row_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c717502r7.item_list.add(C02DO.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c717502r7.text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c717502r7.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c717502r7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C717502r7 c717502r7) {
            C717502r7 c717502r72 = c717502r7;
            return C029C.ADAPTER.encodedSizeWithTag(1, c717502r72.icon) + C5431029t.ADAPTER.encodedSizeWithTag(2, c717502r72.text) + C02DO.ADAPTER.asRepeated().encodedSizeWithTag(3, c717502r72.item_list) + ProtoAdapter.INT32.encodedSizeWithTag(4, c717502r72.promotion_row_type) + c717502r72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C717502r7 c717502r7) {
        }
    };
    public C029C icon;
    public List<C02DO> item_list;
    public Integer promotion_row_type;
    public C5431029t text;

    public C717502r7() {
        super(ADAPTER, ByteString.EMPTY);
        this.item_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C717602r8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
