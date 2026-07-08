package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5W extends Message<C1C5W, C1C5X> {
    public static final ProtoAdapter<C1C5W> ADAPTER = new ProtoAdapter<C1C5W>() { // from class: X.1C5V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5W decode(ProtoReader protoReader) {
            C1C5W c1c5w = new C1C5W();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 200) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c1c5w.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c1c5w.icon = C029C.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1c5w.benefit_cart_item.add(C1C5T.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1c5w.bubble_ui_config = C2223701C1o.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1c5w.sub_text_area = C1C22.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c5w.benefit_emphasis_style = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5W c1c5w) {
            C1C5W c1c5w2 = c1c5w;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1c5w2.benefit_emphasis_style) + C1C22.ADAPTER.encodedSizeWithTag(2, c1c5w2.sub_text_area) + C2223701C1o.ADAPTER.encodedSizeWithTag(3, c1c5w2.bubble_ui_config) + C1C5T.ADAPTER.asRepeated().encodedSizeWithTag(4, c1c5w2.benefit_cart_item) + C029C.ADAPTER.encodedSizeWithTag(5, c1c5w2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(200, c1c5w2.da_info) + c1c5w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C5W c1c5w) {
        }
    };
    public List<C1C5T> benefit_cart_item;
    public Integer benefit_emphasis_style;
    public C2223701C1o bubble_ui_config;
    public String da_info;
    public C029C icon;
    public C1C22 sub_text_area;

    public C1C5W() {
        super(ADAPTER, ByteString.EMPTY);
        this.benefit_cart_item = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C5X newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
