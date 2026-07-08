package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551602Da extends Message<C551602Da, C02I2> {
    public static final ProtoAdapter<C551602Da> ADAPTER = new ProtoAdapter<C551602Da>() { // from class: X.027g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551602Da decode(ProtoReader protoReader) {
            C551602Da c551602Da = new C551602Da();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c551602Da.scenario = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c551602Da.appear_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c551602Da.continuous_show_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c551602Da.silence_days = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c551602Da.show_count_per_interval = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c551602Da.interval_days = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551602Da;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551602Da c551602Da) {
            C551602Da c551602Da2 = c551602Da;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c551602Da2.scenario) + protoAdapter.encodedSizeWithTag(2, c551602Da2.appear_time) + protoAdapter.encodedSizeWithTag(3, c551602Da2.continuous_show_count) + protoAdapter.encodedSizeWithTag(4, c551602Da2.silence_days) + protoAdapter.encodedSizeWithTag(5, c551602Da2.show_count_per_interval) + protoAdapter.encodedSizeWithTag(6, c551602Da2.interval_days) + c551602Da2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C551602Da c551602Da) {
            C551602Da c551602Da2 = c551602Da;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c551602Da2.scenario);
            protoAdapter.encodeWithTag(protoWriter, 2, c551602Da2.appear_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c551602Da2.continuous_show_count);
            protoAdapter.encodeWithTag(protoWriter, 4, c551602Da2.silence_days);
            protoAdapter.encodeWithTag(protoWriter, 5, c551602Da2.show_count_per_interval);
            protoAdapter.encodeWithTag(protoWriter, 6, c551602Da2.interval_days);
            protoWriter.writeBytes(c551602Da2.unknownFields());
        }
    };
    public Integer appear_time;
    public Integer continuous_show_count;
    public Integer interval_days;
    public Integer scenario;
    public Integer show_count_per_interval;
    public Integer silence_days;

    public C551602Da() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02I2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
