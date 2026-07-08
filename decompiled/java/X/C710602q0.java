package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C710602q0 extends Message<C710602q0, C710702q1> {
    public static final ProtoAdapter<C710602q0> ADAPTER = new ProtoAdapter<C710602q0>() { // from class: X.02pz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C710602q0 decode(ProtoReader protoReader) {
            C710602q0 c710602q0 = new C710602q0();
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
                                        c710602q0.shipping_right_list.add(C5434029w.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c710602q0.shipping_rights_content = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c710602q0.shipping_service_popup = C2224771C5r.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c710602q0.service_name_list.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c710602q0.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c710602q0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C710602q0 c710602q0) {
            C710602q0 c710602q02 = c710602q0;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c710602q02.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c710602q02.service_name_list) + C2224771C5r.ADAPTER.encodedSizeWithTag(3, c710602q02.shipping_service_popup) + protoAdapter.encodedSizeWithTag(4, c710602q02.shipping_rights_content) + C5434029w.ADAPTER.asRepeated().encodedSizeWithTag(5, c710602q02.shipping_right_list) + c710602q02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C710602q0 c710602q0) {
        }
    };
    public C029C icon;
    public List<String> service_name_list;
    public List<C5434029w> shipping_right_list;
    public String shipping_rights_content;
    public C2224771C5r shipping_service_popup;

    public C710602q0() {
        super(ADAPTER, ByteString.EMPTY);
        this.service_name_list = C1516540pZE.LJIIIIZZ();
        this.shipping_right_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C710702q1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
