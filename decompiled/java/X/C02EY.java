package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EY extends Message<C02EY, C02LV> {
    public static final ProtoAdapter<C02EY> ADAPTER = new ProtoAdapter<C02EY>() { // from class: X.028f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EY decode(ProtoReader protoReader) {
            C02EY c02ey = new C02EY();
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
                                        c02ey.max_continuous_display = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c02ey.max_exposure_daily = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c02ey.exposures = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c02ey.end_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02ey.start_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ey;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EY c02ey) {
            C02EY c02ey2 = c02ey;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c02ey2.start_time) + protoAdapter.encodedSizeWithTag(2, c02ey2.end_time) + protoAdapter.encodedSizeWithTag(3, c02ey2.exposures) + protoAdapter.encodedSizeWithTag(4, c02ey2.max_exposure_daily) + protoAdapter.encodedSizeWithTag(5, c02ey2.max_continuous_display) + c02ey2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EY c02ey) {
            C02EY c02ey2 = c02ey;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ey2.start_time);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ey2.end_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ey2.exposures);
            protoAdapter.encodeWithTag(protoWriter, 4, c02ey2.max_exposure_daily);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ey2.max_continuous_display);
            protoWriter.writeBytes(c02ey2.unknownFields());
        }
    };
    public Long end_time;
    public Long exposures;
    public Long max_continuous_display;
    public Long max_exposure_daily;
    public Long start_time;

    public C02EY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
