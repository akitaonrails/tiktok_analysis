package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556002Es extends Message<C556002Es, C02IR> {
    public static final ProtoAdapter<C556002Es> ADAPTER = new ProtoAdapter<C556002Es>() { // from class: X.028S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556002Es decode(ProtoReader protoReader) {
            C556002Es c556002Es = new C556002Es();
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
                                    c556002Es.is_fake_bio = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c556002Es.is_fake_avatar = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c556002Es.fake_username = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c556002Es.fake_nickname = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556002Es;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556002Es c556002Es) {
            C556002Es c556002Es2 = c556002Es;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c556002Es2.fake_nickname) + protoAdapter.encodedSizeWithTag(2, c556002Es2.fake_username);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c556002Es2.is_fake_avatar) + protoAdapter2.encodedSizeWithTag(4, c556002Es2.is_fake_bio) + c556002Es2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C556002Es c556002Es) {
            C556002Es c556002Es2 = c556002Es;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c556002Es2.fake_nickname);
            protoAdapter.encodeWithTag(protoWriter, 2, c556002Es2.fake_username);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 3, c556002Es2.is_fake_avatar);
            protoAdapter2.encodeWithTag(protoWriter, 4, c556002Es2.is_fake_bio);
            protoWriter.writeBytes(c556002Es2.unknownFields());
        }
    };
    public String fake_nickname;
    public String fake_username;
    public Boolean is_fake_avatar;
    public Boolean is_fake_bio;

    public C556002Es() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
