package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C546202Ay extends Message<C546202Ay, C568902Jr> {
    public static final ProtoAdapter<C546202Ay> ADAPTER = new ProtoAdapter<C546202Ay>() { // from class: X.024S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C546202Ay decode(ProtoReader protoReader) {
            C546202Ay c546202Ay = new C546202Ay();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c546202Ay.rec_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c546202Ay.recommend_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c546202Ay.mutual_struct = C02C6.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c546202Ay.relation_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c546202Ay.external_recommend_reason = C02WK.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c546202Ay.social_ui_config = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c546202Ay.school_mutual_struct = C027U.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c546202Ay;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C546202Ay c546202Ay) {
            C546202Ay c546202Ay2 = c546202Ay;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c546202Ay2.rec_type) + protoAdapter.encodedSizeWithTag(2, c546202Ay2.recommend_reason) + C02C6.ADAPTER.encodedSizeWithTag(3, c546202Ay2.mutual_struct) + protoAdapter.encodedSizeWithTag(4, c546202Ay2.relation_type) + C02WK.ADAPTER.encodedSizeWithTag(5, c546202Ay2.external_recommend_reason) + ProtoAdapter.INT32.encodedSizeWithTag(6, c546202Ay2.social_ui_config) + C027U.ADAPTER.encodedSizeWithTag(7, c546202Ay2.school_mutual_struct) + c546202Ay2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C546202Ay c546202Ay) {
            C546202Ay c546202Ay2 = c546202Ay;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c546202Ay2.rec_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c546202Ay2.recommend_reason);
            C02C6.ADAPTER.encodeWithTag(protoWriter, 3, c546202Ay2.mutual_struct);
            protoAdapter.encodeWithTag(protoWriter, 4, c546202Ay2.relation_type);
            C02WK.ADAPTER.encodeWithTag(protoWriter, 5, c546202Ay2.external_recommend_reason);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c546202Ay2.social_ui_config);
            C027U.ADAPTER.encodeWithTag(protoWriter, 7, c546202Ay2.school_mutual_struct);
            protoWriter.writeBytes(c546202Ay2.unknownFields());
        }
    };
    public C02WK external_recommend_reason;
    public C02C6 mutual_struct;
    public String rec_type;
    public String recommend_reason;
    public String relation_type;
    public C027U school_mutual_struct;
    public Integer social_ui_config;

    public C546202Ay() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C568902Jr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
