package Y;

import X.C098200Yq;
import X.C0K6W;
import X.C0K7C;
import X.C0K7D;
import X.C0K7E;
import X.C0K7H;
import X.C0K7M;
import X.C0K7Q;
import X.C1106200etO;
import X.C1106210etP;
import X.C1161920gLG;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C2102208Lk;
import X.C2188811AlT;
import X.C259800zU;
import X.C464660IKa;
import X.C504210Jpz;
import X.C512310K7h;
import X.C516850KOt;
import X.C520010KaN;
import X.C786410Ut5;
import X.InterfaceC1372610lp5;
import X.InterfaceC214897198d;
import X.InterfaceC481210Itz;
import X.InterfaceC516840KOs;
import X.InterfaceC634840OvC;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS12S1100000_7;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.share.LiveShareDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS67S0301000_7;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS6S0500000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0K7D, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ$0() {
        C0K7D c0k7d;
        C259800zU c259800zU = (C259800zU) this.l0;
        PrivilegeRepository privilegeRepository = (PrivilegeRepository) this.l3;
        C0K6W c0k6w = (C0K6W) this.l1;
        ?? c0k7d2 = new C0K7D((PGCGetSubPrivilegeDetailResponse.Data) this.l2);
        privilegeRepository.LLILLJJLI.put(c0k6w, (C0K7H) c0k7d2);
        c259800zU.element = c0k7d2;
        T t = ((C259800zU) this.l0).element;
        if (!(t instanceof C0K7D) || (c0k7d = (C0K7D) t) == null) {
            return;
        }
        C0K7M c0k7m = (C0K7M) this.l4;
        PrivilegeRepository privilegeRepository2 = (PrivilegeRepository) this.l3;
        C0K6W c0k6w2 = (C0K6W) this.l1;
        c0k7m.oP(c0k7d, false);
        List<C0K7M> list = privilegeRepository2.LLILZ.get(c0k6w2);
        if (list != null) {
            Iterator<C0K7M> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().oP(c0k7d, false);
            }
        }
        List<C0K7M> list2 = privilegeRepository2.LLILZ.get(c0k6w2);
        if (list2 != null) {
            list2.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0K7C, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ$1() {
        C0K7C c0k7c;
        C259800zU c259800zU = (C259800zU) this.l0;
        PrivilegeRepository privilegeRepository = (PrivilegeRepository) this.l3;
        C0K6W c0k6w = (C0K6W) this.l1;
        ?? c0k7c2 = new C0K7C(C512310K7h.LIZIZ((Throwable) this.l2), (Throwable) this.l2);
        privilegeRepository.LLILLJJLI.put(c0k6w, (C0K7H) c0k7c2);
        c259800zU.element = c0k7c2;
        T t = ((C259800zU) this.l0).element;
        if (!(t instanceof C0K7C) || (c0k7c = (C0K7C) t) == null) {
            return;
        }
        C0K7M c0k7m = (C0K7M) this.l4;
        PrivilegeRepository privilegeRepository2 = (PrivilegeRepository) this.l3;
        C0K6W c0k6w2 = (C0K6W) this.l1;
        c0k7m.he(c0k7c);
        List<C0K7M> list = privilegeRepository2.LLILZ.get(c0k6w2);
        if (list != null) {
            Iterator<C0K7M> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().he(c0k7c);
            }
        }
        List<C0K7M> list2 = privilegeRepository2.LLILZ.get(c0k6w2);
        if (list2 != null) {
            list2.clear();
        }
    }

    public final void LIZ$2() {
        InterfaceC634840OvC interfaceC634840OvC;
        Activity activityLIZLLL;
        if (((Room) this.l0) == null || (interfaceC634840OvC = ((C516850KOt) this.l1).IBridgeSdkContext) == null || (activityLIZLLL = interfaceC634840OvC.LIZLLL()) == null) {
            return;
        }
        C516850KOt c516850KOt = (C516850KOt) this.l1;
        Room room = (Room) this.l0;
        Map<String, String> map = (Map) this.l2;
        final InterfaceC516840KOs interfaceC516840KOs = (InterfaceC516840KOs) this.l3;
        final CompletionBlock completionBlock = (CompletionBlock) this.l4;
        boolean z = activityLIZLLL.getResources().getConfiguration().orientation == 1;
        InterfaceC634840OvC interfaceC634840OvC2 = c516850KOt.IBridgeSdkContext;
        Activity activityLIZLLL2 = interfaceC634840OvC2 != null ? interfaceC634840OvC2.LIZLLL() : null;
        final C19EG c19eg = activityLIZLLL2 instanceof C19EG ? (C19EG) activityLIZLLL2 : null;
        if (c19eg == null) {
            C20441214yg.LJ("ShareGamePlayTogetherMethod", "fragmentActivity is null");
            return;
        }
        boolean z2 = (C504210Jpz.LIZ || C464660IKa.LIZ()) && (activityLIZLLL instanceof InterfaceC214897198d);
        InterfaceC634840OvC interfaceC634840OvC3 = c516850KOt.IBridgeSdkContext;
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(interfaceC634840OvC3 != null ? interfaceC634840OvC3.getContext() : null, false);
        if (fragmentManagerLJIL == null) {
            fragmentManagerLJIL = c19eg.getSupportFragmentManager();
        }
        C1106200etO c1106200etO = new C1106200etO(room);
        c1106200etO.LJIL = map;
        c1106200etO.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        c1106200etO.LJJLIIIJJI = 1;
        c1106200etO.LJJJJLI = "play_together_invite";
        c1106200etO.LJJJI = z;
        c1106200etO.LJJJIL = true;
        c1106200etO.LJJLIIIJL = z2;
        final C1106210etP c1106210etP = new C1106210etP(c1106200etO);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shareParams: ");
        sbLIZ.append(c1106210etP);
        C20441214yg.LIZIZ("ShareGamePlayTogetherMethod", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
        InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0KOr
            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map2) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map2) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map2) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
                C20441214yg.LJI("ShareGamePlayTogetherMethod", th);
                interfaceC516840KOs.setSuccess(Boolean.FALSE);
                interfaceC516840KOs.setPlatform("");
                completionBlock.onSuccess(interfaceC516840KOs, "");
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str, String str2, Bundle bundle) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("success, shareParams: ");
                sbLIZ2.append(c1106210etP);
                sbLIZ2.append(", fragmentActivity: ");
                sbLIZ2.append(c19eg.getClass().getSimpleName());
                C20441214yg.LIZIZ("ShareGamePlayTogetherMethod", C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC516840KOs.setSuccess(Boolean.TRUE);
                interfaceC516840KOs.setPlatform(str);
                completionBlock.onSuccess(interfaceC516840KOs, "");
            }
        };
        interfaceC481210ItzMh.getClass();
        if (z) {
            LiveShareDialog.NR(c19eg, c1106210etP, interfaceC1372610lp5);
            return;
        }
        LiveShareDialog liveShareDialogMR = LiveShareDialog.MR(c1106210etP, interfaceC1372610lp5);
        if (fragmentManagerLJIL != null) {
            liveShareDialogMR.show(fragmentManagerLJIL, "LiveShareDialog");
        }
    }

    public final void LIZ$3() {
        Object c098200Yq;
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = (SubPrivilegeDetailFullPage) this.l0;
        View view = (View) this.l1;
        Context context = (Context) this.l4;
        try {
            subPrivilegeDetailFullPage.getClass();
            c098200Yq = SubPrivilegeDetailFullPage.MR(context, view);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Bitmap bitmap = (Bitmap) c098200Yq;
        C786410Ut5.LJLLLLLL(8, (View) this.l1);
        if (bitmap == null) {
            ((Function0) this.l2).invoke();
            return;
        }
        final SubPrivilegeDetailFullPage subPrivilegeDetailFullPage2 = (SubPrivilegeDetailFullPage) this.l0;
        final View view2 = (View) this.l1;
        final Function1 function1 = (Function1) this.l3;
        final Function0 function0 = (Function0) this.l2;
        subPrivilegeDetailFullPage2.getClass();
        C0K7E c0k7e = C0K7E.LIZ;
        C0K7Q c0k7q = new C0K7Q() { // from class: X.0K7P
            @Override // X.C0K7Q
            public final void LIZ() {
                HandlerHook.viewPost(view2, new ARunnableS107S0100000_7((Function0) function0, 260));
            }

            @Override // X.C0K7Q
            public final void LIZIZ(String str) {
                subPrivilegeDetailFullPage2.getClass();
                C0K7E.LIZ.getClass();
                C0K76.LIZ.getClass();
                if (str != null && str.length() != 0) {
                    try {
                        C0K77 c0k77LIZ = C0K76.LIZ();
                        if (c0k77LIZ != null) {
                            String strLJIIIIZZ = c0k77LIZ.LJIIIIZZ(str);
                            if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
                                HandlerHook.viewPost(view2, new ARunnableS12S1100000_7(function1, strLJIIIIZZ, 15));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                HandlerHook.viewPost(view2, new ARunnableS107S0100000_7((Function0) function0, 261));
            }
        };
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        c0k7e.getClass();
        C2102208Lk.LIZ("pgc-sub-link-share-upload", new AwS67S0301000_7(100, compressFormat, bitmap, c0k7q, 1), 23);
    }

    public static final void run$0(ARunnableS6S0500000_7 aRunnableS6S0500000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$2$pausedRunnable$1");
        try {
            aRunnableS6S0500000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$2$pausedRunnable$1");
    }

    public static final void run$1(ARunnableS6S0500000_7 aRunnableS6S0500000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$3$pausedRunnable$1");
        try {
            aRunnableS6S0500000_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivilegeRepository@5946.fetchPrivilegeDetail$2$3$pausedRunnable$1");
    }

    public static final void run$2(ARunnableS6S0500000_7 aRunnableS6S0500000_7) {
        boolean zLIZ;
        C1C7U.LIZ("ShareGamePlayTogetherMethod@a152.handle$1");
        try {
            aRunnableS6S0500000_7.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareGamePlayTogetherMethod@a152.handle$1");
    }

    public static final void run$3(ARunnableS6S0500000_7 aRunnableS6S0500000_7) {
        boolean zLIZ;
        C1C7U.LIZ("SubPrivilegeDetailFullPage@8e7b.generateAndUploadSubLinkShareImg$tryCaptureAndUpload$1");
        try {
            aRunnableS6S0500000_7.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubPrivilegeDetailFullPage@8e7b.generateAndUploadSubLinkShareImg$tryCaptureAndUpload$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS6S0500000_7(Object obj, Room room, C516850KOt c516850KOt, Map<String, String> map, InterfaceC516840KOs interfaceC516840KOs, CompletionBlock<InterfaceC516840KOs> completionBlock) {
        this.$t = completionBlock;
        this.l0 = obj;
        this.l1 = room;
        this.l2 = c516850KOt;
        this.l3 = map;
        this.l4 = interfaceC516840KOs;
    }
}
