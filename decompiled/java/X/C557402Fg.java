package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557402Fg extends Message<C557402Fg, C02I0> {
    public static final ProtoAdapter<C557402Fg> ADAPTER = new ProtoAdapter<C557402Fg>() { // from class: X.028Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557402Fg decode(ProtoReader protoReader) {
            C557402Fg c557402Fg = new C557402Fg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c557402Fg.avatar_medium = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c557402Fg.nickname = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c557402Fg.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557402Fg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557402Fg c557402Fg) {
            C557402Fg c557402Fg2 = c557402Fg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c557402Fg2.sec_uid) + protoAdapter.encodedSizeWithTag(2, c557402Fg2.nickname) + C673002jw.ADAPTER.encodedSizeWithTag(3, c557402Fg2.avatar_medium) + c557402Fg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C557402Fg c557402Fg) {
            C557402Fg c557402Fg2 = c557402Fg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c557402Fg2.sec_uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c557402Fg2.nickname);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c557402Fg2.avatar_medium);
            protoWriter.writeBytes(c557402Fg2.unknownFields());
        }
    };
    public C673002jw avatar_medium;
    public String nickname;
    public String sec_uid;

    public C557402Fg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02I0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
