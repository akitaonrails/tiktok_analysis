package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.028x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5409028x extends Message<C5409028x, C02Q3> {
    public static final ProtoAdapter<C5409028x> ADAPTER = new ProtoAdapter<C5409028x>() { // from class: X.0247
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5409028x decode(ProtoReader protoReader) {
            C5409028x c5409028x = new C5409028x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5409028x.launch_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5409028x.start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c5409028x.end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c5409028x.color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5409028x.is_bold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c5409028x.countdown_configs.add(C02CZ.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5409028x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5409028x c5409028x) {
            C5409028x c5409028x2 = c5409028x;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c5409028x2.launch_status);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c5409028x2.start_time) + protoAdapter.encodedSizeWithTag(3, c5409028x2.end_time) + C618602bA.ADAPTER.encodedSizeWithTag(4, c5409028x2.color) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c5409028x2.is_bold) + C02CZ.ADAPTER.asRepeated().encodedSizeWithTag(6, c5409028x2.countdown_configs) + c5409028x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5409028x c5409028x) {
        }
    };
    public C618602bA color;
    public List<C02CZ> countdown_configs;
    public Long end_time;
    public Boolean is_bold;
    public Integer launch_status;
    public Long start_time;

    public C5409028x() {
        super(ADAPTER, ByteString.EMPTY);
        this.countdown_configs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02Q3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
