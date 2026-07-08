package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS13S0301000_20;
import Y.ARunnableS24S1200000_20;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.animax.util.LynxAnimaX;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.jvm.internal.AwS26S1101000_20;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0jjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292290jjX extends FrameLayout {
    public static final AtomicLong LLJILJILJ = new AtomicLong(0);
    public static final AtomicBoolean LLJILLL = new AtomicBoolean(false);
    public final long LL;
    public TextureViewSurfaceTextureListenerC1288630jdd LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public volatile Integer LLILZIL;
    public float LLILZLL;
    public final AtomicInteger LLIZ;
    public C1288190jcv LLIZLLLIL;
    public int LLJ;
    public File LLJI;
    public String LLJIJIL;
    public String LLJILJIL;

    public final void LIZ() {
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILLJJLI;
        if (textureViewSurfaceTextureListenerC1288630jdd == null) {
            return;
        }
        InterfaceC1288650jdf player = textureViewSurfaceTextureListenerC1288630jdd.getPlayer();
        Integer num = this.LLILZIL;
        if (num != null) {
            player.setLoop(num.intValue() > 1);
        } else {
            player.setLoop(this.LLILZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0jcn, X.0jcv] */
    public final TextureViewSurfaceTextureListenerC1288630jdd LJ() {
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILLJJLI;
        if (textureViewSurfaceTextureListenerC1288630jdd != null) {
            return textureViewSurfaceTextureListenerC1288630jdd;
        }
        final TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = new TextureViewSurfaceTextureListenerC1288630jdd(getContext());
        textureViewSurfaceTextureListenerC1288630jdd2.setIgnoreAttachStatus(true);
        textureViewSurfaceTextureListenerC1288630jdd2.setStartFrame(0);
        textureViewSurfaceTextureListenerC1288630jdd2.getPlayer().setAutoPlay(false);
        addView(textureViewSurfaceTextureListenerC1288630jdd2, new FrameLayout.LayoutParams(-1, -1));
        this.LLILLJJLI = textureViewSurfaceTextureListenerC1288630jdd2;
        if (this.LLIZLLLIL == null) {
            ?? r1 = new InterfaceC1288110jcn() { // from class: X.0jcv
                @Override // X.InterfaceC1288110jcn
                public final void LIZ(C1288070jcj c1288070jcj) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LIZIZ(C1288070jcj c1288070jcj) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LIZLLL(C1288070jcj c1288070jcj) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJ(C1288070jcj c1288070jcj) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJFF(C1288090jcl c1288090jcl) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJII(C1288100jcm c1288100jcm) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJIIIZ(C1288070jcj c1288070jcj) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJIIJ(C1288070jcj c1288070jcj) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJIIJJI(C1288070jcj c1288070jcj) {
                }

                @Override // X.InterfaceC1288110jcn
                public final void LIZJ(C1288070jcj c1288070jcj) {
                    int iIntValue;
                    Integer num = this.LIZ.LLILZIL;
                    if (num != null && (iIntValue = num.intValue()) > 1 && this.LIZ.LLIZ.incrementAndGet() >= iIntValue - 1) {
                        textureViewSurfaceTextureListenerC1288630jdd2.getPlayer().setLoop(false);
                    }
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJI(C1288060jci c1288060jci) {
                    C1168400gVi.LIZLLL(new AwS599S0100000_20(c1288060jci, 4));
                }

                @Override // X.InterfaceC1288110jcn
                public final void LJIIIIZZ(C1288060jci c1288060jci) {
                    C1168400gVi.LIZIZ(new AwS599S0100000_20(c1288060jci, 3));
                }
            };
            this.LLIZLLLIL = r1;
            textureViewSurfaceTextureListenerC1288630jdd2.getPlayer().LJIIIIZZ(r1);
        }
        LIZ();
        setSpeed(this.LLILZLL);
        return textureViewSurfaceTextureListenerC1288630jdd2;
    }

    public final void LJI() {
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jddLJ = LJ();
        this.LLIZ.set(0);
        LIZ();
        textureViewSurfaceTextureListenerC1288630jddLJ.getPlayer().play();
        C1168400gVi.LIZJ(new AwS599S0100000_20(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC1288650jdf player;
        super.onDetachedFromWindow();
        C1168400gVi.LIZJ(new AwS599S0100000_20(this, 1));
        this.LLJ++;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILLJJLI;
        if (textureViewSurfaceTextureListenerC1288630jdd != null && (player = textureViewSurfaceTextureListenerC1288630jdd.getPlayer()) != null) {
            player.pause();
        }
        LIZJ(this.LLJI, "detach");
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd2 = this.LLILLJJLI;
        if (textureViewSurfaceTextureListenerC1288630jdd2 != null) {
            C1288190jcv c1288190jcv = this.LLIZLLLIL;
            if (c1288190jcv != null) {
                textureViewSurfaceTextureListenerC1288630jdd2.getPlayer().LIZLLL(c1288190jcv);
            }
            this.LLIZLLLIL = null;
            textureViewSurfaceTextureListenerC1288630jdd2.getPlayer().cancel();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, textureViewSurfaceTextureListenerC1288630jdd2);
            removeView(textureViewSurfaceTextureListenerC1288630jdd2);
            textureViewSurfaceTextureListenerC1288630jdd2.release();
            this.LLILLJJLI = null;
            this.LLIZ.set(0);
        }
    }

    public C1292290jjX(Context context) {
        Object c098200Yq;
        super(context);
        this.LL = LLJILJILJ.incrementAndGet();
        this.LLILZLL = 1.0f;
        this.LLIZ = new AtomicInteger(0);
        try {
            LynxAnimaX.inst().init();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1168400gVi.LIZIZ(new AwS581S0100000_2(thM5exceptionOrNullimpl, 3));
        }
        File fileW2 = C786410Ut5.w2(context);
        if (LLJILLL.compareAndSet(false, true)) {
            C1168270gVV.LIZ.getClass();
            C1168270gVV.LIZLLL().execute(new ARunnableS120S0100000_20(fileW2, 1));
        }
    }

    public static void LIZLLL(File file) {
        if (!file.exists()) {
            return;
        }
        C08QK c08qk = new C08QK(new C08QE(file, FileWalkDirection.BOTTOM_UP, null, null, null, 0, 32, null));
        while (c08qk.hasNext()) {
            File next = c08qk.next();
            if (!Intrinsics.LJFF(next, file)) {
                next.delete();
            }
        }
        file.delete();
    }

    public final void setAutoPlay(boolean z) {
        this.LLILLL = z;
    }

    public final void setLoop(boolean z) {
        this.LLILZ = z;
        LIZ();
    }

    public final void setLoopCount(Integer num) {
        this.LLILZIL = num;
        this.LLIZ.set(0);
        LIZ();
    }

    public final void setSource(String str) {
        if (str != null && str.length() != 0) {
            int i = this.LLJ + 1;
            this.LLJ = i;
            C1168400gVi.LIZJ(new AwS26S1101000_20(str, this, i, 0));
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                C1168400gVi.LIZIZ(new AwS53S1000000_2(str, 0));
                return;
            }
            if (u.LJIIZILJ(c0vsj.getName(), ".json", true)) {
                LIZIZ(c0vsj.getAbsolutePath(), null, null, i, "json");
                return;
            }
            if (u.LJIIZILJ(c0vsj.getName(), ".zip", true)) {
                File file = this.LLJI;
                String str2 = this.LLJIJIL;
                String str3 = this.LLJILJIL;
                if (file != null && Intrinsics.LJFF(str3, c0vsj.getAbsolutePath()) && str2 != null && file.exists() && new C0VSJ(str2).exists()) {
                    LIZIZ(str2, file, str3, i, "zip-cached");
                    return;
                }
                File fileW2 = C786410Ut5.w2(getContext());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("myna_lottie_prepare/");
                sbLIZ.append(C08QA.LJIJI(c0vsj));
                sbLIZ.append('_');
                sbLIZ.append(c0vsj.getAbsolutePath().hashCode());
                sbLIZ.append('_');
                sbLIZ.append(this.LL);
                sbLIZ.append('_');
                sbLIZ.append(i);
                C0VSJ c0vsj2 = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ));
                C1168270gVV.LIZ.getClass();
                C1168270gVV.LIZLLL().execute(new ARunnableS13S0301000_20(i, this, c0vsj, c0vsj2, 0));
                return;
            }
            C1168400gVi.LIZIZ(new AwS581S0100000_2(c0vsj, 4));
            return;
        }
        C1168400gVi.LIZLLL(AFwS258S0000000_20.get$arr$(0));
    }

    public final void setSpeed(float f) {
        InterfaceC1288650jdf player;
        this.LLILZLL = f;
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILLJJLI;
        if (textureViewSurfaceTextureListenerC1288630jdd != null && (player = textureViewSurfaceTextureListenerC1288630jdd.getPlayer()) != null) {
            player.setSpeed(f);
        }
    }

    public static int LJFF(File file, File file2) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(file.getCanonicalFile().toPath().relativize(file2.getCanonicalFile().toPath()).getNameCount());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = Integer.MAX_VALUE;
        }
        return ((Number) c098200Yq).intValue();
    }

    public static File LJII(File file, String str) {
        Object obj;
        Object obj2 = null;
        try {
            C0VSJ c0vsj = new C0VSJ(file, str);
            boolean zStartsWith = c0vsj.getCanonicalFile().toPath().startsWith(file.getCanonicalFile().toPath());
            C0VSJ c0vsj2 = c0vsj;
            if (!zStartsWith) {
                c0vsj2 = null;
            }
            C189200o6.m2constructorimpl(c0vsj2);
            obj = c0vsj2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (File) obj2;
    }

    public final void LIZJ(File file, String str) {
        if (file == null) {
            return;
        }
        C1168270gVV.LIZ.getClass();
        C1168270gVV.LIZLLL().execute(new ARunnableS24S1200000_20(file, str, this, 7));
    }

    public final void LIZIZ(String str, File file, String str2, int i, String str3) {
        if (i != this.LLJ) {
            if (file != null && !Intrinsics.LJFF(file, this.LLJI)) {
                LIZJ(file, "stale-before-apply");
                return;
            }
            return;
        }
        File file2 = this.LLJI;
        if (file2 != null && !Intrinsics.LJFF(file2, file)) {
            LIZJ(file2, "replace");
        }
        this.LLJI = file;
        this.LLJIJIL = str;
        this.LLJILJIL = str2;
        C1168400gVi.LIZJ(new C1292300jjY(str3, str, file, str2, this));
        TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jddLJ = LJ();
        this.LLIZ.set(0);
        textureViewSurfaceTextureListenerC1288630jddLJ.getPlayer().setSrc(str);
        LIZ();
        if (this.LLILLL) {
            LJI();
        }
    }
}
