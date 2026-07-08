package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02tT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C732102tT extends Message<C732102tT, C732202tU> {
    public static final ProtoAdapter<C732102tT> ADAPTER = new ProtoAdapter<C732102tT>() { // from class: X.02tS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C732102tT decode(ProtoReader protoReader) {
            C732102tT c732102tT = new C732102tT();
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
                                    c732102tT.da_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c732102tT.items.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c732102tT.background_color = C618602bA.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c732102tT.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c732102tT;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C732102tT c732102tT) {
            C732102tT c732102tT2 = c732102tT;
            int iEncodedSizeWithTag = C5431029t.ADAPTER.encodedSizeWithTag(1, c732102tT2.title) + C618602bA.ADAPTER.encodedSizeWithTag(2, c732102tT2.background_color);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(3, c732102tT2.items) + protoAdapter.encodedSizeWithTag(4, c732102tT2.da_info) + c732102tT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C732102tT c732102tT) {
        }
    };
    public C618602bA background_color;
    public String da_info;
    public List<String> items;
    public C5431029t title;

    public C732102tT() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C732202tU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
