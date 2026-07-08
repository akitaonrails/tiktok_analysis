package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223991C2r extends Message<C2223991C2r, C2224001C2s> {
    public static final ProtoAdapter<C2223991C2r> ADAPTER = new ProtoAdapter<C2223991C2r>() { // from class: X.1C2q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223991C2r decode(ProtoReader protoReader) {
            C2223991C2r c2223991C2r = new C2223991C2r();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2223991C2r.biz_pack_source = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2223991C2r.pack_scene = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223991C2r.tenant = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223991C2r;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223991C2r c2223991C2r) {
            C2223991C2r c2223991C2r2 = c2223991C2r;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2223991C2r2.tenant) + protoAdapter.encodedSizeWithTag(2, c2223991C2r2.pack_scene) + protoAdapter.encodedSizeWithTag(3, c2223991C2r2.biz_pack_source) + c2223991C2r2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223991C2r c2223991C2r) {
            C2223991C2r c2223991C2r2 = c2223991C2r;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223991C2r2.tenant);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223991C2r2.pack_scene);
            protoAdapter.encodeWithTag(protoWriter, 3, c2223991C2r2.biz_pack_source);
            protoWriter.writeBytes(c2223991C2r2.unknownFields());
        }
    };
    public String biz_pack_source;
    public String pack_scene;
    public String tenant;

    public C2223991C2r() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224001C2s newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
