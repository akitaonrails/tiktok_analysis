package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ZH extends Message<C02ZH, C02ZI> {
    public static final ProtoAdapter<C02ZH> ADAPTER = new ProtoAdapter<C02ZH>() { // from class: X.02ZG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ZH decode(ProtoReader protoReader) {
            C02ZH c02zh = new C02ZH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02zh.icon = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02zh.rights_template = AnonymousClass0241.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02zh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ZH c02zh) {
            C02ZH c02zh2 = c02zh;
            return AnonymousClass0241.ADAPTER.encodedSizeWithTag(1, c02zh2.rights_template) + C029C.ADAPTER.encodedSizeWithTag(2, c02zh2.icon) + c02zh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02ZH c02zh) {
        }
    };
    public C029C icon;
    public AnonymousClass0241 rights_template;

    public C02ZH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ZI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
