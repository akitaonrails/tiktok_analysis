package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0F4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384180F4m {
    public static final C384180F4m LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static AnonymousClass0956 LIZLLL;
    public static final AtomicInteger LJ;
    public static long LJFF;
    public static volatile boolean LJI;
    public static volatile long LJII;
    public static BaseStickerModel LJIIIIZZ;
    public static final ArrayList<Pair<Long, String>> LJIIIZ;
    public static final ArrayList<C443120HZe<Long, String, Boolean>> LJIIJ;
    public static final ArrayList<C443120HZe<Long, String, Boolean>> LJIIJJI;
    public static final ArrayList<Pair<Long, String>> LJIIL;
    public static final C054G LJIILIIL;
    public volatile C09U0 LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C384180F4m.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C384180F4m c384180F4m = new C384180F4m();
        LIZIZ = c384180F4m;
        LJ = new AtomicInteger(0);
        LJIIIIZZ = new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
        LJIIIZ = new ArrayList<>();
        LJIIJ = new ArrayList<>();
        LJIIJJI = new ArrayList<>();
        LJIIL = new ArrayList<>();
        C09U0 c09u0 = c384180F4m.LIZ;
        if (c09u0 == null) {
            synchronized (c384180F4m) {
                c09u0 = c384180F4m.LIZ;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    c384180F4m.LIZ = c09u0;
                }
            }
        }
        LJIILIIL = C2296808zG.LIZ(c09u0.LIZJ);
    }

    public static void LIZ() {
        ArrayList<Pair<Long, String>> arrayList = LJIIL;
        if (arrayList.isEmpty()) {
            return;
        }
        Pair pair = (Pair) ListProtector.remove(arrayList, 0);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_id", (String) pair.getSecond());
        c0lab.LIZIZ(System.currentTimeMillis() - ((Number) pair.getFirst()).longValue(), "cost_time");
        C20684815ws.LJIILLIIL("tool_performance_effect_text_apply_caption_template", c0lab.LIZ);
    }

    public static void LIZIZ() {
        ArrayList<Pair<Long, String>> arrayList = LJIIIZ;
        if (arrayList.isEmpty()) {
            return;
        }
        Pair pair = (Pair) ListProtector.remove(arrayList, 0);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("font_id", (String) pair.getSecond());
        c0lab.LIZIZ(System.currentTimeMillis() - ((Number) pair.getFirst()).longValue(), "cost_time");
        C20684815ws.LJIILLIIL("tool_performance_effect_text_apply_font", c0lab.LIZ);
    }

    public static void LIZJ() {
        ArrayList<C443120HZe<Long, String, Boolean>> arrayList = LJIIJJI;
        if (arrayList.isEmpty()) {
            return;
        }
        C443120HZe c443120HZe = (C443120HZe) ListProtector.remove(arrayList, 0);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("anim_id", (String) c443120HZe.getSecond());
        c0lab.LJ("is_caption_anim", C0ML9.LJ(((Boolean) c443120HZe.getThird()).booleanValue()));
        c0lab.LIZIZ(System.currentTimeMillis() - ((Number) c443120HZe.getFirst()).longValue(), "cost_time");
        C20684815ws.LJIILLIIL("tool_performance_effect_text_apply_anim", c0lab.LIZ);
    }

    public static void LIZLLL() {
        ArrayList<C443120HZe<Long, String, Boolean>> arrayList = LJIIJ;
        if (arrayList.isEmpty()) {
            return;
        }
        C443120HZe c443120HZe = (C443120HZe) ListProtector.remove(arrayList, 0);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("style_id", (String) c443120HZe.getSecond());
        c0lab.LJ("is_effect_style", C0ML9.LJ(((Boolean) c443120HZe.getThird()).booleanValue()));
        c0lab.LIZIZ(System.currentTimeMillis() - ((Number) c443120HZe.getFirst()).longValue(), "cost_time");
        C20684815ws.LJIILLIIL("tool_performance_effect_text_apply_style", c0lab.LIZ);
    }

    public static void LJI() {
        if (LJI) {
            LJII = System.currentTimeMillis();
            LJ.incrementAndGet();
            return;
        }
        synchronized (LJIIIZ) {
            try {
                LIZIZ.getClass();
                LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        synchronized (LJIIJJI) {
            try {
                LIZJ();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        synchronized (LJIIJ) {
            try {
                LIZLLL();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        synchronized (LJIIL) {
            try {
                LIZ();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
    }

    public static void LJ(TextStickerModel textStickerModel) {
        if (textStickerModel.isVERenderSticker()) {
            BaseStickerModel baseStickerModel = LJIIIIZZ;
            BaseStickerModel baseStickerModel2 = textStickerModel.getBaseStickerModel();
            if (Math.abs(baseStickerModel.getTranslateX() - baseStickerModel2.getTranslateX()) > 2.0f || Math.abs(baseStickerModel.getTranslateY() - baseStickerModel2.getTranslateY()) > 2.0f || Math.abs(baseStickerModel.getScale() - baseStickerModel2.getScale()) > 0.05f || Math.abs(baseStickerModel.getRotation() - baseStickerModel2.getRotation()) > 0.2f) {
                LJIIIIZZ = textStickerModel.getBaseStickerModel();
                if (!LJI) {
                    LJI = true;
                    LJFF = System.currentTimeMillis();
                }
                AnonymousClass0956 anonymousClass0956 = LIZLLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                LIZLLL = C23250099c.LIZLLL(LJIILIIL, null, null, new C0EKX(textStickerModel, null), 3);
            }
        }
    }

    public static void LJFF(TextStickerModel textStickerModel) {
        if (textStickerModel.isVERenderSticker() && LJI) {
            AnonymousClass0956 anonymousClass0956 = LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LJI = false;
            AtomicInteger atomicInteger = LJ;
            int i = atomicInteger.get();
            long j = LJII - LJFF;
            LJFF = 0L;
            LJII = 0L;
            atomicInteger.set(0);
            LJIIIIZZ = new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
            if (i > 0 && j > 200) {
                float fRint = (float) Math.rint((i * 1000.0f) / j);
                C0LAB c0lab = new C0LAB();
                c0lab.LIZJ(Float.valueOf(fRint), "fps");
                c0lab.LJ("font_name", textStickerModel.getFontModel().fontName);
                c0lab.LIZ(textStickerModel.getTextStr().length(), "character_count");
                TextStyleModel textStyle = textStickerModel.getTextStyle();
                if (textStyle != null) {
                    c0lab.LIZ(textStyle.isEffectStyle ? 1 : 0, "is_effect_style");
                    c0lab.LJ("style_id", textStyle.styleResId);
                }
                if (textStickerModel.getTextMotionModel().motionEnabled == 1) {
                    c0lab.LIZ(C363290EMd.LIZ(textStickerModel.getTextMotionModel()) ? 1 : 0, "is_caption_anim");
                    c0lab.LJ("anim_id", textStickerModel.getTextMotionModel().motionResId);
                }
                C20684815ws.LJIILLIIL("tool_performance_effect_text_operation_fps", c0lab.LIZ);
            }
        }
    }
}
