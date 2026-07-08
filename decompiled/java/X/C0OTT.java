package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTT implements C0OT0, InterfaceC619690OSh {
    public final BulletinHybridAbility LIZ;
    public final BulletinProfileViewModel LIZIZ;
    public final C0OTY LIZJ;
    public final View LIZLLL;
    public C1537720q7O LJ;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    @Override // X.InterfaceC619690OSh
    public final void LJIIJ() {
        BulletinHybridAbility bulletinHybridAbility = this.LIZ;
        if (bulletinHybridAbility != null) {
            bulletinHybridAbility.Aw1(this.LJ);
        }
    }

    @Override // X.InterfaceC619690OSh
    public final C1537720q7O LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC619690OSh
    public final View getContentContainer() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC619690OSh
    public final void LJFF(Map<String, Object> map) {
        C1537720q7O c1537720q7O = this.LJ;
        if (c1537720q7O != null) {
            c1537720q7O.updateGlobalProps(map);
        }
    }

    @Override // X.InterfaceC619690OSh
    public final void LJI(C0OOV c0oov) {
        BulletinCardUIInfo bulletinCardUIInfo;
        BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
        if (bulletinCardInfo != null && (bulletinCardUIInfo = bulletinCardInfo.hybridCardUIInfo) != null) {
            bulletinCardUIInfo.setBulletinItemId(String.valueOf(c0oov.LLJI));
            bulletinCardUIInfo.setBulletinCardType(String.valueOf(c0oov.LLJJL.cardType));
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("wwwzccc updateMetaData", bulletinCardUIInfo.toString());
            C1537720q7O c1537720q7O = this.LJ;
            if (c1537720q7O != null) {
                C1227904rF.LIZ.getClass();
                c1537720q7O.updateData(TemplateData.LJIIIIZZ(C1227904rF.LJI(bulletinCardUIInfo)));
            }
        }
    }

    @Override // X.InterfaceC619690OSh
    public final void LJIIL(final C0OOV c0oov, long j) {
        int iLIZIZ;
        int iLIZIZ2;
        Integer numValueOf;
        boolean z;
        C1537720q7O c1537720q7O;
        C1537720q7O c1537720q7O2;
        int iLIZIZ3;
        float fLIZIZ;
        int iLIZIZ4;
        ViewParent parent;
        BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
        if (bulletinCardInfo == null) {
            return;
        }
        BulletinCardUIInfo bulletinCardUIInfo = bulletinCardInfo.hybridCardUIInfo;
        if (bulletinCardUIInfo != null) {
            bulletinCardUIInfo.setBulletinItemId(String.valueOf(c0oov.LLJI));
        }
        BulletinCardUIInfo bulletinCardUIInfo2 = bulletinCardInfo.hybridCardUIInfo;
        if (bulletinCardUIInfo2 != null) {
            bulletinCardUIInfo2.setBulletinCardType(String.valueOf(bulletinCardInfo.cardType));
        }
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct = bulletinCardInfo.hybridConfigInfo;
        if (bulletinHybridCardConfigStruct == null) {
            return;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("wwwzccc", String.valueOf(this.LIZIZ.LLILLJJLI));
        String strValueOf = String.valueOf(c0oov.LLJI);
        String strValueOf2 = String.valueOf(c0oov.LLJJJJ);
        String str = bulletinHybridCardConfigStruct.schema;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("bulletin_identity", Integer.valueOf(this.LIZIZ.HQ2())), new Pair("bulletin_item_id", String.valueOf(c0oov.LLJI)), new Pair("bulletin_subscribe_status", Integer.valueOf(this.LIZIZ.JQ2())), new Pair("bulletin_quota", Long.valueOf(this.LIZIZ.getState().LLJJIJIL)), new Pair("bulletin_channel_status", Integer.valueOf(this.LIZIZ.EQ2())), new Pair("bulletin_creator_id", this.LIZIZ.CQ2()));
        C1227904rF c1227904rF = C1227904rF.LIZ;
        BulletinCardUIInfo bulletinCardUIInfo3 = bulletinCardInfo.hybridCardUIInfo;
        c1227904rF.getClass();
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(C1227904rF.LJI(bulletinCardUIInfo3));
        Integer num = bulletinHybridCardConfigStruct.dynamicWidth;
        if (num == null && (num = bulletinHybridCardConfigStruct.defaultWidth) == null) {
            iLIZIZ = -2;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
        }
        Integer numValueOf2 = Integer.valueOf(iLIZIZ);
        Integer num2 = bulletinHybridCardConfigStruct.dynamicHeight;
        if (num2 == null && (num2 = bulletinHybridCardConfigStruct.defaultHeight) == null) {
            iLIZIZ2 = -2;
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2));
        }
        C1162570gMJ c1162570gMJ = new C1162570gMJ(numValueOf2, Integer.valueOf(iLIZIZ2));
        Integer num3 = bulletinHybridCardConfigStruct.dynamicHeight;
        C1537720q7O c1537720q7OYs1 = null;
        if (num3 != null) {
            numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num3)));
        } else {
            Integer num4 = bulletinHybridCardConfigStruct.defaultHeight;
            if (num4 != null) {
                numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num4)));
            } else {
                numValueOf = null;
            }
        }
        Boolean bool = Boolean.TRUE;
        C679540Ql6 c679540Ql6 = new C679540Ql6(strValueOf, templateDataLJIIIIZZ, bool, mapLJIIJ, numValueOf, c1162570gMJ, null, strValueOf2, str, null, 31044);
        c679540Ql6.LIZLLL = new LynxViewClient() { // from class: X.0OTV
            @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
            public final void LJFF(LynxError lynxError) {
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIJ() {
                C1537720q7O c1537720q7O3 = this.LL.LJ;
                if (c1537720q7O3 != null) {
                    C0OTX.LIZ(c1537720q7O3);
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIILJJIL() {
                this.LL.LIZJ.LIZ(c0oov, true);
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIJ() {
                C1537720q7O c1537720q7O3 = this.LL.LJ;
                if (c1537720q7O3 != null) {
                    C0OTX.LIZ(c1537720q7O3);
                }
            }
        };
        c679540Ql6.LJJ = new Function1<SparkContext, Unit>() { // from class: X.0OTU
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(SparkContext sparkContext) {
                SparkContext sparkContext2 = sparkContext;
                sparkContext2.LJJ(InterfaceC1538610q8p.class, new C21395518oD((ViewGroup) this.LL.LIZLLL));
                final C0OTT c0ott = this.LL;
                final C0OOV c0oov2 = c0oov;
                sparkContext2.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0OTW
                    @Override // X.AbstractC1537870q7d
                    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                        C2252408s6.LJIIIIZZ(new AwS410S0200000_9(c0ott, c0oov2, 82));
                    }
                });
                return Unit.LIZ;
            }
        };
        if (this.LJ != null && ((ViewGroup) this.LIZLLL).getChildCount() != 0 && Intrinsics.LJFF(((ViewGroup) this.LIZLLL).getChildAt(0), this.LJ)) {
            z = true;
        } else {
            z = false;
        }
        C1537720q7O c1537720q7O3 = this.LJ;
        if (c1537720q7O3 != null && z) {
            BulletinHybridAbility bulletinHybridAbility = this.LIZ;
            if (bulletinHybridAbility != null) {
                bulletinHybridAbility.ys1(c679540Ql6, c1537720q7O3);
            }
        } else {
            BulletinHybridAbility bulletinHybridAbility2 = this.LIZ;
            if (bulletinHybridAbility2 != null) {
                c1537720q7OYs1 = bulletinHybridAbility2.ys1(c679540Ql6, null);
            }
            this.LJ = c1537720q7OYs1;
            if (c1537720q7OYs1 != null && (parent = c1537720q7OYs1.getParent()) != null && (parent instanceof ViewGroup)) {
                C786410Ut5.LJJJLZIJ(this.LJ, (ViewGroup) parent);
            }
            ViewGroup viewGroup = (ViewGroup) this.LIZLLL;
            if (viewGroup.getChildCount() != 0) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            C1537720q7O c1537720q7O4 = this.LJ;
            if ((c1537720q7O4 != null && Intrinsics.LJFF(c1537720q7O4.LJIJI("isPreRender"), bool)) || (((c1537720q7O = this.LJ) != null && Intrinsics.LJFF(c1537720q7O.LJIJI("isPreCreate"), bool)) || ((c1537720q7O2 = this.LJ) != null && Intrinsics.LJFF(c1537720q7O2.LJIJI("isPreLayout"), bool)))) {
                C1537720q7O c1537720q7O5 = this.LJ;
                if (c1537720q7O5 != null) {
                    C0OTX.LIZ(c1537720q7O5);
                }
                iLIZIZ3 = -2;
            } else {
                Integer num5 = bulletinHybridCardConfigStruct.dynamicWidth;
                if (num5 == null && (num5 = bulletinHybridCardConfigStruct.defaultHeight) == null) {
                    iLIZIZ3 = -2;
                } else {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num5));
                }
                Integer num6 = bulletinHybridCardConfigStruct.dynamicHeight;
                if (num6 != null) {
                    fLIZIZ = C418440Gaw.LIZIZ(num6);
                } else {
                    Integer num7 = bulletinHybridCardConfigStruct.defaultWidth;
                    if (num7 != null) {
                        fLIZIZ = C418440Gaw.LIZIZ(num7);
                    }
                }
                iLIZIZ4 = C814420VxA.LIZIZ(fLIZIZ);
                viewGroup.addView(this.LJ, new ViewGroup.LayoutParams(iLIZIZ4, iLIZIZ3));
            }
            iLIZIZ4 = -2;
            viewGroup.addView(this.LJ, new ViewGroup.LayoutParams(iLIZIZ4, iLIZIZ3));
        }
        C1537720q7O c1537720q7O6 = this.LJ;
        if (c1537720q7O6 != null) {
            c1537720q7O6.LJJIL(Long.valueOf(j), "customInitTime");
        }
    }

    public C0OTT(ViewStub viewStub, BulletinHybridAbility bulletinHybridAbility, BulletinProfileViewModel bulletinProfileViewModel, C0OTY c0oty) {
        this.LIZ = bulletinHybridAbility;
        this.LIZIZ = bulletinProfileViewModel;
        this.LIZJ = c0oty;
        viewStub.setLayoutResource(R.layout.a72);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        ViewGroup.LayoutParams layoutParams = viewLJLLLL.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(viewLJLLLL, layoutParams);
        this.LIZLLL = viewLJLLLL;
    }
}
