package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552302Dh extends Message<C552302Dh, C02JH> {
    public static final ProtoAdapter<C552302Dh> ADAPTER = new ProtoAdapter<C552302Dh>() { // from class: X.027a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552302Dh decode(ProtoReader protoReader) {
            C552302Dh c552302Dh = new C552302Dh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 3) {
                            if (iNextTag != 5) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c552302Dh.followers = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c552302Dh.cameo_asset_info = C02TM.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c552302Dh.user_base_info = C02CF.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552302Dh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552302Dh c552302Dh) {
            C552302Dh c552302Dh2 = c552302Dh;
            return C02CF.ADAPTER.encodedSizeWithTag(1, c552302Dh2.user_base_info) + C02TM.ADAPTER.encodedSizeWithTag(3, c552302Dh2.cameo_asset_info) + ProtoAdapter.INT64.encodedSizeWithTag(5, c552302Dh2.followers) + c552302Dh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C552302Dh c552302Dh) {
            C552302Dh c552302Dh2 = c552302Dh;
            C02CF.ADAPTER.encodeWithTag(protoWriter, 1, c552302Dh2.user_base_info);
            C02TM.ADAPTER.encodeWithTag(protoWriter, 3, c552302Dh2.cameo_asset_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c552302Dh2.followers);
            protoWriter.writeBytes(c552302Dh2.unknownFields());
        }
    };
    public C02TM cameo_asset_info;
    public Long followers;
    public C02CF user_base_info;

    public C552302Dh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
