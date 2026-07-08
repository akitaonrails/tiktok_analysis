package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.159r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204745159r extends FrameLayout implements C15AX {
    public ViewGroup LL;
    public String LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C1324720kZq LLILZ;
    public C20475415Aa LLILZIL;
    public final C11NJ LLILZLL;

    @Override // X.C15AX
    public final Bitmap LJJJJZI() {
        return null;
    }

    @Override // X.C15AJ
    public final boolean LLZZLLIL() {
        return false;
    }

    @Override // X.C15AJ
    public final void g() {
        C500260Jjc.LJLJLJ(this, true);
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getGeniusId());
        sbLIZ.append("_screenshot");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZLL.LJ();
    }

    @Override // X.C15AJ
    public final void LJIIJ() {
        C15AI.LJII(this);
    }

    @Override // X.C15AJ
    public final void LLLIILIL() {
        C15AI.LIZ(this);
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLILLJJLI;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LL;
    }

    @Override // X.C15AJ
    public C20475415Aa getGeniusModel() {
        return this.LLILZIL;
    }

    @Override // X.C15AJ
    public final ViewGroup.LayoutParams LLIIIZ(Rect rect) {
        return C15AI.LIZIZ(this, rect);
    }

    @Override // X.C15AJ
    public final void LLIIL(View view) {
        C15AI.LJIIIIZZ(this, view);
    }

    @Override // X.C15AJ
    public final void W(InterfaceC20476615Am interfaceC20476615Am) {
        C15AI.LJ(this, interfaceC20476615Am);
    }

    @Override // X.C15AJ
    public final void log(String str) {
        C15AI.LJFF(this, str);
    }

    public void setGeniusId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C20475415Aa c20475415Aa) {
        this.LLILZIL = c20475415Aa;
    }

    public C204745159r(String str, ViewGroup viewGroup) {
        super(viewGroup.getContext());
        this.LL = viewGroup;
        this.LLILLJJLI = str;
        this.LLILZLL = new C11NJ();
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ha7, this, true);
        this.LLILLL = (C1324720kZq) findViewById(R.id.nru);
        this.LLILZ = (C1324720kZq) findViewById(R.id.nrb);
        ViewGroup.LayoutParams layoutParamsLLIIIZ = LLIIIZ(new Rect());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLLIIIZ);
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, function2);
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    @Override // X.C15AJ
    public final /* bridge */ /* synthetic */ void LLJJIJIL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
    }

    @Override // X.C15AJ
    public final void LLLZZIL(InterfaceC20476615Am interfaceC20476615Am, String str, boolean z, Function2 function2) {
        C15AO c15ao;
        C20345714jH c20345714jH;
        String nickName;
        C15AO c15ao2;
        C20475415Aa c20475415Aa = (C20475415Aa) interfaceC20476615Am;
        C15AI.LJIIJ(this, c20475415Aa, str, z, function2);
        C500260Jjc.LJLJLJ(this, true);
        float f = c20475415Aa.LIZ.LJFF;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(f);
        float f2 = c20475415Aa.LIZ.LJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(f2);
        float f3 = c20475415Aa.LIZ.LIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(f3);
        float f4 = c20475415Aa.LIZ.LIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(f4);
        setZ(c20475415Aa.LIZ.LJII);
        float f5 = c20475415Aa.LIZ.LJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f5);
        C204746159s c204746159sLJI = c20475415Aa.LJI();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C20476115Ah c20476115Ah = c20475415Aa.LIZ;
        layoutParams.width = c20476115Ah.LIZJ;
        layoutParams.height = c20476115Ah.LIZLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C1324720kZq c1324720kZq = this.LLILLL;
        ViewGroup.LayoutParams layoutParams2 = c1324720kZq.getLayoutParams();
        C20476115Ah c20476115Ah2 = c20475415Aa.LIZ;
        layoutParams2.width = c20476115Ah2.LIZJ;
        layoutParams2.height = c20476115Ah2.LIZLLL;
        C786410Ut5.u6(c1324720kZq, layoutParams2);
        ImageModel avatarThumb = null;
        if (c204746159sLJI != null) {
            c15ao = c204746159sLJI.LIZ;
        } else {
            c15ao = null;
        }
        if (c15ao == null) {
            C500260Jjc.LJLJLJ(this, false);
            return;
        }
        if (z) {
            C15AI.LJFF(this, "onlyInit");
            return;
        }
        C1324720kZq c1324720kZq2 = this.LLILLL;
        if (c204746159sLJI != null && (c15ao2 = c204746159sLJI.LIZ) != null) {
            c20345714jH = c15ao2.LJIIIIZZ;
        } else {
            c20345714jH = null;
        }
        C20410914tn.LIZ(c1324720kZq2, c20345714jH);
        C20345714jH c20345714jH2 = c204746159sLJI.LIZ.LJIIIIZZ;
        if (c20345714jH2 != null) {
            Pair<Integer, Integer> pair = c20345714jH2.LIZLLL;
            Pair<Integer, Integer> pair2 = c20345714jH2.LIZJ;
            if (pair2 != null && pair != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateByGeniusModel avatarSize:");
                sbLIZ.append(pair);
                sbLIZ.append(" lottieSize:");
                sbLIZ.append(c20475415Aa.LIZ.LIZIZ());
                sbLIZ.append(" nickName:");
                User user = c204746159sLJI.LIZIZ;
                if (user != null) {
                    nickName = user.getNickName();
                } else {
                    nickName = null;
                }
                sbLIZ.append(nickName);
                C15AI.LJFF(this, C2188811AlT.LIZIZ(sbLIZ));
                C500260Jjc.LJLJLJ(this.LLILZ, true);
                C1324720kZq c1324720kZq3 = this.LLILZ;
                ViewGroup.LayoutParams layoutParams3 = c1324720kZq3.getLayoutParams();
                layoutParams3.width = (int) ((pair.getFirst().intValue() / pair2.getFirst().floatValue()) * c20475415Aa.LIZ.LIZJ);
                layoutParams3.height = (int) ((pair.getSecond().intValue() / pair2.getSecond().floatValue()) * c20475415Aa.LIZ.LIZLLL);
                C786410Ut5.u6(c1324720kZq3, layoutParams3);
                Context context = getContext();
                User user2 = c204746159sLJI.LIZIZ;
                if (user2 != null) {
                    avatarThumb = user2.getAvatarThumb();
                }
                C2363809Oa.LIZ(context, avatarThumb, new AwS610S0100000_31(this, 466), new AwS610S0100000_31(this, 467), this.LLILZLL);
                return;
            }
        }
        C500260Jjc.LJLJLJ(this.LLILZ, false);
    }
}
