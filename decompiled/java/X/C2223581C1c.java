package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223581C1c extends Message<C2223581C1c, C2223591C1d> {
    public static final ProtoAdapter<C2223581C1c> ADAPTER = new ProtoAdapter<C2223581C1c>() { // from class: X.1C1b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223581C1c decode(ProtoReader protoReader) {
            C2223581C1c c2223581C1c = new C2223581C1c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2223581C1c.req_progress = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2223581C1c.req_seconf = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2223581C1c.mode = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223581C1c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223581C1c c2223581C1c) {
            C2223581C1c c2223581C1c2 = c2223581C1c;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2223581C1c2.mode) + protoAdapter.encodedSizeWithTag(2, c2223581C1c2.req_seconf) + protoAdapter.encodedSizeWithTag(3, c2223581C1c2.req_progress) + c2223581C1c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223581C1c c2223581C1c) {
            C2223581C1c c2223581C1c2 = c2223581C1c;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223581C1c2.mode);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223581C1c2.req_seconf);
            protoAdapter.encodeWithTag(protoWriter, 3, c2223581C1c2.req_progress);
            protoWriter.writeBytes(c2223581C1c2.unknownFields());
        }
    };
    public Integer mode;
    public Integer req_progress;
    public Integer req_seconf;

    public C2223581C1c() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223591C1d newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
