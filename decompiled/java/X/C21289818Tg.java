package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotPictureComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21289818Tg {
    public static final Keva LIZ = Keva.getRepo("vp_message_read_time");
    public static final Keva LIZIZ = Keva.getRepo("vp_message_executed_flag");

    public static final long LIZIZ(C869590Y9l c869590Y9l) {
        Long l;
        Long l2;
        if (c869590Y9l.getMsgType() == 1820) {
            VisualPoetBotCardTemplate visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetBotCardTemplate.class);
            if (visualPoetBotCardTemplate != null && (l2 = visualPoetBotCardTemplate.updateTime) != null) {
                return l2.longValue();
            }
            return c869590Y9l.getCreatedAt();
        }
        if (c869590Y9l.getMsgType() == 1821) {
            VisualPoetErrorCardTemplate visualPoetErrorCardTemplate = (VisualPoetErrorCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetErrorCardTemplate.class);
            if (visualPoetErrorCardTemplate != null && (l = visualPoetErrorCardTemplate.updateTime) != null) {
                return l.longValue();
            }
            return c869590Y9l.getCreatedAt();
        }
        return c869590Y9l.getCreatedAt();
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        EnumC21290318Tl enumC21290318Tl;
        VisualPoetBotPictureComponent visualPoetBotPictureComponent;
        if (c869590Y9l.getMsgType() != 1820 || !Intrinsics.LJFF(c869590Y9l.getScene(), "visual_poet_bot_picture")) {
            return false;
        }
        VisualPoetBotCardTemplate visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetBotCardTemplate.class);
        if (visualPoetBotCardTemplate != null && (visualPoetBotPictureComponent = visualPoetBotCardTemplate.botPictureComponent) != null) {
            enumC21290318Tl = visualPoetBotPictureComponent.taskStatusComponent;
        } else {
            enumC21290318Tl = null;
        }
        if (enumC21290318Tl != EnumC21290318Tl.SUCCESS) {
            return false;
        }
        return !visualPoetBotCardTemplate.botPictureComponent.pictureStructComponent.image.urls.isEmpty();
    }

    public static final boolean LIZLLL(C869590Y9l c869590Y9l) {
        EnumC21290318Tl enumC21290318Tl;
        VisualPoetBotPictureComponent visualPoetBotPictureComponent;
        VisualPoetBotPictureComponent visualPoetBotPictureComponent2;
        if (c869590Y9l.getMsgType() != 1820 || !Intrinsics.LJFF(c869590Y9l.getScene(), "visual_poet_bot_picture")) {
            return false;
        }
        VisualPoetBotCardTemplate visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetBotCardTemplate.class);
        EnumC21290318Tl enumC21290318Tl2 = null;
        if (visualPoetBotCardTemplate != null && (visualPoetBotPictureComponent2 = visualPoetBotCardTemplate.botPictureComponent) != null) {
            enumC21290318Tl = visualPoetBotPictureComponent2.taskStatusComponent;
        } else {
            enumC21290318Tl = null;
        }
        if (enumC21290318Tl != EnumC21290318Tl.RUNNING) {
            if (visualPoetBotCardTemplate != null && (visualPoetBotPictureComponent = visualPoetBotCardTemplate.botPictureComponent) != null) {
                enumC21290318Tl2 = visualPoetBotPictureComponent.taskStatusComponent;
            }
            if (enumC21290318Tl2 != EnumC21290318Tl.CREATED) {
                return false;
            }
        }
        if (visualPoetBotCardTemplate.botPictureComponent.taskProgressComponent == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(C869590Y9l c869590Y9l) {
        if (!Intrinsics.LJFF(c869590Y9l.getScene(), "visual_poet_bot_picture")) {
            return false;
        }
        Keva keva = LIZ;
        long j = keva.getLong("last_read_time", 0L);
        long j2 = keva.getLong("last_read_index", 0L);
        if (j >= LIZIZ(c869590Y9l) && j2 >= c869590Y9l.getIndex()) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() == 1821 && TextUtils.equals(c869590Y9l.getScene(), "visual_poet_quota")) {
            return true;
        }
        return false;
    }

    public static final void LIZ(Long l, String str, Runnable runnable) {
        if (l != null) {
            l.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(l);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Keva keva = LIZIZ;
            boolean z = false;
            if (keva.getBoolean(strLIZIZ, false)) {
                return;
            }
            synchronized (keva) {
                try {
                    if (!keva.getBoolean(strLIZIZ, false)) {
                        keva.storeBoolean(strLIZIZ, true);
                        z = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                runnable.run();
            }
        }
    }
}
