package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.AwS12S0300100_18;

/* JADX INFO: renamed from: X.0hXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207920hXS implements InterfaceC19359210oY {
    public final C1207520hWo LIZ;

    public C1207920hXS() {
        this(null);
    }

    public C1207920hXS(C1207520hWo c1207520hWo) {
        this.LIZ = c1207520hWo;
    }

    @Override // X.InterfaceC19359210oY
    public final C12Q8 LIZ(final Activity activity, AbstractC1207960hXW abstractC1207960hXW) {
        if (abstractC1207960hXW instanceof C1207950hXV) {
            final boolean z = ((C1207950hXV) abstractC1207960hXW).LIZ;
            return new C12Q8() { // from class: X.0hXM
                public InterfaceC1207430hWf LIZ;

                @Override // X.C12Q8
                public final void LIZ() {
                    InterfaceC1207430hWf interfaceC1207430hWf = this.LIZ;
                    if (interfaceC1207430hWf != null) {
                        interfaceC1207430hWf.hide();
                    }
                }

                @Override // X.C12Q8
                public final void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3) {
                    String strLJJIIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (z) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = activity.getString(2131844821);
                        }
                        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                        if (iLocationBaseServiceForMT != null) {
                            strLJJIIZ = iLocationBaseServiceForMT.LJJIIZ(activity);
                        } else {
                            strLJJIIZ = null;
                        }
                        this.LIZ = C0JOG.LIZ(activity, strLJJIIZ, str2);
                        return;
                    }
                    if (c12qb == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    C1397580mTM c1397580mTM = new C1397580mTM(activity2);
                    c1397580mTM.LJI(activity2.getResources().getString(2131850512));
                    c1397580mTM.LIZIZ(str2);
                    c1397580mTM.LJII = false;
                    C1238130iKB.LIZ(c1397580mTM, new AwS12S0300100_18(jCurrentTimeMillis, activity, c12qb, this, 3));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
            };
        }
        if (!(abstractC1207960hXW instanceof C1207980hXY)) {
            return null;
        }
        C1207520hWo c1207520hWo = this.LIZ;
        if (c1207520hWo != null && c1207520hWo.LJ) {
            return null;
        }
        return new C1207910hXR(activity, this);
    }
}
