package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C739902uj extends Message<C739902uj, C740002uk> {
    public static final ProtoAdapter<C739902uj> ADAPTER = new ProtoAdapter<C739902uj>() { // from class: X.02ui
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C739902uj decode(ProtoReader protoReader) {
            C739902uj c739902uj = new C739902uj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c739902uj.test5 = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c739902uj.test3 = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c739902uj.test_for_pack_developer_platform = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c739902uj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C739902uj c739902uj) {
            C739902uj c739902uj2 = c739902uj;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c739902uj2.test_for_pack_developer_platform) + ProtoAdapter.INT64.encodedSizeWithTag(2, c739902uj2.test3) + ProtoAdapter.STRING.encodedSizeWithTag(3, c739902uj2.test5) + c739902uj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C739902uj c739902uj) {
            C739902uj c739902uj2 = c739902uj;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c739902uj2.test_for_pack_developer_platform);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c739902uj2.test3);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c739902uj2.test5);
            protoWriter.writeBytes(c739902uj2.unknownFields());
        }
    };
    public Long test3;
    public String test5;
    public Boolean test_for_pack_developer_platform;

    public C739902uj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C740002uk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
