package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379950m0v implements InterfaceC1370310llN, InterfaceC1370280llK {
    public final C1379390m01 LL;
    public C424560Gko LLILLJJLI;
    public WeakReference<Context> LLILLL;
    public C1379970m0x LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1400));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1398));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1399));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1402));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1401));
    public Bitmap LLJI;
    public long LLJIJIL;

    @Override // X.InterfaceC1370280llK
    public final void LIZIZ(Context context, ViewGroup viewGroup) {
    }

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    public final C1379170lzf LJFF() {
        AbstractC736370SuZ abstractC736370SuZ = this.LL.LIZIZ;
        if (abstractC736370SuZ instanceof C1379400m02) {
            return ((C1379400m02) abstractC736370SuZ).LLILZ;
        }
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILZIL.getValue();
        return c1376820lvs != null ? c1376820lvs.LIZIZ : this.LL.LIZ.LIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        C1376820lvs c1376820lvs = (C1376820lvs) this.LLILZIL.getValue();
        return c1376820lvs != null ? c1376820lvs.LIZ : this.LL.LIZ.LIZ;
    }

    public final RectF LJJIIZ() {
        RectF rectF;
        int left;
        InterfaceC719460SKa interfaceC719460SKaLJLIL;
        IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLILZLL.getValue();
        if (iPhotoSlidesAbility == null || (interfaceC719460SKaLJLIL = iPhotoSlidesAbility.LJLIL()) == null || (rectF = interfaceC719460SKaLJLIL.I8()) == null) {
            rectF = new RectF();
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJ.getValue();
        AdaptionPaddingValues adaptionPaddingValuesVk1 = cellAdaptionComponentAbility != null ? cellAdaptionComponentAbility.vk1() : null;
        int top = 0;
        if (adaptionPaddingValuesVk1 != null) {
            left = adaptionPaddingValuesVk1.getLeft();
            top = adaptionPaddingValuesVk1.getTop();
        } else {
            left = 0;
        }
        float f = left;
        float f2 = top;
        return new RectF(rectF.left - f, rectF.top - f2, rectF.right - f, rectF.bottom - f2);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return this.LL.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        String str = this.LL.LIZ.LIZJ;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.LongPress;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public C1379950m0v(C1379390m01 c1379390m01) {
        this.LL = c1379390m01;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379950m0v.LJJ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[PHI: r1
      0x00e1: PHI (r1v2 java.lang.Integer) = (r1v1 java.lang.Integer), (r1v4 java.lang.Integer) binds: [B:44:0x00de, B:39:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    @Override // X.InterfaceC1370310llN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(android.view.View r32, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r33) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379950m0v.LJJIIZI(android.view.View, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC1370280llK
    public final View LIZ(ViewGroup viewGroup, Context context, C1370200llC c1370200llC) {
        this.LLILLL = new WeakReference<>(context);
        if (c1370200llC != null && this.LLILLJJLI == null) {
            C424560Gko c424560Gko = new C424560Gko(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424560Gko);
            c424560Gko.setLayoutParams(layoutParams);
            c424560Gko.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c424560Gko.setBackground(c384050F3z.LIZ(context));
            c424560Gko.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            c424560Gko.setClipToOutline(true);
            this.LLILLJJLI = c424560Gko;
            if (viewGroup != null) {
                viewGroup.addView(c424560Gko, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
            }
        }
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2 A[PHI: r3
      0x00d2: PHI (r3v1 boolean) = (r3v0 boolean), (r3v0 boolean), (r3v7 boolean) binds: [B:50:0x00c4, B:52:0x00ca, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1370280llK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1370200llC r7, int r8, X.InterfaceC1369750lkT r9, kotlin.jvm.functions.Function0 r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379950m0v.LJ(X.0llC, int, X.0lkT, kotlin.jvm.functions.Function0):void");
    }
}
