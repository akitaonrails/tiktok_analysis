package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C613202aI extends Message<C613202aI, C613302aJ> {
    public static final ProtoAdapter<C613202aI> ADAPTER = new ProtoAdapter<C613202aI>() { // from class: X.02aH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C613202aI decode(ProtoReader protoReader) {
            C613202aI c613202aI = new C613202aI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c613202aI.button = C685202lu.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c613202aI.contents.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c613202aI.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c613202aI;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C613202aI c613202aI) {
            C613202aI c613202aI2 = c613202aI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c613202aI2.title) + protoAdapter.asRepeated().encodedSizeWithTag(2, c613202aI2.contents) + C685202lu.ADAPTER.encodedSizeWithTag(3, c613202aI2.button) + c613202aI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C613202aI c613202aI) {
        }
    };
    public C685202lu button;
    public List<String> contents;
    public String title;

    public C613202aI() {
        super(ADAPTER, ByteString.EMPTY);
        this.contents = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C613302aJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
