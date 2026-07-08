package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C606402Yc extends Message<C606402Yc, C606502Yd> {
    public static final ProtoAdapter<C606402Yc> ADAPTER = new ProtoAdapter<C606402Yc>() { // from class: X.02Yb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C606402Yc decode(ProtoReader protoReader) {
            C606402Yc c606402Yc = new C606402Yc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c606402Yc.lead_icon = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c606402Yc.contents.add(C5431029t.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c606402Yc.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c606402Yc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C606402Yc c606402Yc) {
            C606402Yc c606402Yc2 = c606402Yc;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c606402Yc2.title) + C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(2, c606402Yc2.contents) + C029C.ADAPTER.encodedSizeWithTag(3, c606402Yc2.lead_icon) + c606402Yc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C606402Yc c606402Yc) {
        }
    };
    public List<C5431029t> contents;
    public C029C lead_icon;
    public String title;

    public C606402Yc() {
        super(ADAPTER, ByteString.EMPTY);
        this.contents = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C606502Yd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
