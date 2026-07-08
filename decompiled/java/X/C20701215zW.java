package X;

import Y.ACListenerS165S0100000_31;
import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.cla.et.newet.SaveNotTranslateLangsEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.15zW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20701215zW {
    public static int LIZ(C19EG c19eg) {
        int i;
        View decorView;
        Window window = c19eg.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            Rect rect = new Rect();
            decorView.getGlobalVisibleRect(rect);
            int i2 = rect.bottom;
            View viewFindViewById = decorView.findViewById(R.id.content);
            if (viewFindViewById != null) {
                viewFindViewById.getGlobalVisibleRect(rect);
            }
            i = i2 - rect.bottom;
        } else {
            i = 0;
        }
        return Math.max(i, 0) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            java.lang.String r4 = ""
            if (r7 == 0) goto Lf
            X.15zt r0 = X.C20703515zt.LIZ
            r0.getClass()
            java.lang.String r3 = X.C20703515zt.LJII(r7)
            if (r3 != 0) goto L10
        Lf:
            r3 = r4
        L10:
            com.ss.android.ugc.aweme.cla.et.newet.LanguageSettingToastShowEvent r2 = new com.ss.android.ugc.aweme.cla.et.newet.LanguageSettingToastShowEvent
            r2.<init>()
            java.lang.String r1 = r8.getAid()
            java.lang.String r0 = "group_id"
            r2.LJI(r1, r0)
            java.lang.String r0 = "toast_type"
            r2.LJI(r6, r0)
            java.lang.String r0 = "enter_from"
            r2.LJI(r5, r0)
            java.lang.String r0 = "display_not_translate_lang"
            r2.LJI(r3, r0)
            java.lang.String r1 = X.C20703515zt.LJIIIZ(r8)
            if (r1 != 0) goto L34
            r1 = r4
        L34:
            java.lang.String r0 = "subtitle_source_lang"
            r2.LJI(r1, r0)
            java.lang.String r0 = r8.getDescLanguage()
            if (r0 == 0) goto L40
            r4 = r0
        L40:
            java.lang.String r0 = "title_source_lang"
            r2.LJI(r4, r0)
            X.161N r0 = X.C161N.LIZIZ
            java.lang.String r1 = r0.LLIIZ()
            java.lang.String r0 = "target_lang"
            r2.LJI(r1, r0)
            r2.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20701215zW.LIZJ(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LIZIZ(Fragment fragment, Aweme aweme, final String str, boolean z) {
        final C19EG activity;
        String groupId;
        boolean z2;
        if (aweme != null && fragment != null && (activity = fragment.getActivity()) != null && (groupId = aweme.getGroupId()) != null) {
            int iLIZ = LIZ(activity);
            boolean zLJLILLLLZI = C746760TRa.LIZ().LJLILLLLZI();
            C20703515zt.LIZ.getClass();
            final String textStickerMajorityLang = null;
            if (AwemeExtKt.isPhotoMode(aweme)) {
                boolean zLJIILLIIL = C13LQ.LJIILLIIL(C0SKF.LIZJ(aweme), C0SCU.LIZ().LL());
                C161N c161n = C20703515zt.LIZIZ;
                if (c161n.LJJJ(aweme) && !zLJIILLIIL) {
                    textStickerMajorityLang = C0SKF.LIZJ(aweme);
                } else {
                    boolean zLJIILLIIL2 = C13LQ.LJIILLIIL(C20701315zX.LIZ(aweme), c161n.LL());
                    if (c161n.LJJJJZ(aweme) && !zLJIILLIIL2) {
                        textStickerMajorityLang = C20701315zX.LIZ(aweme);
                    }
                }
            } else {
                boolean zLJIILLIIL3 = C13LQ.LJIILLIIL(C0SKF.LIZJ(aweme), C0SCU.LIZ().LL());
                C161N c161n2 = C20703515zt.LIZIZ;
                if (c161n2.LJJJ(aweme) && !zLJIILLIIL3) {
                    textStickerMajorityLang = C0SKF.LIZJ(aweme);
                } else {
                    boolean zLIZ = C20702515zj.LIZ(aweme, null);
                    if (c161n2.LLFFF(aweme, false) && !zLIZ) {
                        textStickerMajorityLang = C20703515zt.LJIIIZ(aweme);
                    } else {
                        boolean zLJ = C161F.LJ(aweme);
                        if (C746760TRa.LIZ().LJJJJI() && !zLJ) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (c161n2.LLIIII(aweme, true) && z2) {
                            textStickerMajorityLang = aweme.getTextStickerMajorityLang();
                        }
                    }
                }
            }
            if (z) {
                if (!zLJLILLLLZI) {
                    C161N c161n3 = C20703515zt.LIZIZ;
                    if (c161n3.LJLIIL() < 3) {
                        c161n3.LJJIIJ(groupId);
                        if (c161n3.LJLIIL() == 3 && c161n3.LJLJLJ()) {
                            C1389910mGz c1389910mGz = new C1389910mGz(fragment);
                            c1389910mGz.LJI(com.zhiliaoapp.musically.R.style.y0);
                            c1389910mGz.LIZ.LIZIZ = 4;
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = com.zhiliaoapp.musically.R.raw.icon_languages;
                            c419910GdJ.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1h);
                            c1389910mGz.LJIIL(c419910GdJ);
                            c1389910mGz.LJIIJ(C20642515q3.LJI(2131828814));
                            c1389910mGz.LIZ.LIZLLL = 3;
                            c1389910mGz.LIZ.LJ = new AwS581S0100000_2(fragment, 512);
                            c1389910mGz.LIZIZ(iLIZ);
                            c1389910mGz.LJIIIIZZ(true);
                            c1389910mGz.LJII(false);
                            c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS165S0100000_31(activity, 163);
                            c1389910mGz.LJIIJJI();
                            C746760TRa.LIZ().LJJJJJ(C746760TRa.LIZ().LJIIIZ() + 1);
                            C746760TRa.LIZ().LJJZ(System.currentTimeMillis());
                            LIZJ(str, "always_translate", null, aweme);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!zLJLILLLLZI || textStickerMajorityLang == null) {
                return;
            }
            C161N c161n4 = C20703515zt.LIZIZ;
            if (c161n4.LLI(textStickerMajorityLang) >= 3) {
                return;
            }
            c161n4.LJJJLZIJ(textStickerMajorityLang, groupId);
            if (c161n4.LLI(textStickerMajorityLang) != 3 || !c161n4.LJJ()) {
                return;
            }
            String strLJII = C20703515zt.LJII(textStickerMajorityLang);
            C1389910mGz c1389910mGz2 = new C1389910mGz(fragment);
            c1389910mGz2.LJI(com.zhiliaoapp.musically.R.style.y0);
            c1389910mGz2.LIZ.LIZIZ = 4;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = com.zhiliaoapp.musically.R.raw.icon_languages;
            c419910GdJ2.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1h);
            c1389910mGz2.LJIIL(c419910GdJ2);
            c1389910mGz2.LJIIJ(C786410Ut5.j4(C20642515q3.LJI(2131828813), Arrays.copyOf(new Object[]{strLJII}, 1)));
            c1389910mGz2.LIZ.LIZLLL = 3;
            c1389910mGz2.LIZ.LJ = new AwS581S0100000_2(fragment, 513);
            c1389910mGz2.LIZIZ(iLIZ);
            c1389910mGz2.LJIIIIZZ(true);
            c1389910mGz2.LJII(false);
            c1389910mGz2.LIZ.LJIIIIZZ = new View.OnClickListener() { // from class: X.15zI
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [X.15zK] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String[] strArr;
                    C20701215zW c20701215zW = this.LL;
                    String str2 = textStickerMajorityLang;
                    final C19EG c19eg = activity;
                    String str3 = str;
                    c20701215zW.getClass();
                    C1839820xye.LIZ().LJIIIIZZ().getClass();
                    String[] strArrLIZJ = C20700315zN.LIZJ();
                    if (strArrLIZJ != null) {
                        ArrayList arrayList = (ArrayList) C13LQ.LJLI(strArrLIZJ);
                        arrayList.add(str2);
                        strArr = (String[]) arrayList.toArray(new String[0]);
                    } else {
                        strArr = null;
                    }
                    C20700915zT c20700915zTLIZJ = C20698815z8.LIZ().LIZJ(new InterfaceC20700815zS() { // from class: X.15zK
                        @Override // X.InterfaceC20700815zS
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC20700815zS
                        public final void LIZIZ(String[] strArr2) {
                            if (C294270Bg9.LIZ()) {
                                C1839820xye.LIZ().LJIIIIZZ().clearDefaultDNTLangsAndSetHasUserManuallyModifiedDNTs();
                            }
                            C1839820xye.LIZ().LJIIIIZZ().setSelectedDoNotTranslateLanguageCodes(strArr2);
                            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                            c1389890mGx.LJIIJ(C786410Ut5.j4(C20642515q3.LJI(2131828812), Arrays.copyOf(new Object[]{C20642515q3.LJI(2131828821)}, 1)));
                            c1389890mGx.LJIIJJI();
                        }
                    });
                    if (strArr != null) {
                        c20700915zTLIZJ.LIZ(strArr);
                        if (((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser() != null) {
                            SaveNotTranslateLangsEvent saveNotTranslateLangsEvent = new SaveNotTranslateLangsEvent();
                            saveNotTranslateLangsEvent.LJI(C13LQ.LJJJ(strArr, ", ", null, null, null, 62), "not_translate_langs");
                            saveNotTranslateLangsEvent.LJI(C13LQ.LJJJ(strArrLIZJ, ", ", null, null, null, 62), "prev_not_translate_langs");
                            saveNotTranslateLangsEvent.LJI(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid(), "user_id");
                            saveNotTranslateLangsEvent.LJI(str3, "enter_from");
                            saveNotTranslateLangsEvent.LJI("toast", "enter_method");
                            saveNotTranslateLangsEvent.LJIIIIZZ();
                        }
                    }
                    C746760TRa.LIZ().LIZJ(0);
                    C746760TRa.LIZ().LJLJLJ(0L);
                    C20703515zt.LIZ.getClass();
                    C20703515zt.LIZIZ.LJLLL();
                }
            };
            c1389910mGz2.LJIIJJI();
            C746760TRa.LIZ().LIZJ(C746760TRa.LIZ().LJJIJL() + 1);
            C746760TRa.LIZ().LJLJLJ(System.currentTimeMillis());
            LIZJ(str, "not_translate", textStickerMajorityLang, aweme);
        }
    }
}
