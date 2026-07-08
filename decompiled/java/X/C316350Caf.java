package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Caf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C316350Caf extends C1696260uF6 implements Function1<ComposerBeauty, Boolean> {
    public C316350Caf(C19570611hY c19570611hY) {
        super(1, c19570611hY, C19570611hY.class, "isBeautyAvailable", "isBeautyAvailable(Lcom/ss/android/ugc/aweme/beauty/ComposerBeauty;Z)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ComposerBeauty composerBeauty) {
        return Boolean.valueOf(((C19570611hY) this.receiver).LIZLLL(composerBeauty, false));
    }
}
