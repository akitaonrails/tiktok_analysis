package X;

import com.lynx.tasm.TemplateBundle;
import com.tiktok.forestx.RequestParamsX;

/* JADX INFO: renamed from: X.0q7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537880q7e extends AbstractC1299950jvt {
    public final /* synthetic */ C1537480q70 LIZ;

    public C1537880q7e(C1537480q70 c1537480q70) {
        this.LIZ = c1537480q70;
    }

    @Override // X.AbstractC1299950jvt
    public final void LIZ(C1301600jyY c1301600jyY, C1299940jvs c1299940jvs) {
        C1537890q7f c1537890q7f = C1537890q7f.LIZ;
        C1537480q70 c1537480q70 = this.LIZ;
        EnumC1299880jvm enumC1299880jvm = c1301600jyY.LIZIZ;
        if (enumC1299880jvm == null) {
            enumC1299880jvm = EnumC1299880jvm.LynxResourceTypeTemplate;
        }
        c1537890q7f.getClass();
        RequestParamsX requestParamsX = new RequestParamsX(C1537890q7f.LIZLLL(enumC1299880jvm), byte[].class);
        C1537480q70 c1537480q702 = this.LIZ;
        if (c1301600jyY.LIZJ == EnumC1299900jvo.EXACTLY_SYNC) {
            requestParamsX.onlyLocal = true;
        }
        requestParamsX.groupId = c1537480q702.containerId;
        requestParamsX.source = "new_lynx_resource_interface";
        if (C1535630q41.LJIJ && c1301600jyY.LIZIZ == EnumC1299880jvm.LynxResourceTypeTemplate) {
            requestParamsX.allowRedirectInternally = false;
        }
        C1537890q7f.LIZ(c1537480q70, c1301600jyY, c1299940jvs, requestParamsX, new C1538180q88(this));
    }

    @Override // X.AbstractC1299950jvt
    public final void LIZIZ(C1301600jyY c1301600jyY, InterfaceC1290540jgi<C1299660jvQ> interfaceC1290540jgi) {
        boolean z;
        C1537890q7f c1537890q7f = C1537890q7f.LIZ;
        C1537480q70 c1537480q70 = this.LIZ;
        EnumC1299880jvm enumC1299880jvm = c1301600jyY.LIZIZ;
        if (enumC1299880jvm == null) {
            enumC1299880jvm = EnumC1299880jvm.LynxResourceTypeTemplate;
        }
        c1537890q7f.getClass();
        RequestParamsX requestParamsX = new RequestParamsX(C1537890q7f.LIZLLL(enumC1299880jvm), TemplateBundle.class);
        C1537480q70 c1537480q702 = this.LIZ;
        if (c1301600jyY.LIZJ == EnumC1299900jvo.EXACTLY_SYNC) {
            requestParamsX.onlyLocal = true;
        }
        requestParamsX.groupId = c1537480q702.containerId;
        if (c1537480q702.codeCacheInfo != null) {
            z = true;
        } else {
            z = false;
        }
        requestParamsX.resourceSupplier = new C1535870q4P(z, true);
        requestParamsX.source = "new_lynx_resource_interface";
        if (C1535630q41.LJIJ && c1301600jyY.LIZIZ == EnumC1299880jvm.LynxResourceTypeTemplate) {
            requestParamsX.allowRedirectInternally = false;
        }
        C1537890q7f.LIZ(c1537480q70, c1301600jyY, interfaceC1290540jgi, requestParamsX, new C1537800q7W(this, this.LIZ, c1301600jyY));
    }
}
