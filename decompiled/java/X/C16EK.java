package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.16EK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EK extends C09AY implements Function2<VideoProgressBarAssem, C291001Au<? extends Boolean>, Unit> {
    public C16EK() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem r5, X.C291001Au<? extends java.lang.Boolean> r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem r5 = (com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem) r5
            X.01Au r6 = (X.C291001Au) r6
            if (r6 == 0) goto L5d
            T r0 = r6.LIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r0.booleanValue()
            X.01GW r0 = r5.LLJLLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility r0 = (com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility) r0
            if (r0 == 0) goto L23
            r0.dJ(r2)
        L23:
            com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility r0 = r5.LLJZ
            r3 = 0
            if (r0 != 0) goto L38
            X.0Q7z r1 = X.C1558520qew.LJIIL(r5)
            java.lang.Class<com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility> r0 = com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r3)
            com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility r0 = (com.ss.android.ugc.aweme.feed.ghouse.InsertCacheWhenPlayLagAbility) r0
            if (r0 == 0) goto L3b
            r5.LLJZ = r0
        L38:
            r0.K1(r2)
        L3b:
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r0.LL
        L41:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r1 = r0.mEventType
            if (r1 == 0) goto L60
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L60
            int r1 = X.C305550ByL.LIZ()
            r0 = 2
            if (r1 == r0) goto L5d
            int r1 = X.C305550ByL.LIZ()
            r0 = 3
            if (r1 != r0) goto L60
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L66
            java.lang.Object r3 = r0.LL
        L66:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r3 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r3
            java.lang.String r0 = r3.mEventType
            boolean r0 = X.C305550ByL.LIZIZ(r0)
            if (r0 != 0) goto L5d
            if (r2 == 0) goto L85
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            boolean r0 = r0.o4()
            if (r0 != 0) goto L5d
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r1 = r5.LLLFF
            X.0hgX r0 = new X.0hgX
            r0.<init>()
            X.C2041907zF.LIZ(r1, r0)
            goto L5d
        L85:
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            boolean r0 = r0.o4()
            if (r0 != 0) goto L5d
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r5.LLLFF
            X.C2041907zF.LIZJ(r0)
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r5.LLLFF
            if (r0 == 0) goto L5d
            r0.LIZLLL()
            goto L5d
        L9a:
            r0 = r3
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16EK.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
