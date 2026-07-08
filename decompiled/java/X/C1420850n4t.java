package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownload;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointDownloadHelper$downloadMusicInfoV2$1$downloadMusicAlgorithmTask$1", f = "StickPointDownloadHelper.kt", l = {222}, m = "invokeSuspend")
public final class C1420850n4t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends AVMusic>>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ AVMusic LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420850n4t(Context context, AVMusic aVMusic, InterfaceC1364105Vn<? super C1420850n4t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = aVMusic;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1420850n4t(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1420860n4u stickPointMusicAlgFileDownload;
        C1C7U.LIZ("StickPointDownloadHelper@e94d.downloadMusicInfoV2$1$downloadMusicAlgorithmTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1420960n54 c1420960n54 = C1420960n54.LIZ;
            Context context = this.LLILLJJLI;
            final AVMusic aVMusic = this.LLILLL;
            this.LL = 1;
            c1420960n54.getClass();
            if (context != null && aVMusic != null && aVMusic.getStickPointMusicAlg() != null) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "stick_point_music_alg_file_download_parallel", true, false)) {
                    stickPointMusicAlgFileDownload = new C1421070n5F();
                } else {
                    stickPointMusicAlgFileDownload = new StickPointMusicAlgFileDownload();
                }
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                final C013C c013c = new C013C();
                stickPointMusicAlgFileDownload.LIZ(new C0NM2() { // from class: X.0n50
                    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
                    @Override // X.C0NM2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg r6, boolean r7) {
                        /*
                            r5 = this;
                            if (r7 == 0) goto L81
                            boolean r0 = X.C1420940n52.LIZIZ()
                            r4 = 0
                            r3 = 1
                            if (r0 == 0) goto L29
                            if (r6 == 0) goto L29
                            boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existMusicSyncAlgFile(r6)
                            if (r0 == r3) goto L18
                            boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existOnSetAlgFile(r6)
                            if (r0 != r3) goto L29
                        L18:
                            X.013C r4 = r2
                            X.05Vn<kotlin.Pair<java.lang.Boolean, ? extends com.ss.android.ugc.aweme.creative.model.music.AVMusic>> r3 = r3
                            kotlin.Pair r2 = new kotlin.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.TRUE
                            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r1
                            r2.<init>(r1, r0)
                            X.C1420960n54.LIZIZ(r4, r3, r2)
                            return
                        L29:
                            X.0C64 r2 = X.C0C64.LJIILLIIL()
                            r1 = 31744(0x7c00, float:4.4483E-41)
                            java.lang.String r0 = "stick_point_new_alg_rule"
                            int r1 = r2.LJIJ(r1, r4, r0, r3)
                            r0 = 2
                            if (r1 != r0) goto L57
                            if (r6 == 0) goto L70
                            boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existBeatsTrackerAlgFile(r6)
                            if (r0 == r3) goto L46
                            boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existOnSetAlgFile(r6)
                            if (r0 != r3) goto L59
                        L46:
                            X.013C r4 = r2
                            X.05Vn<kotlin.Pair<java.lang.Boolean, ? extends com.ss.android.ugc.aweme.creative.model.music.AVMusic>> r3 = r3
                            kotlin.Pair r2 = new kotlin.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.TRUE
                            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r1
                            r2.<init>(r1, r0)
                            X.C1420960n54.LIZIZ(r4, r3, r2)
                            return
                        L57:
                            if (r6 == 0) goto L70
                        L59:
                            boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existOnSetAlgFile(r6)
                            if (r0 != r3) goto L70
                            X.013C r4 = r2
                            X.05Vn<kotlin.Pair<java.lang.Boolean, ? extends com.ss.android.ugc.aweme.creative.model.music.AVMusic>> r3 = r3
                            kotlin.Pair r2 = new kotlin.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.TRUE
                            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r1
                            r2.<init>(r1, r0)
                            X.C1420960n54.LIZIZ(r4, r3, r2)
                            return
                        L70:
                            X.013C r4 = r2
                            X.05Vn<kotlin.Pair<java.lang.Boolean, ? extends com.ss.android.ugc.aweme.creative.model.music.AVMusic>> r3 = r3
                            kotlin.Pair r2 = new kotlin.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.FALSE
                            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r1
                            r2.<init>(r1, r0)
                            X.C1420960n54.LIZIZ(r4, r3, r2)
                            return
                        L81:
                            X.013C r4 = r2
                            X.05Vn<kotlin.Pair<java.lang.Boolean, ? extends com.ss.android.ugc.aweme.creative.model.music.AVMusic>> r3 = r3
                            kotlin.Pair r2 = new kotlin.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.FALSE
                            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r1
                            r2.<init>(r1, r0)
                            X.C1420960n54.LIZIZ(r4, r3, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1420920n50.LIZ(com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg, boolean):void");
                    }
                });
                stickPointMusicAlgFileDownload.LIZIZ(context, aVMusic.getMusicId(), aVMusic.getStickPointMusicAlg());
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            } else {
                obj = new Pair(false, aVMusic);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickPointDownloadHelper@e94d.downloadMusicInfoV2$1$downloadMusicAlgorithmTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StickPointDownloadHelper@e94d.downloadMusicInfoV2$1$downloadMusicAlgorithmTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends AVMusic>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
