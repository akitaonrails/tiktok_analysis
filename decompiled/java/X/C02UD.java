package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02UD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02UD extends Message<C02UD, C02UE> {
    public static final ProtoAdapter<C02UD> ADAPTER = new ProtoAdapter<C02UD>() { // from class: X.02UC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02UD decode(ProtoReader protoReader) {
            C02UD c02ud = new C02UD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02ud.enable_funnel_event_record = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02ud.realtime_component_config = C027S.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ud;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02UD c02ud) {
            C02UD c02ud2 = c02ud;
            return C027S.ADAPTER.encodedSizeWithTag(1, c02ud2.realtime_component_config) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c02ud2.enable_funnel_event_record) + c02ud2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02UD c02ud) {
            C02UD c02ud2 = c02ud;
            C027S.ADAPTER.encodeWithTag(protoWriter, 1, c02ud2.realtime_component_config);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c02ud2.enable_funnel_event_record);
            protoWriter.writeBytes(c02ud2.unknownFields());
        }
    };
    public Boolean enable_funnel_event_record;
    public C027S realtime_component_config;

    public C02UD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02UE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
