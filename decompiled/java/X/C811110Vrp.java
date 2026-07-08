package X;

import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cubes.api.ImageItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811110Vrp {
    public static final C811110Vrp LIZ = new C811110Vrp();
    public static C811820Vsy LIZIZ;

    public static void LIZ() {
        C844470XAv.LIZ.getClass();
        LIZLLL(C844470XAv.LIZ(), new InterfaceC809720Vpa() { // from class: X.0Vrw
            @Override // X.InterfaceC809720Vpa
            public final void LIZ() {
                C811110Vrp.LIZ.getClass();
                C811110Vrp.LJ(1);
                final C811230Vs1 c811230Vs1 = new C811230Vs1();
                try {
                    c811230Vs1.LIZ.LIZ.LIZ.LIZLLL(C811110Vrp.LIZJ(new ImageItem("https://sf16-pivot-creative.tiktokcdn.com/obj/musically-maliva-obj/1733727239521.png", 712, 1264)));
                    Uri uri = UriProtector.parse("snssdk1233://login");
                    C811240Vs2 c811240Vs2 = c811230Vs1.LIZ;
                    c811240Vs2.LIZIZ = uri;
                    c811240Vs2.LIZJ = "Join TikTok to get more content";
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SignInCardEntity.Builder() ERROR: ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                C811820Vsy c811820Vsy = C811110Vrp.LIZIZ;
                if (c811820Vsy == null) {
                    c811820Vsy = null;
                }
                C811300Vs8 c811300Vs8 = new C811300Vs8();
                c811300Vs8.LIZ.LIZ.LIZ.LIZLLL(new AbstractC811280Vs6(c811230Vs1) { // from class: X.0Vs4
                    public final C811250Vs3 LIZIZ;

                    @Override // X.AbstractC811280Vs6
                    public final Bundle LIZ() {
                        Bundle bundleLIZ = super.LIZ();
                        C811250Vs3 c811250Vs3 = this.LIZIZ;
                        c811250Vs3.getClass();
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJIIZI(bundle, c811250Vs3.LIZ.LIZ(), "A");
                        if (!TextUtils.isEmpty(null)) {
                            C786410Ut5.LJJJI("B", null, bundle);
                        }
                        Uri uri2 = c811250Vs3.LIZIZ;
                        if (uri2 != null) {
                            C786410Ut5.LJJIJL(bundle, "C", uri2);
                        }
                        if (!TextUtils.isEmpty(c811250Vs3.LIZJ)) {
                            C786410Ut5.LJJJI("D", c811250Vs3.LIZJ, bundle);
                        }
                        if (!TextUtils.isEmpty(null)) {
                            C786410Ut5.LJJJI("E", null, bundle);
                        }
                        C786410Ut5.LJJIIZI(bundleLIZ, bundle, "A");
                        return bundleLIZ;
                    }

                    {
                        super(23);
                        this.LIZIZ = new C811250Vs3(c811230Vs1.LIZ);
                    }
                });
                C811190Vrx c811190Vrx = new C811190Vrx(c811300Vs8);
                C811810Vsx c811810Vsx = c811820Vsy.LIZ;
                C811220Vs0 c811220Vs0 = new C811220Vs0();
                c811220Vs0.LIZ.LIZLLL(c811190Vrx.LIZ);
                c811810Vsx.LIZ(new C811200Vry(c811220Vs0)).LJIILLIIL(EnumC2272608vM.LL, new InterfaceC835700WqO() { // from class: X.0Vrz
                    @Override // X.InterfaceC835700WqO
                    public final C835510Wq5 then(Object obj) {
                        return C835460Wq0.LJ(null);
                    }
                }).LIZIZ(new InterfaceC834580Woa() { // from class: X.0VpZ
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz<Void> abstractC835450Wpz) {
                        if (abstractC835450Wpz.LJIILJJIL()) {
                            C0VQD.LIZ.getClass();
                            C0VQD.LIZ(0);
                            return;
                        }
                        Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                        if (!(excLJIIIZ instanceof C812840Vuc)) {
                            return;
                        }
                        int errorCode = ((C812840Vuc) excLJIIIZ).getErrorCode();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("publishSignInCard() AppEngageException: ");
                        sbLIZ2.append(errorCode);
                        sbLIZ2.append('!');
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C0VQD.LIZ.getClass();
                        C0VQD.LIZ(errorCode);
                    }
                });
            }

            @Override // X.InterfaceC809720Vpa
            public final void LIZIZ(C0VQL c0vql) {
                int i = C0VQM.LIZ[c0vql.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onInitFail(ERR_ELSE: ");
                        sbLIZ.append(c0vql);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        C0VQB.LIZIZ.LJ(false, null);
                        return;
                    }
                    C0VQB.LIZIZ.LJ(false, null);
                }
            }
        });
    }

    public static void LIZIZ() {
        C844470XAv.LIZ.getClass();
        LIZLLL(C844470XAv.LIZ(), new InterfaceC809720Vpa() { // from class: X.0Vpc
            @Override // X.InterfaceC809720Vpa
            public final void LIZ() {
                C811820Vsy c811820Vsy = C811110Vrp.LIZIZ;
                if (c811820Vsy == null) {
                    c811820Vsy = null;
                }
                c811820Vsy.getClass();
                C809930Vpv c809930Vpv = new C809930Vpv();
                c809930Vpv.LIZ.LIZLLL(8);
                c811820Vsy.LIZ(new C809940Vpw(c809930Vpv)).LIZIZ(new InterfaceC834580Woa() { // from class: X.0Vpb
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz<Void> abstractC835450Wpz) {
                        if (!abstractC835450Wpz.LJIILJJIL()) {
                            Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                            if (excLJIIIZ instanceof C812840Vuc) {
                                int errorCode = ((C812840Vuc) excLJIIIZ).getErrorCode();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("clearSignInCard() AppEngageException: ");
                                sbLIZ.append(errorCode);
                                sbLIZ.append('!');
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                    }
                });
            }

            @Override // X.InterfaceC809720Vpa
            public final void LIZIZ(C0VQL c0vql) {
                int i = C0VQN.LIZ[c0vql.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onInitFail(ERR_ELSE: ");
                        sbLIZ.append(c0vql);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        C0VQB.LIZIZ.LJ(false, null);
                        return;
                    }
                    C0VQB.LIZIZ.LJ(false, null);
                }
            }
        });
    }

    public static C811170Vrv LIZJ(ImageItem imageItem) {
        if (imageItem != null) {
            C811120Vrq c811120Vrq = new C811120Vrq();
            c811120Vrq.LIZ = UriProtector.parse(imageItem.url);
            c811120Vrq.LIZIZ = imageItem.height;
            c811120Vrq.LIZJ = imageItem.width;
            return new C811170Vrv(c811120Vrq);
        }
        return new C811170Vrv(new C811120Vrq());
    }

    public static void LJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishEmptyAndSyncStatus(");
        sbLIZ.append(i);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C844470XAv.LIZ.getClass();
        C811820Vsy c811820Vsy = null;
        LIZLLL(C844470XAv.LIZ(), null);
        C811820Vsy c811820Vsy2 = LIZIZ;
        if (c811820Vsy2 == null) {
            c811820Vsy2 = null;
        }
        c811820Vsy2.getClass();
        C809930Vpv c809930Vpv = new C809930Vpv();
        c809930Vpv.LIZ.LIZLLL(1);
        c811820Vsy2.LIZ(new C809940Vpw(c809930Vpv));
        C811820Vsy c811820Vsy3 = LIZIZ;
        if (c811820Vsy3 != null) {
            c811820Vsy = c811820Vsy3;
        }
        C811160Vru c811160Vru = new C811160Vru();
        c811160Vru.LIZ = i;
        C811150Vrt c811150Vrt = new C811150Vrt(c811160Vru);
        final C811810Vsx c811810Vsx = c811820Vsy.LIZ;
        c811810Vsx.getClass();
        final Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("engage_sdk_version", c811810Vsx.LIZLLL, bundle);
        C786410Ut5.LJJJI("calling_package_name", c811810Vsx.LIZJ, bundle);
        bundle.putInt("publish_status_code", c811150Vrt.LIZ);
        c811810Vsx.LIZIZ(new InterfaceC811950VtB() { // from class: X.0Vt8
            @Override // X.InterfaceC811950VtB
            public final void LIZ(InterfaceC811930Vt9 interfaceC811930Vt9, C835520Wq6 c835520Wq6) {
                interfaceC811930Vt9.O0(bundle, new BinderC812180VtY(c811810Vsx, c835520Wq6));
            }
        }).LJIILLIIL(EnumC2272608vM.LL, new InterfaceC835700WqO() { // from class: X.0Vrr
            @Override // X.InterfaceC835700WqO
            public final C835510Wq5 then(Object obj) {
                return C835460Wq0.LJ(null);
            }
        });
    }

    public static void LIZLLL(Context context, final InterfaceC809720Vpa interfaceC809720Vpa) {
        AbstractC835450Wpz abstractC835450WpzLJIIIIZZ;
        if (LIZIZ == null) {
            try {
                LIZIZ = new C811820Vsy(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0VQD c0vqd = C0VQD.LIZ;
                String message = e.getMessage();
                boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
                c0vqd.getClass();
                C0VQD.LIZJ(3, zIsLogin ? 1 : 0, message);
                if (interfaceC809720Vpa != null) {
                    interfaceC809720Vpa.LIZIZ(C0VQL.ERR_IPC_CALL_FAILS);
                    return;
                }
                return;
            }
        }
        if (interfaceC809720Vpa != null) {
            C811820Vsy c811820Vsy = LIZIZ;
            if (c811820Vsy == null) {
                c811820Vsy = null;
            }
            final C811810Vsx c811810Vsx = c811820Vsy.LIZ;
            if (!c811810Vsx.LIZ) {
                abstractC835450WpzLJIIIIZZ = C835460Wq0.LJ(Boolean.FALSE);
            } else {
                final Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("engage_sdk_version", c811810Vsx.LIZLLL, bundle);
                C786410Ut5.LJJJI("calling_package_name", c811810Vsx.LIZJ, bundle);
                abstractC835450WpzLJIIIIZZ = c811810Vsx.LIZIZ(new InterfaceC811950VtB() { // from class: X.0VtA
                    @Override // X.InterfaceC811950VtB
                    public final void LIZ(InterfaceC811930Vt9 interfaceC811930Vt9, C835520Wq6 c835520Wq6) {
                        interfaceC811930Vt9.LLLLL(bundle, new BinderC812110VtR(c811810Vsx, c835520Wq6));
                    }
                }).LJIIIIZZ(EnumC2272608vM.LL, new InterfaceC835680WqM() { // from class: X.0Vt0
                    @Override // X.InterfaceC835680WqM
                    public final Object LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                        int errorCode;
                        C2460109kV c2460109kV = C811810Vsx.LJFF;
                        if (abstractC835450Wpz.LJIIL()) {
                            return C835460Wq0.LIZLLL(new C812840Vuc(3));
                        }
                        if (abstractC835450Wpz.LJIILJJIL()) {
                            return C835460Wq0.LJ(Boolean.valueOf(((BaseBundle) abstractC835450Wpz.LJIIJ()).getBoolean("availability", false)));
                        }
                        Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                        if (excLJIIIZ != null) {
                            if (excLJIIIZ instanceof C812060VtM) {
                                return C835460Wq0.LJ(Boolean.FALSE);
                            }
                            if ((excLJIIIZ instanceof C812840Vuc) && ((errorCode = ((C812840Vuc) excLJIIIZ).getErrorCode()) == 2 || errorCode == 1)) {
                                return C835460Wq0.LJ(Boolean.FALSE);
                            }
                            return C835460Wq0.LIZLLL(excLJIIIZ);
                        }
                        return C835460Wq0.LIZLLL(new C812840Vuc(3));
                    }
                });
            }
            abstractC835450WpzLJIIIIZZ.LJIILLIIL(EnumC2272608vM.LL, new InterfaceC835700WqO() { // from class: X.0Vrs
                @Override // X.InterfaceC835700WqO
                public final C835510Wq5 then(Object obj) {
                    return C835460Wq0.LJ(obj);
                }
            }).LIZIZ(new InterfaceC834580Woa() { // from class: X.0VpX
                @Override // X.InterfaceC834580Woa
                public final void LIZ(AbstractC835450Wpz<Boolean> abstractC835450Wpz) {
                    String message2 = null;
                    if (abstractC835450Wpz.LJIILJJIL()) {
                        if (Intrinsics.LJFF(abstractC835450Wpz.LJIIJ(), Boolean.TRUE)) {
                            C0VQD c0vqd2 = C0VQD.LIZ;
                            boolean zIsLogin2 = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
                            c0vqd2.getClass();
                            C0VQD.LIZJ(0, zIsLogin2 ? 1 : 0, null);
                            interfaceC809720Vpa.LIZ();
                            return;
                        }
                        C0VQD c0vqd3 = C0VQD.LIZ;
                        boolean zIsLogin3 = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
                        c0vqd3.getClass();
                        C0VQD.LIZJ(1, zIsLogin3 ? 1 : 0, null);
                        interfaceC809720Vpa.LIZIZ(C0VQL.ERR_NOT_AVAILABLE);
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("The IPC call itself fails: ");
                    sbLIZ.append(abstractC835450Wpz.LJIIIZ());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C0VQD c0vqd4 = C0VQD.LIZ;
                    Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                    if (excLJIIIZ != null) {
                        message2 = excLJIIIZ.getMessage();
                    }
                    boolean zIsLogin4 = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
                    c0vqd4.getClass();
                    C0VQD.LIZJ(2, zIsLogin4 ? 1 : 0, message2);
                    interfaceC809720Vpa.LIZIZ(C0VQL.ERR_IPC_CALL_FAILS);
                }
            });
        }
    }
}
