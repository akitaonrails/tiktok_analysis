package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.026d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5337026d extends Message<C5337026d, C575902Mj> {
    public static final ProtoAdapter<C5337026d> ADAPTER = new ProtoAdapter<C5337026d>() { // from class: X.026S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5337026d decode(ProtoReader protoReader) {
            C5337026d c5337026d = new C5337026d();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c5337026d.icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c5337026d.change_plan_url = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c5337026d.change_plan = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c5337026d.insurance_info_list.add(AnonymousClass0226.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                c5337026d.exposure_insurance_info_list.add(AnonymousClass0226.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                c5337026d.insurance_plan = C5421029j.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c5337026d.type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                c5337026d.type_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c5337026d.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5337026d;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5337026d c5337026d) {
            C5337026d c5337026d2 = c5337026d;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c5337026d2.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c5337026d2.change_plan_url) + protoAdapter.encodedSizeWithTag(3, c5337026d2.change_plan);
            ProtoAdapter<AnonymousClass0226> protoAdapter2 = AnonymousClass0226.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter2.asRepeated().encodedSizeWithTag(4, c5337026d2.insurance_info_list) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c5337026d2.exposure_insurance_info_list) + C5421029j.ADAPTER.encodedSizeWithTag(6, c5337026d2.insurance_plan) + ProtoAdapter.INT32.encodedSizeWithTag(7, c5337026d2.type) + protoAdapter.encodedSizeWithTag(8, c5337026d2.type_title) + protoAdapter.encodedSizeWithTag(200, c5337026d2.da_info) + c5337026d2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5337026d c5337026d) {
        }
    };
    public String change_plan;
    public String change_plan_url;
    public String da_info;
    public List<AnonymousClass0226> exposure_insurance_info_list;
    public C029C icon;
    public List<AnonymousClass0226> insurance_info_list;
    public C5421029j insurance_plan;
    public Integer type;
    public String type_title;

    public C5337026d() {
        super(ADAPTER, ByteString.EMPTY);
        this.insurance_info_list = C1516540pZE.LJIIIIZZ();
        this.exposure_insurance_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C575902Mj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
