package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224881C6c extends Message<C2224881C6c, C2224891C6d> {
    public static final ProtoAdapter<C2224881C6c> ADAPTER = new ProtoAdapter<C2224881C6c>() { // from class: X.1C6b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224881C6c decode(ProtoReader protoReader) {
            C2224881C6c c2224881C6c = new C2224881C6c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2224881C6c.ec_rich_texts.add(C5431029t.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2224881C6c.xl_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224881C6c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224881C6c c2224881C6c) {
            C2224881C6c c2224881C6c2 = c2224881C6c;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c2224881C6c2.xl_type) + C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(2, c2224881C6c2.ec_rich_texts) + c2224881C6c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224881C6c c2224881C6c) {
        }
    };
    public List<C5431029t> ec_rich_texts;
    public Integer xl_type;

    public C2224881C6c() {
        super(ADAPTER, ByteString.EMPTY);
        this.ec_rich_texts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2224891C6d newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
