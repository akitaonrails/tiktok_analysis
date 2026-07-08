package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02x3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C754302x3 extends Message<C754302x3, C754402x4> {
    public static final ProtoAdapter<C754302x3> ADAPTER = new ProtoAdapter<C754302x3>() { // from class: X.02x2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C754302x3 decode(ProtoReader protoReader) {
            C754302x3 c754302x3 = new C754302x3();
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
                                    c754302x3.text_color = C618602bA.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c754302x3.background_color = C618602bA.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c754302x3.icon = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c754302x3.title.add(C754602x6.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c754302x3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C754302x3 c754302x3) {
            C754302x3 c754302x32 = c754302x3;
            int iEncodedSizeWithTag = C754602x6.ADAPTER.asRepeated().encodedSizeWithTag(1, c754302x32.title) + C029C.ADAPTER.encodedSizeWithTag(2, c754302x32.icon);
            ProtoAdapter<C618602bA> protoAdapter = C618602bA.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c754302x32.background_color) + protoAdapter.encodedSizeWithTag(4, c754302x32.text_color) + c754302x32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C754302x3 c754302x3) {
        }
    };
    public C618602bA background_color;
    public C029C icon;
    public C618602bA text_color;
    public List<C754602x6> title;

    public C754302x3() {
        super(ADAPTER, ByteString.EMPTY);
        this.title = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C754402x4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
