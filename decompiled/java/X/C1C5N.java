package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5N extends Message<C1C5N, C1C5O> {
    public static final ProtoAdapter<C1C5N> ADAPTER = new ProtoAdapter<C1C5N>() { // from class: X.1C5M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5N decode(ProtoReader protoReader) {
            C1C5N c1c5n = new C1C5N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1c5n.BlindBoxInfoList.add(C1C5Q.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1c5n.gift_sub_title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c5n.normal_sub_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c5n.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5N c1c5n) {
            C1C5N c1c5n2 = c1c5n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c5n2.title) + protoAdapter.encodedSizeWithTag(2, c1c5n2.normal_sub_title) + protoAdapter.encodedSizeWithTag(3, c1c5n2.gift_sub_title) + C1C5Q.ADAPTER.asRepeated().encodedSizeWithTag(4, c1c5n2.BlindBoxInfoList) + c1c5n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C5N c1c5n) {
        }
    };
    public List<C1C5Q> BlindBoxInfoList;
    public String gift_sub_title;
    public String normal_sub_title;
    public String title;

    public C1C5N() {
        super(ADAPTER, ByteString.EMPTY);
        this.BlindBoxInfoList = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C5O newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
