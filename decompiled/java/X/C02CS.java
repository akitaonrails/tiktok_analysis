package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CS extends Message<C02CS, C02Q9> {
    public static final ProtoAdapter<C02CS> ADAPTER = new ProtoAdapter<C02CS>() { // from class: X.027E
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CS decode(ProtoReader protoReader) {
            C02CS c02cs = new C02CS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 8) {
                                            if (iNextTag != 100) {
                                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                            } else {
                                                c02cs.da_info = ProtoAdapter.STRING.decode(protoReader);
                                            }
                                        } else {
                                            c02cs.action_id = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c02cs.status = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02cs.sub_desc = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02cs.is_hide = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02cs.default_desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02cs.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CS c02cs) {
            C02CS c02cs2 = c02cs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02cs2.desc) + protoAdapter.encodedSizeWithTag(2, c02cs2.default_desc) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02cs2.is_hide) + protoAdapter.encodedSizeWithTag(4, c02cs2.sub_desc) + ProtoAdapter.INT32.encodedSizeWithTag(5, c02cs2.status) + protoAdapter.encodedSizeWithTag(8, c02cs2.action_id) + protoAdapter.encodedSizeWithTag(100, c02cs2.da_info) + c02cs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CS c02cs) {
        }
    };
    public String action_id;
    public String da_info;
    public String default_desc;
    public String desc;
    public Boolean is_hide;
    public Integer status;
    public String sub_desc;

    public C02CS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Q9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
