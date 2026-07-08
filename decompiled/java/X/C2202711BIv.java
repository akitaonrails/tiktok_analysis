package X;

import Y.ARunnableS38S1100000_34;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1BIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202711BIv extends AbstractC21522419Ks {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public boolean LLJ;
    public String LLJI;
    public String LLJIJIL;
    public final C1BJ2 LLJILJIL;
    public boolean LLJILJILJ;
    public EnumC21522219Kq LLJILLL;
    public C1BJ4 LLJJ;
    public long LLJJI;
    public C21521919Kn LLJJIII;
    public C2202901BJo LLJJIJI;
    public C01GW<? extends LoginManager> LLJJIJIIJIL;
    public Float LLJJIJIL;
    public int LLJJJ;
    public final String LLJJJIL;
    public CallbackManager LLJJJJ;
    public C19FH LLJJJJJIL;

    @Override // X.AbstractC21522419Ks
    public int getDefaultStyleResource() {
        return R.style.aac;
    }

    public final int getLoginButtonContinueLabel() {
        return 2131828980;
    }

    public final String getAuthType() {
        return this.LLJILJIL.LIZLLL;
    }

    public final C1BIP getDefaultAudience() {
        return this.LLJILJIL.LIZ;
    }

    public final C1BIT getLoginBehavior() {
        return this.LLJILJIL.LIZJ;
    }

    public final EnumC824980WXw getLoginTargetApp() {
        return this.LLJILJIL.LJ;
    }

    public final String getMessengerPageId() {
        return this.LLJILJIL.LJFF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BIf] */
    public ViewOnClickListenerC2202551BIf getNewLoginClickListener() {
        return new View.OnClickListener() { // from class: X.1BIf
            public final LoginManager LIZ() {
                EnumC824980WXw enumC824980WXw;
                if (C807660VmG.LIZ(this)) {
                    return null;
                }
                try {
                    LoginManager loginManagerLIZ = LoginManager.LJIIIZ.LIZ();
                    loginManagerLIZ.LIZIZ = this.LL.getDefaultAudience();
                    loginManagerLIZ.LIZ = this.LL.getLoginBehavior();
                    if (C807660VmG.LIZ(this)) {
                        enumC824980WXw = null;
                    } else {
                        try {
                            enumC824980WXw = EnumC824980WXw.FACEBOOK;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            enumC824980WXw = null;
                        }
                    }
                    loginManagerLIZ.LJI = enumC824980WXw;
                    loginManagerLIZ.LIZLLL = this.LL.getAuthType();
                    C807660VmG.LIZ(this);
                    loginManagerLIZ.LJII = false;
                    loginManagerLIZ.LJIIIIZZ = this.LL.getShouldSkipAccountDeduplication();
                    loginManagerLIZ.LJ = this.LL.getMessengerPageId();
                    loginManagerLIZ.LJFF = this.LL.getResetMessengerState();
                    return loginManagerLIZ;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return null;
                }
            }

            public final void LIZIZ() {
                if (C807660VmG.LIZ(this)) {
                    return;
                }
                try {
                    LoginManager loginManagerLIZ = LIZ();
                    C2202711BIv c2202711BIv = this.LL;
                    C19FH c19fh = c2202711BIv.LLJJJJJIL;
                    if (c19fh != null) {
                        C2202591BIj c2202591BIj = (C2202591BIj) c19fh.LIZJ;
                        CallbackManager callbackManager = c2202711BIv.getCallbackManager();
                        if (callbackManager == null) {
                            callbackManager = new C2202501BIa();
                        }
                        c2202591BIj.LIZ = callbackManager;
                        c19fh.LIZ(this.LL.getProperties().LIZIZ);
                        return;
                    }
                    if (c2202711BIv.getFragment() != null) {
                        Fragment fragment = this.LL.getFragment();
                        if (fragment != null) {
                            C2202711BIv c2202711BIv2 = this.LL;
                            List<String> list = c2202711BIv2.getProperties().LIZIZ;
                            String loggerID = c2202711BIv2.getLoggerID();
                            loginManagerLIZ.getClass();
                            C202011142n c202011142n = new C202011142n(fragment);
                            LoginClient.Request requestLIZ = loginManagerLIZ.LIZ(new C13LR(list));
                            if (loggerID != null) {
                                requestLIZ.authId = loggerID;
                            }
                            loginManagerLIZ.LJI(new InterfaceC1701380uNM(c202011142n) { // from class: X.142m
                                public final C202011142n LIZ;
                                public final Activity LIZIZ;

                                @Override // X.InterfaceC1701380uNM
                                public final Activity LIZ() {
                                    return this.LIZIZ;
                                }

                                {
                                    Activity activity;
                                    this.LIZ = c202011142n;
                                    Fragment fragment2 = c202011142n.LIZ;
                                    if (fragment2 != null) {
                                        activity = fragment2.getActivity();
                                    } else {
                                        android.app.Fragment fragment3 = c202011142n.LIZIZ;
                                        if (fragment3 == null) {
                                            activity = null;
                                        } else {
                                            activity = fragment3.getActivity();
                                        }
                                    }
                                    this.LIZIZ = activity;
                                }

                                @Override // X.InterfaceC1701380uNM
                                public final void startActivityForResult(Intent intent, int i) throws Throwable {
                                    int iIntValue = i;
                                    Intent intent2 = intent;
                                    C202011142n c202011142n2 = this.LIZ;
                                    Fragment fragment2 = c202011142n2.LIZ;
                                    if (fragment2 != null) {
                                        C1701330uNH.LIZ(intent2, fragment2);
                                        C2204961BRm.LLJL(fragment2, intent2, iIntValue, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXilpWL7GarKXWf8luvGcLvbQ==", new String[]{"019e5"}));
                                        return;
                                    }
                                    android.app.Fragment fragment3 = c202011142n2.LIZIZ;
                                    if (fragment3 == null) {
                                        return;
                                    }
                                    C1701330uNH.LIZ(intent2, fragment3);
                                    C0WZX c0wzx = new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXilpWL7GarKXWf8luvGcLvbQ==", new String[]{"019e5"});
                                    C0WST c0wst = new C0WST();
                                    Object[] objArr = {intent2, Integer.valueOf(iIntValue)};
                                    C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
                                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11085, "android/app/Fragment", "startActivityForResult", fragment3, objArr, "void", c0wzw);
                                    if (c0wsuLIZIZ.LIZ) {
                                        c0wst.LIZ(11085, "android/app/Fragment", "startActivityForResult", null, objArr, fragment3, c0wzw, false);
                                        return;
                                    }
                                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                                    if (objArr2 != null) {
                                        Object obj = objArr2[0];
                                        if (obj != null) {
                                            fragment3 = (android.app.Fragment) obj;
                                        }
                                        Object obj2 = objArr2[1];
                                        if (obj2 != null) {
                                            intent2 = (Intent) obj2;
                                        }
                                        Object obj3 = objArr2[2];
                                        if (obj3 != null) {
                                            iIntValue = ((Integer) obj3).intValue();
                                        }
                                    }
                                    fragment3.startActivityForResult(intent2, iIntValue);
                                    c0wst.LIZ(11085, "android/app/Fragment", "startActivityForResult", null, objArr, fragment3, c0wzw, true);
                                }
                            }, requestLIZ);
                            return;
                        }
                        return;
                    }
                    if (this.LL.getNativeFragment() == null) {
                        Activity activity = this.LL.getActivity();
                        List<String> list2 = this.LL.getProperties().LIZIZ;
                        String loggerID2 = this.LL.getLoggerID();
                        loginManagerLIZ.getClass();
                        LoginClient.Request requestLIZ2 = loginManagerLIZ.LIZ(new C13LR(list2));
                        if (loggerID2 != null) {
                            requestLIZ2.authId = loggerID2;
                        }
                        loginManagerLIZ.LJI(new InterfaceC1701380uNM(activity) { // from class: X.0uNJ
                            public final Activity LIZ;

                            @Override // X.InterfaceC1701380uNM
                            public final Activity LIZ() {
                                return this.LIZ;
                            }

                            {
                                this.LIZ = activity;
                            }

                            @Override // X.InterfaceC1701380uNM
                            public final void startActivityForResult(Intent intent, int i) throws Throwable {
                                Activity activity2 = this.LIZ;
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                                C1701330uNH.LIZ(intent, activity2);
                                C2204961BRm.LJIIZILJ(i, activity2, intent, new C0WZX("dzBzEgQ7XM/eWlgqCx6LYVXDpcl0e9WVUVV6k53Qaw==", new String[]{"019e5"}));
                            }
                        }, requestLIZ2);
                        return;
                    }
                    android.app.Fragment nativeFragment = this.LL.getNativeFragment();
                    if (nativeFragment != null) {
                        C2202711BIv c2202711BIv3 = this.LL;
                        List<String> list3 = c2202711BIv3.getProperties().LIZIZ;
                        String loggerID3 = c2202711BIv3.getLoggerID();
                        loginManagerLIZ.getClass();
                        C202011142n c202011142n2 = new C202011142n(nativeFragment);
                        LoginClient.Request requestLIZ3 = loginManagerLIZ.LIZ(new C13LR(list3));
                        if (loggerID3 != null) {
                            requestLIZ3.authId = loggerID3;
                        }
                        loginManagerLIZ.LJI(new InterfaceC1701380uNM(c202011142n2) { // from class: X.142m
                            public final C202011142n LIZ;
                            public final Activity LIZIZ;

                            @Override // X.InterfaceC1701380uNM
                            public final Activity LIZ() {
                                return this.LIZIZ;
                            }

                            {
                                Activity activity2;
                                this.LIZ = c202011142n2;
                                Fragment fragment2 = c202011142n2.LIZ;
                                if (fragment2 != null) {
                                    activity2 = fragment2.getActivity();
                                } else {
                                    android.app.Fragment fragment3 = c202011142n2.LIZIZ;
                                    if (fragment3 == null) {
                                        activity2 = null;
                                    } else {
                                        activity2 = fragment3.getActivity();
                                    }
                                }
                                this.LIZIZ = activity2;
                            }

                            @Override // X.InterfaceC1701380uNM
                            public final void startActivityForResult(Intent intent, int i) throws Throwable {
                                int iIntValue = i;
                                Intent intent2 = intent;
                                C202011142n c202011142n22 = this.LIZ;
                                Fragment fragment2 = c202011142n22.LIZ;
                                if (fragment2 != null) {
                                    C1701330uNH.LIZ(intent2, fragment2);
                                    C2204961BRm.LLJL(fragment2, intent2, iIntValue, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXilpWL7GarKXWf8luvGcLvbQ==", new String[]{"019e5"}));
                                    return;
                                }
                                android.app.Fragment fragment3 = c202011142n22.LIZIZ;
                                if (fragment3 == null) {
                                    return;
                                }
                                C1701330uNH.LIZ(intent2, fragment3);
                                C0WZX c0wzx = new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXilpWL7GarKXWf8luvGcLvbQ==", new String[]{"019e5"});
                                C0WST c0wst = new C0WST();
                                Object[] objArr = {intent2, Integer.valueOf(iIntValue)};
                                C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
                                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11085, "android/app/Fragment", "startActivityForResult", fragment3, objArr, "void", c0wzw);
                                if (c0wsuLIZIZ.LIZ) {
                                    c0wst.LIZ(11085, "android/app/Fragment", "startActivityForResult", null, objArr, fragment3, c0wzw, false);
                                    return;
                                }
                                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                                if (objArr2 != null) {
                                    Object obj = objArr2[0];
                                    if (obj != null) {
                                        fragment3 = (android.app.Fragment) obj;
                                    }
                                    Object obj2 = objArr2[1];
                                    if (obj2 != null) {
                                        intent2 = (Intent) obj2;
                                    }
                                    Object obj3 = objArr2[2];
                                    if (obj3 != null) {
                                        iIntValue = ((Integer) obj3).intValue();
                                    }
                                }
                                fragment3.startActivityForResult(intent2, iIntValue);
                                c0wst.LIZ(11085, "android/app/Fragment", "startActivityForResult", null, objArr, fragment3, c0wzw, true);
                            }
                        }, requestLIZ3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            public final void LIZJ(Context context) {
                String str;
                String string;
                if (C807660VmG.LIZ(this)) {
                    return;
                }
                try {
                    LoginManager loginManagerLIZ = LIZ();
                    C2202711BIv c2202711BIv = this.LL;
                    if (c2202711BIv.LLJ) {
                        String string2 = c2202711BIv.getResources().getString(2131828982);
                        String string3 = this.LL.getResources().getString(2131828978);
                        Profile.Companion.getClass();
                        Profile profile = C2202701BIu.LIZLLL.LIZ().LIZJ;
                        if (profile != null) {
                            str = profile.name;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            string = C786410Ut5.j4(this.LL.getResources().getString(2131828984), Arrays.copyOf(new Object[]{profile.name}, 1));
                        } else {
                            string = this.LL.getResources().getString(2131828985);
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new C1D10(loginManagerLIZ, 4)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                        C786410Ut5.A4(builder.create());
                        return;
                    }
                    loginManagerLIZ.LIZLLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i;
                if (C807660VmG.LIZ(this)) {
                    return;
                }
                try {
                    if (C807660VmG.LIZ(this)) {
                        return;
                    }
                    try {
                        C2202711BIv c2202711BIv = this.LL;
                        c2202711BIv.getClass();
                        if (!C807660VmG.LIZ(c2202711BIv)) {
                            try {
                                View.OnClickListener onClickListener = c2202711BIv.LLILLL;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        AccessToken.Companion.getClass();
                        AccessToken accessTokenLIZIZ = C2202721BIw.LIZIZ();
                        boolean zLIZJ = C2202721BIw.LIZJ();
                        if (zLIZJ) {
                            LIZJ(this.LL.getContext());
                        } else {
                            LIZIZ();
                        }
                        this.LL.getContext();
                        Bundle bundle = new Bundle();
                        if (accessTokenLIZIZ != null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        bundle.putInt("logging_in", i);
                        bundle.putInt("access_token_expired", zLIZJ ? 1 : 0);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
        };
    }

    public final List<String> getPermissions() {
        return this.LLJILJIL.LIZIZ;
    }

    public final boolean getResetMessengerState() {
        return this.LLJILJIL.LJI;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        this.LLJILJIL.getClass();
        return false;
    }

    public final void LJI() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            int i = C1BJV.LIZ[this.LLJJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    LJII(getResources().getString(2131828993));
                }
            } else {
                C0W7K.LIZLLL(getContext(), "context");
                FacebookSdk.LJ().execute(new ARunnableS38S1100000_34(this, FacebookSdk.LIZLLL(), 12));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJ() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(C14MI.LIZ(getContext(), R.drawable.b0a), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJJI() {
        int stateCount;
        GradientDrawable gradientDrawable;
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            Float f = this.LLJJIJIL;
            if (f == null) {
                return;
            }
            float fFloatValue = f.floatValue();
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable) && (stateCount = ((StateListDrawable) background).getStateCount()) > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Drawable stateDrawable = ((StateListDrawable) background).getStateDrawable(i);
                    if ((stateDrawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) stateDrawable) != null) {
                        gradientDrawable.setCornerRadius(fFloatValue);
                    }
                    if (i2 >= stateCount) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(fFloatValue);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIL() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode()) {
                AccessToken.Companion.getClass();
                if (C2202721BIw.LIZJ()) {
                    String string = this.LLJIJIL;
                    if (string == null) {
                        string = resources.getString(2131828983);
                    }
                    setText(string);
                    return;
                }
            }
            String str = this.LLJI;
            if (str != null) {
                setText(str);
                return;
            }
            String string2 = resources.getString(getLoginButtonContinueLabel());
            int width = getWidth();
            if (width != 0 && LJIIIIZZ(string2) > width) {
                string2 = resources.getString(2131828979);
            }
            setText(string2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC21522419Ks
    public int getDefaultRequestCode() {
        if (C807660VmG.LIZ(this)) {
            return 0;
        }
        try {
            return EnumC2202541BIe.Login.toRequestCode();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // X.AbstractC21522419Ks, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof InterfaceC1670800ta2) {
                Object context = getContext();
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
                }
                C19FF activityResultRegistry = ((InterfaceC1670800ta2) context).getActivityResultRegistry();
                LoginManager value = this.LLJJIJIIJIL.getValue();
                CallbackManager callbackManager = this.LLJJJJ;
                String str = this.LLJJJIL;
                value.getClass();
                this.LLJJJJJIL = activityResultRegistry.LIZLLL("facebook-login", new C2202591BIj(value, callbackManager, str), new C168Q() { // from class: X.1BKP
                    @Override // X.C168Q
                    public final void LIZ(Object obj) {
                    }
                });
            }
            C2202901BJo c2202901BJo = this.LLJJIJI;
            if (c2202901BJo == null || !c2202901BJo.LIZJ) {
                return;
            }
            LJIIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            C19FH c19fh = this.LLJJJJJIL;
            if (c19fh != null) {
                c19fh.LIZIZ();
            }
            C2202901BJo c2202901BJo = this.LLJJIJI;
            if (c2202901BJo != null && c2202901BJo.LIZJ) {
                c2202901BJo.LIZIZ.LIZLLL(c2202901BJo.LIZ);
                c2202901BJo.LIZJ = false;
            }
            C21521919Kn c21521919Kn = this.LLJJIII;
            if (c21521919Kn != null) {
                c21521919Kn.LIZ();
            }
            this.LLJJIII = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final CallbackManager getCallbackManager() {
        return this.LLJJJJ;
    }

    public final String getLoggerID() {
        return this.LLJJJIL;
    }

    public final C01GW<LoginManager> getLoginManagerLazy() {
        return this.LLJJIJIIJIL;
    }

    public final String getLoginText() {
        return this.LLJI;
    }

    public final String getLogoutText() {
        return this.LLJIJIL;
    }

    public final C1BJ2 getProperties() {
        return this.LLJILJIL;
    }

    public final long getToolTipDisplayTime() {
        return this.LLJJI;
    }

    public final C1BJ4 getToolTipMode() {
        return this.LLJJ;
    }

    public final EnumC21522219Kq getToolTipStyle() {
        return this.LLJILLL;
    }

    public C2202711BIv(Context context) {
        super(context);
        this.LLJILJIL = new C1BJ2();
        this.LLJILLL = EnumC21522219Kq.BLUE;
        C1BJ4.Companion.getClass();
        this.LLJJ = C1BJ4.DEFAULT;
        this.LLJJI = 6000L;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(289));
        this.LLJJJ = 255;
        this.LLJJJIL = UUID.randomUUID().toString();
    }

    public final void LJII(String str) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            C21521919Kn c21521919Kn = new C21521919Kn(this, str);
            EnumC21522219Kq enumC21522219Kq = this.LLJILLL;
            if (!C807660VmG.LIZ(c21521919Kn)) {
                try {
                    c21521919Kn.LJFF = enumC21522219Kq;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            long j = this.LLJJI;
            if (!C807660VmG.LIZ(c21521919Kn)) {
                try {
                    c21521919Kn.LJI = j;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            c21521919Kn.LIZIZ();
            this.LLJJIII = c21521919Kn;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public final int LJIIIIZZ(String str) {
        if (C807660VmG.LIZ(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + LIZIZ(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // X.AbstractC21522419Ks, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
            if (!this.LLJILJILJ && !isInEditMode()) {
                this.LLJILJILJ = true;
                LJI();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void setAuthType(String str) {
        this.LLJILJIL.LIZLLL = str;
    }

    public final void setDefaultAudience(C1BIP c1bip) {
        this.LLJILJIL.LIZ = c1bip;
    }

    public final void setLoginBehavior(C1BIT c1bit) {
        this.LLJILJIL.LIZJ = c1bit;
    }

    public final void setLoginManagerLazy(C01GW<? extends LoginManager> c01gw) {
        this.LLJJIJIIJIL = c01gw;
    }

    public final void setLoginTargetApp(EnumC824980WXw enumC824980WXw) {
        this.LLJILJIL.LJ = enumC824980WXw;
    }

    public final void setLoginText(String str) {
        this.LLJI = str;
        LJIIL();
    }

    public final void setLogoutText(String str) {
        this.LLJIJIL = str;
        LJIIL();
    }

    public final void setMessengerPageId(String str) {
        this.LLJILJIL.LJFF = str;
    }

    public final void setPermissions(String... strArr) {
        this.LLJILJIL.LIZIZ = C13LQ.LJIJI(Arrays.copyOf(strArr, strArr.length));
    }

    @InterfaceC1294060jmO
    public final void setPublishPermissions(String... strArr) {
        this.LLJILJIL.LIZIZ = C13LQ.LJIJI(Arrays.copyOf(strArr, strArr.length));
    }

    @InterfaceC1294060jmO
    public final void setReadPermissions(String... strArr) {
        this.LLJILJIL.LIZIZ = C13LQ.LJIJI(Arrays.copyOf(strArr, strArr.length));
    }

    public final void setResetMessengerState(boolean z) {
        this.LLJILJIL.LJI = z;
    }

    public final void setToolTipDisplayTime(long j) {
        this.LLJJI = j;
    }

    public final void setToolTipMode(C1BJ4 c1bj4) {
        this.LLJJ = c1bj4;
    }

    public final void setToolTipStyle(EnumC21522219Kq enumC21522219Kq) {
        this.LLJILLL = enumC21522219Kq;
    }

    public final void setPermissions(List<String> list) {
        this.LLJILJIL.LIZIZ = list;
    }

    @InterfaceC1294060jmO
    public final void setPublishPermissions(List<String> list) {
        this.LLJILJIL.LIZIZ = list;
    }

    @InterfaceC1294060jmO
    public final void setReadPermissions(List<String> list) {
        this.LLJILJIL.LIZIZ = list;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1BJo] */
    @Override // X.AbstractC21522419Ks
    public final void LIZ(Context context, int i) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.LIZ(context, i);
            setInternalOnClickListener(getNewLoginClickListener());
            LJIIIZ(context, i);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(R.color.i6));
                setLoginText("Continue with Facebook");
            } else {
                this.LLJJIJI = new AbstractC787340Uua() { // from class: X.1BJo
                    @Override // X.AbstractC787340Uua
                    public final void LIZ() {
                        this.LJ.LJIIL();
                        this.LJ.LJIIJ();
                    }
                };
            }
            LJIIL();
            LJIIJJI();
            if (!C807660VmG.LIZ(this)) {
                try {
                    getBackground().setAlpha(this.LLJJJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            LJIIJ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LJIIIZ(Context context, int i) {
        C1BJ4 c1bj4;
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            C1BJ4.Companion.getClass();
            C1BJ4 c1bj42 = C1BJ4.DEFAULT;
            this.LLJJ = c1bj42;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R$styleable.com_facebook_login_view, 0, i);
            try {
                this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.com_facebook_login_view_com_facebook_confirm_logout, true);
                setLoginText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.com_facebook_login_view_com_facebook_login_text));
                setLogoutText(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.com_facebook_login_view_com_facebook_logout_text));
                int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.com_facebook_login_view_com_facebook_tooltip_mode, c1bj42.getIntValue());
                C1BJ4[] c1bj4ArrValuesCustom = C1BJ4.valuesCustom();
                int length = c1bj4ArrValuesCustom.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        c1bj4 = c1bj4ArrValuesCustom[i3];
                        if (c1bj4.getIntValue() == i2) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        C1BJ4.Companion.getClass();
                        c1bj4 = C1BJ4.DEFAULT;
                        break;
                    }
                }
                this.LLJJ = c1bj4;
                if (typedArrayObtainStyledAttributes.hasValue(R$styleable.com_facebook_login_view_com_facebook_login_button_radius)) {
                    this.LLJJIJIL = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(R$styleable.com_facebook_login_view_com_facebook_login_button_radius, 0.0f));
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.com_facebook_login_view_com_facebook_login_button_transparency, 255);
                this.LLJJJ = integer;
                int iMax = Math.max(0, integer);
                this.LLJJJ = iMax;
                this.LLJJJ = Math.min(255, iMax);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int iLJIIIIZZ = 0;
            if (!C807660VmG.LIZ(this)) {
                try {
                    Resources resources2 = getResources();
                    String string = this.LLJI;
                    if (string == null) {
                        string = resources2.getString(2131828980);
                        int iLJIIIIZZ2 = LJIIIIZZ(string);
                        if (Button.resolveSize(iLJIIIIZZ2, i) < iLJIIIIZZ2) {
                            string = resources2.getString(2131828979);
                        }
                    }
                    iLJIIIIZZ = LJIIIIZZ(string);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            String string2 = this.LLJIJIL;
            if (string2 == null) {
                string2 = resources.getString(2131828983);
            }
            setMeasuredDimension(Button.resolveSize(Math.max(iLJIIIIZZ, LJIIIIZZ(string2)), i), compoundPaddingTop);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            if (i != 0) {
                C21521919Kn c21521919Kn = this.LLJJIII;
                if (c21521919Kn != null) {
                    c21521919Kn.LIZ();
                }
                this.LLJJIII = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            LJIIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
