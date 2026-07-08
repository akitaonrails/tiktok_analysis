package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F2 extends Message<C02F2, C02L4> {
    public static final ProtoAdapter<C02F2> ADAPTER = new ProtoAdapter<C02F2>() { // from class: X.02F1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F2 decode(ProtoReader protoReader) {
            C02F2 c02f2 = new C02F2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02f2.stripped_music_list.add(C02F0.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F2 c02f2) {
            C02F2 c02f22 = c02f2;
            return C02F0.ADAPTER.asRepeated().encodedSizeWithTag(1, c02f22.stripped_music_list) + c02f22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02F2 c02f2) {
            C02F2 c02f22 = c02f2;
            C02F0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c02f22.stripped_music_list);
            protoWriter.writeBytes(c02f22.unknownFields());
        }
    };
    public List<C02F0> stripped_music_list;

    public C02F2() {
        super(ADAPTER, ByteString.EMPTY);
        this.stripped_music_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02L4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
