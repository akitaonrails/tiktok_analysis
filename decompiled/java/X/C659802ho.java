package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C659802ho extends Message<C659802ho, C659902hp> {
    public static final ProtoAdapter<C659802ho> ADAPTER = new ProtoAdapter<C659802ho>() { // from class: X.02hn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C659802ho decode(ProtoReader protoReader) {
            C659802ho c659802ho = new C659802ho();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 100) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c659802ho.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c659802ho.exposure_insurance_info_list.add(AnonymousClass0226.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c659802ho.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c659802ho;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C659802ho c659802ho) {
            C659802ho c659802ho2 = c659802ho;
            return C029C.ADAPTER.encodedSizeWithTag(1, c659802ho2.icon) + AnonymousClass0226.ADAPTER.asRepeated().encodedSizeWithTag(2, c659802ho2.exposure_insurance_info_list) + ProtoAdapter.STRING.encodedSizeWithTag(100, c659802ho2.da_info) + c659802ho2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C659802ho c659802ho) {
        }
    };
    public String da_info;
    public List<AnonymousClass0226> exposure_insurance_info_list;
    public C029C icon;

    public C659802ho() {
        super(ADAPTER, ByteString.EMPTY);
        this.exposure_insurance_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C659902hp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
