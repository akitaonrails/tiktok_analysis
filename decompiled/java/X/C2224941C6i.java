package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224941C6i extends Message<C2224941C6i, C2224951C6j> {
    public static final ProtoAdapter<C2224941C6i> ADAPTER = new ProtoAdapter<C2224941C6i>() { // from class: X.1C6h
        public final ProtoAdapter<Map<String, C2224911C6f>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C2224911C6f.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224941C6i decode(ProtoReader protoReader) {
            C2224941C6i c2224941C6i = new C2224941C6i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2224941C6i.scene_statement.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c2224941C6i.statement = C2224911C6f.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224941C6i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224941C6i c2224941C6i) {
            C2224941C6i c2224941C6i2 = c2224941C6i;
            return C2224911C6f.ADAPTER.encodedSizeWithTag(1, c2224941C6i2.statement) + this.LIZ.encodedSizeWithTag(2, c2224941C6i2.scene_statement) + c2224941C6i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224941C6i c2224941C6i) {
        }
    };
    public Map<String, C2224911C6f> scene_statement;
    public C2224911C6f statement;

    @Override // com.squareup.wire.Message
    public C2224951C6j newBuilder() {
        return null;
    }

    public C2224941C6i() {
        super(ADAPTER, ByteString.EMPTY);
        this.scene_statement = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
