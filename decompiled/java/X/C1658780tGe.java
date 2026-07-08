package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS120S0400000_25;

/* JADX INFO: renamed from: X.0tGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658780tGe {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tGa] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0tGo] */
    public static final C1658740tGa LIZ(C1DRG c1drg, C19A3 c19a3) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null);
        return new C1658700tGW(c1drg, new C1658890tGp(shortVideoContext, shortVideoContext.LJ()) { // from class: X.0tGo
            public final ShortVideoContext LIZ;
            public final AVETParameter LIZIZ;

            @Override // X.C1658890tGp, X.InterfaceC19731912Ib
            public final void LIZLLL() {
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C2341909Fp.LIZ("reset_beautify_all", LJIIL(this.LIZIZ).LIZ);
            }

            @Override // X.C1658890tGp
            public final void LJIIJJI() {
                C1411130mpD c1411130mpD = C1411130mpD.LIZ;
                ShortVideoContext shortVideoContext2 = this.LIZ;
                c1411130mpD.getClass();
                C1411130mpD.LIZ(shortVideoContext2);
            }

            public static C0LAB LJIIL(AVETParameter aVETParameter) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", aVETParameter.getCreationId());
                c0lab.LJ("shoot_way", aVETParameter.getShootWay());
                c0lab.LJ("content_source", aVETParameter.getContentSource());
                c0lab.LJ("content_type", aVETParameter.getContentType());
                c0lab.LJ("enter_from", "video_shoot_page");
                return c0lab;
            }

            @Override // X.C1658890tGp, X.InterfaceC19731912Ib
            public final void LIZ(ComposerBeauty composerBeauty) {
                int defaultProgress;
                if (composerBeauty != null) {
                    if (composerBeauty.getProgressValue() != 0) {
                        defaultProgress = composerBeauty.getProgressValue();
                    } else {
                        defaultProgress = composerBeauty.getDefaultProgress();
                    }
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    C0LAB c0labLJIILIIL = LJIILIIL(composerBeauty, this.LIZIZ);
                    c0labLJIILIIL.LJ("beautify_value", String.valueOf(defaultProgress));
                    C2341909Fp.LIZ("select_beautify", c0labLJIILIIL.LIZ);
                }
            }

            @Override // X.C1658890tGp, X.InterfaceC19731912Ib
            public final void LIZIZ(BeautyCategory beautyCategory) {
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0labLJIIL = LJIIL(this.LIZIZ);
                c0labLJIIL.LJ("beautify_category_id", beautyCategory.getCategoryResponse().getId());
                c0labLJIIL.LJ("beautify_category_name", beautyCategory.getCategoryResponse().getName());
                C2341909Fp.LIZ("click_beautify_category", c0labLJIIL.LIZ);
            }

            @Override // X.C1658890tGp, X.InterfaceC19731912Ib
            public final void LJ(String str) {
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0labLJIIL = LJIIL(this.LIZIZ);
                c0labLJIIL.LJ("to_status", str);
                C2341909Fp.LIZ("beautify_status_switch", c0labLJIIL.LIZ);
            }

            @Override // X.C1658890tGp, X.InterfaceC19731912Ib
            public final void LJII(boolean z) {
                String str;
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0labLJIIL = LJIIL(this.LIZIZ);
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                c0labLJIIL.LJ("final_status", str);
                C2341909Fp.LIZ("click_beauty_switch", c0labLJIIL.LIZ);
            }

            @Override // X.C1658890tGp, X.InterfaceC19731912Ib
            public final void LJIIIZ(String str) {
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0labLJIIL = LJIIL(this.LIZIZ);
                c0labLJIIL.LJ("event_type", str);
                C2341909Fp.LIZ("reset_beautify_popup", c0labLJIIL.LIZ);
            }

            @Override // X.C1658890tGp, X.InterfaceC19731912Ib
            public final void LJIIJ(ComposerBeauty composerBeauty) {
                if (composerBeauty != null) {
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    C2341909Fp.LIZ("click_beautify_tab", LJIILIIL(composerBeauty, this.LIZIZ).LIZ);
                }
            }

            {
                this.LIZ = shortVideoContext;
                this.LIZIZ = aVETParameter;
            }

            public static C0LAB LJIILIIL(ComposerBeauty composerBeauty, AVETParameter aVETParameter) {
                C0LAB c0labLJIIL = LJIIL(aVETParameter);
                if (C12HP.LIZLLL(composerBeauty)) {
                    c0labLJIIL.LJ("beautify_name_parent", composerBeauty.getParentName());
                    c0labLJIIL.LJ("beautify_id_parent", composerBeauty.getParentId());
                    c0labLJIIL.LJ("beautify_name_child", composerBeauty.getEffect().getName());
                    c0labLJIIL.LJ("beautify_id_child", composerBeauty.getEffect().getEffectId());
                    return c0labLJIIL;
                }
                c0labLJIIL.LJ("beautify_name_parent", composerBeauty.getEffect().getName());
                c0labLJIIL.LJ("beautify_id_parent", composerBeauty.getEffect().getEffectId());
                return c0labLJIIL;
            }
        }, new C12JZ() { // from class: X.0tGf
        }, AFwS266S0000000_25.get$arr$(278)) { // from class: X.0tGa
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
            public final InterfaceC1731706qJ LLJILJIL;
            public final /* synthetic */ C1658880tGo LLJILLL;
            public final /* synthetic */ C12JZ LLJJ;
            public final /* synthetic */ Function1<C12J7, C12J7> LLJJI;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C1658740tGa.class, "recordAdapterComponent", "getRecordAdapterComponent()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterComponent;", 0);
                C13LE.LIZ.getClass();
                LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            private final C1647410syJ B3() {
                return (C1647410syJ) this.LLJILJIL.getValue(this, LLJJIII[0]);
            }

            @Override // X.AbstractC2255721DQs
            public void onCreate() {
                super.onCreate();
                B3().Rv0(this);
            }

            @Override // X.C1658700tGW
            public C1658810tGh W1(C1DRG c1drg2) {
                return new C1658810tGh(c1drg2, new AwS120S0400000_25(this.LLJILJILJ, (C19A3) this.LLJILLL, (C1658880tGo) this.LLJJ, (C12JZ) this.LLJJI, (Function1<? super C12J7, ? extends C12J7>) 16));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(this.LLJILJILJ, c1drg, null);
                this.LLJILLL = c1658880tGo;
                this.LLJJ = c12jz;
                this.LLJJI = function1;
                this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C1647410syJ.class, null);
            }
        };
    }
}
