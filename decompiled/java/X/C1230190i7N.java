package X;

import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IToastHelper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import njp.a;

/* JADX INFO: renamed from: X.0i7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.GroupInvitationImpl$tryOpenGroupInvitationSheet$1", f = "GroupInvitationImpl.kt", l = {251}, m = "invokeSuspend")
public final class C1230190i7N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ WeakReference<Function0<Unit>> LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ InterfaceC1230230i7R LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230190i7N(WeakReference<Function0<Unit>> weakReference, ViewGroup viewGroup, InterfaceC1230230i7R interfaceC1230230i7R, String str, String str2, InterfaceC1364105Vn<? super C1230190i7N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = weakReference;
        this.LLILZ = viewGroup;
        this.LLILZIL = interfaceC1230230i7R;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1230190i7N c1230190i7N = new C1230190i7N(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1230190i7N.LLILLJJLI = obj;
        return c1230190i7N;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int errorCode;
        InterfaceC497601wk interfaceC497601wk;
        boolean z;
        IToastHelper iToastHelper;
        Object objLJI = obj;
        C1C7U.LIZ("GroupInvitationImpl@19a2.tryOpenGroupInvitationSheet$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C23112093u c23112093u = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(objLJI);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJI);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C1229320i5y.LIZ.LJFF = System.currentTimeMillis();
                C1DFB c1dfb = C0PEM.LIZJ;
                C1230180i7M c1230180i7M = new C1230180i7M(this.LLIZ, null);
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                objLJI = C23250099c.LJI(this, c1dfb, c1230180i7M);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("GroupInvitationImpl@19a2.tryOpenGroupInvitationSheet$1");
                    return objLJFF;
                }
            }
            final GroupInvitePopupResponse groupInvitePopupResponse = (GroupInvitePopupResponse) objLJI;
            C1229320i5y.LIZ.LJI = System.currentTimeMillis();
            int i2 = (int) groupInvitePopupResponse.toastMeta.statusCode;
            if (i2 != 0) {
                C1229320i5y.LIZLLL(new C1229340i60(i2, 0, C0ZBV.BUSINESS_FAIL, 2));
                C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
                ViewGroup viewGroup = this.LLILZ;
                WeakReference<Function0<Unit>> weakReference = this.LLILLL;
                c1230440i7m.getClass();
                C1230440i7m.LJI(viewGroup, weakReference);
                String str = groupInvitePopupResponse.toastMeta.text;
                if (C123100dR.LIZ(str) && (iToastHelper = (IToastHelper) PluggableExtentionKt.pluggableSpi$default(IToastHelper.class, false, false, false, 14, null)) != null) {
                    iToastHelper.LIZ(EnumC1365740le0.TOP, str, 3000L, AFwS201S0000000_14.get$arr$(291), false, 3, false, UUID.randomUUID().toString(), C0ZTX.LIZ);
                }
                this.LLILZIL.onFail();
            } else {
                final String strValueOf = String.valueOf(groupInvitePopupResponse.popupMeta.groupInfo.convShortId);
                String strLIZJ = C1229100i5c.LIZ.LIZJ(strValueOf);
                String strLJFF = C1229100i5c.LJFF(strValueOf);
                C1229330i5z c1229330i5z = C1229320i5y.LIZ;
                c1229330i5z.LIZLLL = strLIZJ;
                c1229330i5z.LJ = strLJFF;
                C2296808zG.LJFF(interfaceC497601wk);
                IMCrossAppFeatureDiffApi.LIZ.getClass();
                IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
                if (iMCrossAppFeatureDiffApiLIZIZ != null) {
                    iMCrossAppFeatureDiffApiLIZIZ.LIZ();
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C1230440i7m c1230440i7m2 = C1230440i7m.LIZJ;
                    ViewGroup viewGroup2 = this.LLILZ;
                    WeakReference<Function0<Unit>> weakReference2 = this.LLILLL;
                    c1230440i7m2.getClass();
                    C1230440i7m.LJI(viewGroup2, weakReference2);
                    C1229320i5y.LIZLLL(new C1229340i60(0, groupInvitePopupResponse.popupMeta.userGroupStatus, C0ZBV.SUCCESS, 1));
                    this.LLILZIL.LIZ(groupInvitePopupResponse);
                } else {
                    C1230440i7m c1230440i7m3 = C1230440i7m.LIZJ;
                    final ViewGroup viewGroup3 = this.LLILZ;
                    long j = groupInvitePopupResponse.popupMeta.groupInfo.convShortId;
                    final InterfaceC1230230i7R interfaceC1230230i7R = this.LLILZIL;
                    final WeakReference<Function0<Unit>> weakReference3 = this.LLILLL;
                    c1230440i7m3.getClass();
                    C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
                    C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(c0ysq).LIZ(strValueOf);
                    if (c0y8tLIZ != null) {
                        C1230440i7m.LJFF(viewGroup3, c0y8tLIZ, groupInvitePopupResponse, interfaceC1230230i7R, weakReference3);
                    } else {
                        C0YSQ.LIZIZ(c0ysq).LJJI(strValueOf, j, AbstractC1711506n3.LIZIZ, new InterfaceC863600XuI<C0Y8T>() { // from class: X.0i7O
                            @Override // X.InterfaceC863600XuI
                            public final void LIZIZ(C0YMW c0ymw) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1230210i7P(strValueOf, viewGroup3, groupInvitePopupResponse, interfaceC1230230i7R, weakReference3, null), 3);
                            }

                            @Override // X.InterfaceC863600XuI
                            public final void onSuccess(C0Y8T c0y8t) {
                                C1230440i7m c1230440i7m4 = C1230440i7m.LIZJ;
                                ViewGroup viewGroup4 = viewGroup3;
                                GroupInvitePopupResponse groupInvitePopupResponse2 = groupInvitePopupResponse;
                                InterfaceC1230230i7R interfaceC1230230i7R2 = interfaceC1230230i7R;
                                WeakReference<Function0<Unit>> weakReference4 = weakReference3;
                                c1230440i7m4.getClass();
                                C1230440i7m.LJFF(viewGroup4, c0y8t, groupInvitePopupResponse2, interfaceC1230230i7R2, weakReference4);
                            }
                        });
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1229320i5y.LIZ.LJI = System.currentTimeMillis();
            if (e instanceof C0XIR) {
                c23112093u = (C23112093u) e;
            }
            if (c23112093u != null) {
                errorCode = c23112093u.getErrorCode();
            } else {
                errorCode = -1;
            }
            C1229320i5y.LIZLLL(new C1229340i60(errorCode, 0, C0ZBV.ABNORMAL_FAIL, 2));
            C1230440i7m c1230440i7m4 = C1230440i7m.LIZJ;
            ViewGroup viewGroup4 = this.LLILZ;
            WeakReference<Function0<Unit>> weakReference4 = this.LLILLL;
            c1230440i7m4.getClass();
            C1230440i7m.LJI(viewGroup4, weakReference4);
            IToastHelper iToastHelper2 = (IToastHelper) PluggableExtentionKt.pluggableSpi$default(IToastHelper.class, false, false, false, 14, null);
            if (iToastHelper2 != null) {
                iToastHelper2.LIZ(EnumC1365740le0.TOP, this.LLILZLL, 3000L, AFwS201S0000000_14.get$arr$(291), false, 3, false, UUID.randomUUID().toString(), C0ZTX.LIZ);
            }
            this.LLILZIL.onFail();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupInvitationImpl@19a2.tryOpenGroupInvitationSheet$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
