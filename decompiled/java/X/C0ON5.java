package X;

import Y.ACListenerS139S0100000_4;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0ON5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ON5 {
    public static final C0ON5 LIZ = new C0ON5();
    public static final C19319410i8 LIZIZ = new C19319410i8("PopupUtil");
    public static C09AY LIZJ;

    public static void LIZJ(Activity activity, Object obj, TuxSheet tuxSheet) {
        String string;
        C1389890mGx c1389890mGx;
        if (activity == null) {
            return;
        }
        if (obj instanceof Integer) {
            string = activity.getString(((Number) obj).intValue());
        } else if (!(obj instanceof String)) {
            return;
        } else {
            string = (String) obj;
        }
        C19319410i8 c19319410i8 = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popupToastInternal ");
        sbLIZ.append(string);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        if (tuxSheet == null) {
            c1389890mGx = new C1389890mGx(activity);
        } else {
            c1389890mGx = new C1389890mGx(tuxSheet);
        }
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389890mGx.LJIIJJI();
    }

    public static void LIZIZ(C19EG c19eg, int i, int i2, int i3, C0ON7 c0on7) {
        C19319410i8 c19319410i8 = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("popupDialogInternal ");
        sbLIZ.append(i);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        if (c19eg == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LIZIZ(c19eg.getString(i));
        C985403tE.LIZ(c1397580mTM, new C0ON6(c19eg, i2, i3, c0on7));
        c1397580mTM.LJ(AFwS240S0000000_9.get$arr$(584));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        C1391850mK7.LIZIZ(c1397510mTF, "offline_mode_clear_downloaded_videos_dialog");
        c1397510mTF.LIZLLL();
    }

    public static void LIZ(C0ON5 c0on5, final C19EG c19eg, final Fragment fragment, final int i, EnumC344510Dez enumC344510Dez, C419910GdJ c419910GdJ, Integer num, Integer num2, Function0 function0, int i2) {
        final View decorView;
        final Function0 function02 = function0;
        final Integer num3 = num2;
        final Integer num4 = num;
        final C419910GdJ c419910GdJ2 = c419910GdJ;
        final EnumC344510Dez enumC344510Dez2 = enumC344510Dez;
        if ((i2 & 8) != 0) {
            enumC344510Dez2 = null;
        }
        if ((i2 & 16) != 0) {
            c419910GdJ2 = null;
        }
        if ((i2 & 32) != 0) {
            num4 = null;
        }
        if ((i2 & 64) != 0) {
            num3 = null;
        }
        if ((i2 & 128) != 0) {
            function02 = null;
        }
        c0on5.getClass();
        if (C625820Oge.LIZ() && c19eg != null && fragment != null) {
            C19319410i8 c19319410i8 = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popupBottomToastInternal ");
            sbLIZ.append(i);
            c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
            final C118300cf c118300cf = new C118300cf();
            Window window = c19eg.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                HandlerHook.viewPost(decorView, new Runnable() { // from class: X.0Dex
                    public final void LIZ() {
                        final InterfaceC20658015sY interfaceC20658015sY;
                        AbstractC20660815t0 abstractC20660815t0;
                        Rect rect = new Rect();
                        decorView.getGlobalVisibleRect(rect);
                        int i3 = rect.bottom;
                        View viewFindViewById = decorView.findViewById(R.id.content);
                        if (viewFindViewById != null) {
                            viewFindViewById.getGlobalVisibleRect(rect);
                            c118300cf.element = i3 - rect.bottom;
                            C1389910mGz c1389910mGz = new C1389910mGz(fragment);
                            C19EG c19eg2 = c19eg;
                            int i4 = i;
                            C419910GdJ c419910GdJ3 = c419910GdJ2;
                            Integer num5 = num3;
                            C118300cf c118300cf2 = c118300cf;
                            Integer num6 = num4;
                            Function0<Unit> function03 = function02;
                            c1389910mGz.LJIIJ(c19eg2.getString(i4));
                            if (c419910GdJ3 != null) {
                                c1389910mGz.LIZ.LIZIZ = 4;
                                c1389910mGz.LJIIL(c419910GdJ3);
                            }
                            if (num5 != null) {
                                c1389910mGz.LJI(num5.intValue());
                            }
                            c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))) + Math.max(c118300cf2.element, 0) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                            if (num6 != null) {
                                c1389910mGz.LIZ.LIZLLL = 3;
                                c1389910mGz.LIZ.LJ = new AwS370S0200000_4(c19eg2, num6, 20);
                            } else {
                                c1389910mGz.LIZ.LIZLLL = 0;
                            }
                            c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS139S0100000_4(function03, 39);
                            c1389910mGz.LJ(Mp4ScreenVideoLoadTimeout.CONTROL);
                            EnumC344510Dez enumC344510Dez3 = enumC344510Dez2;
                            if (enumC344510Dez3 == null) {
                                c1389910mGz.LJIIJJI();
                                return;
                            }
                            C128Y c128y = fragment;
                            if (!(c128y instanceof InterfaceC20658015sY) || (interfaceC20658015sY = (InterfaceC20658015sY) c128y) == null) {
                                return;
                            }
                            int i5 = C344500Dey.LIZ[enumC344510Dez3.ordinal()];
                            if (i5 == 1) {
                                final AwS375S0200000_9 awS375S0200000_9 = new AwS375S0200000_9(c1389910mGz, decorView, 89);
                                abstractC20660815t0 = new AbstractC20660815t0(interfaceC20658015sY, awS375S0200000_9) { // from class: X.0Df1
                                    public final Function1<C20656615sK, Unit> LL;

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return 7003;
                                    }

                                    {
                                        this.LL = awS375S0200000_9;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        this.LL.invoke(c20656615sK);
                                    }
                                };
                            } else {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        throw new C1954807lC();
                                    }
                                    c1389910mGz.LJIIJJI();
                                    return;
                                }
                                final AwS375S0200000_9 awS375S0200000_92 = new AwS375S0200000_9(c1389910mGz, decorView, 90);
                                abstractC20660815t0 = new AbstractC20660815t0(interfaceC20658015sY, awS375S0200000_92) { // from class: X.0Df0
                                    public final Function1<C20656615sK, Unit> LL;

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return 7004;
                                    }

                                    {
                                        this.LL = awS375S0200000_92;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        this.LL.invoke(c20656615sK);
                                    }
                                };
                            }
                            PopupManager.LJIJI(abstractC20660815t0, true);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("OfflineModePopupUtil@e420.popupBottomToastInternal$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("OfflineModePopupUtil@e420.popupBottomToastInternal$1$1");
                    }
                });
            }
        }
    }
}
