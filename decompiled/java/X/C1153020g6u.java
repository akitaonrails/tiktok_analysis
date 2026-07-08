package X;

import com.bytedance.android.livesdk.livesetting.message.LivePreviewGameGuessingSetting;

/* JADX INFO: renamed from: X.0g6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153020g6u implements C1AC0 {
    public static final C1153020g6u LIZ = new C1153020g6u();

    @Override // X.C1AC0
    public final boolean LIZ() {
        return LivePreviewGameGuessingSetting.INSTANCE.getValue().getGameQuestionDesc();
    }

    @Override // X.C1AC0
    public final boolean LIZIZ() {
        return LivePreviewGameGuessingSetting.INSTANCE.getValue().isShowWidget();
    }

    @Override // X.C1AC0
    public final boolean LIZJ() {
        return LivePreviewGameGuessingSetting.INSTANCE.getValue().getGameNameTitle();
    }

    @Override // X.C1AC0
    public final boolean LIZLLL() {
        return LivePreviewGameGuessingSetting.INSTANCE.getValue().getFreeCoinDesc();
    }

    @Override // X.C1AC0
    public final long LJ() {
        return LivePreviewGameGuessingSetting.INSTANCE.getValue().getTimeEarly();
    }
}
