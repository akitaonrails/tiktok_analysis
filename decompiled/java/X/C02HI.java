package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HI extends Message<C02HI, C02LP> {
    public static final ProtoAdapter<C02HI> ADAPTER = new ProtoAdapter<C02HI>() { // from class: X.02HJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HI decode(ProtoReader protoReader) {
            C02HI c02hi = new C02HI();
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
                                    c02hi.second_floor_info = C02WB.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02hi.with_text_entry = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02hi.quick_shop_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02hi.quick_shop_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HI c02hi) {
            C02HI c02hi2 = c02hi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02hi2.quick_shop_url) + protoAdapter.encodedSizeWithTag(2, c02hi2.quick_shop_name) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02hi2.with_text_entry) + C02WB.ADAPTER.encodedSizeWithTag(4, c02hi2.second_floor_info) + c02hi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02HI c02hi) {
            C02HI c02hi2 = c02hi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02hi2.quick_shop_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c02hi2.quick_shop_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02hi2.with_text_entry);
            C02WB.ADAPTER.encodeWithTag(protoWriter, 4, c02hi2.second_floor_info);
            protoWriter.writeBytes(c02hi2.unknownFields());
        }
    };
    public String quick_shop_name;
    public String quick_shop_url;
    public C02WB second_floor_info;
    public Boolean with_text_entry;

    public C02HI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
