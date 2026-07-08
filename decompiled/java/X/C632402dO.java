package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C632402dO extends Message<C632402dO, C632502dP> {
    public static final ProtoAdapter<C632402dO> ADAPTER = new ProtoAdapter<C632402dO>() { // from class: X.02dN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C632402dO decode(ProtoReader protoReader) {
            C632402dO c632402dO = new C632402dO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c632402dO.layout_apply_from = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c632402dO.layout_mode = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c632402dO;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C632402dO c632402dO) {
            C632402dO c632402dO2 = c632402dO;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c632402dO2.layout_mode) + protoAdapter.encodedSizeWithTag(2, c632402dO2.layout_apply_from) + c632402dO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C632402dO c632402dO) {
            C632402dO c632402dO2 = c632402dO;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c632402dO2.layout_mode);
            protoAdapter.encodeWithTag(protoWriter, 2, c632402dO2.layout_apply_from);
            protoWriter.writeBytes(c632402dO2.unknownFields());
        }
    };
    public String layout_apply_from;
    public String layout_mode;

    public C632402dO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C632502dP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
