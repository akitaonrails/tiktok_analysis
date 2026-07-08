package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.popup.dynamic.DynamicPopupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15qP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.popup.dynamic.spark.FeedPopupSparkPreloader$preload$1", f = "FeedPopupSparkPreloader.kt", l = {}, m = "invokeSuspend")
public final class C20644715qP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DynamicPopupInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20644715qP(DynamicPopupInfo dynamicPopupInfo, InterfaceC1364105Vn<? super C20644715qP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dynamicPopupInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20644715qP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedPopupSparkPreloader@427.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload element_label:");
        sbLIZ.append(this.LL.popupKey);
        sbLIZ.append(" trigger_id:");
        sbLIZ.append(this.LL.triggerId);
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        String str = this.LL.geckoChannel;
        if (str != null && str.length() != 0) {
            C20548215aq c20548215aq = C20548215aq.LIZ;
            String str2 = this.LL.geckoChannel;
            c20548215aq.getClass();
            C20548215aq.LIZ(str2);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("geckoChannel is empty. popupKey=");
            sbLIZ2.append(this.LL.popupKey);
            C20589415hU.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C054G c054g = C1303570k1j.LIZ;
        DynamicPopupInfo dynamicPopupInfo = this.LL;
        final C20644415qM c20644415qMLIZ = C20644515qN.LIZ(dynamicPopupInfo);
        if (c20644415qMLIZ == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cacheSparkManager: key is null. popupKey=");
            sbLIZ3.append(dynamicPopupInfo.popupKey);
            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            C20644815qQ c20644815qQ = new C20644815qQ(dynamicPopupInfo, null);
            C1303560k1i c1303560k1i = C1303570k1j.LIZIZ;
            synchronized (c1303560k1i) {
                try {
                    synchronized (c1303560k1i) {
                        try {
                            C20644815qQ c20644815qQ2 = c1303560k1i.get(c20644415qMLIZ);
                            if (c20644815qQ2 != null && c20644815qQ2.LIZLLL != EnumC20574215f2.LLILLJJLI) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("cacheSparkManager: use cache. popupKey=");
                                sbLIZ4.append(dynamicPopupInfo.popupKey);
                                C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                            } else {
                                c1303560k1i.put(c20644415qMLIZ, c20644815qQ);
                                c20644815qQ.LIZLLL(new InterfaceC20646115qd() { // from class: X.0k0Y
                                    @Override // X.InterfaceC20646115qd
                                    public final void LIZ(C20644815qQ c20644815qQ3) {
                                    }

                                    @Override // X.InterfaceC20646115qd
                                    public final void LIZIZ() {
                                        C23250099c.LIZLLL(C1303570k1j.LIZ, null, null, new C1300250jwN(c20644415qMLIZ, null), 3);
                                    }
                                });
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedPopupSparkPreloader@427.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
