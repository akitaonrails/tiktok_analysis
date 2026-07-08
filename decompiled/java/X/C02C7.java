package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C7 extends Message<C02C7, C02NM> {
    public static final ProtoAdapter<C02C7> ADAPTER = new ProtoAdapter<C02C7>() { // from class: X.027e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C7 decode(ProtoReader protoReader) {
            C02C7 c02c7 = new C02C7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02c7.un_selected_toast = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02c7.sns_period_info_list.add(C02EA.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02c7.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C7 c02c7) {
            C02C7 c02c72 = c02c7;
            return C5431029t.ADAPTER.encodedSizeWithTag(1, c02c72.title) + C02EA.ADAPTER.asRepeated().encodedSizeWithTag(2, c02c72.sns_period_info_list) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02c72.un_selected_toast) + c02c72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02C7 c02c7) {
        }
    };
    public List<C02EA> sns_period_info_list;
    public C5431029t title;
    public String un_selected_toast;

    public C02C7() {
        super(ADAPTER, ByteString.EMPTY);
        this.sns_period_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
