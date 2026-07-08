package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12JA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12JA extends C1696260uF6 implements Function1<ComposerBeauty, Boolean> {
    public C12JA(C19570611hY c19570611hY) {
        super(1, c19570611hY, C19570611hY.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;Z)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ComposerBeauty composerBeauty) {
        return Boolean.valueOf(((C19570611hY) this.receiver).LIZLLL(composerBeauty, false));
    }
}
