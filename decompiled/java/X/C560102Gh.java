package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560102Gh extends Message<C560102Gh, C02L9> {
    public static final ProtoAdapter<C560102Gh> ADAPTER = new ProtoAdapter<C560102Gh>() { // from class: X.028e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560102Gh decode(ProtoReader protoReader) {
            C560102Gh c560102Gh = new C560102Gh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c560102Gh.priority = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c560102Gh.tab_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c560102Gh.tab_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560102Gh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560102Gh c560102Gh) {
            C560102Gh c560102Gh2 = c560102Gh;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c560102Gh2.tab_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c560102Gh2.tab_name) + protoAdapter.encodedSizeWithTag(3, c560102Gh2.priority) + c560102Gh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C560102Gh c560102Gh) {
            C560102Gh c560102Gh2 = c560102Gh;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c560102Gh2.tab_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c560102Gh2.tab_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c560102Gh2.priority);
            protoWriter.writeBytes(c560102Gh2.unknownFields());
        }
    };
    public Long priority;
    public Long tab_id;
    public String tab_name;

    public C560102Gh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02L9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
