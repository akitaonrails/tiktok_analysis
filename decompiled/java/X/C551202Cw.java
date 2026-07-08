package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551202Cw extends Message<C551202Cw, C580702Of> {
    public static final ProtoAdapter<C551202Cw> ADAPTER = new ProtoAdapter<C551202Cw>() { // from class: X.0279
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551202Cw decode(ProtoReader protoReader) {
            C551202Cw c551202Cw = new C551202Cw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 199) {
                                        if (iNextTag != 200) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c551202Cw.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c551202Cw.da_info_type = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c551202Cw.illustration_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c551202Cw.screen_button = C02HK.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c551202Cw.message = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c551202Cw.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551202Cw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551202Cw c551202Cw) {
            C551202Cw c551202Cw2 = c551202Cw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c551202Cw2.title) + protoAdapter.encodedSizeWithTag(2, c551202Cw2.message) + C02HK.ADAPTER.encodedSizeWithTag(3, c551202Cw2.screen_button);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c551202Cw2.illustration_type) + protoAdapter2.encodedSizeWithTag(199, c551202Cw2.da_info_type) + protoAdapter.encodedSizeWithTag(200, c551202Cw2.da_info) + c551202Cw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551202Cw c551202Cw) {
        }
    };
    public String da_info;
    public Integer da_info_type;
    public Integer illustration_type;
    public String message;
    public C02HK screen_button;
    public String title;

    public C551202Cw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580702Of newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
