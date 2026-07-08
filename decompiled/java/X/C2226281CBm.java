package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226281CBm extends Message<C2226281CBm, C2226291CBn> {
    public static final ProtoAdapter<C2226281CBm> ADAPTER = new ProtoAdapter<C2226281CBm>() { // from class: X.1CBl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226281CBm decode(ProtoReader protoReader) {
            C2226281CBm c2226281CBm = new C2226281CBm();
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
                                    c2226281CBm.extra = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2226281CBm.download_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2226281CBm.entrance_info = C2226251CBj.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2226281CBm.cloud_game_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226281CBm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226281CBm c2226281CBm) {
            C2226281CBm c2226281CBm2 = c2226281CBm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2226281CBm2.cloud_game_id) + C2226251CBj.ADAPTER.encodedSizeWithTag(2, c2226281CBm2.entrance_info) + protoAdapter.encodedSizeWithTag(3, c2226281CBm2.download_url) + protoAdapter.encodedSizeWithTag(4, c2226281CBm2.extra) + c2226281CBm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226281CBm c2226281CBm) {
            C2226281CBm c2226281CBm2 = c2226281CBm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2226281CBm2.cloud_game_id);
            C2226251CBj.ADAPTER.encodeWithTag(protoWriter, 2, c2226281CBm2.entrance_info);
            protoAdapter.encodeWithTag(protoWriter, 3, c2226281CBm2.download_url);
            protoAdapter.encodeWithTag(protoWriter, 4, c2226281CBm2.extra);
            protoWriter.writeBytes(c2226281CBm2.unknownFields());
        }
    };
    public String cloud_game_id;
    public String download_url;
    public C2226251CBj entrance_info;
    public String extra;

    public C2226281CBm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2226291CBn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
