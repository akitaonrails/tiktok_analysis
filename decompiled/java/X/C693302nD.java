package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C693302nD extends Message<C693302nD, C693202nC> {
    public static final ProtoAdapter<C693302nD> ADAPTER = new ProtoAdapter<C693302nD>() { // from class: X.02nE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C693302nD decode(ProtoReader protoReader) {
            C693302nD c693302nD = new C693302nD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c693302nD.banner_title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c693302nD.banner_right_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c693302nD.banner_right_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c693302nD;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C693302nD c693302nD) {
            C693302nD c693302nD2 = c693302nD;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c693302nD2.banner_right_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c693302nD2.banner_right_name) + protoAdapter.encodedSizeWithTag(3, c693302nD2.banner_title) + c693302nD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C693302nD c693302nD) {
        }
    };
    public Long banner_right_id;
    public String banner_right_name;
    public String banner_title;

    public C693302nD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C693202nC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
