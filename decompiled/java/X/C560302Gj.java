package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560302Gj extends Message<C560302Gj, C02KR> {
    public static final ProtoAdapter<C560302Gj> ADAPTER = new ProtoAdapter<C560302Gj>() { // from class: X.02Gi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560302Gj decode(ProtoReader protoReader) {
            C560302Gj c560302Gj = new C560302Gj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c560302Gj.comment_tab_info_config.add(C560102Gh.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c560302Gj.max_tab_count = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560302Gj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560302Gj c560302Gj) {
            C560302Gj c560302Gj2 = c560302Gj;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c560302Gj2.max_tab_count) + C560102Gh.ADAPTER.asRepeated().encodedSizeWithTag(2, c560302Gj2.comment_tab_info_config) + c560302Gj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C560302Gj c560302Gj) {
            C560302Gj c560302Gj2 = c560302Gj;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c560302Gj2.max_tab_count);
            C560102Gh.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c560302Gj2.comment_tab_info_config);
            protoWriter.writeBytes(c560302Gj2.unknownFields());
        }
    };
    public List<C560102Gh> comment_tab_info_config;
    public Long max_tab_count;

    public C560302Gj() {
        super(ADAPTER, ByteString.EMPTY);
        this.comment_tab_info_config = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
