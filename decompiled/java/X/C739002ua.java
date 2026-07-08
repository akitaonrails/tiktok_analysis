package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C739002ua extends Message<C739002ua, C739102ub> {
    public static final ProtoAdapter<C739002ua> ADAPTER = new ProtoAdapter<C739002ua>() { // from class: X.02uZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C739002ua decode(ProtoReader protoReader) {
            C739002ua c739002ua = new C739002ua();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c739002ua.source = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c739002ua.task_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c739002ua;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C739002ua c739002ua) {
            C739002ua c739002ua2 = c739002ua;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c739002ua2.task_id) + protoAdapter.encodedSizeWithTag(2, c739002ua2.source) + c739002ua2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C739002ua c739002ua) {
            C739002ua c739002ua2 = c739002ua;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c739002ua2.task_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c739002ua2.source);
            protoWriter.writeBytes(c739002ua2.unknownFields());
        }
    };
    public String source;
    public String task_id;

    public C739002ua() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C739102ub newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
