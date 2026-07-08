package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import ln3.a;
import mn3.e0;

/* JADX INFO: renamed from: X.0nnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448710nnp implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final String LL;
    public final String LLILLJJLI;
    public final C1DRG LLILLL;
    public final ShortVideoContext LLILZ;
    public final InterfaceC1650230t2r LLILZIL;
    public final C01GW<a> LLILZLL;
    public final C1664740tQG LLIZ;
    public Effect LLIZLLLIL;
    public C1449000noI LLJ;
    public final C1664740tQG LLJI;
    public final C054G LLJIJIL;
    public final C13IV LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1448710nnp.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1448710nnp.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final String LIZJ(int i) {
        return this.LLILZIL.u92().LIZIZ().LJIIJ(i);
    }

    public final void LIZ(C0LAB c0lab, String str) {
        Object c098200Yq;
        AbstractC19979113Fd abstractC19979113Fd;
        Object obj = null;
        try {
            C13IV c13iv = this.LLJILJIL;
            c13iv.getClass();
            abstractC19979113Fd = (AbstractC19979113Fd) c13iv.LIZIZ(C13GI.LIZ, str);
            C13H0 c13h0 = C19988013Io.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if ((abstractC19979113Fd instanceof C13BG) && (c098200Yq = (C13BG) abstractC19979113Fd) != null) {
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            C13BG c13bg = (C13BG) obj;
            if (c13bg == null) {
                return;
            }
            for (Map.Entry<String, AbstractC19979113Fd> entry : c13bg.entrySet()) {
                String key = entry.getKey();
                AbstractC19979113Fd value = entry.getValue();
                if (!(value instanceof C13GQ)) {
                    c0lab.LJ(key, value.toString());
                }
            }
            return;
        }
        C19988013Io.LIZ(abstractC19979113Fd, "JsonObject");
        throw null;
    }

    public final void LIZIZ(C0LAB c0lab, Function0<Unit> function0) {
        C23250099c.LIZLLL(this.LLJIJIL, null, null, new C859000Xms(this, c0lab, function0, null), 3);
    }

    public /* synthetic */ C1448710nnp(C1DRG c1drg, e0 e0Var, C01GW c01gw) {
        this(null, null, c1drg, null, e0Var, c01gw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1448710nnp(String str, String str2, C1DRG c1drg, ShortVideoContext shortVideoContext, InterfaceC1650230t2r interfaceC1650230t2r, C01GW<? extends a> c01gw) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = c1drg;
        this.LLILZ = shortVideoContext;
        this.LLILZIL = interfaceC1650230t2r;
        this.LLILZLL = c01gw;
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, a.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1625000sOA.class, null);
        this.LLJIJIL = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LLJILJIL = C13J2.LIZ(AFwS261S0000000_22.get$arr$(141));
    }
}
