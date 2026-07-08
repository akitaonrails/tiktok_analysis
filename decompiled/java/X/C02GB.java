package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GB extends Message<C02GB, C02LS> {
    public static final ProtoAdapter<C02GB> ADAPTER = new ProtoAdapter<C02GB>() { // from class: X.02GC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GB decode(ProtoReader protoReader) {
            C02GB c02gb = new C02GB();
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
                                        c02gb.primary_btn = C632702dR.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02gb.content = C600602Vw.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02gb.schema_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02gb.show_delay_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02gb.activity_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GB c02gb) {
            C02GB c02gb2 = c02gb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02gb2.activity_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02gb2.show_delay_time) + protoAdapter.encodedSizeWithTag(3, c02gb2.schema_url) + C600602Vw.ADAPTER.encodedSizeWithTag(4, c02gb2.content) + C632702dR.ADAPTER.encodedSizeWithTag(5, c02gb2.primary_btn) + c02gb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02GB c02gb) {
            C02GB c02gb2 = c02gb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02gb2.activity_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c02gb2.show_delay_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c02gb2.schema_url);
            C600602Vw.ADAPTER.encodeWithTag(protoWriter, 4, c02gb2.content);
            C632702dR.ADAPTER.encodeWithTag(protoWriter, 5, c02gb2.primary_btn);
            protoWriter.writeBytes(c02gb2.unknownFields());
        }
    };
    public String activity_id;
    public C600602Vw content;
    public C632702dR primary_btn;
    public String schema_url;
    public Long show_delay_time;

    public C02GB() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
