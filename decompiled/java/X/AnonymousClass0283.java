package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0283, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0283 extends Message<AnonymousClass0283, C02QX> {
    public static final ProtoAdapter<AnonymousClass0283> ADAPTER = new ProtoAdapter<AnonymousClass0283>() { // from class: X.023n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0283 decode(ProtoReader protoReader) {
            AnonymousClass0283 anonymousClass0283 = new AnonymousClass0283();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 20) {
                                            if (iNextTag != 100) {
                                                if (iNextTag != 101) {
                                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                                } else {
                                                    anonymousClass0283.unable_toast = ProtoAdapter.STRING.decode(protoReader);
                                                }
                                            } else {
                                                anonymousClass0283.payment_unable_toast = ProtoAdapter.STRING.decode(protoReader);
                                            }
                                        } else {
                                            anonymousClass0283.donation_info = C02XO.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        anonymousClass0283.unable_detail.add(C5431029t.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    anonymousClass0283.payment_unable_detail.add(C5431029t.ADAPTER.decode(protoReader));
                                }
                            } else {
                                anonymousClass0283.normal_donation_detail.add(C5431029t.ADAPTER.decode(protoReader));
                            }
                        } else {
                            anonymousClass0283.donation_module_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        anonymousClass0283.donation_icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0283;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0283 anonymousClass0283) {
            AnonymousClass0283 anonymousClass02832 = anonymousClass0283;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, anonymousClass02832.donation_icon) + ProtoAdapter.INT32.encodedSizeWithTag(2, anonymousClass02832.donation_module_status);
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(3, anonymousClass02832.normal_donation_detail) + protoAdapter.asRepeated().encodedSizeWithTag(4, anonymousClass02832.payment_unable_detail) + protoAdapter.asRepeated().encodedSizeWithTag(5, anonymousClass02832.unable_detail) + C02XO.ADAPTER.encodedSizeWithTag(20, anonymousClass02832.donation_info);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(100, anonymousClass02832.payment_unable_toast) + protoAdapter2.encodedSizeWithTag(101, anonymousClass02832.unable_toast) + anonymousClass02832.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0283 anonymousClass0283) {
        }
    };
    public C029C donation_icon;
    public C02XO donation_info;
    public Integer donation_module_status;
    public List<C5431029t> normal_donation_detail;
    public List<C5431029t> payment_unable_detail;
    public String payment_unable_toast;
    public List<C5431029t> unable_detail;
    public String unable_toast;

    public AnonymousClass0283() {
        super(ADAPTER, ByteString.EMPTY);
        this.normal_donation_detail = C1516540pZE.LJIIIIZZ();
        this.payment_unable_detail = C1516540pZE.LJIIIIZZ();
        this.unable_detail = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
