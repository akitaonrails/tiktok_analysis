package X;

import kotlin.Unit;
import webcast.api.smb.GetSMBOptInProgressResponse;
import webcast.api.smb.TriggerAIDMRequest;
import webcast.api.smb.TriggerAIDMResponse;
import webcast.api.sub.SMBBasicInfoEditRequest;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.SMBOptInRequest;
import webcast.api.sub.SMBOptInResponse;
import webcast.api.sub.SMBServiceOptFormRequest;
import webcast.api.sub.UpdateDMStatusRequest;
import webcast.api.sub.UpdateDMStatusResponse;

/* JADX INFO: renamed from: X.0KVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC518660KVs {
    Object LIZ(InterfaceC1364105Vn<? super C470590Icr<SMBOptInQualificationResponse.ResponseData>> interfaceC1364105Vn);

    Object LIZIZ(InterfaceC1364105Vn interfaceC1364105Vn);

    Object getSmbOptInProgress(InterfaceC1364105Vn<? super C470590Icr<GetSMBOptInProgressResponse.ResponseData>> interfaceC1364105Vn);

    Object requestBasicInfoEdit(SMBBasicInfoEditRequest sMBBasicInfoEditRequest, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    Object requestServiceOptForm(SMBServiceOptFormRequest sMBServiceOptFormRequest, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    Object requestSmbOptIn(SMBOptInRequest sMBOptInRequest, InterfaceC1364105Vn<? super C470590Icr<SMBOptInResponse.ResponseData>> interfaceC1364105Vn);

    Object triggerAIDM(TriggerAIDMRequest triggerAIDMRequest, InterfaceC1364105Vn<? super C470590Icr<TriggerAIDMResponse.Data>> interfaceC1364105Vn);

    Object updateDMStatus(UpdateDMStatusRequest updateDMStatusRequest, InterfaceC1364105Vn<? super C470590Icr<UpdateDMStatusResponse.ResponseData>> interfaceC1364105Vn);
}
