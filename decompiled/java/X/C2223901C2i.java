package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223901C2i extends Message<C2223901C2i, C2223911C2j> {
    public static final ProtoAdapter<C2223901C2i> ADAPTER = new ProtoAdapter<C2223901C2i>() { // from class: X.1C2h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223901C2i decode(ProtoReader protoReader) {
            C2223901C2i c2223901C2i = new C2223901C2i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223901C2i.content.add(C2223871C2f.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2223901C2i.tab_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223901C2i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223901C2i c2223901C2i) {
            C2223901C2i c2223901C2i2 = c2223901C2i;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2223901C2i2.tab_title) + C2223871C2f.ADAPTER.asRepeated().encodedSizeWithTag(2, c2223901C2i2.content) + c2223901C2i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223901C2i c2223901C2i) {
        }
    };
    public List<C2223871C2f> content;
    public String tab_title;

    public C2223901C2i() {
        super(ADAPTER, ByteString.EMPTY);
        this.content = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2223911C2j newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
