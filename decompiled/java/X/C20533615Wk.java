package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnimImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15Wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20533615Wk implements AnonymousClass1800 {
    public static long LIZIZ;
    public static InterfaceC20533915Wn LJFF;
    public static AnonymousClass0956 LJI;
    public static LiveBagIconAnimation LJII;
    public static final C20533615Wk LIZ = new C20533615Wk();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(8));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(7));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(6));

    @Override // X.AnonymousClass1800
    public final void LIZIZ() {
    }

    @Override // X.AnonymousClass1800
    public final void LIZJ() {
    }

    @Override // X.AnonymousClass1800
    public final void LIZLLL(long j, LiveBagIconAnimation liveBagIconAnimation, AwS610S0100000_31 awS610S0100000_31) {
    }

    @Override // X.AnonymousClass1800
    public final void init(Context context) {
    }

    @Override // X.AnonymousClass1800
    public final boolean isShowing() {
        return false;
    }

    public static HashMap LJFF() {
        return (HashMap) LIZJ.getValue();
    }

    @Override // X.AnonymousClass1800
    public final void LIZ() {
        InterfaceC20533915Wn interfaceC20533915Wn = LJFF;
        if (interfaceC20533915Wn != null) {
            interfaceC20533915Wn.LIZ();
        }
    }

    public static void LJI() {
        Iterator it2 = LJFF().values().iterator();
        while (it2.hasNext()) {
            InterfaceC469401sC interfaceC469401sC = ((C20533815Wm) it2.next()).LIZ;
            if (interfaceC469401sC != null) {
                interfaceC469401sC.cancel();
            }
        }
        LJFF().clear();
        ((C557050Lt1) LIZLLL.getValue()).LIZ(true, false);
        ((C563400M7u) LJ.getValue()).LJ(0);
        LIZIZ = 0L;
        LJII = null;
        LJFF = null;
        AnonymousClass0956 anonymousClass0956 = LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJI = null;
    }

    @Override // X.AnonymousClass1800
    public final void destroy() {
        LJI();
    }

    @Override // X.AnonymousClass1800
    public final void LJ(long j, final LiveBagIconAnimation liveBagIconAnimation) {
        if (liveBagIconAnimation == null) {
            return;
        }
        if (LIZIZ != j) {
            LJI();
            LIZIZ = j;
        }
        LJII = liveBagIconAnimation;
        List<AnimImage> list = liveBagIconAnimation.animationImgList;
        if (list != null) {
            final int i = 0;
            for (AnimImage animImage : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    AnimImage animImage2 = animImage;
                    Integer numValueOf = Integer.valueOf(i);
                    LIZ.getClass();
                    LJFF().put(numValueOf, new C20533815Wm());
                    C20533815Wm c20533815Wm = (C20533815Wm) LJFF().get(Integer.valueOf(i));
                    if (c20533815Wm != null) {
                        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                        String strValueOf = String.valueOf(animImage2.url);
                        c1326790kdB.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strValueOf);
                        C1331750klB c1331750klB = new C1331750klB();
                        c1331750klB.LJ = C0H9H.LIZ(6);
                        c1331750klB.LIZ = false;
                        c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
                        c20533815Wm.LIZ = c1331670kl3LIZLLL.LJJIIJZLJL(new AbstractC468201s0() { // from class: X.15Wl
                            @Override // X.InterfaceC1331910klR
                            public final void LIZ(Bitmap bitmap) {
                                String str;
                                Bitmap bitmap2;
                                List<String> list2;
                                C20533615Wk.LIZ.getClass();
                                C20533815Wm c20533815Wm2 = (C20533815Wm) C20533615Wk.LJFF().get(Integer.valueOf(i));
                                if (c20533815Wm2 != null) {
                                    c20533815Wm2.LIZIZ = bitmap;
                                }
                                ((C563400M7u) C20533615Wk.LJ.getValue()).LIZLLL();
                                List<AnimImage> list3 = liveBagIconAnimation.animationImgList;
                                if (list3 != null) {
                                    Collection collectionValues = C20533615Wk.LJFF().values();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : collectionValues) {
                                        if (((C20533815Wm) obj).LIZIZ != null) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    if (arrayList.size() == list3.size()) {
                                        C20533615Wk.LIZ.getClass();
                                        ((C557050Lt1) C20533615Wk.LIZLLL.getValue()).LIZ(false, true);
                                        InterfaceC20533915Wn interfaceC20533915Wn = C20533615Wk.LJFF;
                                        if (interfaceC20533915Wn != null) {
                                            LiveBagIconAnimation liveBagIconAnimation2 = C20533615Wk.LJII;
                                            if (liveBagIconAnimation2 == null || (list2 = liveBagIconAnimation2.animationTextList) == null || (str = (String) C13LP.LJJJJZI(list2)) == null) {
                                                str = "";
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it2 = C13LP.LJLLJ(C20533615Wk.LJFF().keySet()).iterator();
                                            while (it2.hasNext()) {
                                                int iIntValue = ((Number) it2.next()).intValue();
                                                C20533615Wk.LIZ.getClass();
                                                C20533815Wm c20533815Wm3 = (C20533815Wm) C20533615Wk.LJFF().get(Integer.valueOf(iIntValue));
                                                if (c20533815Wm3 != null) {
                                                    bitmap2 = c20533815Wm3.LIZIZ;
                                                } else {
                                                    bitmap2 = null;
                                                }
                                                arrayList2.add(bitmap2);
                                            }
                                            interfaceC20533915Wn.LIZIZ(new C20534015Wo(str, arrayList2));
                                        }
                                        C20533615Wk.LJFF = null;
                                    }
                                }
                            }

                            @Override // X.InterfaceC1331910klR
                            public final void onFailed(Throwable th) {
                                C21212917zr c21212917zrLIZIZ;
                                C20533615Wk.LIZ.getClass();
                                C20533815Wm c20533815Wm2 = (C20533815Wm) C20533615Wk.LJFF().get(Integer.valueOf(i));
                                if (c20533815Wm2 != null) {
                                    c20533815Wm2.LIZIZ = null;
                                }
                                ((C563400M7u) C20533615Wk.LJ.getValue()).LIZLLL();
                                InterfaceC20533915Wn interfaceC20533915Wn = C20533615Wk.LJFF;
                                if (interfaceC20533915Wn != null) {
                                    interfaceC20533915Wn.onFail();
                                }
                                if (C20533615Wk.LJFF != null && (c21212917zrLIZIZ = C21213217zu.LIZ.LIZIZ(Long.valueOf(C20533615Wk.LIZIZ))) != null) {
                                    c21212917zrLIZIZ.LIZLLL("before_show", "image_download_fail", false);
                                }
                                C20533615Wk.LJFF = null;
                            }
                        });
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
