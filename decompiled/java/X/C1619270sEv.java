package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.config.Crowd;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0sEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619270sEv {
    public static final C1619270sEv LIZ = new C1619270sEv();
    public static C1611150s1p LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static C11JF LJ;

    public static void LIZIZ() {
        C11JF c11jf = LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJ = null;
        LIZLLL = false;
        LIZJ = false;
    }

    public static void LIZ(final View view, final C19EG c19eg, C1619280sEw c1619280sEw) {
        int iIntValue;
        if (C673080Qag.LIZIZ() && C0BYB.LIZ() && C1255704vj.LIZ().LJJJ() && Hox.LLJILJIL.LIZ(c19eg).KQ2("For You")) {
            if (C0N0N.LIZJ == null) {
                C0N0N.LIZJ = Integer.valueOf(C0N0N.LIZ.getInt((String) C0N0N.LIZIZ.getValue(), 0));
            }
            Integer num = C0N0N.LIZJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue < ((Number) C271320AkE.LIZ.getValue()).intValue()) {
                C311300CIe.LIZ.getClass();
                Crowd crowdLIZ = C311300CIe.LIZ();
                if (crowdLIZ != null) {
                    Integer num2 = crowdLIZ.enableVisualSearchGuide;
                    if (num2 == null || num2.intValue() != 1) {
                        if (crowdLIZ.enableVisualSearchGuide == null || crowdLIZ.enableVisualSearchGuide.intValue() <= 0 || !C0QRL.LIZ(crowdLIZ) || c1619280sEw == null) {
                            return;
                        }
                        if (!c1619280sEw.LIZ && c1619280sEw.LIZIZ <= Mp4ScreenVideoLoadTimeout.CONTROL && c1619280sEw.LIZLLL <= Mp4ScreenVideoLoadTimeout.CONTROL && c1619280sEw.LIZJ <= 10000) {
                            return;
                        }
                    }
                    EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.SEARCH;
                    AbstractC1391580mJg<C0HXT> abstractC1391580mJg = new AbstractC1391580mJg<C0HXT>(c19eg, view) { // from class: X.0HXT
                        public final View LLILZ;

                        @Override // X.AbstractC1391580mJg
                        public final C0P0T LIZIZ() {
                            View view2 = this.LLILZ;
                            C1391600mJi c1391600mJi = this.LLILLJJLI;
                            c1391600mJi.LIZIZ = view2;
                            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                            c1391600mJi.LJIJJ = true;
                            LJI(-1);
                            this.LLILLJJLI.LJIIIIZZ = C0H9H.LIZIZ(9);
                            C1546210qL5.LIZ.getClass();
                            this.LLILLJJLI.LJFF = -C814420VxA.LIZIZ(C1546210qL5.LIZ(12));
                            C0HXU c0hxu = new C0HXU(this.LL);
                            String string = c0hxu.getContext().getString(2131858262);
                            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(196)));
                            Integer num3 = 52;
                            c0hxu.LLILZ = -16777216;
                            c0hxu.LLIZ = string;
                            c0hxu.LLILZIL = null;
                            c0hxu.LLILZLL = numValueOf;
                            c0hxu.LLILLL = num3 != null ? num3.intValue() : 52;
                            C444830HcP c444830HcP = new C444830HcP();
                            c444830HcP.LIZIZ.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            Integer num4 = c0hxu.LLILZLL;
                            c444830HcP.LIZIZ.LJ = num4 != null ? num4.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(234));
                            c444830HcP.LJIILIIL(c0hxu.LLIZ);
                            c444830HcP.LJII(c0hxu.LLILLL);
                            c444830HcP.LJIILJJIL(c0hxu.LLILZ);
                            c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
                            Integer num5 = c0hxu.LLILZIL;
                            if (num5 != null) {
                                c444830HcP.LJIIIZ(num5.intValue());
                            }
                            c0hxu.LLILLJJLI.setTextLayout(C444830HcP.LIZJ(c444830HcP, 1.0f, true, C431830GwX.LIZ(c444830HcP, null, null), 24));
                            C0HXV.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), c0hxu.LLILLJJLI);
                            C0HXV.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), c0hxu.LLILLJJLI);
                            if (string.length() > 0) {
                                C786410Ut5.LLLLZIL(c0hxu.LLILLJJLI, 0);
                            } else {
                                C786410Ut5.LLLLZIL(c0hxu.LLILLJJLI, 8);
                            }
                            ImageView imageView = (ImageView) c0hxu.LL.findViewById(R.id.kb6);
                            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            C786410Ut5.c6(imageView, layoutParams);
                            C426750GoL.LJIIIZ(imageView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, false, 27);
                            c0hxu.setCustomImage$search_release(new AwS585S0100000_6(this, 338));
                            this.LLILLJJLI.LJIIZILJ = c0hxu;
                            return super.LIZIZ();
                        }

                        {
                            this.LLILZ = view;
                        }
                    };
                    C1905770zh1.LIZ(abstractC1391580mJg, "visual_search_guide", enumC1584360rKc, AFwS264S0000000_24.get$arr$(692));
                    C1905770zh1.LIZJ(abstractC1391580mJg, "visual_search_guide", true, new View.OnClickListener() { // from class: X.0sEx
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                        }
                    });
                    C1905770zh1.LIZIZ(abstractC1391580mJg, "visual_search_guide", enumC1584360rKc, AFwS213S0000000_24.get$arr$(578));
                    abstractC1391580mJg.LLILLJJLI.LJIJJ = true;
                    final C0P0T c0p0tLIZIZ = abstractC1391580mJg.LIZIZ();
                    C1904790zfR c1904790zfRLIZ = C1904960zfi.LIZ("visual_search_guide", enumC1584360rKc);
                    c1904790zfRLIZ.LIZLLL = true;
                    c1904790zfRLIZ.LJFF = EnumC1619300sEy.JUMP_NEW_PAGE;
                    c1904790zfRLIZ.LJ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    C1905750zgz.LIZIZ.LJFF(c1904790zfRLIZ.LIZ(c0p0tLIZIZ), new InterfaceC1906540ziG() { // from class: X.0s1z
                        @Override // X.InterfaceC1906540ziG
                        public final void LIZ(C1619160sEk c1619160sEk) {
                        }

                        @Override // X.InterfaceC1906540ziG
                        public final void onDismiss() {
                        }

                        @Override // X.InterfaceC1906540ziG
                        public final void LIZIZ() {
                            c0p0tLIZIZ.dismiss();
                        }

                        @Override // X.InterfaceC1906540ziG
                        public final void onShow() {
                            if (C0N0N.LIZJ == null) {
                                C0N0N.LIZJ = Integer.valueOf(C0N0N.LIZ.getInt((String) C0N0N.LIZIZ.getValue(), 0));
                            }
                            Integer num3 = C0N0N.LIZJ;
                            int iIntValue2 = (num3 != null ? num3.intValue() : C0N0N.LIZ.getInt((String) C0N0N.LIZIZ.getValue(), 0)) + 1;
                            C0N0N.LIZ.storeInt((String) C0N0N.LIZIZ.getValue(), iIntValue2);
                            C0N0N.LIZJ = Integer.valueOf(iIntValue2);
                            C1619270sEv.LIZ.getClass();
                            C1619270sEv.LIZLLL = true;
                            C1619270sEv.LJ = (C11JF) C11NZ.LJLJJLL(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0s1q
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("VisualSearchChainedBubbleManager@dd44.startWindowOfOpportunity$1");
                                    C1619270sEv.LIZ.getClass();
                                    C11JF c11jf = C1619270sEv.LJ;
                                    if (c11jf != null) {
                                        c11jf.dispose();
                                    }
                                    C1619270sEv.LJ = null;
                                    C786410Ut5.LJJZZIII(C0CAU.LIZ, RunnableC1611180s1s.LL);
                                    C1C7U.LIZIZ("VisualSearchChainedBubbleManager@dd44.startWindowOfOpportunity$1");
                                }
                            });
                        }
                    });
                }
            }
        }
    }
}
