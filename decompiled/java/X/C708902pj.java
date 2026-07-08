package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C708902pj extends Message<C708902pj, C709302pn> {
    public static final ProtoAdapter<C708902pj> ADAPTER = new ProtoAdapter<C708902pj>() { // from class: X.02pi
        public final ProtoAdapter<Map<String, C709102pl>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C709102pl.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C708902pj decode(ProtoReader protoReader) {
            C708902pj c708902pj = new C708902pj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c708902pj.scene_items.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c708902pj.items.add(C578602Nk.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c708902pj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C708902pj c708902pj) {
            C708902pj c708902pj2 = c708902pj;
            return C578602Nk.ADAPTER.asRepeated().encodedSizeWithTag(1, c708902pj2.items) + this.LIZ.encodedSizeWithTag(2, c708902pj2.scene_items) + c708902pj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C708902pj c708902pj) {
        }
    };
    public List<C578602Nk> items;
    public Map<String, C709102pl> scene_items;

    @Override // com.squareup.wire.Message
    public C709302pn newBuilder() {
        return null;
    }

    public C708902pj() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
        this.scene_items = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
