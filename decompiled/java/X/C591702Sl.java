package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C591702Sl extends Message<C591702Sl, C591802Sm> {
    public static final ProtoAdapter<C591702Sl> ADAPTER = new ProtoAdapter<C591702Sl>() { // from class: X.02Sk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C591702Sl decode(ProtoReader protoReader) {
            C591702Sl c591702Sl = new C591702Sl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c591702Sl.popup_layer_items.add(C591502Sj.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c591702Sl.desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c591702Sl.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c591702Sl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C591702Sl c591702Sl) {
            C591702Sl c591702Sl2 = c591702Sl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c591702Sl2.title) + protoAdapter.encodedSizeWithTag(2, c591702Sl2.desc) + C591502Sj.ADAPTER.asRepeated().encodedSizeWithTag(3, c591702Sl2.popup_layer_items) + c591702Sl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C591702Sl c591702Sl) {
        }
    };
    public String desc;
    public List<C591502Sj> popup_layer_items;
    public String title;

    public C591702Sl() {
        super(ADAPTER, ByteString.EMPTY);
        this.popup_layer_items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C591802Sm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
