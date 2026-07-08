package X;

import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS63S1300000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854650yMZ extends LinearLayout {
    public static final /* synthetic */ int LLJI = 0;
    public final List<BaseImage> LL;
    public int LLILLJJLI;
    public final HorizontalScrollView LLILLL;
    public final LinearLayout LLILZ;
    public String LLILZIL;
    public Function2<? super String, ? super Integer, Unit> LLILZLL;
    public Function0<Unit> LLIZ;
    public Function1<? super Integer, Unit> LLIZLLLIL;
    public final C1854640yMY LLJ;

    public final void LIZIZ() {
        if (this.LLILLJJLI > 0) {
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                C786410Ut5.LJJJJJL(linearLayout);
            }
            setDisplayItemCount(0);
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            Function1<? super String, Unit> function1 = this.LLJ.LIZLLL;
            if (function1 != null) {
                function1.invoke(this.LLILZIL);
            }
            this.LLILZIL = "";
            ((ArrayList) this.LL).clear();
            Function0<Unit> function0 = this.LLJ.LJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final int getDisplayItemCount() {
        return this.LLILLJJLI;
    }

    public final List<BaseImage> getDisplayPhotoList() {
        return this.LL;
    }

    public final Function0<Unit> getOnAllPicCleanListener() {
        return this.LLIZ;
    }

    public final Function1<Integer, Unit> getOnPicDisplayItemCountChangedListener() {
        return this.LLIZLLLIL;
    }

    public final Function2<String, Integer, Unit> getOnPicRemoveListener() {
        return this.LLILZLL;
    }

    public final String getScene() {
        return this.LLILZIL;
    }

    private final void setDisplayItemCount(int i) {
        Function1<? super Integer, Unit> function1 = this.LLIZLLLIL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        this.LLILLJJLI = i;
    }

    public final void LIZJ(C1854660yMa c1854660yMa) {
        LinearLayout linearLayout;
        if (this.LLILLJJLI > 0 && (linearLayout = this.LLILZ) != null && linearLayout.indexOfChild(c1854660yMa) != -1) {
            LinearLayout linearLayout2 = this.LLILZ;
            if (linearLayout2 != null) {
                linearLayout2.indexOfChild(c1854660yMa);
            }
            LinearLayout linearLayout3 = this.LLILZ;
            if (linearLayout3 != null) {
                C786410Ut5.LJJL(c1854660yMa, linearLayout3);
            }
            setDisplayItemCount(this.LLILLJJLI - 1);
            if (this.LLILLJJLI == 0) {
                int visibility = getVisibility();
                setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, this);
                Function1<? super String, Unit> function1 = this.LLJ.LIZLLL;
                if (function1 != null) {
                    function1.invoke(this.LLILZIL);
                }
                this.LLILZIL = "";
            }
            BaseImage image = c1854660yMa.getImage();
            if (image != null) {
                ((ArrayList) this.LL).remove(image);
            }
            Function0<Unit> function0 = this.LLJ.LJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void setItemConfig(Function1<? super C1854640yMY, Unit> function1) {
        function1.invoke(this.LLJ);
    }

    public final void setOnAllPicCleanListener(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setOnPicDisplayItemCountChangedListener(Function1<? super Integer, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setOnPicRemoveListener(Function2<? super String, ? super Integer, Unit> function2) {
        this.LLILZLL = function2;
    }

    public C1854650yMZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILZIL = "";
        C786410Ut5.Sd(R.layout.fpt, C786410Ut5.ne(context), this);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(R.id.xan);
        this.LLILLL = horizontalScrollView;
        this.LLILZ = (LinearLayout) findViewById(R.id.xam);
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ() && horizontalScrollView != null) {
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            C426750GoL.LJIIL(horizontalScrollView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
            horizontalScrollView.setClipToPadding(false);
        }
        this.LLJ = new C1854640yMY(0);
    }

    public final void LIZ(String str, BaseImage baseImage, Function0<Unit> function0) {
        Function0<Unit> function02;
        TuxIconView tuxIconView;
        if (this.LLILLJJLI < C20189513zB.LJI(str)) {
            this.LLILZIL = str;
            if (Intrinsics.LJFF(str, "ai_create_menu_edit_image") && this.LLILLJJLI == 1) {
                LinearLayout linearLayout = this.LLILZ;
                if (linearLayout != null) {
                    C786410Ut5.LJJJJJL(linearLayout);
                }
                setDisplayItemCount(0);
                ((ArrayList) this.LL).clear();
            }
            C1854660yMa c1854660yMa = new C1854660yMa(getContext());
            c1854660yMa.setItemClickConfig(new AwS63S1300000_27(str, (String) function0, (Function0<Unit>) this, (C1854650yMZ) c1854660yMa, (C1854660yMa) 2));
            C346190Dhh c346190Dhh = new C346190Dhh(c1854660yMa, 2);
            if (C2137908Zd.LIZJ.LJFF(baseImage.localCachePath)) {
                String str2 = baseImage.localCachePath;
                if (str2 == null) {
                    str2 = "";
                }
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str2));
                c1331670kl3LJII.LJJIJL(c1854660yMa.getContext());
                c1331670kl3LJII.LJJ(c1854660yMa.LLILLL);
                c1331670kl3LJII.LJIIL(c346190Dhh);
            } else {
                String str3 = baseImage.uri;
                if (str3 != null) {
                    if (C1854460yMG.LIZIZ(str3)) {
                        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str3));
                        c1331670kl3LJI.LJJIJL(c1854660yMa.getContext());
                        c1331670kl3LJI.LJJ(c1854660yMa.LLILLL);
                        c1331670kl3LJI.LJIIL(c346190Dhh);
                    } else if (C1854460yMG.LIZ(str3)) {
                        C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(new C0VSJ(str3));
                        c1331670kl3LJII2.LJJIJL(c1854660yMa.getContext());
                        c1331670kl3LJII2.LJJ(c1854660yMa.LLILLL);
                        c1331670kl3LJII2.LJIIL(c346190Dhh);
                    } else {
                        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(baseImage.urlList));
                        c1331670kl3LJIIJ.LJJIJL(c1854660yMa.getContext());
                        c1331670kl3LJIIJ.LJJ(c1854660yMa.LLILLL);
                        c1331670kl3LJIIJ.LJIIL(c346190Dhh);
                    }
                }
            }
            c1854660yMa.LLIZLLLIL = baseImage;
            if (Intrinsics.LJFF(str, "ai_create_menu_edit_image") && (tuxIconView = c1854660yMa.LLILZ) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_arrow_left_right_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                float f = 16;
                c419910GdJ.LIZIZ = (int) C0DSB.LIZ(f);
                c419910GdJ.LIZJ = (int) C0DSB.LIZ(f);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            LinearLayout linearLayout2 = this.LLILZ;
            if (linearLayout2 != null) {
                linearLayout2.addView(c1854660yMa);
            }
            if (this.LLILLJJLI > 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (C426750GoL.LIZLLL(getContext())) {
                    layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), layoutParams.bottomMargin);
                } else {
                    layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1854660yMa);
                c1854660yMa.setLayoutParams(layoutParams);
            } else {
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
            }
            setDisplayItemCount(this.LLILLJJLI + 1);
            ((ArrayList) this.LL).add(baseImage);
            Function1<? super String, Unit> function1 = this.LLJ.LIZ;
            if (function1 != null) {
                function1.invoke(str);
            }
            if (this.LLILLJJLI == 1 && (function02 = this.LLJ.LIZJ) != null) {
                function02.invoke();
            }
            HandlerHook.viewPost(this, new ARunnableS127S0100000_27(this, 27));
        }
    }
}
