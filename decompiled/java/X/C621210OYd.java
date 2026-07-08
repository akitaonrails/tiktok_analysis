package X;

import Y.AComparatorS28S0000000_9;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMediaViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePlayedStore;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS60S1000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621210OYd implements C0OT0 {
    public static final List<Float> LJJIIZ = Collections.singletonList(Float.valueOf(0.15f));
    public static final int LJJIIZI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
    public static final int LJJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LJJIJIIJI = R.raw.icon_spinner_circle_fill;
    public static final int LJJIJIIJIL = R.raw.icon_spinner_normal;
    public final boolean LIZ;
    public final BulletinCommonAbility LIZIZ;
    public final Function0<BulletinMediaViewModel> LIZJ;
    public final InterfaceC497601wk LIZLLL;
    public final BulletinListViewModel LJ;
    public final View LJFF;
    public final FrameLayout LJI;
    public final TuxIconView LJII;
    public final View LJIIIIZZ;
    public final TuxIconView LJIIIZ;
    public ObjectAnimator LJIIJ;
    public final C194434115c LJIIJJI;
    public final TuxTextView LJIIL;
    public BulletinVoiceItem LJIILIIL;
    public AnonymousClass0956 LJIILJJIL;
    public AnonymousClass0956 LJIILL;
    public AnonymousClass0956 LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public Boolean LJIJJ;
    public boolean LJIJJLI;
    public Boolean LJIL;
    public EnumC621190OYb LJJ;
    public EnumC621190OYb LJJI;
    public String LJJIFFI;
    public boolean LJJII;
    public C2227808o8 LJJIII;
    public Float LJJIIJ;
    public boolean LJJIIJZLJL;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final C621370OYt LJIIJ() {
        BulletinMediaViewModel bulletinMediaViewModelInvoke = this.LIZJ.invoke();
        if (bulletinMediaViewModelInvoke != null) {
            return bulletinMediaViewModelInvoke.LLILLL;
        }
        return null;
    }

    public final Context LJIJ() {
        Context context = this.LJFF.getContext();
        int i = C621200OYc.LIZ[this.LJJI.ordinal()];
        if (i == 1) {
            return new ContextThemeWrapper(context, R.style.y0);
        }
        if (i == 2) {
            return new ContextThemeWrapper(context, R.style.y3);
        }
        if (i == 3) {
            return this.LIZ ? new ContextThemeWrapper(context, R.style.y0) : context;
        }
        throw new C1954807lC();
    }

    public final void LJJIFFI() {
        ObjectAnimator objectAnimator = this.LJIIJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.LJIIJ = null;
        TuxIconView tuxIconView = this.LJII;
        if (tuxIconView != null) {
            C786410Ut5.Fb(tuxIconView, 0.0f);
        }
        TuxIconView tuxIconView2 = this.LJIIIZ;
        if (tuxIconView2 != null) {
            C786410Ut5.Fb(tuxIconView2, 0.0f);
        }
    }

    public final void LJJII() {
        AnonymousClass0956 anonymousClass0956 = this.LJIILJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJIILL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJIILJJIL = null;
        this.LJIILL = null;
    }

    public static String LJI(long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = 60;
        return C786410Ut5.j4("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
    }

    public final boolean LJIIL(String str) {
        String uid;
        BulletinCommonAbility bulletinCommonAbility;
        String string;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null || (bulletinCommonAbility = this.LIZIZ) == null || (string = Long.valueOf(bulletinCommonAbility.Og2()).toString()) == null) {
            return false;
        }
        Gson gson = BulletinVoicePlayedStore.LIZ;
        if (uid.length() == 0 || string.length() == 0 || str.length() == 0) {
            return false;
        }
        List listLIZ = BulletinVoicePlayedStore.LIZ(uid, string);
        if (listLIZ.isEmpty()) {
            return false;
        }
        Iterator it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((BulletinVoicePlayedStore.Entry) it2.next()).sourceId, str)) {
                return true;
            }
        }
        return false;
    }

    public final C621280OYk LJIILJJIL(String str) {
        String string;
        ConcurrentHashMap<String, C621280OYk> concurrentHashMap;
        BulletinCommonAbility bulletinCommonAbility = this.LIZIZ;
        if (bulletinCommonAbility == null || (string = Long.valueOf(bulletinCommonAbility.Og2()).toString()) == null || string.length() == 0 || str.length() == 0 || (concurrentHashMap = C621270OYj.LIZ.get(string)) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public final void LJIILL(String str) {
        String string;
        Long l;
        String uid;
        BulletinCommonAbility bulletinCommonAbility;
        String string2;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null && (uid = curUser.getUid()) != null && (bulletinCommonAbility = this.LIZIZ) != null && (string2 = Long.valueOf(bulletinCommonAbility.Og2()).toString()) != null) {
            Gson gson = BulletinVoicePlayedStore.LIZ;
            if (uid.length() != 0 && string2.length() != 0 && str.length() != 0) {
                List listLIZ = BulletinVoicePlayedStore.LIZ(uid, string2);
                C19719612Di.LJJIIJ(listLIZ, new AwS60S1000000_9(str, 5), true);
                listLIZ.add(new BulletinVoicePlayedStore.Entry(str, System.currentTimeMillis()));
                if (listLIZ.size() > 20) {
                    listLIZ = C13LP.LLD(20, C13LP.LJLLLL(new AComparatorS28S0000000_9(19), listLIZ));
                }
                BulletinVoicePlayedStore.LIZIZ(uid, string2).storeString("entries", GsonProtectorUtils.toJson(BulletinVoicePlayedStore.LIZ, listLIZ));
            }
        }
        BulletinVoiceItem bulletinVoiceItem = this.LJIILIIL;
        if (bulletinVoiceItem != null && (l = bulletinVoiceItem.LLJJIJI) != null) {
            string = l.toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, str)) {
            LIZLLL(str, true, false);
        }
    }

    public final void LJIIZILJ(final C21568919b5 c21568919b5) {
        final C194434115c c194434115c;
        final TuxTextView tuxTextView;
        int width;
        final BulletinVoiceItem bulletinVoiceItem = this.LJIILIIL;
        if (bulletinVoiceItem == null || (c194434115c = this.LJIIJJI) == null || (tuxTextView = this.LJIIL) == null) {
            return;
        }
        if (c21568919b5.isLaidOut() && !c21568919b5.isLayoutRequested()) {
            if (this.LJIILIIL == bulletinVoiceItem && (width = (c21568919b5.getWidth() - c21568919b5.getPaddingLeft()) - c21568919b5.getPaddingRight()) > 0) {
                int i = 0;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                tuxTextView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = tuxTextView.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                if (layoutParams != null && layoutParams.width != measuredWidth) {
                    layoutParams.width = measuredWidth;
                    C786410Ut5.R6(tuxTextView, layoutParams);
                }
                int iLIZIZ = (width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) - measuredWidth;
                if (iLIZIZ >= 0) {
                    i = iLIZIZ;
                }
                ViewGroup.LayoutParams layoutParams2 = c194434115c.getLayoutParams();
                if (layoutParams2 != null && layoutParams2.width > i) {
                    layoutParams2.width = i;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c194434115c);
                    c194434115c.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            }
            return;
        }
        c21568919b5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0OYf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int width2;
                view.removeOnLayoutChangeListener(this);
                if (this.LL.LJIILIIL == bulletinVoiceItem && (width2 = (c21568919b5.getWidth() - c21568919b5.getPaddingLeft()) - c21568919b5.getPaddingRight()) > 0) {
                    int i10 = 0;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    tuxTextView.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                    int measuredWidth2 = tuxTextView.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                    if (layoutParams3 != null && layoutParams3.width != measuredWidth2) {
                        layoutParams3.width = measuredWidth2;
                        C786410Ut5.R6(tuxTextView, layoutParams3);
                    }
                    int iLIZIZ2 = (width2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) - measuredWidth2;
                    if (iLIZIZ2 >= 0) {
                        i10 = iLIZIZ2;
                    }
                    ViewGroup.LayoutParams layoutParams4 = c194434115c.getLayoutParams();
                    if (layoutParams4 != null && layoutParams4.width > i10) {
                        layoutParams4.width = i10;
                        C194434115c c194434115c2 = c194434115c;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c194434115c2);
                        c194434115c2.setLayoutParams(layoutParams4);
                    }
                }
            }
        });
    }

    public final void LJIJJ(String str) {
        C2227808o8 value;
        BulletinCommonAbility bulletinCommonAbility;
        String string;
        C621370OYt c621370OYtLJIIJ = LJIIJ();
        if (c621370OYtLJIIJ != null && (value = c621370OYtLJIIJ.LJFF(str).getValue()) != null && value.LIZ > 0 && (bulletinCommonAbility = this.LIZIZ) != null && (string = Long.valueOf(bulletinCommonAbility.Og2()).toString()) != null) {
            C621270OYj.LIZIZ(value.LIZ, value.LIZIZ, string, str);
        }
    }

    public final void LJIJJLI(String str) {
        BulletinCommonAbility bulletinCommonAbility;
        String string;
        C2227808o8 c2227808o8 = this.LJJIII;
        if (c2227808o8 != null && c2227808o8.LIZ > 0 && (bulletinCommonAbility = this.LIZIZ) != null && (string = Long.valueOf(bulletinCommonAbility.Og2()).toString()) != null) {
            C621270OYj.LIZIZ(c2227808o8.LIZ, c2227808o8.LIZIZ, string, str);
        }
    }

    public final void LJJ(boolean z) {
        int iIntValue;
        Long l;
        String string;
        C621370OYt c621370OYtLJIIJ;
        Boolean boolValueOf;
        this.LJIIZILJ = z;
        boolean zBooleanValue = false;
        if (!z) {
            LJJIFFI();
            LJIL(10, this.LJIIIZ);
            LJIL(22, this.LJIIIIZZ);
            if (this.LJIJI) {
                TuxIconView tuxIconView = this.LJII;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                View view = this.LJIIIIZZ;
                if (view != null) {
                    view.setBackground(null);
                }
                View view2 = this.LJIIIIZZ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                TuxIconView tuxIconView2 = this.LJIIIZ;
                if (tuxIconView2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                }
            } else {
                View view3 = this.LJIIIIZZ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                TuxIconView tuxIconView3 = this.LJIIIZ;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                }
                TuxIconView tuxIconView4 = this.LJII;
                if (tuxIconView4 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
                }
            }
            BulletinVoiceItem bulletinVoiceItem = this.LJIILIIL;
            if (bulletinVoiceItem != null && (l = bulletinVoiceItem.LLJJIJI) != null && (string = l.toString()) != null && (c621370OYtLJIIJ = LJIIJ()) != null && (boolValueOf = Boolean.valueOf(c621370OYtLJIIJ.LIZJ(string))) != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
            LJJIIJ(null, zBooleanValue);
            return;
        }
        Context contextLJIJ = LJIJ();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, contextLJIJ);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else if (this.LIZ) {
            iIntValue = -1;
        } else {
            iIntValue = -16777216;
        }
        if (this.LJIJI) {
            View view4 = this.LJIIIIZZ;
            if (view4 != null) {
                view4.setBackground(null);
            }
            View view5 = this.LJIIIIZZ;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            TuxIconView tuxIconView5 = this.LJIIIZ;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
            TuxIconView tuxIconView6 = this.LJII;
            if (tuxIconView6 == null) {
                return;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZLLL = Integer.valueOf(iIntValue);
            c419910GdJ.LIZ = LJJIJIIJI;
            tuxIconView6.setTuxIcon(c419910GdJ);
            C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
            LJJI(tuxIconView6);
            return;
        }
        TuxIconView tuxIconView7 = this.LJII;
        if (tuxIconView7 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
        }
        LJIL(24, this.LJIIIIZZ);
        View view6 = this.LJIIIIZZ;
        if (view6 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            int iLIZJ = C1308910kAL.LIZJ(R.attr.a03, contextLJIJ);
            if (iLIZJ == null) {
                iLIZJ = 0;
            }
            c384050F3z.LIZ = iLIZJ;
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            view6.setBackground(c384050F3z.LIZ(contextLJIJ));
        }
        View view7 = this.LJIIIIZZ;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(0, view7);
        }
        TuxIconView tuxIconView8 = this.LJIIIZ;
        if (tuxIconView8 == null) {
            return;
        }
        LJIL(12, tuxIconView8);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ2.LIZLLL = Integer.valueOf(iIntValue);
        c419910GdJ2.LIZ = LJJIJIIJIL;
        tuxIconView8.setTuxIcon(c419910GdJ2);
        C786410Ut5.LLLLLLZZ(tuxIconView8, 0);
        LJJI(tuxIconView8);
    }

    public final void LJJI(TuxIconView tuxIconView) {
        LJJIFFI();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.ROTATION, 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LJIIJ = objectAnimatorOfFloat;
    }

    public static void LJIL(int i, View view) {
        if (view == null) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ;
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(view, layoutParams);
    }

    public static void LJJIII(BulletinVoiceItem bulletinVoiceItem, String str) {
        C2233908p7 c2233908p7;
        String str2 = bulletinVoiceItem.LLILZLL;
        if (str2.length() == 0) {
            return;
        }
        C2233808p6.LIZ.getClass();
        if (str2.length() != 0 && (c2233908p7 = C2233808p6.LIZJ.get(str2)) != null) {
            if (c2233908p7.LJIIIZ != 0 && !c2233908p7.LJIIJJI) {
                C2233808p6.LIZIZ(c2233908p7, "aborted_before_start");
            }
            c2233908p7.LJIIIZ = System.currentTimeMillis();
            c2233908p7.LJIIJ = str;
            c2233908p7.LJIIJJI = false;
        }
    }

    public final void LJFF(BulletinVoiceItem bulletinVoiceItem, boolean z) {
        EnumC621190OYb enumC621190OYb;
        Integer num;
        BulletinStyleStruct bulletinStyleStruct;
        if (z) {
            if (bulletinVoiceItem != null && (bulletinStyleStruct = bulletinVoiceItem.LLJJJJLIIL) != null) {
                num = bulletinStyleStruct.frontStyle;
            } else {
                num = null;
            }
            enumC621190OYb = EnumC621190OYb.BULLETIN_FRONT_STYLE_LIGHT;
            int value = enumC621190OYb.getValue();
            if (num == null || num.intValue() != value) {
                enumC621190OYb = EnumC621190OYb.BULLETIN_FRONT_STYLE_DARK;
                int value2 = enumC621190OYb.getValue();
                if (num == null || num.intValue() != value2) {
                    enumC621190OYb = EnumC621190OYb.BULLETIN_FRONT_STYLE_NONE;
                }
            }
        } else {
            enumC621190OYb = EnumC621190OYb.BULLETIN_FRONT_STYLE_NONE;
        }
        if (enumC621190OYb == this.LJJI) {
            return;
        }
        this.LJJI = enumC621190OYb;
        this.LJJ = null;
        String str = this.LJJIFFI;
        if (str == null) {
            return;
        }
        LIZLLL(str, this.LJJII, false);
    }

    public final void LJIILLIIL(String str, String str2) {
        int i;
        C621370OYt c621370OYtLJIIJ;
        String str3;
        C621280OYk c621280OYkLJIILJJIL = LJIILJJIL(str);
        if (c621280OYkLJIILJJIL != null) {
            i = c621280OYkLJIILJJIL.LIZ;
        } else {
            i = 0;
        }
        LJIILL(str);
        this.LJJIII = null;
        BulletinVoiceItem bulletinVoiceItem = this.LJIILIIL;
        if (bulletinVoiceItem != null && (str3 = bulletinVoiceItem.LLILZLL) != null && str3.length() > 0) {
            C2233808p6.LIZ.getClass();
            C2233808p6.LJ(str3, "play_started");
        }
        C621370OYt c621370OYtLJIIJ2 = LJIIJ();
        if (c621370OYtLJIIJ2 != null) {
            c621370OYtLJIIJ2.LJ(str, str2, new AwS158S1100000_9(this, str, 11));
        }
        if (i > 0 && (c621370OYtLJIIJ = LJIIJ()) != null) {
            c621370OYtLJIIJ.LJIIIIZZ(i);
        }
    }

    public final void LJJIIJ(Context context, boolean z) {
        int iIntValue;
        int i;
        int i2;
        if (this.LJIIZILJ) {
            return;
        }
        if (context == null) {
            context = LJIJ();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(this.LJIJ, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else if (this.LIZ) {
            iIntValue = -1;
        } else {
            iIntValue = -16777216;
        }
        if (this.LJIJI) {
            TuxIconView tuxIconView = this.LJII;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZLLL = Integer.valueOf(iIntValue);
                if (z) {
                    i2 = R.raw.icon_pause_circle_fill;
                } else {
                    i2 = R.raw.icon_play_circle_fill;
                }
                c419910GdJ.LIZ = i2;
                tuxIconView.setTuxIcon(c419910GdJ);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LJIIIZ;
        if (tuxIconView2 == null) {
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c419910GdJ2.LIZLLL = Integer.valueOf(iIntValue);
        if (z) {
            i = R.raw.icon_pause_fill;
        } else {
            i = R.raw.icon_play_fill;
        }
        c419910GdJ2.LIZ = i;
        tuxIconView2.setTuxIcon(c419910GdJ2);
    }

    public final void LIZLLL(String str, boolean z, boolean z2) {
        boolean z3;
        Integer numValueOf;
        int iIntValue;
        boolean zLIZIZ;
        int iIntValue2;
        Integer numLIZJ;
        int i;
        C621370OYt c621370OYtLJIIJ;
        C621280OYk c621280OYkLJIILJJIL;
        Context contextLJIJ = LJIJ();
        boolean z4 = true;
        if (z2 || (((c621370OYtLJIIJ = LJIIJ()) != null && c621370OYtLJIIJ.LIZIZ(str)) || ((c621280OYkLJIILJJIL = LJIILJJIL(str)) != null && c621280OYkLJIILJJIL.LIZ > 0))) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJJIFFI = str;
        this.LJJII = z;
        if (Intrinsics.LJFF(this.LJIL, Boolean.valueOf(this.LIZ)) && Intrinsics.LJFF(this.LJIJJ, Boolean.valueOf(z)) && this.LJIJJLI == z3 && this.LJJ == this.LJJI) {
            return;
        }
        this.LJIL = Boolean.valueOf(this.LIZ);
        this.LJIJJ = Boolean.valueOf(z);
        this.LJIJJLI = z3;
        this.LJJ = this.LJJI;
        if (!this.LIZ && z) {
            z4 = false;
        }
        this.LJIJI = z4;
        if (!this.LJIIZILJ) {
            TuxIconView tuxIconView = this.LJII;
            int i2 = 8;
            if (tuxIconView != null) {
                if (z4) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, i);
            }
            if (!z4) {
                i2 = 0;
            }
            View view = this.LJIIIIZZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(i2, view);
            }
            TuxIconView tuxIconView2 = this.LJIIIZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, i2);
            }
        }
        if (z4) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(R.attr.a03);
        }
        this.LJIJ = R.attr.a00;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, contextLJIJ);
        int iIntValue3 = -1;
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        } else if (this.LIZ) {
            iIntValue = -1;
        } else {
            iIntValue = -16777216;
        }
        TuxTextView tuxTextView = this.LJIIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(iIntValue);
        }
        C621370OYt c621370OYtLJIIJ2 = LJIIJ();
        if (c621370OYtLJIIJ2 != null) {
            zLIZIZ = c621370OYtLJIIJ2.LIZIZ(str);
        } else {
            zLIZIZ = false;
        }
        LJJIIJ(contextLJIJ, zLIZIZ);
        if (!this.LJIIZILJ) {
            if (numValueOf != null) {
                View view2 = this.LJIIIIZZ;
                if (view2 != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    int iLIZJ = C1308910kAL.LIZJ(numValueOf.intValue(), contextLJIJ);
                    if (iLIZJ == null) {
                        iLIZJ = 0;
                    }
                    c384050F3z.LIZ = iLIZJ;
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(11));
                    view2.setBackground(c384050F3z.LIZ(contextLJIJ));
                }
            } else {
                View view3 = this.LJIIIIZZ;
                if (view3 != null) {
                    view3.setBackground(null);
                }
            }
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a00, contextLJIJ);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else if (!this.LIZ) {
            iIntValue3 = -16777216;
        }
        if (z3 && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, contextLJIJ)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = iIntValue3;
        }
        C194434115c c194434115c = this.LJIIJJI;
        if (c194434115c != null) {
            c194434115c.LLJJIJIL = iIntValue3;
            c194434115c.LLJJJ = iIntValue2;
            c194434115c.invalidate();
        }
    }

    public C621210OYd(ViewStub viewStub, boolean z, BulletinCommonAbility bulletinCommonAbility, AwS553S0100000_9 awS553S0100000_9, LifecycleCoroutineScope lifecycleCoroutineScope, BulletinListViewModel bulletinListViewModel) {
        this.LIZ = z;
        this.LIZIZ = bulletinCommonAbility;
        this.LIZJ = awS553S0100000_9;
        this.LIZLLL = lifecycleCoroutineScope;
        this.LJ = bulletinListViewModel;
        viewStub.setLayoutResource(R.layout.a8q);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        ViewGroup.LayoutParams layoutParams = viewLJLLLL.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(viewLJLLLL, layoutParams);
        this.LJFF = viewLJLLLL;
        this.LJI = (FrameLayout) viewLJLLLL.findViewById(R.id.voice_play_button_frame);
        this.LJII = (TuxIconView) viewLJLLLL.findViewById(R.id.voice_play_button_creator);
        this.LJIIIIZZ = viewLJLLLL.findViewById(R.id.voice_play_button_consumer_bg);
        this.LJIIIZ = (TuxIconView) viewLJLLLL.findViewById(R.id.voice_play_button_consumer_icon);
        this.LJIIJJI = (C194434115c) viewLJLLLL.findViewById(R.id.voice_waveform_view);
        this.LJIIL = (TuxTextView) viewLJLLLL.findViewById(R.id.voice_duration_text);
        this.LJIJ = R.attr.a00;
        this.LJIJI = z;
        this.LJJI = EnumC621190OYb.BULLETIN_FRONT_STYLE_NONE;
    }
}
