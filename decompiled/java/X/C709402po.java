package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C709402po extends Message<C709402po, C709602pq> {
    public static final ProtoAdapter<C709402po> ADAPTER = new ProtoAdapter<C709402po>() { // from class: X.02pp
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C709402po decode(ProtoReader protoReader) {
            C709602pq c709602pq = new C709602pq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c709602pq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c709602pq.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c709602pq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c709602pq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C709402po c709402po) {
            C709402po c709402po2 = c709402po;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c709402po2.comment_button_text) + this.LIZ.encodedSizeWithTag(2, c709402po2.mob_extra) + c709402po2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C709402po c709402po) {
            C709402po c709402po2 = c709402po;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c709402po2.comment_button_text);
            this.LIZ.encodeWithTag(protoWriter, 2, c709402po2.mob_extra);
            protoWriter.writeBytes(c709402po2.unknownFields());
        }
    };
    public String comment_button_text;
    public Map<String, String> mob_extra;

    public C709402po() {
    }

    @Override // com.squareup.wire.Message
    public C709602pq newBuilder() {
        return null;
    }

    public C709402po(String str, Map<String, String> map) {
        this(str, map, ByteString.EMPTY);
    }

    public C709402po(String str, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.comment_button_text = str;
        this.mob_extra = C1516540pZE.LJI("mob_extra", map);
    }
}
