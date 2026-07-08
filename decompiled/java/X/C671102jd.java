package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C671102jd extends Message<C671102jd, C671202je> {
    public static final ProtoAdapter<C671102jd> ADAPTER = new ProtoAdapter<C671102jd>() { // from class: X.02jc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C671102jd decode(ProtoReader protoReader) {
            C671102jd c671102jd = new C671102jd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c671102jd.images.add(C02U1.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c671102jd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C671102jd c671102jd) {
            C671102jd c671102jd2 = c671102jd;
            return C02U1.ADAPTER.asRepeated().encodedSizeWithTag(1, c671102jd2.images) + c671102jd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C671102jd c671102jd) {
        }
    };
    public List<C02U1> images;

    public C671102jd() {
        super(ADAPTER, ByteString.EMPTY);
        this.images = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C671202je newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
