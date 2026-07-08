package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C559702Gd extends Message<C559702Gd, C571502Kr> {
    public static final ProtoAdapter<C559702Gd> ADAPTER = new ProtoAdapter<C559702Gd>() { // from class: X.02Gc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C559702Gd decode(ProtoReader protoReader) {
            C559702Gd c559702Gd = new C559702Gd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c559702Gd.video_http_dns_results.add(C559502Gb.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c559702Gd.http_dns_results.add(C559502Gb.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c559702Gd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C559702Gd c559702Gd) {
            C559702Gd c559702Gd2 = c559702Gd;
            ProtoAdapter<C559502Gb> protoAdapter = C559502Gb.ADAPTER;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c559702Gd2.http_dns_results) + protoAdapter.asRepeated().encodedSizeWithTag(2, c559702Gd2.video_http_dns_results) + c559702Gd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C559702Gd c559702Gd) {
            C559702Gd c559702Gd2 = c559702Gd;
            ProtoAdapter<C559502Gb> protoAdapter = C559502Gb.ADAPTER;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c559702Gd2.http_dns_results);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c559702Gd2.video_http_dns_results);
            protoWriter.writeBytes(c559702Gd2.unknownFields());
        }
    };
    public List<C559502Gb> http_dns_results;
    public List<C559502Gb> video_http_dns_results;

    public C559702Gd() {
        super(ADAPTER, ByteString.EMPTY);
        this.http_dns_results = C1516540pZE.LJIIIIZZ();
        this.video_http_dns_results = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C571502Kr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
