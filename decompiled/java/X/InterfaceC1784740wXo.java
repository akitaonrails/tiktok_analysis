package X;

import java.util.List;
import webcast.api.smb.SMBVerificationInfoResponse;
import webcast.api.sub.UpsellIndustryListResponse;

/* JADX INFO: renamed from: X.0wXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1784740wXo {
    Object LIZ(int i, long j, String str, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LIZIZ(List list, InterfaceC1364105Vn interfaceC1364105Vn);

    Object LIZJ(InterfaceC1364105Vn<? super C1268104xj> interfaceC1364105Vn);

    Object getIndustryList(InterfaceC1364105Vn<? super C470590Icr<UpsellIndustryListResponse.Data>> interfaceC1364105Vn);

    Object getSmbVerificationInfo(InterfaceC1364105Vn<? super C470590Icr<SMBVerificationInfoResponse.Data>> interfaceC1364105Vn);
}
