package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C548202Bs extends Message<C548202Bs, C02QG> {
    public static final ProtoAdapter<C548202Bs> ADAPTER = new ProtoAdapter<C548202Bs>() { // from class: X.028k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C548202Bs decode(ProtoReader protoReader) {
            C548202Bs c548202Bs = new C548202Bs();
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
                                        c548202Bs.default_skc_id = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c548202Bs.mini_panel_schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c548202Bs.skcs.add(C024N.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c548202Bs.skc_property_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c548202Bs.skc_property_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c548202Bs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C548202Bs c548202Bs) {
            C548202Bs c548202Bs2 = c548202Bs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c548202Bs2.skc_property_id) + protoAdapter.encodedSizeWithTag(2, c548202Bs2.skc_property_name) + C024N.ADAPTER.asRepeated().encodedSizeWithTag(3, c548202Bs2.skcs) + protoAdapter.encodedSizeWithTag(4, c548202Bs2.mini_panel_schema) + protoAdapter.encodedSizeWithTag(5, c548202Bs2.default_skc_id) + c548202Bs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C548202Bs c548202Bs) {
        }
    };
    public String default_skc_id;
    public String mini_panel_schema;
    public String skc_property_id;
    public String skc_property_name;
    public List<C024N> skcs;

    public C548202Bs() {
        super(ADAPTER, ByteString.EMPTY);
        this.skcs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
