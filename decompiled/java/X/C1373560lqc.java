package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoShareAbilityHandler;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373560lqc implements InterfaceC1374600lsI {
    public final InterfaceC1369790lkX LIZ;
    public Aweme LIZIZ;

    public C1373560lqc(InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LIZ = interfaceC1369790lkX;
    }

    @Override // X.InterfaceC1374600lsI
    public final boolean LIZ(final Context context, final View view, final AwemeSharePackage awemeSharePackage, C0M7Y c0m7y, final Function1<? super Boolean, Unit> function1) {
        int iLIZJ;
        Aweme awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        this.LIZIZ = awemeLJJIFFI;
        if (awemeLJJIFFI != null) {
            if (C1373450lqR.LJFF(awemeLJJIFFI, this.LIZ, false)) {
                C1373850lr5.LIZ.getClass();
                if (C1373540lqa.LJIILJJIL(awemeLJJIFFI)) {
                    C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
                    return false;
                }
                return true;
            }
            if (C1373450lqR.LJIIIIZZ(awemeLJJIFFI, this.LIZ, context)) {
                C1373540lqa c1373540lqa = C1373850lr5.LIZ;
                String strKey = this.LIZ.key();
                c1373540lqa.getClass();
                if (C1373540lqa.LJIIJ(strKey)) {
                    C1373540lqa.LJIIZILJ(context, view, awemeSharePackage, this.LIZ, function1);
                    return true;
                }
                if (Intrinsics.LJFF(this.LIZ.key(), "sms") && !C1373450lqR.LJ(awemeLJJIFFI)) {
                    InterfaceC1369790lkX interfaceC1369790lkX = this.LIZ;
                    C1376270luz c1376270luz = C1376270luz.LIZ;
                    String strKey2 = interfaceC1369790lkX.key();
                    c1376270luz.getClass();
                    C1376270luz.LJIIIIZZ = strKey2;
                    C1375730lu7 c1375730lu7 = C1375730lu7.LIZIZ;
                    c1375730lu7.LJ();
                    c1375730lu7.LJIIJJI();
                    C1375740lu8 c1375740lu8 = C1375740lu8.LIZ;
                    Aweme awemeLJJIFFI2 = awemeSharePackage.LJJIFFI();
                    c1375740lu8.getClass();
                    if (C1375740lu8.LIZ(context, awemeLJJIFFI2, "download_to_share") && C1375500ltk.LJII(context) != null && awemeSharePackage.LJJIFFI() != null) {
                        ACLCommonShare aCLCommonShareLJI = C1373540lqa.LJI(awemeSharePackage.LJJIFFI());
                        if (aCLCommonShareLJI != null) {
                            String toastMsg = aCLCommonShareLJI.getToastMsg();
                            if (toastMsg != null && toastMsg.length() != 0) {
                                int code = aCLCommonShareLJI.getCode();
                                if (code != 1) {
                                    if (code == 2) {
                                        C1373550lqb c1373550lqb = C1373550lqb.LIZ;
                                        String strKey3 = interfaceC1369790lkX.key();
                                        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(function1, (Function1<? super Boolean, Unit>) 791);
                                        c1373550lqb.getClass();
                                        C1373550lqb.LIZ(awemeSharePackage, context, view, strKey3, toastMsg, awS546S0100000_2);
                                    }
                                } else {
                                    if (view != null) {
                                        if (C299060Bns.LIZ()) {
                                            C1389880mGw c1389880mGw = new C1389880mGw(view);
                                            c1389880mGw.LJIIIZ(toastMsg);
                                            c1389880mGw.LJIIJ();
                                        } else {
                                            C1389890mGx c1389890mGx = new C1389890mGx(view);
                                            c1389890mGx.LJIIJ(toastMsg);
                                            c1389890mGx.LJIIJJI();
                                        }
                                    }
                                    function1.invoke(Boolean.FALSE);
                                }
                            } else if (aCLCommonShareLJI != null) {
                            }
                            if (aCLCommonShareLJI.getCode() != 0) {
                                return true;
                            }
                        }
                        new AwemePhotoShareAbilityHandler(context, function1).LJIIJJI(context, null, awemeSharePackage, interfaceC1369790lkX);
                        return true;
                    }
                    return true;
                }
                return C1373540lqa.LJIILIIL(awemeSharePackage, this.LIZ.key(), new InterfaceC1373810lr1() { // from class: X.0lqf
                    @Override // X.InterfaceC1373810lr1
                    public final void LIZ() {
                        C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
                    }

                    @Override // X.InterfaceC1373810lr1
                    public final void LIZIZ() {
                        AwemeSharePackage awemeSharePackage2 = awemeSharePackage;
                        if (awemeSharePackage2 != null) {
                            Context context2 = context;
                            View view2 = view;
                            C1373560lqc c1373560lqc = this;
                            Function1<Boolean, Unit> function12 = function1;
                            C1373540lqa c1373540lqa2 = C1373850lr5.LIZ;
                            InterfaceC1369790lkX interfaceC1369790lkX2 = c1373560lqc.LIZ;
                            c1373540lqa2.getClass();
                            C1373540lqa.LJIIZILJ(context2, view2, awemeSharePackage2, interfaceC1369790lkX2, function12);
                        }
                    }
                });
            }
            InterfaceC1369790lkX interfaceC1369790lkX2 = this.LIZ;
            if (awemeLJJIFFI.getAwemeType() == 150) {
                iLIZJ = C1373450lqR.LIZIZ(interfaceC1369790lkX2.key());
            } else {
                iLIZJ = C1373450lqR.LIZJ(interfaceC1369790lkX2.key(), C1373450lqR.LIZLLL());
            }
            if (iLIZJ != 1 && iLIZJ != 6) {
                C1373540lqa c1373540lqa2 = C1373850lr5.LIZ;
                Aweme awemeLJJIFFI3 = awemeSharePackage.LJJIFFI();
                c1373540lqa2.getClass();
                if (C1373540lqa.LJIILJJIL(awemeLJJIFFI3)) {
                    C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
                } else {
                    return true;
                }
            } else {
                C1373540lqa c1373540lqa3 = C1373850lr5.LIZ;
                String strKey4 = this.LIZ.key();
                c1373540lqa3.getClass();
                if (C1373540lqa.LJIIJ(strKey4)) {
                    if (C1375500ltk.LJII(context) != null) {
                        int iLIZJ2 = C1373450lqR.LIZJ(this.LIZ.key(), C1373450lqR.LIZLLL());
                        C1373550lqb c1373550lqb2 = C1373550lqb.LIZ;
                        Aweme aweme = this.LIZIZ;
                        InterfaceC1369790lkX interfaceC1369790lkX3 = this.LIZ;
                        c1373550lqb2.getClass();
                        C1373550lqb.LJFF(aweme, interfaceC1369790lkX3, context, view, awemeSharePackage, function1, false, iLIZJ2);
                    }
                    return true;
                }
                return C1373540lqa.LJIJ(awemeSharePackage, this.LIZ.key(), new InterfaceC1373820lr2() { // from class: X.0lqe
                    @Override // X.InterfaceC1373820lr2
                    public final void LIZ() {
                        C786410Ut5.LJJJI("share_form", "url_form", awemeSharePackage.extras);
                    }

                    @Override // X.InterfaceC1373820lr2
                    public final void LIZIZ() {
                        int iLIZJ3 = C1373450lqR.LIZJ(this.LIZ.key(), C1373450lqR.LIZLLL());
                        C1373550lqb c1373550lqb3 = C1373550lqb.LIZ;
                        C1373560lqc c1373560lqc = this;
                        Aweme aweme2 = c1373560lqc.LIZIZ;
                        InterfaceC1369790lkX interfaceC1369790lkX4 = c1373560lqc.LIZ;
                        Context context2 = context;
                        View view2 = view;
                        AwemeSharePackage awemeSharePackage2 = awemeSharePackage;
                        Function1<Boolean, Unit> function12 = function1;
                        c1373550lqb3.getClass();
                        C1373550lqb.LJFF(aweme2, interfaceC1369790lkX4, context2, view2, awemeSharePackage2, function12, false, iLIZJ3);
                    }
                });
            }
        }
        return false;
    }
}
