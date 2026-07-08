package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C03, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C03 extends Message<C1C03, C1C04> {
    public static final ProtoAdapter<C1C03> ADAPTER = new ProtoAdapter<C1C03>() { // from class: X.1C02
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C03 decode(ProtoReader protoReader) {
            C1C03 c1c03 = new C1C03();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c03.intervals.add(C1C00.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1c03.song_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c03;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C03 c1c03) {
            C1C03 c1c032 = c1c03;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c032.song_name) + C1C00.ADAPTER.asRepeated().encodedSizeWithTag(2, c1c032.intervals) + c1c032.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C03 c1c03) {
            C1C03 c1c032 = c1c03;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1c032.song_name);
            C1C00.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c1c032.intervals);
            protoWriter.writeBytes(c1c032.unknownFields());
        }
    };
    public List<C1C00> intervals;
    public String song_name;

    public C1C03() {
        super(ADAPTER, ByteString.EMPTY);
        this.intervals = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C04 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
