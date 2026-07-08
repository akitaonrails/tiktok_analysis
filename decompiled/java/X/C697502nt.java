package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C697502nt extends Message<C697502nt, C697402ns> {
    public static final ProtoAdapter<C697502nt> ADAPTER = new ProtoAdapter<C697502nt>() { // from class: X.02nu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C697502nt decode(ProtoReader protoReader) {
            C697502nt c697502nt = new C697502nt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 100) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c697502nt.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c697502nt.format_token = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c697502nt.additional_logistics_descriptions.add(C5431029t.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c697502nt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C697502nt c697502nt) {
            C697502nt c697502nt2 = c697502nt;
            return C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(1, c697502nt2.additional_logistics_descriptions) + ProtoAdapter.INT32.encodedSizeWithTag(2, c697502nt2.format_token) + ProtoAdapter.STRING.encodedSizeWithTag(100, c697502nt2.da_info) + c697502nt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C697502nt c697502nt) {
        }
    };
    public List<C5431029t> additional_logistics_descriptions;
    public String da_info;
    public Integer format_token;

    public C697502nt() {
        super(ADAPTER, ByteString.EMPTY);
        this.additional_logistics_descriptions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C697402ns newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
