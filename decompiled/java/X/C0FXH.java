package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.VideoCropRootScene;
import com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FXH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXH implements InterfaceC1737690vJv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        switch (this.$t) {
            case 0:
                return onBackPressed$0(this);
            case 1:
                return onBackPressed$1(this);
            case 2:
                return onBackPressed$2(this);
            case 3:
                return onBackPressed$3(this);
            case 4:
                return onBackPressed$4(this);
            case 5:
                return onBackPressed$5(this);
            case 6:
                return onBackPressed$6(this);
            case 7:
                return onBackPressed$7(this);
            case 8:
                return onBackPressed$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onBackPressed$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onBackPressed$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onBackPressed$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onBackPressed$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onBackPressed$13(this);
            default:
                return false;
        }
    }

    public static final boolean onBackPressed$0(C0FXH c0fxh) {
        Object objValueOf;
        C390390FSj c390390FSj = (C390390FSj) c0fxh.l0;
        c390390FSj.getClass();
        new C390340FSe(c390390FSj).LJIIIZ();
        List<C0FEF> listLJ = ((C390390FSj) c0fxh.l0).LJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        Iterator<C0FEF> it2 = listLJ.iterator();
        while (true) {
            objValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            C0FEF next = it2.next();
            if (next != null) {
                objValueOf = Boolean.valueOf(next.onBackPressed());
            }
            arrayList.add(objValueOf);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (Intrinsics.LJFF(next2, Boolean.TRUE)) {
                objValueOf = next2;
                break;
            }
        }
        Boolean bool = (Boolean) objValueOf;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean onBackPressed$1(C0FXH c0fxh) {
        if (((C377730ErT) c0fxh.l0).T2().LIZLLL != EnumC378320EsQ.SHOW && ((C377730ErT) c0fxh.l0).T2().LIZLLL != EnumC378320EsQ.SHOW_WITH_ANIMATION) {
            return false;
        }
        C377730ErT c377730ErT = (C377730ErT) c0fxh.l0;
        if (c377730ErT.LLLFZ) {
            return false;
        }
        c377730ErT.LIZLLL();
        return true;
    }

    public static final boolean onBackPressed$10(C0FXH c0fxh) {
        C373630Ekr c373630Ekr = (C373630Ekr) c0fxh.l0;
        if (c373630Ekr.LLIZLLLIL != null) {
            c373630Ekr.X1();
            return true;
        }
        return false;
    }

    public static final boolean onBackPressed$11(C0FXH c0fxh) {
        Scene sceneLLLLIIIILLL;
        AbstractC375510Ent abstractC375510Ent = (AbstractC375510Ent) c0fxh.l0;
        NavigationScene navigationScene = abstractC375510Ent.LLJJIII;
        if (navigationScene != null) {
            sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
        } else {
            sceneLLLLIIIILLL = null;
        }
        return Intrinsics.LJFF(sceneLLLLIIIILLL, abstractC375510Ent);
    }

    public static final boolean onBackPressed$12(C0FXH c0fxh) {
        C385670FAf<Boolean> c385670FAfBK0;
        AbstractC364960ESo abstractC364960ESo = (AbstractC364960ESo) c0fxh.l0;
        InterfaceC362600EJm interfaceC362600EJm = abstractC364960ESo.LLJJL;
        if (interfaceC362600EJm == null) {
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(abstractC364960ESo);
            if (c1drgLJIIIZ != null && (interfaceC362600EJm = (InterfaceC362600EJm) ((C0ETY) c1drgLJIIIZ.LJII(C0ETY.class, null)).MY1(InterfaceC362600EJm.class)) != null) {
                abstractC364960ESo.LLJJL = interfaceC362600EJm;
            } else {
                interfaceC362600EJm = null;
            }
        }
        if (interfaceC362600EJm != null && (c385670FAfBK0 = interfaceC362600EJm.BK0()) != null && Intrinsics.LJFF(c385670FAfBK0.LIZJ(), Boolean.TRUE)) {
            return interfaceC362600EJm.onBackPressed();
        }
        C0ETQ c0etq = (C0ETQ) abstractC364960ESo.LLJJJJ.getValue();
        if (c0etq == null) {
            return false;
        }
        return c0etq.onBackPressed();
    }

    public static final boolean onBackPressed$13(C0FXH c0fxh) {
        if (((C382480Ez8) c0fxh.l0).T2().LIZIZ != EnumC378320EsQ.SHOW && ((C382480Ez8) c0fxh.l0).T2().LIZIZ != EnumC378320EsQ.SHOW_WITH_ANIMATION) {
            return false;
        }
        ((C382480Ez8) c0fxh.l0).LIZLLL();
        return true;
    }

    public static final boolean onBackPressed$2(C0FXH c0fxh) {
        InterfaceC362600EJm interfaceC362600EJm;
        C385670FAf<Boolean> c385670FAfBK0;
        C0ECF c0ecf = (C0ECF) ((C362630EJp) c0fxh.l0).LLJILLL;
        if (c0ecf != null && (interfaceC362600EJm = (InterfaceC362600EJm) c0ecf.LLJJIJI.getValue(c0ecf, C0ECF.LLJJJIL[9])) != null && (c385670FAfBK0 = interfaceC362600EJm.BK0()) != null && Intrinsics.LJFF(c385670FAfBK0.LIZJ(), Boolean.TRUE)) {
            return false;
        }
        InterfaceC362640EJq interfaceC362640EJq = ((C362630EJp) c0fxh.l0).LLJJIJIIJIL;
        if (interfaceC362640EJq != null) {
            interfaceC362640EJq.LJZI();
            return true;
        }
        return true;
    }

    public static final boolean onBackPressed$3(C0FXH c0fxh) {
        InterfaceC362600EJm interfaceC362600EJm;
        C385670FAf<Boolean> c385670FAfBK0;
        C364490EQt c364490EQt = (C364490EQt) ((C364510EQv) c0fxh.l0).LLJILLL;
        if (c364490EQt != null && (interfaceC362600EJm = (InterfaceC362600EJm) c364490EQt.LLJJJJJIL.getValue(c364490EQt, C364490EQt.LLJJL[9])) != null && (c385670FAfBK0 = interfaceC362600EJm.BK0()) != null && Intrinsics.LJFF(c385670FAfBK0.LIZJ(), Boolean.TRUE)) {
            return false;
        }
        InterfaceC364550EQz interfaceC364550EQz = ((C364510EQv) c0fxh.l0).LLJJIJIL;
        if (interfaceC364550EQz != null) {
            interfaceC364550EQz.LJZI();
            return true;
        }
        return true;
    }

    public static final boolean onBackPressed$4(C0FXH c0fxh) {
        InterfaceC362600EJm interfaceC362600EJm;
        C385670FAf<Boolean> c385670FAfBK0;
        C0ERA c0era = (C0ERA) ((C0ERB) c0fxh.l0).LLJILLL;
        if (c0era != null && (interfaceC362600EJm = (InterfaceC362600EJm) c0era.LLJJIII.getValue(c0era, C0ERA.LLJJIJIIJIL[8])) != null && (c385670FAfBK0 = interfaceC362600EJm.BK0()) != null && Intrinsics.LJFF(c385670FAfBK0.LIZJ(), Boolean.TRUE)) {
            return false;
        }
        C0ERC c0erc = ((C0ERB) c0fxh.l0).LLJJIJIIJIL;
        if (c0erc != null) {
            c0erc.LJZI();
            return true;
        }
        return true;
    }

    public static final boolean onBackPressed$5(C0FXH c0fxh) {
        InterfaceC364910ESj interfaceC364910ESj = ((C364890ESh) c0fxh.l0).LLJJJIL;
        if (interfaceC364910ESj != null) {
            return interfaceC364910ESj.onBackPressed();
        }
        return false;
    }

    public static final boolean onBackPressed$6(C0FXH c0fxh) {
        return ((VideoCropRootScene) c0fxh.l0).onBackPressed();
    }

    public static final boolean onBackPressed$7(C0FXH c0fxh) {
        return ((BaseCanvasPanelRootScene) c0fxh.l0).onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onBackPressed$8(X.C0FXH r6) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FXH.onBackPressed$8(X.0FXH):boolean");
    }

    public static final boolean onBackPressed$9(C0FXH c0fxh) {
        C0F2W c0f2w = (C0F2W) c0fxh.l0;
        if (c0f2w.LLILZLL != null) {
            c0f2w.fn1(true);
            return true;
        }
        return false;
    }

    public C0FXH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
