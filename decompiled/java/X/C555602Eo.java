package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555602Eo extends Message<C555602Eo, C580802Og> {
    public static final ProtoAdapter<C555602Eo> ADAPTER = new ProtoAdapter<C555602Eo>() { // from class: X.02En
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555602Eo decode(ProtoReader protoReader) {
            C555602Eo c555602Eo = new C555602Eo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c555602Eo.membership_info = C614102aR.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c555602Eo.virtual_info = C555402Em.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c555602Eo.vas_badge = C02WW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555602Eo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555602Eo c555602Eo) {
            C555602Eo c555602Eo2 = c555602Eo;
            return C02WW.ADAPTER.encodedSizeWithTag(1, c555602Eo2.vas_badge) + C555402Em.ADAPTER.encodedSizeWithTag(2, c555602Eo2.virtual_info) + C614102aR.ADAPTER.encodedSizeWithTag(3, c555602Eo2.membership_info) + c555602Eo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C555602Eo c555602Eo) {
        }
    };
    public C614102aR membership_info;
    public C02WW vas_badge;
    public C555402Em virtual_info;

    public C555602Eo() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580802Og newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
