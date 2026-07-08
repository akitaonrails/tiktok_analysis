package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VO extends Message<C02VO, C02VP> {
    public static final ProtoAdapter<C02VO> ADAPTER = new ProtoAdapter<C02VO>() { // from class: X.02VN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VO decode(ProtoReader protoReader) {
            C02VO c02vo = new C02VO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vo.dark_icons.add(C02U1.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02vo.icons.add(C02U1.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02vo.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VO c02vo) {
            C02VO c02vo2 = c02vo;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02vo2.title);
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c02vo2.icons) + protoAdapter.asRepeated().encodedSizeWithTag(3, c02vo2.dark_icons) + c02vo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02VO c02vo) {
        }
    };
    public List<C02U1> dark_icons;
    public List<C02U1> icons;
    public String title;

    public C02VO() {
        super(ADAPTER, ByteString.EMPTY);
        this.icons = C1516540pZE.LJIIIIZZ();
        this.dark_icons = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02VP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
