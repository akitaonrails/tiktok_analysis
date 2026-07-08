package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import j27.s;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0kLW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315840kLW {
    public static final C1324630kZh LJIIJJI = new C1324630kZh(LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
    public int LIZ;
    public int LIZIZ;
    public s LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public Drawable LJFF;
    public C1320770kTT<C1331070kk5> LJI;
    public C1339420kxY LJII;
    public C1320810kTX LJIIIIZZ;
    public InterfaceC1320380kSq LJIIIZ;
    public final CountDownLatch LJIIJ;

    public C1315840kLW(final String str, final s sVar, final C1315280kKc c1315280kKc, final C1320310kSj c1320310kSj, final boolean z, boolean z2) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.LJIIJ = countDownLatch;
        C1289620jfE.LIZLLL(new Runnable() { // from class: X.0kLS
            /* JADX WARN: Type inference failed for: r5v1, types: [REQUEST, X.0kMF] */
            @Override // java.lang.Runnable
            public final void run() {
                C1315840kLW c1315840kLW = this.LL;
                String str2 = str;
                s sVar2 = sVar;
                C1315280kKc c1315280kKc2 = c1315280kKc;
                boolean z3 = z;
                InterfaceC1320380kSq interfaceC1320380kSq = c1320310kSj;
                c1315840kLW.getClass();
                C1C7U.LIZ("MarkdownImage@27d8.<init>$1L");
                c1315840kLW.LJ = str2;
                c1315840kLW.LIZJ = sVar2;
                if (str2 != null) {
                    String strLIZ = C1294030jmL.LIZ(sVar2, str2, false);
                    c1315840kLW.LJ = strLIZ;
                    Uri uri = UriProtector.parse(strLIZ);
                    if (uri.getScheme() == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Image src should not be relative url : ");
                        sbLIZ.append(c1315840kLW.LJ);
                        LynxLog.e("Lynx", C2188811AlT.LIZIZ(sbLIZ));
                    } else if (uri != Uri.EMPTY) {
                        if (c1315280kKc2 != null) {
                            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
                            if (z3) {
                                c1325700kbQLIZLLL.LIZJ = C1315840kLW.LJIIJJI;
                            }
                            C1315790kLR.LIZ(c1325700kbQLIZLLL);
                            ?? c1316290kMF = new C1316290kMF(c1325700kbQLIZLLL, null);
                            c1315840kLW.LJIIIIZZ = C1322200kVm.LIZJ();
                            c1315840kLW.LJIIIZ = interfaceC1320380kSq;
                            c1315840kLW.LJII = new C1339420kxY(c1315840kLW, c1315280kKc2, 0);
                            c1315840kLW.LJI = new C1320770kTT<>(new C1331090kk7(c1315840kLW.LIZJ.getResources()).LIZ());
                            C1320810kTX c1320810kTX = c1315840kLW.LJIIIIZZ;
                            c1320810kTX.LIZJ();
                            c1320810kTX.LJIIJJI = true;
                            c1320810kTX.LJIILJJIL = c1315840kLW.LJI.LLILZIL;
                            sVar2.getClass();
                            c1320810kTX.LIZJ = null;
                            c1320810kTX.LIZLLL = c1316290kMF;
                            c1320810kTX.LJIIIIZZ = c1315840kLW.LJII;
                            AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTX.LIZ();
                            c1315840kLW.getClass();
                            c1315840kLW.LJI.LJIIIIZZ(abstractC1320710kTNLIZ);
                            c1315840kLW.LJIIIIZZ.LIZJ();
                            c1315840kLW.LJFF = c1315840kLW.LJI.LIZLLL();
                        }
                        if (c1315840kLW.LJFF != null) {
                            c1315840kLW.LJFF.setCallback(c1315280kKc2);
                            DH dh = c1315840kLW.LJI.LLILZ;
                            dh.getClass();
                            ((C1331070kk5) dh).LJIIZILJ(c1315840kLW.LJIIIZ);
                            c1315840kLW.LJFF.draw(new Canvas());
                        }
                        c1315840kLW.LJIIJ.countDown();
                        C1C7U.LIZIZ("MarkdownImage@27d8.<init>$1L");
                        return;
                    }
                }
                c1315840kLW.LJIIJ.countDown();
                C1C7U.LIZIZ("MarkdownImage@27d8.<init>$1L");
            }
        });
        if (z2) {
            try {
                countDownLatch.await(100L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
