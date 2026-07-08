package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128090fSh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC1128120fSk LL;
    public final /* synthetic */ C1128080fSg LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128090fSh(AbstractC1128120fSk abstractC1128120fSk, C1128080fSg c1128080fSg, long j, boolean z) {
        super(0);
        this.LL = abstractC1128120fSk;
        this.LLILLJJLI = c1128080fSg;
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Gift giftFindGiftById;
        C1128150fSn c1128150fSn;
        C1128160fSo c1128160fSo;
        C1128190fSr c1128190fSr;
        String str;
        AbstractC1128120fSk abstractC1128120fSk = this.LL;
        if (abstractC1128120fSk != null) {
            C1128080fSg c1128080fSg = this.LLILLJJLI;
            long j = this.LLILLL;
            boolean z = this.LLILZ;
            if ((!Intrinsics.LJFF(c1128080fSg.LLIZ != null ? r2.getClass() : null, abstractC1128120fSk.getClass())) || z) {
                C1128190fSr c1128190fSrLIZ = C1128110fSj.LIZ(abstractC1128120fSk);
                int i = c1128190fSrLIZ != null ? c1128190fSrLIZ.LIZ : 0;
                int iLIZIZ = abstractC1128120fSk.LIZIZ();
                Long lValueOf = c1128190fSrLIZ != null ? Long.valueOf(c1128190fSrLIZ.LIZIZ) : null;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_party_banner_show");
                C176900m7.LIZ(c474500IjALIZ);
                c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "task_left_progress");
                c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "ongoing_stage");
                c474500IjALIZ.LJJII(lValueOf, "ongoing_to_unlock_gift_id");
                c474500IjALIZ.LJJII("top_of_gift_panel", "show_entrance");
                c474500IjALIZ.LIZ();
            }
            if (abstractC1128120fSk instanceof C1128140fSm) {
                String strLJIJI = ((C1128140fSm) abstractC1128120fSk).LIZIZ ? C497740JfY.LJIJI(2131821800) : C497740JfY.LJIJI(2131821798);
                c1128080fSg.e0(strLJIJI, abstractC1128120fSk);
                c1128080fSg.LLILLJJLI.setText(strLJIJI);
                C500260Jjc.LJIILIIL(c1128080fSg.LLILLL);
                C500260Jjc.LJIILIIL(c1128080fSg.LL);
            } else if (abstractC1128120fSk instanceof C1128130fSl) {
                C1128130fSl c1128130fSl = (C1128130fSl) abstractC1128120fSk;
                String strLJIIJJI = C497740JfY.LJIIJJI(2131755034, c1128130fSl.LIZIZ);
                c1128080fSg.e0(strLJIIJJI, abstractC1128120fSk);
                c1128080fSg.h0(c1128130fSl.LIZIZ, strLJIIJJI);
                C500260Jjc.LJIILIIL(c1128080fSg.LLILLL);
                C500260Jjc.LJIILIIL(c1128080fSg.LL);
            } else if (abstractC1128120fSk instanceof C1128170fSp) {
                String strLJIJI2 = C497740JfY.LJIJI(2131821799);
                c1128080fSg.e0(strLJIJI2, abstractC1128120fSk);
                c1128080fSg.LLILLJJLI.setText(strLJIJI2);
                C500260Jjc.LJIILIIL(c1128080fSg.LLILLL);
                C500260Jjc.LJIILIIL(c1128080fSg.LL);
            } else if (abstractC1128120fSk instanceof C1128150fSn) {
                C500260Jjc.LLFFF(c1128080fSg.LLILLL);
                C500260Jjc.LLFFF(c1128080fSg.LL);
                C1128150fSn c1128150fSn2 = (C1128150fSn) abstractC1128120fSk;
                Gift giftFindGiftById2 = GiftManager.inst().findGiftById(c1128150fSn2.LIZIZ.LIZIZ.LIZIZ);
                if (giftFindGiftById2 != null && (giftFindGiftById = GiftManager.inst().findGiftById(j)) != null) {
                    C1128160fSo c1128160fSo2 = c1128150fSn2.LIZIZ;
                    float f = c1128160fSo2.LIZJ;
                    float f2 = c1128160fSo2.LIZ;
                    long j2 = giftFindGiftById.diamondCount;
                    AbstractC1128120fSk abstractC1128120fSk2 = c1128080fSg.LLIZ;
                    c1128080fSg.j0(f, f2, j2, !((!(abstractC1128120fSk2 instanceof C1128150fSn) || (c1128150fSn = (C1128150fSn) abstractC1128120fSk2) == null || (c1128160fSo = c1128150fSn.LIZIZ) == null || (c1128190fSr = c1128160fSo.LIZIZ) == null || c1128160fSo2.LIZIZ.LIZIZ != c1128190fSr.LIZIZ) ? false : true), null);
                    String strLJIIJJI2 = C497740JfY.LJIIJJI(2131755033, c1128150fSn2.LIZIZ.LIZIZ.LIZ);
                    if (strLJIIJJI2 == null) {
                        strLJIIJJI2 = "";
                    }
                    c1128080fSg.e0(strLJIIJJI2, abstractC1128120fSk);
                    c1128080fSg.h0(c1128150fSn2.LIZIZ.LIZIZ.LIZ, strLJIIJJI2);
                    c1128080fSg.LLILZLL.LIZ(C1126570fQF.LJ(c1128080fSg.LLILLL, giftFindGiftById2.icon, 0, 0, false, 0, 60).LJJLJLI(new C09JN() { // from class: X.0fR4
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            String message;
                            C1C7U.LIZ("GiftChallengePanel@55a0.updateNextGiftIcon$1");
                            AbstractC1127100fR6 abstractC1127100fR6 = (AbstractC1127100fR6) obj;
                            if (abstractC1127100fR6 instanceof C1127090fR5) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("updateNextGiftIcon failed imageUrl ");
                                C1127090fR5 c1127090fR5 = (C1127090fR5) abstractC1127100fR6;
                                sbLIZ.append(c1127090fR5.LIZ);
                                sbLIZ.append(' ');
                                Exception exc = c1127090fR5.LIZIZ;
                                if (exc != null) {
                                    message = exc.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ.append(message);
                                C20441214yg.LJIIIZ("GiftChallengePanel", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            C1C7U.LIZIZ("GiftChallengePanel@55a0.updateNextGiftIcon$1");
                        }
                    }));
                }
            } else {
                C1AF0.LIZJ("GiftChallenge: wrong state");
            }
            Gift giftFindGiftById3 = GiftManager.inst().findGiftById(j);
            if (giftFindGiftById3 != null) {
                GiftPanelBanner giftPanelBanner = giftFindGiftById3.giftPanelBanner;
                if (giftPanelBanner != null && (str = giftPanelBanner.schemaUrl) != null && C500260Jjc.LJJIIZ(str)) {
                    c1128080fSg.setBannerClickListener(str);
                }
                GiftPanelBanner giftPanelBanner2 = giftFindGiftById3.giftPanelBanner;
                if (giftPanelBanner2 != null) {
                    c1128080fSg.setBackground(giftPanelBanner2);
                }
            }
            c1128080fSg.LLIZ = abstractC1128120fSk;
        }
        return Unit.LIZ;
    }
}
