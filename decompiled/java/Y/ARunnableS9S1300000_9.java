package Y;

import X.C0NBW;
import X.C0OU7;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1334040kos;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1537720q7O;
import X.C1540620qC4;
import X.C1C7U;
import X.C438710HIf;
import X.C585010Mx1;
import X.C620080OTu;
import X.C623670OdB;
import X.C623710OdF;
import X.C623720OdG;
import X.C630900Ooq;
import X.C786410Ut5;
import X.EnumC1334360kpO;
import X.EnumC623730OdH;
import X.InterfaceC1334290kpH;
import X.InterfaceC2217461Bqa;
import X.InterfaceC605070NoH;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicIgnoreCopyRightDescAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.share.OpenPlatformServiceImpl;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS9S1300000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((BulletinBoardPageHybridAssem) this.l1).LLLFFI) {
            C1540620qC4 c1540620qC4 = ((BulletinBoardPageHybridAssem) this.l1).LLJILLL;
            if (c1540620qC4 != null) {
                c1540620qC4.LJJI((C1537720q7O) this.l2);
                return;
            }
            return;
        }
        ((BulletinBoardPageHybridAssem) this.l1).LLLF.addLast(new C620080OTu((C1537720q7O) this.l2, (C0OU7) this.l3, this.s0));
        BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem = (BulletinBoardPageHybridAssem) this.l1;
        if (bulletinBoardPageHybridAssem.LLLFF || !(!bulletinBoardPageHybridAssem.LLLF.isEmpty())) {
            return;
        }
        bulletinBoardPageHybridAssem.LLLFF = true;
        C786410Ut5.v2().postFrameCallback(bulletinBoardPageHybridAssem.LLLFZ);
    }

    public final void LIZ$1() {
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) this.l1;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed((C1481290oeN) this.l2);
            ((OnUIPlayListener) this.l1).onPlayFailed(this.s0, (C1481290oeN) this.l2, (C1480430ocz) this.l3);
            C0NBW.LIZIZ().LIZ(new C585010Mx1(this.s0, (C1481290oeN) this.l2), "PlayerCallback_FAILED");
        }
    }

    public final void LIZ$2() {
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) this.l1;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed((C1481290oeN) this.l2);
            ((OnUIPlayListener) this.l1).onPlayFailed(this.s0, (C1481290oeN) this.l2, (C1480430ocz) this.l3);
            C0NBW.LIZIZ().LIZ(new C585010Mx1(this.s0, (C1481290oeN) this.l2), "PlayerCallback_FAILED");
        }
    }

    public final void LIZ$3() {
        ((MusicIgnoreCopyRightDescAssem) this.l1).lp((TuxTextView) this.l2);
        ((TuxTextView) this.l2).setText(new SpannableStringBuilder(this.s0));
        MusicIgnoreCopyRightDescAssem musicIgnoreCopyRightDescAssem = (MusicIgnoreCopyRightDescAssem) this.l1;
        Music music = (Music) this.l3;
        AssemVMLazy assemVMLazy = musicIgnoreCopyRightDescAssem.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MusicIgnoreCopyRightDescAssem.LLJJJJ;
        String str = ((MusicDetailViewModel) assemVMLazy.getValue()).LLILZ;
        if (musicIgnoreCopyRightDescAssem.LLJJIII) {
            return;
        }
        C630900Ooq.LIZ.getClass();
        musicIgnoreCopyRightDescAssem.LLJJIII = C630900Ooq.LIZIZ(music, str, true);
    }

    public final void LIZ$4() {
        List<C623710OdF> listPutIfAbsent;
        Object tag;
        ExecutorService executorService = C623720OdG.LIZ;
        final WeakReference weakReference = (WeakReference) this.l1;
        UrlModel urlModel = (UrlModel) this.l2;
        final String str = this.s0;
        C623670OdB c623670OdB = (C623670OdB) this.l3;
        final String str2 = c623670OdB.LIZJ;
        EnumC1334360kpO enumC1334360kpO = c623670OdB.LIZLLL;
        final C1331730kl9 c1331730kl9 = c623670OdB.LJ;
        final Bitmap.Config config = c623670OdB.LJFF;
        final boolean z = c623670OdB.LJI;
        final String str3 = c623670OdB.LJIIIIZZ;
        final long j = c623670OdB.LJIIIZ;
        Object obj = (InterfaceC1334290kpH) weakReference.get();
        if (obj != null) {
            if ((obj instanceof View) && ((tag = ((View) obj).getTag(1897549899)) == null || !Intrinsics.LJFF(tag, str))) {
                C1334040kos c1334040kos = C1334040kos.LIZ;
                EnumC623730OdH enumC623730OdH = EnumC623730OdH.ERROR;
                c1334040kos.getClass();
                C1334040kos.LJFF(str2, str3, enumC623730OdH, "View recycled, skip loading", 0L);
                return;
            }
            HashSet<String> hashSet = C623720OdG.LIZJ;
            synchronized (hashSet) {
                try {
                    if (!hashSet.contains(str)) {
                        hashSet.add(str);
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                        c1331670kl3LJIIIIZZ.LJJIII = enumC1334360kpO;
                        c1331670kl3LJIIIIZZ.LJJJJ = str2;
                        c1331670kl3LJIIIIZZ.LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0OdE
                            @Override // X.InterfaceC605070NoH
                            public final void onCanceled() {
                                HashSet<String> hashSet2 = C623720OdG.LIZJ;
                                String str4 = str;
                                synchronized (hashSet2) {
                                    try {
                                        hashSet2.remove(str4);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                C1334040kos c1334040kos2 = C1334040kos.LIZ;
                                String str5 = str2;
                                String str6 = str3;
                                EnumC623730OdH enumC623730OdH2 = EnumC623730OdH.ERROR;
                                c1334040kos2.getClass();
                                C1334040kos.LJFF(str5, str6, enumC623730OdH2, "download canceled", 0L);
                                C623720OdG.LIZLLL.remove(str);
                            }

                            @Override // X.InterfaceC605070NoH
                            public final void LIZ(final File file) {
                                HashSet<String> hashSet2 = C623720OdG.LIZJ;
                                String str4 = str;
                                synchronized (hashSet2) {
                                    try {
                                        hashSet2.remove(str4);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                if (file != null) {
                                    final WeakReference<InterfaceC1334290kpH> weakReference2 = weakReference;
                                    final String str5 = str2;
                                    final C1331730kl9 c1331730kl92 = c1331730kl9;
                                    final Bitmap.Config config2 = config;
                                    final boolean z2 = z;
                                    final String str6 = str3;
                                    final long j2 = j;
                                    C786410Ut5.LJJZZIII(C623720OdG.LIZIZ, new Runnable() { // from class: X.0OdD
                                        public final void LIZ() {
                                            InterfaceC1334290kpH interfaceC1334290kpH = weakReference2.get();
                                            if (interfaceC1334290kpH == null) {
                                                return;
                                            }
                                            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(file);
                                            c1331670kl3LJII.LJJ(interfaceC1334290kpH);
                                            String str7 = str5;
                                            c1331670kl3LJII.LJJJJ = str7;
                                            c1331670kl3LJII.LJJJIL = C1334040kos.LIZJ(C1334040kos.LIZ, str7, str6, j2, 2);
                                            C1331730kl9 c1331730kl93 = c1331730kl92;
                                            if (c1331730kl93 != null) {
                                                c1331670kl3LJII.LJJI = c1331730kl93;
                                            }
                                            Bitmap.Config config3 = config2;
                                            if (config3 != null) {
                                                c1331670kl3LJII.LJIL = config3;
                                            }
                                            if (z2) {
                                                c1331670kl3LJII.LIZLLL = true;
                                            }
                                            C786410Ut5.h3(c1331670kl3LJII);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("BulletinImageAsyncLoader@9823.displayToView$1");
                                            try {
                                                LIZ();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("BulletinImageAsyncLoader@9823.displayToView$1");
                                        }
                                    });
                                }
                                List<C623710OdF> listRemove = C623720OdG.LIZLLL.remove(str);
                                if (listRemove != null) {
                                    for (C623710OdF c623710OdF : listRemove) {
                                        if (file != null) {
                                            ExecutorService executorService2 = C623720OdG.LIZ;
                                            final WeakReference<InterfaceC1334290kpH> weakReference3 = c623710OdF.LIZ;
                                            final String str7 = c623710OdF.LIZIZ;
                                            final C1331730kl9 c1331730kl93 = c623710OdF.LIZLLL;
                                            final Bitmap.Config config3 = c623710OdF.LJ;
                                            final boolean z3 = c623710OdF.LJFF;
                                            final String str8 = c623710OdF.LJI;
                                            final long j3 = c623710OdF.LJII;
                                            C786410Ut5.LJJZZIII(C623720OdG.LIZIZ, new Runnable() { // from class: X.0OdD
                                                public final void LIZ() {
                                                    InterfaceC1334290kpH interfaceC1334290kpH = weakReference3.get();
                                                    if (interfaceC1334290kpH == null) {
                                                        return;
                                                    }
                                                    C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(file);
                                                    c1331670kl3LJII.LJJ(interfaceC1334290kpH);
                                                    String str72 = str7;
                                                    c1331670kl3LJII.LJJJJ = str72;
                                                    c1331670kl3LJII.LJJJIL = C1334040kos.LIZJ(C1334040kos.LIZ, str72, str8, j3, 2);
                                                    C1331730kl9 c1331730kl932 = c1331730kl93;
                                                    if (c1331730kl932 != null) {
                                                        c1331670kl3LJII.LJJI = c1331730kl932;
                                                    }
                                                    Bitmap.Config config32 = config3;
                                                    if (config32 != null) {
                                                        c1331670kl3LJII.LJIL = config32;
                                                    }
                                                    if (z3) {
                                                        c1331670kl3LJII.LIZLLL = true;
                                                    }
                                                    C786410Ut5.h3(c1331670kl3LJII);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean zLIZ;
                                                    C1C7U.LIZ("BulletinImageAsyncLoader@9823.displayToView$1");
                                                    try {
                                                        LIZ();
                                                    } finally {
                                                        if (!zLIZ) {
                                                        }
                                                    }
                                                    C1C7U.LIZIZ("BulletinImageAsyncLoader@9823.displayToView$1");
                                                }
                                            });
                                        }
                                    }
                                }
                            }

                            @Override // X.InterfaceC605070NoH
                            public final void onFailed(Throwable th) {
                                String message;
                                HashSet<String> hashSet2 = C623720OdG.LIZJ;
                                String str4 = str;
                                synchronized (hashSet2) {
                                    try {
                                        hashSet2.remove(str4);
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        throw th2;
                                    }
                                }
                                if (th == null || (message = th.getMessage()) == null) {
                                    message = "download failed";
                                }
                                C1334040kos c1334040kos2 = C1334040kos.LIZ;
                                String str5 = str2;
                                String str6 = str3;
                                EnumC623730OdH enumC623730OdH2 = EnumC623730OdH.ERROR;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("download failed: ");
                                sbLIZ.append(message);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                long j2 = j;
                                c1334040kos2.getClass();
                                C1334040kos.LJFF(str5, str6, enumC623730OdH2, strLIZIZ, j2);
                                C1334040kos.LJIIIIZZ(-1L, str2, message);
                                C623720OdG.LIZLLL.remove(str);
                            }
                        });
                        return;
                    }
                    C623710OdF c623710OdF = new C623710OdF(weakReference, str2, enumC1334360kpO, c1331730kl9, config, z, str3, j);
                    ConcurrentHashMap<String, List<C623710OdF>> concurrentHashMap = C623720OdG.LIZLLL;
                    List<C623710OdF> arrayList = concurrentHashMap.get(str);
                    if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList<>()))) != null) {
                        arrayList = listPutIfAbsent;
                    }
                    arrayList.add(c623710OdF);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static final void run$0(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("OpenPlatformServiceImpl@bf65.openLoginPage$1");
        try {
            EventBus.LIZLLL().LJIJJ((OpenPlatformServiceImpl) aRunnableS9S1300000_9.l1);
            ((OpenPlatformServiceImpl) aRunnableS9S1300000_9.l1).LJ((Activity) aRunnableS9S1300000_9.l2, new ArrayList(), aRunnableS9S1300000_9.s0, (Bundle) aRunnableS9S1300000_9.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OpenPlatformServiceImpl@bf65.openLoginPage$1");
    }

    public static final void run$1(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        PlayerController playerController = (PlayerController) aRunnableS9S1300000_9.l1;
        String str = aRunnableS9S1300000_9.s0;
        IBaseListFragmentPanel iBaseListFragmentPanel = (IBaseListFragmentPanel) aRunnableS9S1300000_9.l2;
        Aweme aweme = (Aweme) aRunnableS9S1300000_9.l3;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.onPlayCompletedFirstTime$1L");
        playerController.LLJJJJ(str, iBaseListFragmentPanel, aweme);
        C1C7U.LIZIZ("PlayerController@7763.onPlayCompletedFirstTime$1L");
    }

    public static final void run$2(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinBoardPageHybridAssem@4dcd.getHybridViewAsync$cachedView$2$1");
        try {
            aRunnableS9S1300000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinBoardPageHybridAssem@4dcd.getHybridViewAsync$cachedView$2$1");
    }

    public static final void run$3(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerOnErrorHelper@3969.onError$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS9S1300000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayFailed((C1481290oeN) aRunnableS9S1300000_9.l2);
                ((OnUIPlayListener) aRunnableS9S1300000_9.l1).onPlayFailed(aRunnableS9S1300000_9.s0, (C1481290oeN) aRunnableS9S1300000_9.l2, (C1480430ocz) aRunnableS9S1300000_9.l3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerOnErrorHelper@3969.onError$1");
    }

    public static final void run$4(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.reportEmptyUrlPlayFailed$1");
        try {
            aRunnableS9S1300000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.reportEmptyUrlPlayFailed$1");
    }

    public static final void run$5(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.initPlayer$1$onError$1");
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS9S1300000_9.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayFailed((C1481290oeN) aRunnableS9S1300000_9.l2);
                ((OnUIPlayListener) aRunnableS9S1300000_9.l1).onPlayFailed(aRunnableS9S1300000_9.s0, (C1481290oeN) aRunnableS9S1300000_9.l2, (C1480430ocz) aRunnableS9S1300000_9.l3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.initPlayer$1$onError$1");
    }

    public static final void run$6(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPrepareInternalHelper@a4a9.reportEmptyUrlPlayFailed$1");
        try {
            aRunnableS9S1300000_9.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPrepareInternalHelper@a4a9.reportEmptyUrlPlayFailed$1");
    }

    public static final void run$7(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MusicIgnoreCopyRightDescAssem@30f9.startUpMusicDesc$1$1");
        try {
            aRunnableS9S1300000_9.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicIgnoreCopyRightDescAssem@30f9.startUpMusicDesc$1$1");
    }

    public static final void run$8(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDescAssem@1774.startUpMusicDesc$2$2");
        try {
            ((MusicDescAssem) aRunnableS9S1300000_9.l1).tp((TuxTextView) aRunnableS9S1300000_9.l2, (MusicDetail) aRunnableS9S1300000_9.l3, aRunnableS9S1300000_9.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDescAssem@1774.startUpMusicDesc$2$2");
    }

    public static final void run$9(ARunnableS9S1300000_9 aRunnableS9S1300000_9) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinImageAsyncLoader$Builder@2768.load$1");
        try {
            aRunnableS9S1300000_9.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinImageAsyncLoader$Builder@2768.load$1");
    }

    public ARunnableS9S1300000_9(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }

    public ARunnableS9S1300000_9(PlayerController playerController, String str, IBaseListFragmentPanel iBaseListFragmentPanel, Aweme aweme, boolean z, int i) {
        this.$t = i;
        this.l1 = playerController;
        this.s0 = str;
        this.l2 = iBaseListFragmentPanel;
        this.l3 = aweme;
    }
}
