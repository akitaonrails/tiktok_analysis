package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02YA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YA extends Message<C02YA, C02YB> {
    public static final ProtoAdapter<C02YA> ADAPTER = new ProtoAdapter<C02YA>() { // from class: X.02Y9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YA decode(ProtoReader protoReader) {
            C02YA c02ya = new C02YA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ya.launch_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02ya.start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02ya.end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c02ya.color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02ya.is_bold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c02ya.countdown_configs.add(C02CZ.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c02ya.target_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c02ya.end_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02ya.start_time_ms = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02ya.end_time_ms = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ya;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YA c02ya) {
            C02YA c02ya2 = c02ya;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02ya2.launch_status);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ya2.start_time) + protoAdapter.encodedSizeWithTag(3, c02ya2.end_time) + C618602bA.ADAPTER.encodedSizeWithTag(4, c02ya2.color) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c02ya2.is_bold) + C02CZ.ADAPTER.asRepeated().encodedSizeWithTag(6, c02ya2.countdown_configs) + protoAdapter.encodedSizeWithTag(7, c02ya2.target_time) + ProtoAdapter.STRING.encodedSizeWithTag(8, c02ya2.end_toast) + protoAdapter.encodedSizeWithTag(9, c02ya2.start_time_ms) + protoAdapter.encodedSizeWithTag(10, c02ya2.end_time_ms) + c02ya2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02YA c02ya) {
        }
    };
    public C618602bA color;
    public List<C02CZ> countdown_configs;
    public Long end_time;
    public Long end_time_ms;
    public String end_toast;
    public Boolean is_bold;
    public Integer launch_status;
    public Long start_time;
    public Long start_time_ms;
    public Long target_time;

    public C02YA() {
        super(ADAPTER, ByteString.EMPTY);
        this.countdown_configs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02YB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
