package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FTK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTK extends C0FUM implements C0FUG {
    public final Context LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final LifecycleOwner LLILZ;
    public final InterfaceC388760FMc LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public RectF LLJILJIL;
    public AnonymousClass0956 LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(284));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1009));
    public int LLJJI = -1;

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJI() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIL() {
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    public final C1664680tQA<C0FTO> LJJIJL() {
        return (C1664680tQA) this.LLJ.getValue();
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
        LJJIJIL(true);
    }

    public final void LJJIJIL(boolean z) {
        if (!LJJIJL().LIZ.LJ) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJIL = null;
        C388890FMp c388890FMp = (C388890FMp) this.LLJIJIL.getValue();
        if (c388890FMp != null) {
            c388890FMp.LIZJ();
        }
        LJJIJL().LIZLLL(new AwS20S0010000_5(z, 55), true);
    }

    public final void LJJIL(boolean z) {
        this.LLJILJIL = null;
        C388890FMp c388890FMp = (C388890FMp) this.LLJIJIL.getValue();
        if (c388890FMp != null) {
            c388890FMp.LIZJ();
        }
        LJJIJL().LIZLLL(new AwS20S0010000_5(56), true);
    }

    public final boolean LJJJ(EnumC1466150oFx enumC1466150oFx) {
        C0FF8 c0ff8LIZ;
        C0FK0 c0fk0LJIILLIIL;
        if (enumC1466150oFx != EnumC1466150oFx.TEXT || (c0ff8LIZ = this.LLILZIL.LIZ()) == null || (c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL()) == null || !c0fk0LJIILLIIL.LJJIJIIJI) {
            return false;
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LLJJ = LJJIJL().LIZ.LJ;
        return this instanceof C1417630mzh;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.LLJJ) {
            LJJIJIL(false);
        }
        return this.LLJJ;
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
        if (!z && i == this.LLJJI) {
            LJJIJIL(true);
        }
    }

    public final void LJJIJLIJ(EnumC1466150oFx enumC1466150oFx, long j) {
        C388890FMp c388890FMp = (C388890FMp) this.LLJIJIL.getValue();
        if (c388890FMp != null) {
            c388890FMp.LIZJ();
        }
        C388890FMp c388890FMp2 = (C388890FMp) this.LLJIJIL.getValue();
        if (c388890FMp2 != null) {
            c388890FMp2.LIZ(new AwS371S0200000_5(this, enumC1466150oFx, 204));
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILLL = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C0FTL(j, this, enumC1466150oFx, null), 3);
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
        LJJIJIL(true);
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
        LJJIJIL(true);
    }

    public C0FTK(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C390420FSm c390420FSm) {
        this.LL = context;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = frameLayout2;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = interfaceC388760FMc;
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1010));
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1007));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1008));
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1005));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1006));
        LJJIJL().LIZ(new C2217381BqS() { // from class: X.0FTM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0FTO) obj).LJ);
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 840));
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
        float scale;
        BaseStickerModel baseStickerModelLJJIIJZLJL;
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, (List) this.LLILZLL.getValue());
        if (c0ftjLIZ != null && c0ftjLIZ.LJIILIIL()) {
            this.LLJILJILJ.getValue();
            this.LLJJI = i;
            this.LLJILJIL = null;
            C0FTJ c0ftjLIZ2 = C0FKU.LIZ(i, (List) this.LLILZLL.getValue());
            if (c0ftjLIZ2 != null && (baseStickerModelLJJIIJZLJL = c0ftjLIZ2.LJJIIJZLJL()) != null) {
                scale = baseStickerModelLJJIIJZLJL.getScale();
            } else {
                scale = 1.0f;
            }
            LJJIZ(rectF, enumC1466150oFx, 1.0f, scale, f3, null);
            LJJIJLIJ(enumC1466150oFx, 3000L);
        }
    }

    public final void LJJIZ(RectF rectF, EnumC1466150oFx enumC1466150oFx, float f, float f2, float f3, String str) {
        Rect rect;
        float dimension;
        this.LLJILJILJ.getValue();
        if (((C0FUH) this.LLIZ.getValue()).LJIILIIL) {
            int[] iArr = new int[2];
            this.LLILLJJLI.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            this.LLILLL.getLocationOnScreen(iArr2);
            rect = new Rect(this.LLILLJJLI.getLeft(), iArr[1] - iArr2[1], this.LLILLL.getRight() - this.LLILLJJLI.getRight(), ((iArr2[1] + this.LLILLL.getHeight()) - iArr[1]) - this.LLILLJJLI.getHeight());
        } else {
            rect = new Rect(this.LLILLJJLI.getLeft(), this.LLILLJJLI.getTop(), this.LLILLL.getRight() - this.LLILLJJLI.getRight(), this.LLILLL.getBottom() - this.LLILLJJLI.getBottom());
        }
        if (!((Boolean) C282960B7e.LIZ.getValue()).booleanValue() && !LJJJ(enumC1466150oFx)) {
            rectF.left -= this.LLILLJJLI.getLeft() + C11VU.LIZ(10.0f);
            rectF.right += C11VU.LIZ(10.0f) - this.LLILLJJLI.getLeft();
            rectF.top -= this.LLILLJJLI.getTop() + C11VU.LIZ(10.0f);
            rectF.bottom += C11VU.LIZ(10.0f) - this.LLILLJJLI.getTop();
            LJJIJL().LIZLLL(new C0FTQ(rect, enumC1466150oFx, rectF, f3, str, f), true);
            return;
        }
        rectF.left -= this.LLILLJJLI.getLeft() + C418440Gaw.LIZIZ(Float.valueOf(8.0f));
        rectF.right += C418440Gaw.LIZIZ(Float.valueOf(8.0f)) - this.LLILLJJLI.getLeft();
        rectF.top -= this.LLILLJJLI.getTop() + C418440Gaw.LIZIZ(Float.valueOf(8.0f));
        rectF.bottom += C418440Gaw.LIZIZ(Float.valueOf(8.0f)) - this.LLILLJJLI.getTop();
        EnumC1466150oFx enumC1466150oFx2 = EnumC1466150oFx.DONATION;
        if (enumC1466150oFx != enumC1466150oFx2) {
            dimension = C0FTR.LIZ(enumC1466150oFx);
        } else if (C0FWJ.LIZ()) {
            dimension = C0FTR.LIZ(enumC1466150oFx2);
        } else {
            try {
                dimension = this.LL.getResources().getDimension(R.dimen.tj) / this.LL.getResources().getDisplayMetrics().density;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                dimension = 200.0f;
            }
        }
        LJJIJL().LIZLLL(new C0FTP(rect, enumC1466150oFx, rectF, f3, (dimension * f2) + 8.0f, str, f), true);
    }
}
