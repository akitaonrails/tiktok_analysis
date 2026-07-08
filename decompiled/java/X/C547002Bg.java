package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547002Bg extends Message<C547002Bg, C02O3> {
    public static final ProtoAdapter<C547002Bg> ADAPTER = new ProtoAdapter<C547002Bg>() { // from class: X.026u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547002Bg decode(ProtoReader protoReader) {
            C547002Bg c547002Bg = new C547002Bg();
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
                                        c547002Bg.is_top_sku = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c547002Bg.prop_base_name = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c547002Bg.sale_prop_values.add(C02HB.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c547002Bg.prop_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c547002Bg.prop_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547002Bg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547002Bg c547002Bg) {
            C547002Bg c547002Bg2 = c547002Bg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c547002Bg2.prop_id) + protoAdapter.encodedSizeWithTag(2, c547002Bg2.prop_name) + C02HB.ADAPTER.asRepeated().encodedSizeWithTag(3, c547002Bg2.sale_prop_values) + protoAdapter.encodedSizeWithTag(4, c547002Bg2.prop_base_name) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c547002Bg2.is_top_sku) + c547002Bg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C547002Bg c547002Bg) {
        }
    };
    public Boolean is_top_sku;
    public String prop_base_name;
    public String prop_id;
    public String prop_name;
    public List<C02HB> sale_prop_values;

    public C547002Bg() {
        super(ADAPTER, ByteString.EMPTY);
        this.sale_prop_values = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02O3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
