package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551402Cy extends Message<C551402Cy, C584302Pp> {
    public static final ProtoAdapter<C551402Cy> ADAPTER = new ProtoAdapter<C551402Cy>() { // from class: X.027w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551402Cy decode(ProtoReader protoReader) {
            C551402Cy c551402Cy = new C551402Cy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c551402Cy.pop_up_info = AnonymousClass0282.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c551402Cy.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c551402Cy.logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c551402Cy.logistics_service_invalid = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c551402Cy.hide_sku_images = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c551402Cy.pinpoint_da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551402Cy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551402Cy c551402Cy) {
            C551402Cy c551402Cy2 = c551402Cy;
            int iEncodedSizeWithTag = AnonymousClass0282.ADAPTER.encodedSizeWithTag(1, c551402Cy2.pop_up_info);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c551402Cy2.da_info) + protoAdapter.encodedSizeWithTag(3, c551402Cy2.logistics_service_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c551402Cy2.logistics_service_invalid) + protoAdapter2.encodedSizeWithTag(5, c551402Cy2.hide_sku_images) + protoAdapter.encodedSizeWithTag(6, c551402Cy2.pinpoint_da_info) + c551402Cy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551402Cy c551402Cy) {
        }
    };
    public String da_info;
    public Integer hide_sku_images;
    public String logistics_service_id;
    public Integer logistics_service_invalid;
    public String pinpoint_da_info;
    public AnonymousClass0282 pop_up_info;

    public C551402Cy() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C584302Pp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
