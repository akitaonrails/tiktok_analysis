package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C596502Uh extends Message<C596502Uh, C596602Ui> {
    public static final ProtoAdapter<C596502Uh> ADAPTER = new ProtoAdapter<C596502Uh>() { // from class: X.02Ug
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C596502Uh decode(ProtoReader protoReader) {
            C596502Uh c596502Uh = new C596502Uh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c596502Uh.hosts.add(ProtoAdapter.STRING.decode(protoReader));
                                    }
                                } else {
                                    c596502Uh.tv_token = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c596502Uh.auth = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c596502Uh.token = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c596502Uh.vid = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c596502Uh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C596502Uh c596502Uh) {
            C596502Uh c596502Uh2 = c596502Uh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c596502Uh2.vid) + protoAdapter.encodedSizeWithTag(2, c596502Uh2.token) + protoAdapter.encodedSizeWithTag(3, c596502Uh2.auth) + protoAdapter.encodedSizeWithTag(4, c596502Uh2.tv_token) + protoAdapter.asRepeated().encodedSizeWithTag(5, c596502Uh2.hosts) + c596502Uh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C596502Uh c596502Uh) {
            C596502Uh c596502Uh2 = c596502Uh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c596502Uh2.vid);
            protoAdapter.encodeWithTag(protoWriter, 2, c596502Uh2.token);
            protoAdapter.encodeWithTag(protoWriter, 3, c596502Uh2.auth);
            protoAdapter.encodeWithTag(protoWriter, 4, c596502Uh2.tv_token);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, c596502Uh2.hosts);
            protoWriter.writeBytes(c596502Uh2.unknownFields());
        }
    };
    public String auth;
    public List<String> hosts;
    public String token;
    public String tv_token;
    public String vid;

    public C596502Uh() {
        super(ADAPTER, ByteString.EMPTY);
        this.hosts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C596602Ui newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
