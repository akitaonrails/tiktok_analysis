package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225001C6o extends Message<C2225001C6o, C2225011C6p> {
    public static final ProtoAdapter<C2225001C6o> ADAPTER = new ProtoAdapter<C2225001C6o>() { // from class: X.1C6n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225001C6o decode(ProtoReader protoReader) {
            C2225001C6o c2225001C6o = new C2225001C6o();
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
                                    c2225001C6o.countdown_configs.add(C2224971C6l.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c2225001C6o.count_down_ec_rich_text.add(C5431029t.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2225001C6o.end_time = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2225001C6o.start_time = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225001C6o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225001C6o c2225001C6o) {
            C2225001C6o c2225001C6o2 = c2225001C6o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2225001C6o2.start_time) + protoAdapter.encodedSizeWithTag(2, c2225001C6o2.end_time) + C5431029t.ADAPTER.asRepeated().encodedSizeWithTag(3, c2225001C6o2.count_down_ec_rich_text) + C2224971C6l.ADAPTER.asRepeated().encodedSizeWithTag(4, c2225001C6o2.countdown_configs) + c2225001C6o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2225001C6o c2225001C6o) {
        }
    };
    public List<C5431029t> count_down_ec_rich_text;
    public List<C2224971C6l> countdown_configs;
    public String end_time;
    public String start_time;

    public C2225001C6o() {
        super(ADAPTER, ByteString.EMPTY);
        this.count_down_ec_rich_text = C1516540pZE.LJIIIIZZ();
        this.countdown_configs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2225011C6p newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
